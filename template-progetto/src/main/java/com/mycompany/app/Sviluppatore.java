package com.mycompany.app;

import java.time.LocalDate;

public class Sviluppatore extends Dipendente{


    public Sviluppatore(String nome, String cognome,int matricola, LocalDate dataAssunzione, double RAL,String skill) {
        super(nome,cognome,matricola,dataAssunzione,RAL,skill);
    }



    @Override
    public double calcolaStipendio(double RAL, float bonus, int AnniServizio) {
        return RAL+bonus+(AnniServizio*1000);
    }
}

