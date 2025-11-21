package com.mycompany.app;

import java.util.ArrayList;




import java.util.ArrayList;

public class Gestionale {

    private ArrayList<Dipendente> listaDipendenti;
    private ArrayList<Progetto>listaProgetti;

    public Gestionale(ArrayList<Dipendente>listaDipendenti,ArrayList<Progetto>listaProgetti) {
        this.listaDipendenti=new ArrayList<>();
        this.listaProgetti=new ArrayList<>();

    }

    public ArrayList<Dipendente> getListaDipendenti() {
        return listaDipendenti;
    }

    public ArrayList<Progetto> getListaProgetti() {
        return listaProgetti;
    }

    public void aggiungiDipendente(Dipendente dipendente) {
        listaDipendenti.add(dipendente);
    }

    public void aggiungiProgetto(Progetto progetto) {
        listaProgetti.add(progetto);
    }

    public ArrayList<Dipendente> cercaDipendete(String skill){
        ArrayList<Dipendente> CercaDipendente = new ArrayList<>();
        skill = skill.toLowerCase();
        for (Dipendente d : listaDipendenti) {
            if(d.getSkills().toLowerCase().contains(skill)){
                CercaDipendente.add(d);
            }
        }
        return CercaDipendente;
    }

    public void assegnaProgetto(Progetto progetto,Dipendente dipendente) { //non so come risolverlo.

    }

}
