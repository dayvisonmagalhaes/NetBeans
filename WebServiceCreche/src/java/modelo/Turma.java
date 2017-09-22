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
    private String sala;
    private String turno;
    private double escolaCnpj;
    private int tipoTurmaId;

    public Turma() {
    }

    public Turma(int id, String sala, String turno, double escolaCnpj, int tipoTurmaId) {
        this.id = id;
        this.sala = sala;
        this.turno = turno;
        this.escolaCnpj = escolaCnpj;
        this.tipoTurmaId = tipoTurmaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getEscolaCnpj() {
        return escolaCnpj;
    }

    public void setEscolaCnpj(double escolaCnpj) {
        this.escolaCnpj = escolaCnpj;
    }

    public int getTipoTurmaId() {
        return tipoTurmaId;
    }

    public void setTipoTurmaId(int tipoTurmaId) {
        this.tipoTurmaId = tipoTurmaId;
    }

   
    
}
