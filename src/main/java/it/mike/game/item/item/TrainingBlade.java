package it.mike.game.item.item;
import it.mike.game.item.GenericItem;
import java.util.Objects;

public class TrainingBlade extends GenericItem {
    public String desk = "A training blade in red color. It is not suitable for actual fights.";
    public int ID = 11;
    public int ID_INV_SPACE = 5; // spazio occupato nell' inventario
    public int level;
    public int RequiredLevel;
    public int attack = 10;
    public int magicAttack = 7;
    public int attackRate = 20;
    //blader required stats
    public int STR = 23;
    public int INT = 4;
    public int DEX  = 16;
    public int numberSlot;
    //fixe per armi senza slot bisogna sottrarre dei valori ancora da scrivere

    public TrainingBlade(){
        super.nome = "Training Blade";
        super.is_equip_or_armor = true;
        super.SPACE_ID = 4;
    }

    @Override
    public String toString(){
        return nome + " "+ ID + " " + attack + " " + level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrainingBlade that = (TrainingBlade) o;
        return ID == that.ID && ID_INV_SPACE == that.ID_INV_SPACE && level == that.level && RequiredLevel == that.RequiredLevel && attack == that.attack && magicAttack == that.magicAttack && attackRate == that.attackRate && STR == that.STR && INT == that.INT && DEX == that.DEX && numberSlot == that.numberSlot && Objects.equals(nome, that.nome) && Objects.equals(desk, that.desk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, desk, ID, ID_INV_SPACE, level, RequiredLevel, attack, magicAttack, attackRate, STR, INT, DEX, numberSlot);
    }
}
