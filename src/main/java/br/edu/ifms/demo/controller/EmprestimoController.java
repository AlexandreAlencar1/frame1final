// package br.edu.ifms.demo.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// import br.edu.ifms.demo.model.Emprestimo;
// import br.edu.ifms.demo.services.EmprestimoService;
// import lombok.extern.slf4j.Slf4j;

// @Controller
// @RequestMapping("/Emprestimo")
// @Slf4j
// public class EmprestimoController {

//     @Autowired
//     EmprestimoService emprestimoService;

//     @GetMapping("/")
//     public String listEmprestimo(Model model) {
//         log.info("listando Emprestimo...");
//         List<Emprestimo> emprestimos = emprestimoService.getEmprestimos();
//         model.addAttribute("Emprestimos", emprestimos);
//         return "list-emprestimo";

//     }

//     @GetMapping("/novo")
//     public String novaEmprestimo(Model model) {
//         model.addAttribute("emprestimo", new Emprestimo());
//         return "cadastrar-emprestimo";
//     }

//     @PostMapping("/save")
//     public String saveEmprestimo(@ModelAttribute("emprestimo") Emprestimo emprestimo) {
//         emprestimoService.salvarEmprestimo(emprestimo);
//         return "redirect:/Emprestimo/";
//     }

// }