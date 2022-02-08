package com.user.app.controller;


import com.user.app.entity.BookEntity;
import com.user.app.entity.Library;
import com.user.app.repository.BookRepository;
import com.user.app.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookRepository bookRepository;
    private final LibraryRepository libraryRepository;

    @Autowired
    public BookController(BookRepository bookRepository, LibraryRepository libraryRepository) {
        this.bookRepository = bookRepository;
        this.libraryRepository = libraryRepository;
    }

    @PostMapping
    public ResponseEntity<BookEntity> create(@RequestBody BookEntity book) {
        Optional<Library> optionalLibrary = libraryRepository.findById(book.getLibrary().getId());
        if (!optionalLibrary.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        book.setLibrary(optionalLibrary.get());

        BookEntity savedBook = bookRepository.save(book);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(savedBook.getId()).toUri();

        return ResponseEntity.created(location).body(savedBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookEntity> update(@RequestBody BookEntity book, @PathVariable Integer id) {
        Optional<Library> optionalLibrary = libraryRepository.findById(book.getLibrary().getId());
        if (!optionalLibrary.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        Optional<BookEntity> optionalBook = bookRepository.findById(id);
        if (!optionalBook.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        book.setLibrary(optionalLibrary.get());
        book.setId(optionalBook.get().getId());
        bookRepository.save(book);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BookEntity> delete(@PathVariable Integer id) {
        Optional<BookEntity> optionalBook = bookRepository.findById(id);
        if (!optionalBook.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        bookRepository.delete(optionalBook.get());

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<BookEntity>> getAll(Pageable pageable) {
        return ResponseEntity.ok(bookRepository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookEntity> getById(@PathVariable Integer id) {
        Optional<BookEntity> optionalBook = bookRepository.findById(id);
        if (!optionalBook.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(optionalBook.get());
    }
}
