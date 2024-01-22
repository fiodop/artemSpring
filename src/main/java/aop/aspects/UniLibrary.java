package aop.aspects;

import aop.aspects.AbstractLibrary;
import aop.aspects.Book;
import org.springframework.stereotype.Component;

@Component("uniLibrary")

public class UniLibrary extends AbstractLibrary {
    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary ");
        System.out.println("------------------------------------------");
    }
    public void returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void getMagasine(){
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("------------------------------------------");
    }
    public void returnMagasine(){
        System.out.println("Мы возвращаем журнал из UniLibrary");
        System.out.println("------------------------------------------");
    }
    public void addBook(String personName, Book book){
        System.out.println("Добавлена книга " + book.getName());
        System.out.println("------------------------------------------");
    }

    public void addMagasine(String personName, Book book){
        System.out.println("Добавлен журнал " + book.getName());
        System.out.println("------------------------------------------");
    }
}
