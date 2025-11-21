package com.mycompany.app;

import java.time.LocalDate;

public class Manager extends Dipendente{

    public Manager(String nome, String cognome, int matricola, LocalDate dataAssunzione, double RAL,String skill) {
        super(nome,cognome,matricola,dataAssunzione,RAL,skill);
    }


    @Override
    public double calcolaStipendio(double RAL, float bonus, int AnniServizio) {

        return RAL+(1.5*bonus)+(AnniServizio*1500);
    }
}

