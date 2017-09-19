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
public class Escola {
    
    private int cnpj;
    private String nome;
    private String rua;
    private int numero;
    private String complemento;
    private int bairroId;

    public Escola() {
    }

    public Escola(int cnpj, String nome, String rua, int numero, String complemento, int bairroId) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairroId = bairroId;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getBairroId() {
        return bairroId;
    }

    public void setBairroId(int bairroId) {
        this.bairroId = bairroId;
    }
    
    
    
}
