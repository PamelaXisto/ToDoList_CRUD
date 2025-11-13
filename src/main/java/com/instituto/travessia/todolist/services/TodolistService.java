package com.instituto.travessia.todolist.services;

import com.instituto.travessia.todolist.model.Todolist;
import com.instituto.travessia.todolist.repository.TodolistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Validações
@Service
public class TodolistService {

    @Autowired
    private TodolistRepository todolistRepository;

    public List<Todolist> getAll(){
        return todolistRepository.findAll();
    }

    public List<Todolist> getStatus(String status){
        return todolistRepository.findByStatus(status);
    }

    public Todolist create(Todolist todolist){
        return todolistRepository.save(todolist);
    }

    public Todolist update(Long id, Todolist todolist){
        Optional<Todolist> listExistente = todolistRepository.findById(id);

        if (listExistente.isPresent()) {
            Todolist listAtualizada = listExistente.get();
            listAtualizada.setTarefa(todolist.getTarefa());
            listAtualizada.setPrazo(todolist.getPrazo());
            listAtualizada.setStatus(todolist.getStatus());

            return todolistRepository.save(listAtualizada);

        } else {
            return null;
        }
    }

    public void delete(long id){
        todolistRepository.deleteById(id);
    }

}
