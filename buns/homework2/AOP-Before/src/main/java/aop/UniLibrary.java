package aop;

import org.springframework.stereotype.Component;

@Component("libBean")
public class UniLibrary {
    public void getBook(Book book){
        System.out.println("Берём книгу!" + " " + book.getName());
    }

    public void addBook(Book book){
        System.out.println("Добавили книгу" + " " + book.setName());
    }
}
