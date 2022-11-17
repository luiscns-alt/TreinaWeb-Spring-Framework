package br.com.luiscarlos.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("boasVindas", "Bem vindo ao curso de Spring com Thymeleaf");

        List<String> aulas = new ArrayList<>();
        aulas.add("Aula 01 - Introdução");
        aulas.add("Aula 02 - Template engines");
        aulas.add("Aula 03 - Arquivos estáticos");

        model.addAttribute("aulas", aulas);
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

    @GetMapping("/saudacao/{nome}")
    public ModelAndView saudacao(@PathVariable String nome) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);

        return modelAndView;
    }

    @GetMapping("/saudacaoParam")
    public ModelAndView saudacaoRequestParam(@RequestParam(required = false, defaultValue = "Luis") String nome) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);

        return modelAndView;
    }

}
