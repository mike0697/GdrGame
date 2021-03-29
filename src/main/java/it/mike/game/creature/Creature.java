package it.mike.game.creature;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Creature")
@XmlAccessorType(XmlAccessType.FIELD)
abstract public class Creature {

    protected String name;
    protected int level = 1;
    protected double health;
    protected boolean is_dead = false;
    protected int position_x;
    protected int position_y;



}
