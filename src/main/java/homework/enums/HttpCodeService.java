package homework.enums;

/**
 * @author Evgeny Borisov
 */

public class HttpCodeService {

    private final String t = "httpcode: ";

    public void processHttp(String text) {
        //todo dgasfdjgsafd  httpcode: 404   sjdghfkjdshgafsdah

        int index = text.indexOf(t);
        int code = Integer.parseInt(text.substring(index + t.length(), index + t.length() + 3));
        System.out.println(code);
        for (PROCESSES p: PROCESSES.values()){
            if (code  >= p.getMin() && code <= p.getMax()){
                p.work();
                return;
            }
        }
        throw new IllegalArgumentException(code + " is not correct.");

    }
}
