package homework.never_use_switch;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */

@Component
public class MailDistributor {

    @Autowired
    private Map<String, MailSender> mailSenderMap;

    public void sendMailInfo(MailInfo mailInfo) {
        Optional<MailSender> first = mailSenderMap.values()
                            .stream()
                            .filter(i -> mailInfo.getMailType() == i.myCode())
                            .findFirst();
        if (first.isPresent()){
            first.get().sendMail(mailInfo);
        }
        else{
            mailSenderMap.get("defaultMailSender").sendMail(mailInfo);
        }

    }
}











