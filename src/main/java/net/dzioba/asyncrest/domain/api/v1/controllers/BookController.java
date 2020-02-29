package net.dzioba.asyncrest.domain.api.v1.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dzioba.asyncrest.domain.Book;
import net.dzioba.asyncrest.domain.services.BookService;
import net.dzioba.asyncrest.domain.services.map.BookServiceMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Path(BookController.RESOURCE_BASE_URI)
public class BookController {

    public static final String RESOURCE_BASE_URI = "api/v1/books";

    private final BookService bookService = BookServiceMap.getInstance();

    @GET
    public List<Book> getBooks(){
        return bookService.findAll();
    }

    @GET
    @Path("{id}")
    public Book getBooks(@PathParam("id") Long id){
        return bookService.findById(id);
    }

}
