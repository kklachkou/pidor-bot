package by.kobyzau.tg.bot.pbot.tasks;

import by.kobyzau.tg.bot.pbot.collectors.ReceiveUpdateCollector;
import by.kobyzau.tg.bot.pbot.handlers.update.UpdateHandler;
import by.kobyzau.tg.bot.pbot.program.logger.Logger;
import by.kobyzau.tg.bot.pbot.program.printer.UpdatePrinter;
import by.kobyzau.tg.bot.pbot.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.time.LocalDate;
import java.util.List;

@Component("updateProcessorTask")
public class UpdateProcessorTask implements Task {

  @Autowired private ReceiveUpdateCollector updateCollector;

  @Autowired private List<UpdateHandler> updateHandlers;
  @Autowired private Logger logger;

  @Override
  public void processTask() {
    Update object = updateCollector.poll();
    while (object != null) {
      process(object);
      object = updateCollector.poll();
    }
  }

  private void process(Update update) {
    LocalDate now = DateUtil.now();
    for (UpdateHandler updateHandler : updateHandlers) {
      try {
        if (updateHandler.test(now)) {
          if (updateHandler.handleUpdate(update)) {
            return;
          }
        }
      } catch (Exception e) {
        logger.error("Error in UpdateProcessor for update:\n\n<pre>" + new UpdatePrinter(update)+ "</pre>", e) ;
      }
    }
  }
}
