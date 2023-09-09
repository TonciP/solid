package org.example;

import org.example.biblio.Book;
import org.example.biblio.interfaces.InterfaceBookAction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("El gran libro con paginas",
                "Primera página",
                "Segunda página",
                "Tercera página",
                "Cuarta página",
                "Quinta página"
        );

        /*InterfaceBookAction interfaceBookAction = new InterfaceBookAction(book);

        interfaceBookAction.showCurrentPageContent();
        interfaceBookAction.goToNextPage();
        interfaceBookAction.showCurrentPageContent();
        interfaceBookAction.goToNextPage();
        interfaceBookAction.showCurrentPageContent();
        interfaceBookAction.goToNextPage();
        interfaceBookAction.showCurrentPageContent();
        interfaceBookAction.goToPreviousPage();
        interfaceBookAction.showCurrentPageContent();*/


        // opcion 1
        book.showCurrentPageContent();
        book.goToNextPage();
        book.showCurrentPageContent();
        book.goToNextPage();
        book.showCurrentPageContent();
        book.goToNextPage();
    }
}