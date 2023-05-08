import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class SimpleBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        //System.out.println();
    }

    public String getBotUsername() {
        return "Ciusky_bot";
    }
    @Override
    public String getBotToken() {
        return "5706802840:AAG19xZuAMujA5FQNINFWb6SjTSNgELSXRw";
    }

}
