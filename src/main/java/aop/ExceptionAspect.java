package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionAspect {

    @Value("${dba}")
    private String[] mails;


    @AfterThrowing(pointcut = "execution(* *.*(..))", throwing = "ex")
    public void sendMails(DatabaseRuntimeException ex){
        for (String mail: mails){
            System.out.println("mail sent to " + mail);
            System.out.println(ex.getMessage());
        }

    }
}
