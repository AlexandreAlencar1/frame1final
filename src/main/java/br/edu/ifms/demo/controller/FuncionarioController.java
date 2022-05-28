package br.edu.ifms.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.demo.model.Agiota;
import br.edu.ifms.demo.model.Funcionario;
import br.edu.ifms.demo.services.AgiotaService;
import br.edu.ifms.demo.services.FuncionarioService;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @Autowired
    AgiotaService agiotaService;

    @GetMapping("/")
    public String listFuncionario(Model model) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios = funcionarioService.getFuncionarios();
        model.addAttribute("funcionarios", funcionarios);
        return "list-funcionario";
    }

    @GetMapping("/novo")
    public String novoFuncionario(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        List<Agiota> Agiotas = new ArrayList<Agiota>();
        Agiotas = agiotaService.getAgiotas();
        model.addAttribute("Agiotas", Agiotas);
        return "cadastrar-funcionario";
    }

    @PostMapping("/save")
    public String novoFuncionario(@ModelAttribute Funcionario funcionario) {
        funcionarioService.salvarfuncionario(funcionario);
        return "redirect:/funcionario/";
    }

}
