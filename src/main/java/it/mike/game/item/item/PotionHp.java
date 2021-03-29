package it.mike.game.item.item;

import it.mike.game.item.GenericItem;

public class PotionHp extends GenericItem {
    protected int hpHeal = 0;

    @Override
    public String toString(){
        return "Pozione HP " + hpHeal +" n: " +  super.quantity;
    }

}
