package real_spring.aop_advanced.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import real_spring.aop_advanced.services.DBRuntimeException;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
@PropertySource("classpath:mails.properties")
public class ExceptionHandlerAspect {

    @Value("${dba}")
    String[] mails;

    private Map<DBRuntimeException,Object> exceptions = new WeakHashMap<>();


    @AfterThrowing(pointcut = "execution(* real_spring.aop_advanced..*.*(..))", throwing = "ex")
    public void handleDbException(DBRuntimeException ex) {
        if (!exceptions.containsKey(ex)){
            exceptions.put(ex, null);
            for (String mail : mails) {
                System.out.println("sending mails to " + mail + ": " + ex.getMessage());
            }
        }
    }
}
