/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author u6390869
 */
public class Bairro {
    
    private int id;
    private String nome;
    private int cidadeId;

    public Bairro() {
    }

    public Bairro(int id, String nome, int cidadeId) {
        this.id = id;
        this.nome = nome;
        this.cidadeId = cidadeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(int cidadeId) {
        this.cidadeId = cidadeId;
    }

    
    
    
    
}
