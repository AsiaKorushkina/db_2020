package homework.never_use_switch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        MailMockProducer mailMockProducer = context.getBean(MailMockProducer.class);
        mailMockProducer.sendMailsForever();
    }

}
