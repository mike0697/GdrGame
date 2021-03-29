package it.mike.game.creature.character;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * contiene le statistiche e i metodi per modificarle
 */
@XmlRootElement(name = "Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

    public Stats() {}


    //save the skill in a text area

    //skill
    protected int intelligence = 0;
    protected int sociability = 0;
    protected int focus = 0;
    protected int javaSkills = 0;
    protected int otherSkill = 0;
    protected int innerGame = 0;
    // to level up soon
    protected int aesthetics = 0;

    protected int influence = 0;
    protected int physical = 0;

    protected int health = 0;
    protected int culture = 0;

    protected int mapExploration = 0;

    //time for day and activity
    protected int maxEnergy = 10;
    protected int energy = 10; //reset every day

    protected int money = 500;




    public int getIntelligence() {
        return intelligence;
    }

    public int getSociability() {
        return sociability;
    }

    public int getFocus() {
        return focus;
    }

    public int getJavaSkills() {
        return javaSkills;
    }

    public int getOtherSkill() {
        return otherSkill;
    }

    public int getInnerGame() {
        return innerGame;
    }

    public int getAesthetics() {
        return aesthetics;
    }

    public int getInfluence() {
        return influence;
    }

    public int getPhysical() {
        return physical;
    }

    public int getHealth() {
        return health;
    }

    public int getCulture() {
        return culture;
    }

    public int getMapExploration() {
        return mapExploration;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMoney() {
        return money;
    }



    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setSociability(int sociability) {
        this.sociability = sociability;
    }

    public void setFocus(int focus) {
        this.focus = focus;
    }

    public void setJavaSkills(int _javaSkills) {
        this.javaSkills = _javaSkills;
    }

    public void setOtherSkill(int otherSkill) {
        this.otherSkill = otherSkill;
    }

    public void setInnerGame(int innerGame) {
        this.innerGame = innerGame;
    }

    public void setAesthetics(int aesthetics) {
        this.aesthetics = aesthetics;
    }

    public void setInfluence(int influence) {
        this.influence = influence;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setCulture(int culture) {
        this.culture = culture;
    }

    public void setMapExploration(int mapExploration) {
        this.mapExploration = mapExploration;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
