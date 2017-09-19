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
public class Turma {
    
    private int id;
    private String descricao;
    private String sala;
    private String turno;
    private int escolaCnpj;

    public Turma() {
    }

    public Turma(int id, String descricao, String sala, String turno, int escolaCnpj) {
        this.id = id;
        this.descricao = descricao;
        this.sala = sala;
        this.turno = turno;
        this.escolaCnpj = escolaCnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEscolaCnpj() {
        return escolaCnpj;
    }

    public void setEscolaCnpj(int escolaCnpj) {
        this.escolaCnpj = escolaCnpj;
    }
    
    
}
