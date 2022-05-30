// package br.edu.ifms.demo.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// import br.edu.ifms.demo.model.Agiota;
// import br.edu.ifms.demo.services.AgiotaService;
// import lombok.extern.slf4j.Slf4j;

// @Controller
// @RequestMapping("/Agiota")
// @Slf4j
// public class AgiotaController {

//     @Autowired
//     AgiotaService agiotaService;

//     @GetMapping("/")
//     public String listAgiota(Model model) {
//         log.info("listando Agiota...");
//         List<Agiota> agiotas = agiotaService.getAgiotas();
//         model.addAttribute("Agiotas", agiotas);
//         return "list-Agiota";

//     }

//     @GetMapping("/novo")
//     public String novaAgiota(Model model) {
//         model.addAttribute("Agiota", new Agiota());
//         return "cadastrar-Agiota";
//     }

//     @PostMapping("/save")
//     public String saveAgiotas(@ModelAttribute("turma") Agiota agiota) {
//         agiotaService.salvarAgiota(agiota);
//         return "redirect:/Agiota/";
//     }

// }
