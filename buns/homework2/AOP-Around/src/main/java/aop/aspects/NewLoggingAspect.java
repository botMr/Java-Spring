package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Pointcut("execution(public void getBook(aop.Book))")
    private void beforeGetBook() {
    }

    @Pointcut("execution(public void addBook(aop.Book))")
    private void beforeAddBook() {
    }

    @Pointcut("beforeGetBook() || beforeAddBook()")
    private void allGetAndAddBooks() {
    }

    @Before("allGetAndAddBooks()")
     public  void  allAdvice(){
    System.out.println("allGetAndAddBooks : log #1");
    }


    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
        throws Throwable{
        System.out.println("Пытаются вернуть книгу");
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("Успешно вернули книгу");
        return targetMethodResult;
    }

    @Around("execution(public String addNewBook())")
    public Object aroundAddNewBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
        throws Throwable{
        System.out.println("Пытаемся добавить новую книгу");
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("Успешно добавили новую книгу");
        return targetMethodResult;
    }

}