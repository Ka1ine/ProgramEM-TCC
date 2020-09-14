package com.programem.site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscricaoController {
    
    @Autowired
    private InscricaoRepository InscricaoRepository;
    
    @GetMapping("/inscricao")
    
    public String InscricaoForm(){
        return "inscricaoForm";
    }

    @PostMapping(path="/inscricaoInsere") 
    
    public String addNewInscricao (
      @RequestParam String nome, 
      @RequestParam String email,
      @RequestParam String dataDeNascimento,
      @RequestParam String estado,
      @RequestParam String cidade,
      @RequestParam String numero,
      @RequestParam String identidadeDeGenero,
      @RequestParam String orientacaoSexual,
      @RequestParam String identidadeEtnicoRacial,
      @RequestParam String modalidadeDeEnsinoMedio,
      @RequestParam String ano,
      @RequestParam String interesse,
      @RequestParam String estudou,
      @RequestParam String disponibilidade,
      @RequestParam String porqueInteresse)
    {
    Inscricao Inscricao = new Inscricao();
    Inscricao.setNome(nome);
    Inscricao.setEmail(email);
    Inscricao.setDataDeNascimento(dataDeNascimento);
    Inscricao.setEstado(estado);
    Inscricao.setCidade(cidade);
    Inscricao.setNumero(numero);
    Inscricao.setIdentidadeDeGenero(identidadeDeGenero);
    Inscricao.setOrientacaoSexual(orientacaoSexual);
    Inscricao.setIdentidadeEtnicoRacial(identidadeEtnicoRacial);
    Inscricao.setModalidadeDeEnsinoMedio(modalidadeDeEnsinoMedio);
    Inscricao.setAno(ano);
    Inscricao.setInteresse(interesse);
    Inscricao.setEstudou(estudou);
    Inscricao.setDisponibilidade(disponibilidade);
    Inscricao.setPorqueInteresse(porqueInteresse);
    InscricaoRepository.save(Inscricao);
      return "/respostainscricao";
    }
}

