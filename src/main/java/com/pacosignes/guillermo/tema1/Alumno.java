package com.pacosignes.guillermo.tema1;

import java.io.Serializable;

public class Alumno implements Serializable {
    int exp;
    String nom;
    double nota;

    public Alumno(int exp, String nom, double nota) {
        this.exp = exp;
        this.nom = nom;
        this.nota = nota;
    }
    public Alumno(){

    }

    public int getExp() {
        return exp;
    }

    public String getNom() {
        return nom;
    }

    public double getNota() {
        return nota;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
