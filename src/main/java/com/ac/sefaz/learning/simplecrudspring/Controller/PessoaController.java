package com.ac.sefaz.learning.simplecrudspring.Controller;


import com.ac.sefaz.learning.simplecrudspring.entities.rh.Pessoa;
import com.ac.sefaz.learning.simplecrudspring.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;
import java.util.UUID;

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
    public String novasPessoas(@ModelAttribute("pessoa") Pessoa pessoa) {

        return "rh/pessoa/form";
    }

    @PostMapping("rh/pessoa/salvar")
    public String salvarPessoa(@ModelAttribute(value = "pessoa") Pessoa pessoa) {
        pessoaRepository.save(pessoa);

        return "redirect:/rh/pessoa";
    }

    @GetMapping("rh/pessoa/{id}")
    public String alterarPessoa(@PathVariable("id") UUID uuid, Model model) {

        Optional<Pessoa> pessoaOpt = pessoaRepository.findById(uuid);
        if (pessoaOpt.isEmpty()) {
            throw new IllegalArgumentException("O id não foi encontrado");

        }
        model.addAttribute("pessoa", pessoaOpt.get());
        return "rh/pessoa/form";


    }

    @GetMapping("rh/pessoa/excluir/{id}")
    public String excluirPessoa(@PathVariable("id") UUID uuid) {

        Optional<Pessoa> pessoaOpt = pessoaRepository.findById(uuid);
        if (pessoaOpt.isEmpty()) {
            throw new IllegalArgumentException("O id não foi encontrado");

        }
        pessoaRepository.delete(pessoaOpt.get());
        return "redirect:/rh/pessoa";

    }
}
