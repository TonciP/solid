package org.example.biblio;

import org.example.biblio.interfaces.BookReaderInterface;

public class Book implements BookReaderInterface {

    private String title;
    private String[] contentPages;
    private int currentPage;

    public Book(String title, String... contentPages){
        this.title = title;
        this.contentPages = contentPages;
        this.currentPage = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getContentPages() {
        return contentPages;
    }

    public void setContentPages(String[] contentPages) {
        this.contentPages = contentPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void UpPage(){
        currentPage++;
    }

    public void DownPage(){
        currentPage--;
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
    }
}