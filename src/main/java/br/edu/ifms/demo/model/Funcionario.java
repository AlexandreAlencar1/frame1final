package br.edu.ifms.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String cargo;
    private double salario;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "PROJETO_FUNCIONARIO",
        joinColumns = {@JoinColumn(name = "FUNCIONARIO_ID")},
        inverseJoinColumns = {@JoinColumn(name = "name = PROJETO_ID")}
    )
    private List<Projeto> projetos;

    
    
}
