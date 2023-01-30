package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    public void addBook(BookDto bookDto) {
        books.add(bookDto);
    }

    public void deleteBook(BookDto bookDto) {
        Optional<BookDto> bdto = books.stream().filter(b->b.equals(bookDto)).findAny();
        if(bdto.isPresent()){
            BookDto dto = bdto.get();
            books.remove(dto);
        }
    }
}
