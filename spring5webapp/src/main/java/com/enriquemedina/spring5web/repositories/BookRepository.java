package com.enriquemedina.spring5web.repositories;

import org.springframework.data.repository.CrudRepository;
import com.enriquemedina.spring5web.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
