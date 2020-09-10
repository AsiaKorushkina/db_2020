package real_spring.aop_advanced.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import real_spring.aop_advanced.services.DBRuntimeException;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
//@PropertySource("mails_dba.properties")
public class ExceptionHandlerAspect {

//    @Value()

    @Pointcut("@target(org.springframework.stereotype.Repository)")
    public void repositoryMethods() {}

    @Pointcut("execution(* real_spring.aop_advanced..*.*(..))")
    public void allMethods() {}

    @AfterThrowing(pointcut = "repositoryMethods() && allMethods()", throwing = "ex")
    public void handleDbException(DBRuntimeException ex) {
        System.out.println("sending mails "+ex.getMessage());
    }
}
