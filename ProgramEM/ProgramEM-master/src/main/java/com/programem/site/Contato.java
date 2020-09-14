package com.programem.site;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /*Indica que o banco de dados deve criar uma tabela para esse objeto*/
public class Contato{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    String nome;
    String email;
    String contato;
    String duvida;
    
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

    //Contato
    public void setContato(String contato){
        this.contato = contato;
    }
    public String getContato(){
        return this.contato;
    }

    //Duvida
    public void setDuvida(String duvida){
        this.duvida = duvida;
    }
    public String getDuvida(){
        return this.duvida;
    }
}