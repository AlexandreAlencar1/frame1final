package br.edu.ifms.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.demo.model.Projeto;

public interface ProjetoRepository extends JpaRepository <Projeto, Integer>{
}
    

