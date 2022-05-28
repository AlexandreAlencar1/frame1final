package br.edu.ifms.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.demo.model.Agiota;
import br.edu.ifms.demo.repository.AgiotaRepository;


@Service

public class AgiotaService {

    @Autowired
    AgiotaRepository agiotaRepository;

    public List<Agiota> getAgiotas(){
        return agiotaRepository.findAll();
    }

    public void salvarAgiota(Agiota agiota){
        agiotaRepository.save(agiota);
    }

    public void delete(Integer idAgiota){
        agiotaRepository.deleteById(idAgiota);
    }

    
}