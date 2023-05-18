package com.example.restservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.restservice.entities.BookSlot;

public interface BookSlotRepository extends CrudRepository<BookSlot, String>{
    
}
