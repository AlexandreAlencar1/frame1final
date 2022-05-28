package br.edu.ifms.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.demo.model.Projeto;
import br.edu.ifms.demo.repository.ProjetoRepository;



@Service

public class ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    public List<Projeto> getProjetos(){
        return projetoRepository.findAll();
    }

    public void salvarProjeto(Projeto Projeto){
        projetoRepository.save(Projeto);
    }

    public void delete(Integer idProjeto){
        projetoRepository.deleteById(idProjeto);
    }

}

