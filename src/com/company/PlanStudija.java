package com.company;

import java.util.Map;
import java.util.Set;

public class PlanStudija {

    Predmet izborniPredmet;
    Predmet obavezniPredmet;
    Map<Integer, Set<Predmet>> predmet;


    public PlanStudija (Predmet izborniPredmet, Predmet obavezniPredmet) {}
    Predmet vratiIzborni ()  {return this.izborniPredmet;}
    Predmet vratiObavezni() {return this.obavezniPredmet;}


}
