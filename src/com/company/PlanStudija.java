package com.company;

public class PlanStudija {

    Predmet izborniPredmet;
    Predmet obavezniPredmet;


    public PlanStudija (Predmet izborniPredmet, Predmet obavezniPredmet) {}
    Predmet vratiIzborni ()  {return this.izborniPredmet;}
    Predmet vratiObavezni() {return this.obavezniPredmet;}


}
