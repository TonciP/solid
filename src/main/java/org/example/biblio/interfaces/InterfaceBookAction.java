package org.example.biblio.interfaces;

import org.example.biblio.Book;

public class InterfaceBookAction implements BookReaderInterface{
    private Book book;
    public InterfaceBookAction(Book book){
        this.book = book;
    }

    public void goToNextPage(){
        if(book.getCurrentPage() < book.getContentPages().length - 1){
            book.UpPage();
        }

    };
    public void goToPreviousPage(){
        if(book.getCurrentPage() > 0){
            book.DownPage();
        }
    };
    public void showCurrentPageContent(){
        System.out.println(book.getTitle() + "Página" +
                (book.getCurrentPage() + 1) + "de" + book.getContentPages().length + "\n" +
                book.getContentPages()[book.getCurrentPage()]);
    }

}
