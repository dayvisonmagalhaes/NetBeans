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
public class Pessoa {
    
    private int id;
    private double matricula;
    private String nome;
    private String rua;
    private String complemento;
    private int numero;
    private int cep;
    private int[] foto;
    private String celular;
    private char sexo;
    private String email;
    private String senha;
    private int pessoaId;
    private int bairroId;

    public Pessoa() {
    }

    public Pessoa(int id, double matricula, String nome, String rua, String complemento, int numero, int cep, 
            int[] foto, String celular, char sexo, String email, String senha, int pessoaId, int bairroId) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.rua = rua;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
        this.foto = foto;
        this.celular = celular;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.pessoaId = pessoaId;
        this.bairroId = bairroId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int[] getFoto() {
        return foto;
    }

    public void setFoto(int[] foto) {
        this.foto = foto;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    public int getBairroId() {
        return bairroId;
    }

    public void setBairroId(int bairroId) {
        this.bairroId = bairroId;
    }
    
    
    
}
