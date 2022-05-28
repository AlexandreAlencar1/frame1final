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
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Projeto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idProjeto;

        private String nomeProjeto;
        private double custoTotalProjeto;
        private Integer duracao; // em meses

        // ManyToMany Funcionario
        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "PROJETO_FUNCIONARIO", joinColumns = {
                        @JoinColumn(name = "PROJETO_ID") }, inverseJoinColumns = {
                                        @JoinColumn(name = "FUNCIONARIO_ID") })
        private List<Funcionario> funcionarios;

        // OneToOne Agiota
        @OneToOne(cascade = { CascadeType.ALL })
        @JoinColumn(name = "idAgiota")
        private Agiota agiota;
}
