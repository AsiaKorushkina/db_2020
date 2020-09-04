package homework.never_use_switch;

import lombok.Getter;

@Getter
public class BirthdayMail extends MailAction{

    public BirthdayMail(){
        this.setType(3);
    }

    @Override
    public void sendMail(MailInfo message) {
        // 100 lines of code which will send WELCOME mail
        System.out.println("HAPPY BIRTHDAY " + message.getText() + " was sent to" + message.getEmail());
    }

}
