package br.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import br.edu.ufcg.computacao.psoft.commerce.model.Pessoa;



@RestController
@RequestMapping
public class PessoaV1RestController {

    private Map<Integer, Pessoa> pessoasRepository;

    public PessoaV1RestController(){
        this.pessoasRepository = new HashMap<>();   
    }
    



    
}
