package aop.aspects;

import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)

public class loggingAspect {

    @Pointcut("execution(* add*(..)) ")
    private void allAddMethods(){}


    @Before("aop.aspects.MyPointcuts.allAddMethods()")

    public void beforeAllAddLoggingAdvice(JoinPoint joinPoint) throws InterruptedException {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " +
                    myBook.getName() + ", aвтор - " + myBook.getAuthor() + ", год издания - " + myBook.getYear());
                }
                else if (obj instanceof String){
                    System.out.println("book added by " + obj);
                }
            }

        }

            System.out.println("beforeGetBookAdvice: логирование попытки получить книгу/журнал");
            System.out.println("---------------------------------------------------------------------------------");
    }

}
