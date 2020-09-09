package homework.never_use_switch;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */

@Service("defaultMailSender")
public class DefaultMailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        throw new UnsupportedOperationException(mailInfo.getMailType() + " not supported yet");
    }

    @Override
    public int myCode() {
        return 0;
    }
}
