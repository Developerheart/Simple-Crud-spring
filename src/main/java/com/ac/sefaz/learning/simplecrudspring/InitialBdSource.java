//package com.ac.sefaz.learning.simplecrudspring;
//
//import com.ac.sefaz.learning.simplecrudspring.entities.rh.Pessoa;
//import com.ac.sefaz.learning.simplecrudspring.repository.PessoaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
//@Component
//public class InitialBdSource implements CommandLineRunner {
//
//
//    @Autowired
//    private PessoaRepository pessoaRepository;
//
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome("Leonardo");
//        pessoa.setDataNascimento(LocalDate.of(2002,4,8));
//        pessoa.setEmail("Leonardo@gmail.com");
//        pessoa.setCpf("03253682021");
//
//        Pessoa pessoa1 = new Pessoa();
//        pessoa1.setNome("Maria");
//        pessoa1.setDataNascimento(LocalDate.of(2007,3,8));
//        pessoa1.setEmail("mariaAlves@gmail.com");
//        pessoa1.setCpf("03253683431");
//
//        Pessoa pessoa2 = new Pessoa();
//        pessoa2.setNome("Maria");
//        pessoa2.setDataNascimento(LocalDate.of(2007,3,8));
//        pessoa2.setEmail("mariaAlves@gmail.com");
//        pessoa2.setCpf("03253683431");
//
//
//
//        pessoaRepository.save(pessoa);
//        pessoaRepository.save(pessoa1);
//        pessoaRepository.save(pessoa2);
//
//    }
//
//}
//
