package br.edu.ifms.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.demo.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository <Emprestimo,Integer>{
}
    
