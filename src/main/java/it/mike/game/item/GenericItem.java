package it.mike.game.item;

import it.mike.game.item.item.TrainingBlade;
import java.util.Objects;

public class GenericItem {
    public String nome = "Generic";
    public int ID;
    public int SPACE_ID = 1;
    public int type;
    public int quantity = 1;
    public boolean is_equip_or_armor = false;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericItem that = (GenericItem) o;
        return ID == that.ID && SPACE_ID == that.SPACE_ID && type == that.type && is_equip_or_armor == that.is_equip_or_armor && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ID, SPACE_ID, type, is_equip_or_armor);
    }

    @Override @SuppressWarnings("all")
    public GenericItem clone(){
        GenericItem newItem = new GenericItem();
        newItem.ID = this.ID;
        newItem.SPACE_ID = this.SPACE_ID;
        newItem.type = this.type;
        newItem.quantity = this.quantity;
        newItem.is_equip_or_armor = this.is_equip_or_armor;
        return newItem;
    }

    @Override
    public String toString(){
        if(this instanceof TrainingBlade){
            TrainingBlade blade = (TrainingBlade) this;
            return  blade.nome + " "+ ID + " " + blade.attack + " " + blade.level;
        }
        else
        {
            return this.ID + " item generico ";
        }
    }


}


