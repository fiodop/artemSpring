package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect

public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsAdvice(JoinPoint joinPoint){
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("beforeGetStudentsAdvice: logging get list of students before method: " + methodSignature.getName());
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        Double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = 10.0;
//        firstStudent.setAvgGrade(avgGrade);
//        students.clear();
//
//
//        System.out.println("afterReturningGetStudentsAdvice: logging get list of students after method: getStudents()" );
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exeption")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exeption){
        System.out.println("afterThrowingGetStudentsLoggingAdvice() : logging throwing exeptions: " + exeption);
    }
}
