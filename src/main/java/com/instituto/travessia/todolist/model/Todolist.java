package com.instituto.travessia.todolist.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

// Entidades

@Entity
@Table(name = "tbl_list")
public class Todolist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome da tarefa é obrigatório")
    private String tarefa;

    @NotNull(message = "O prazo é obrigatório")
    private BigDecimal prazo;

    @NotBlank(message = "O status é obrigatório (pendente, em andamento ou concluido)")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public BigDecimal getPrazo() {
        return prazo;
    }

    public void setPrazo(BigDecimal prazo) {
        this.prazo = prazo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


