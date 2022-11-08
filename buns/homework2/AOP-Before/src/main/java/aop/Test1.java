package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("libBean", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook(book);
        uniLibrary.addBook(book);

        context.close();
    }
}
