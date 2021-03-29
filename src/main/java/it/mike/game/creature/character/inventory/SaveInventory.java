package it.mike.game.creature.character.inventory;

import it.mike.game.item.GenericItem;
import it.mike.game.item.item.PotionHp;
import it.mike.game.item.item.TrainingBlade;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
public class SaveInventory {
    @XmlElementWrapper @SuppressWarnings("all")
    static ArrayList<TrainingBlade> trainingBladesArray = new ArrayList<TrainingBlade>();
    @XmlElementWrapper @SuppressWarnings("all")
    static ArrayList<PotionHp> potionHpsArray = new ArrayList<PotionHp>();

    static {
        initialize();
    }

    /**
     * Initialize the arrayList because you need to save the data in a file
     *  and you need to know the length
     */
    private static void initialize(){
        for (int i = 0; i < 3; i++) {
            trainingBladesArray.add(i, null);
        }
        potionHpsArray.add(0,null);
    }

    /**
     * Save an item in a specific array
     * using instanceof for find the classes.
     * @param e is an GenericItem
     */
    public void itemToSave(GenericItem e){
        if(e instanceof TrainingBlade){
            trainingBladesArray.add((TrainingBlade) e);
            trainingBladesArray.remove(0);
        }
        if(e instanceof PotionHp){
            if(potionHpsArray.get(0) == null){
                potionHpsArray.add((PotionHp) e);
                potionHpsArray.remove(0);
            }else {
                potionHpsArray.get(0).quantity += 1;
            }
        }
    }

    /**
     * Load a blade saved
     * @return a Blade
     */
    private GenericItem getBlade()
    {
        //get training blade
        GenericItem item = null;
        for (int i = 0; i < 3; i++) {
            if(trainingBladesArray.get(i) != null){
                item = trainingBladesArray.get(i);
                trainingBladesArray.remove(i);
                trainingBladesArray.add(null);
                break;
            }
        }
        return item;
    }

    /**
     * return an potion or null if is empty
     * @return an potion or null if is empty
     */
    private GenericItem getPotion(){
        GenericItem item;
        int i = 0;
        item = potionHpsArray.get(i);
        potionHpsArray.remove(i);
        potionHpsArray.add(null);
        return item;
    }

    /**
     * Load an item saved
     * @return an item or null if is empty
     */
    public GenericItem getItem(){
        GenericItem item;
        item = getBlade();
        if(item != null)
            return item;
        item = getPotion();
        return item;
    }
}
