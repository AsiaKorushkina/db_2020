package homework.never_use_switch;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class MailDistributor<hashMap> {

    Reflections scanner = new Reflections("homework.never_use_switch");
    private List<Class<? extends MailAction>> classes;
    private HashMap<Integer, MailAction> hashMap = new HashMap<>();


    @SneakyThrows
    public MailDistributor()
    {
        classes = new ArrayList<>(scanner.getSubTypesOf(MailAction.class));
        for (Class<? extends MailAction> aClass : classes) {
            MailAction mailAction = aClass.getDeclaredConstructor().newInstance();
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
