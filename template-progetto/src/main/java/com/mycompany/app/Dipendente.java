package com.mycompany.app;

import java.time.LocalDate;
import java.time.Period;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public  abstract class Dipendente {

    private String nome;
    private String cognome;
    private int matricola;
    private LocalDate dataAssunzione;
    private double RAL;
    private String skill;

    public Dipendente(String nome, String cognome, int matricola,LocalDate dataAssunzione, double RAL,String skill) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.RAL = RAL;
        this.dataAssunzione = dataAssunzione;
        this.skill=skill;

    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public double getRAL() {
        return RAL;
    }

    public String getSkills() {
        return skill;
    }

    public abstract double calcolaStipendio(double RAL, float bonus, int AnniServizio);

    public int calcolaAnzianita(){
        LocalDate dataCorrente= LocalDate.now();
        int AnniServizio = Period.between(dataAssunzione, dataCorrente).getYears();
        return AnniServizio;
    }



}
