package com.programem.site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContatoController{
    
    @Autowired
    private ContatoRepository ContatoRepository;
    
    @GetMapping("/contato")
    
    public String ContatoForm(){
        return "contatoForm";
    }

    @PostMapping(path="/contatoInsere") 
    
    public String addNewContato (
      @RequestParam String nome, 
      @RequestParam String email,
      @RequestParam String contato,
      @RequestParam String duvida)
    {
    Contato Contato = new Contato();
    Contato.setNome(nome);
    Contato.setEmail(email);
    Contato.setContato(contato);
    Contato.setDuvida(duvida);
    ContatoRepository.save(Contato);
      return "/respostacontato";
    }
}

