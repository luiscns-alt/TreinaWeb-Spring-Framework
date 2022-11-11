package br.com.luiscarlos.twclientes.controller;

import br.com.luiscarlos.twclientes.model.Cliente;
import br.com.luiscarlos.twclientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("cliente/listar.html");

        List<Cliente> clienteList = clienteRepository.findAll();
        modelAndView.addObject("clientes", clienteList);

        return modelAndView;
    }
}
