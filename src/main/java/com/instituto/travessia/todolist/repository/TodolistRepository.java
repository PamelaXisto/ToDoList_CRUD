package com.instituto.travessia.todolist.repository;

import com.instituto.travessia.todolist.model.Todolist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Conexão com o bd do model

public interface TodolistRepository extends JpaRepository<Todolist, Long> {

    // Filtra pelo status sem precisar digitar SQL manualmente
    List<Todolist> findByStatus(String status);
}
