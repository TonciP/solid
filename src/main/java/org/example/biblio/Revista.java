package org.example.biblio;

import org.example.biblio.interfaces.BookReaderInterface;

public class Revista implements BookReaderInterface {
    private String title;
    private String[] contentPages;
    private int currentPage;
    private String articulo;

    public Revista(String title, String articulo, String... contentPages){
        this.title = title;
        this.articulo = articulo;
        this.contentPages = contentPages;
        this.currentPage = 0;
    }

    @Override
    public void goToNextPage() {
        if(currentPage < contentPages.length - 1)
            currentPage++;
    }

    @Override
    public void goToPreviousPage() {
        if(currentPage > 0)
            currentPage--;
    }

    @Override
    public void showCurrentPageContent() {
        System.out.println(title + "Página" +
                (currentPage + 1) + "de" + contentPages.length + "\n" +
                contentPages[currentPage]);
        showCurrentArticuloPage();
    }
    public void showCurrentArticuloPage(){
        System.out.println("Articulo: " + articulo + "\n");
    }
}
