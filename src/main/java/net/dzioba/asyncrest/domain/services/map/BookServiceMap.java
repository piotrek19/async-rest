package net.dzioba.asyncrest.domain.services.map;


import lombok.extern.slf4j.Slf4j;
import net.dzioba.asyncrest.domain.Book;
import net.dzioba.asyncrest.domain.services.BookService;

import java.time.LocalDate;

@Slf4j
public class BookServiceMap extends CrudServiceMap<Book> implements BookService {

    private static final BookService INSTANCE = new BookServiceMap();

    public static BookService getInstance(){
        return INSTANCE;
    }

    private BookServiceMap() {
        loadData();
    }

    private void loadData() {
        log.debug("Loading data process started...");
        Book book1 = Book.builder().id(1L).author("Zenon Kurcz").title("Geostrategy for dummies").published(LocalDate.of(2011, 11, 11)).isbn("isbnisdnisbn").build();
        Book book2 = Book.builder().id(2L).author("Zenon Kurcz").title("Lambda for dummies").published(LocalDate.of(2016, 1, 12)).isbn("isdnisbn").build();
        this.save(book1);
        this.save(book2);
        log.debug("Loaded data: Books...");
    }
}
