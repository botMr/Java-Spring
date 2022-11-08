package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args){
      System.out.println("Метод начал работу");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("libBean", UniLibrary.class);
        Book book = context.getBean("bookBean", Book.class);
        library.getBook(book);
        library.addBook(book);
        String bookName =  library.returnBook();
         System.out.println("Вернули книгу " + bookName);
         String add = book.addNewBook();
         System.out.println("Добавили книгу " + add);
        context.close();
        System.out.println("Метод закончился");
    }
}
