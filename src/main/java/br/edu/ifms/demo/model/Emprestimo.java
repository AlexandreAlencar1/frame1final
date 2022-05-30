package br.edu.ifms.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emprestimo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idEmprestimo;

  private String nomeEmprestimo;

  private Double valorEmprestimo;

  // relacionamento ManyToOne com Setor
  // varios emprestimos para um funcionario
  @ManyToOne
  @JoinColumn(name = "Funcionario_id", nullable = true)
  Funcionario funcionario;
}