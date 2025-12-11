package com.demo.api.version.query;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    private BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    Books getAllBooks()
    {
        return booksService.getAllBooks();
    }

    @GetMapping(value="/search", version = "1.0")
    Books searchBooks(@RequestParam("q") String query)
    {
         return booksService.searchByTitle(query);
    }

    @GetMapping(value="/search", version = "2.0")
    Books searchBooks_v2(@RequestParam("q") String query)
    {
        return booksService.searchBooks(query);
    }


}
