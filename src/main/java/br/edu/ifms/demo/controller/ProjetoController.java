package br.edu.ifms.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.demo.model.Projeto;
import br.edu.ifms.demo.services.ProjetoService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/projeto")
@Slf4j
public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    @GetMapping("/")
    public String listProjeto(Model model) {
        log.info("listando Projeto...");
        List<Projeto> projetos = projetoService.getProjetos();
        model.addAttribute("projetos", projetos);
        return "list-projeto";

    }

    @GetMapping("/novo")
    public String novaProjeto(Model model) {
        model.addAttribute("projeto", new Projeto());
        return "cadastrar-projeto";
    }

    @PostMapping("/save")
    public String saveProjeto(@ModelAttribute("projeto") Projeto projeto) {
        projetoService.salvarProjeto(projeto);
        return "redirect:/projeto/";
    }

}
