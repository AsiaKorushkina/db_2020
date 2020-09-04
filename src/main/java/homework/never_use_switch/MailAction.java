package homework.never_use_switch;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MailAction {
    private int type;
    public abstract void sendMail(MailInfo message);
}
