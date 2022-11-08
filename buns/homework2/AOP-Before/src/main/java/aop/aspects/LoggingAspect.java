package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @Pointcut("execution(public void getBook(aop.Book))")
    private void beforeGetBook() {}

  @Pointcut("execution(public void addBook(aop.Book))")
  private void beforeAddBook() {}

  @Pointcut("beforeGetBook() || beforeAddBook()")
  private void allGetAndAddBooks() {}

  @Before("allGetAndAddBooks()")
  public  void  allAdvice(){
    System.out.println("allGetAndAddBooks : log #1");
  }

}
