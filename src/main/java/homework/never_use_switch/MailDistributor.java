package homework.never_use_switch;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class MailDistributor {

    private List<Class<? extends MailAction>> classes;
    private Map<Integer, MailAction> hashMap = new HashMap<Integer, MailAction>();

    @SneakyThrows
    public MailDistributor()
    {
        Reflections scanner = new Reflections("homework.never_use_switch");
        classes = new ArrayList<>(scanner.getSubTypesOf(MailAction.class));
        for (Class<? extends MailAction> cl : classes){
            MailAction mailAction = cl.getDeclaredConstructor().newInstance();
            hashMap.put(mailAction.getType(), mailAction);
        }

    }


    public void sendMailInfo(MailInfo mailInfo){
        for (Integer i: hashMap.keySet()){
            if (Integer.valueOf(mailInfo.getMailType()).equals(i)){
                hashMap.get(i).sendMail(mailInfo);
                return;
            }
        }
        throw new IllegalStateException("e");
    }
}
