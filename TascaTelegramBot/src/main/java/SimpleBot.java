import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class SimpleBot extends TelegramLongPollingBot {

    public String getBotUsername() {
        return "Ciusky_bot";
    }
    @Override
    public String getBotToken() {
        return "5706802840:AAG19xZuAMujA5FQNINFWb6SjTSNgELSXRw";
    }
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());

        String command = update.getMessage().getText();

        if (command.equals("/run")){
            String message = "What do you want to ask?";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try{
                execute(response);
            }catch(TelegramApiException e){
                e.printStackTrace();
            }
        }

        if (command.equals("Who's the goat?")){
            String message = "Absolutely MJ23";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try{
                execute(response);
            }catch(TelegramApiException e){
                e.printStackTrace();
            }
        }
    }

}
