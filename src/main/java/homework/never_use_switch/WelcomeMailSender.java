package homework.never_use_switch;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class WelcomeMailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("WELCOME was sent "+mailInfo);
    }

    @Override
    public int myCode() {
        return 1;
    }
}
