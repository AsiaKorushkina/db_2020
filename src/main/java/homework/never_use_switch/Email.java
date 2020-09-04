package homework.never_use_switch;

import lombok.Getter;

@Getter
public class Email implements MailAction{

    private int type;
    public Email(){
        this.type = 2;
    }

    @Override
    public void sendMail(MailInfo message) {
        // 80 lines of code which will send WELCOME mail
        System.out.println("EMAIL_CALLBACK " + message.getText() + " was sent to" + message.getEmail());
    }
}
