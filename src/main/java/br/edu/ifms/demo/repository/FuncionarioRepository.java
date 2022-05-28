package br.edu.ifms.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.demo.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository <Funcionario,Integer>{
}
    

