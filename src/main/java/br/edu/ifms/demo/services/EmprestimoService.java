package br.edu.ifms.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.demo.model.Emprestimo;
import br.edu.ifms.demo.repository.EmprestimoRepository;


@Service

public class EmprestimoService {

    @Autowired
    EmprestimoRepository emprestimoRepository;

    public List<Emprestimo> getEmprestimos(){
        return emprestimoRepository.findAll();
    }

    public void salvarEmprestimo(Emprestimo emprestimo){
        emprestimoRepository.save(emprestimo);
    }

    public void delete(Integer idEmprestimo){
        emprestimoRepository.deleteById(idEmprestimo);
    }

}
