package com.programem.site;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /*Indica que o banco de dados deve criar uma tabela para esse objeto*/
public class Inscricao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    String nome;
    String email;
    String dataDeNascimento;
    String estado;
    String cidade;
    String numero;
    String identidadeDeGenero;
    String orientacaoSexual;
    String identidadeEtnicoRacial;
    String modalidadeDeEnsinoMedio;
    String ano;
    String interesse;
    String estudou;
    String disponibilidade;
    String porqueInteresse;
    
    //Nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    //Email
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    //Data De Nascimento
    public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getDataDeNascimento(){
        return this.dataDeNascimento;
    }

    //Estado
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return this.estado;
    }

    //Cidade
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return this.cidade;
    }
    
    //Numero
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return this.numero;
    }
    
    //Identidade De Genero
    public void setIdentidadeDeGenero(String identidadeDeGenero){
        this.identidadeDeGenero = identidadeDeGenero;
    }
    public String getIdentidadeDeGenero(){
        return this.identidadeDeGenero;
    }

    //Orientação Sexual
    public void setOrientacaoSexual(String orientacaoSexual){
        this.orientacaoSexual = orientacaoSexual;
    }
    public String getOrientacaoSexual(){
        return this.orientacaoSexual;
    }

    //Identidade Étnico racial
    public void setIdentidadeEtnicoRacial(String identidadeEtnicoRacial){
        this.identidadeEtnicoRacial = identidadeEtnicoRacial;
    }
    public String getIdentidadeEtnicoRacial(){
        return this.identidadeEtnicoRacial;
    }

    //Modalidade de ensino médio
    public void setModalidadeDeEnsinoMedio(String modalidadeDeEnsinoMedio){
        this.modalidadeDeEnsinoMedio = modalidadeDeEnsinoMedio;
    }
    public String getModalidadeDeEnsinoMedio(){
        return this.modalidadeDeEnsinoMedio;
    }

    //Ano
    public void setAno(String ano){
        this.ano = ano;
    }
    public String getAno(){
        return this.ano;
    }

    //Interesse
    public void setInteresse(String interesse){
        this.interesse = interesse;
    }
    public String getInteresse(){
        return this.interesse;
    }

    //Estudou
    public void setEstudou(String estudou){
        this.estudou = estudou;
    }
    public String getEstudou(){
        return this.estudou;
    }

    //Disponibilidade
    public void setDisponibilidade(String disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    public String getDisponibilidade(){
        return this.disponibilidade;
    }

    //Porque Tinha Interesse
    public void setPorqueInteresse(String porqueInteresse){
        this.porqueInteresse = porqueInteresse;
    }
    public String getPorqueInteresse(){
        return this.porqueInteresse;
    }

    
}