package net.dzioba.asyncrest.domain.bootstrap;

import lombok.extern.slf4j.Slf4j;
import net.dzioba.asyncrest.domain.Book;
import net.dzioba.asyncrest.domain.services.BookService;

import java.time.LocalDate;

@Slf4j
public class DataLoader {

    private final BookService bookService;

    public DataLoader(BookService bookService) {
        this.bookService = bookService;
    }

    public void run(){
        if (noDataInModel()) {
            saveData();
        } else {
            log.debug("No need to load data.");
        }
    }

    private boolean noDataInModel() {
        return bookService.findAll().size() == 0;
    }

    private void saveData() {
        log.debug("Loading data process started...");
        Book book1 = Book.builder().id(1L).author("Zenon Kurcz").title("Geostrategy for dummies").published(LocalDate.of(2011, 11, 11)).isbn("isbnisdnisbn").build();
        bookService.save(book1);
        log.debug("Loaded data: Books...");
    }

}