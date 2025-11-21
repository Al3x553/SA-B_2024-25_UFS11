package com.mycompany.app;

import java.time.LocalDate;

public class Progetto {

    private String nome;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private String skills;
    private float budget;
    private float bonus;

    public Progetto(String nome, LocalDate dataInizio, LocalDate dataFine, String skills, float budget, float bonus) {
        this.nome = nome;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.skills = skills;
        this.budget = budget;
        this.bonus = bonus;

    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public String getSkills() {
        return skills;
    }

    public float getBudget() {
        return budget;
    }

    public  float getBonus() {
        return bonus;
    }


}

