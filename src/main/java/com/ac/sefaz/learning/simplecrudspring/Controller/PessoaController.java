package com.ac.sefaz.learning.simplecrudspring.Controller;


import com.ac.sefaz.learning.simplecrudspring.entities.rh.Pessoa;
import com.ac.sefaz.learning.simplecrudspring.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class PessoaController {


    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/rh/pessoa")
    public String pessoas(Model model) {
        model.addAttribute("listPessoasRH", pessoaRepository.findAll());
        return "rh/pessoa/index";
    }

    @GetMapping("/rh/pessoa/nova")
    public String novasPessoas(@ModelAttribute("pessoa")  Pessoa pessoa){

        return "rh/pessoa/form";
    }

    @PostMapping("rh/pessoa/salvar")
    public String salvarPessoa(@ModelAttribute(value = "pessoa") Pessoa pessoa ){
        pessoaRepository.save(pessoa);

        return "redirect:/rh/pessoa";
    }

}
