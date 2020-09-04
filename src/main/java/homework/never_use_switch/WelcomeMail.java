package homework.never_use_switch;

import lombok.Getter;

@Getter
public class WelcomeMail implements MailAction {


    private int type;

    public WelcomeMail(){
        this.type = 1;
    }

    @Override
    public void sendMail(MailInfo message) {
        // 60 lines of code which will send WELCOME mail
        System.out.println("WELCOME " + message.getText() + " was sent to" + message.getEmail());
    }
}
