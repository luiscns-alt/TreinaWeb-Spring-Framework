package br.com.luiscarlos.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/mensagem")
    public String mensagem(Model model) {
        model.addAttribute("mensagem", "Mensagem vinda do servido");
        return "mensagem";
    }

    @GetMapping("/map")
    public String mensagemMap(ModelMap modelMap) {
        modelMap.addAttribute("mensagem", "Mensagem vinda do servido, ex Map");
        return "mensagem";
    }

    @GetMapping("/modelandview")
    public ModelAndView mensagemModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "Mensagem tipo Model e View");

        return modelAndView;
    }
}
