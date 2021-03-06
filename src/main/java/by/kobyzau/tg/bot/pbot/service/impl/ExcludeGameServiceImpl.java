package by.kobyzau.tg.bot.pbot.service.impl;

import by.kobyzau.tg.bot.pbot.handlers.update.schedule.CalendarSchedule;
import by.kobyzau.tg.bot.pbot.handlers.update.schedule.ScheduledItem;
import by.kobyzau.tg.bot.pbot.model.ExcludeGameUserValue;
import by.kobyzau.tg.bot.pbot.repository.exclude.ExcludeGameRepository;
import by.kobyzau.tg.bot.pbot.service.ExcludeGameService;
import by.kobyzau.tg.bot.pbot.service.PidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ExcludeGameServiceImpl implements ExcludeGameService {

    @Autowired
    private ExcludeGameRepository repository;
    @Autowired
    private PidorService pidorService;

    @Autowired
    private CalendarSchedule calendarSchedule;

    private static final List<String> KEYWORDS =
            Arrays.asList("Чур не я", "Я не пидор", "Не пидор я", "Жыве Беларусь");

    @Override
    public boolean isExcludeGameDay(LocalDate localDate) {
        return calendarSchedule.getItem(localDate) == ScheduledItem.EXCLUDE_GAME;
    }

    @Override
    public Optional<ExcludeGameUserValue> getExcludeGameUserValue(
            long chatId, int userId, LocalDate date) {
        return repository.getAll().stream()
                .filter(d -> d.getChatId() == chatId)
                .filter(d -> d.getPlayerTgId() == userId)
                .filter(d -> d.getLocalDate().isEqual(date))
                .findFirst();
    }

    @Override
    public List<ExcludeGameUserValue> getExcludeGameUserValues(long chatId, LocalDate date) {
        return repository.getAll().stream()
                .filter(d -> d.getChatId() == chatId)
                .filter(d -> d.getLocalDate().isEqual(date))
                .collect(Collectors.toList());
    }

    @Override
    public void saveExcludeGameUserValue(ExcludeGameUserValue userValue) {
        repository.create(userValue);
    }


    @Override
    public String getWordOfTheDay(LocalDate date) {
        int index = date.getDayOfYear() % KEYWORDS.size();
        return KEYWORDS.get(index);
    }


    @Override
    public int getNumPidorsToExclude(long chatId) {
        int numPidors = pidorService.getByChat(chatId).size();
        if (numPidors <= 5) {
            return numPidors - 1;
        }
        return (int) (numPidors * 0.8);
    }
}
