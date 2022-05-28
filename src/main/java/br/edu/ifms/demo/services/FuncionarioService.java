package br.edu.ifms.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.demo.model.Funcionario;
import br.edu.ifms.demo.repository.FuncionarioRepository;

@Service

public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getFuncionarios(){
        return funcionarioRepository.findAll();
    }

    public void salvarfuncionario(Funcionario funcionario){
        funcionarioRepository.save(funcionario);
    }

    public void delete(Integer idFuncionario){
        funcionarioRepository.deleteById(idFuncionario);
    }

}

