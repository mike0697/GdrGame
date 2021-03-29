package it.mike.game.creature.character;

import it.mike.game.activities.Activity;
import it.mike.game.creature.Creature;
import it.mike.game.creature.character.inventory.EquipInventory;
import it.mike.game.creature.character.inventory.Inventory;
import it.mike.game.creature.character.inventory.SaveInventory;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Character")
@XmlAccessorType(XmlAccessType.FIELD)
public class Character extends Creature {

    public Character() {}
    protected double attack;
    protected double magicAttack;
    protected double dodge;
    public Inventory inventory = new Inventory();
    public EquipInventory equipInventory = new EquipInventory();
    //per salvare bisogna che gli oggetti vengano castati all'oro tipo originale
    public SaveInventory savesInventory = new SaveInventory();

    // other stats
    public Stats statistiche = new Stats();
    public Activity activity = new Activity();


    public void setName(String name){
        super.name = name;
    }

    public void setHealth(double health){
        super.health = health;
    }
}
