package it.mike.game.activities;

import it.mike.game.creature.character.Character;

public class Activity{

    //protected Character player;
    //TODO aggiungere energia alle varie attività
    // - aggiungere attivita dormire e riposo

    // i costruttori devono essere vuoti per xml ... , si puo risolvere passando i parametri alle funzioni


    public Activity(){}

    public void coding(Character player){
        int n = player.statistiche.getJavaSkills();
        n++;
        player.statistiche.setJavaSkills(n);
        System.out.println("Hai aumentato la tua abilità di coding! ");
        System.out.println("La tua abilità di conding è : " + n);
    }

    public void study(Character player){
        int n = player.statistiche.getCulture();
        n++;
        player.statistiche.setCulture(n);
        System.out.println("Hai studiato! ");
        System.out.println("La tua abilità culture è : " + n);
    }

    public void physicalTraining(Character player){
        int n = player.statistiche.getPhysical();
        n++;
        player.statistiche.setPhysical(n);
        System.out.println("Hai aumentato la tua abilità fisica! ");
        System.out.println("La tua abilità fisica è : " + n);
    }

    public void meditate(Character player){
        int n = player.statistiche.getFocus();
        n++;
        player.statistiche.setFocus(n);
        System.out.println("Hai aumentato la tua abilità focus! ");
        System.out.println("La tua abilità focus è : " + n);
    }

    public void shower(Character player){
        int n = player.statistiche.getAesthetics();
        n++;
        player.statistiche.setAesthetics(n);
        System.out.println("Hai aumentato la tua abilità Aesthetics! ");
        System.out.println("La tua abilità Aesthetics è : " + n);
    }

    public void read(Character player){
        int n = player.statistiche.getIntelligence();
        n++;
        player.statistiche.setIntelligence(n);
        System.out.println("Hai aumentato la tua abilità Int! ");
        System.out.println("La tua abilità Int è : " + n);
    }

    public void work(Character player){
        int n = player.statistiche.getMoney();
        n += 500;
        player.statistiche.setMoney(n);
        System.out.println("Hai guadagnato 500$! ");
        System.out.println("Il tuo portafoglio è di : " + n);
    }
}
