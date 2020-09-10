package aop;

import org.springframework.context.annotation.*;

import java.security.Provider;

@Configuration
@ComponentScan
@PropertySource("classpath:mails.properties")
@EnableAspectJAutoProxy
public class AopConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConf.class);
        ServiceA serviceA = context.getBean(ServiceA.class);

        while (true) {
            try {
                serviceA.work();
            } catch (Exception e) {
                System.out.println("Плохо все");
            }
        }

    }
}
