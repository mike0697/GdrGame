package it.mike.game.console;

import it.mike.game.creature.character.Character;
import it.mike.game.item.item.PotionHp;
import it.mike.game.item.item.TrainingBlade;


public class ConsoleGame {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public boolean interpretsCommands(String s, Character player1){
        if(s.startsWith("help")){
            System.out.println("Lista commandi : ");
            System.out.print("close, ");
            System.out.print("save, ");
            System.out.print("coding, ");
            System.out.print("read, ");
            System.out.print("work, ");
            System.out.print("study, ");
            System.out.print("training, ");
            System.out.print("meditate, ");
            System.out.print("shower, ");
            System.out.println(" ");
        }
        if(s.startsWith("coding")){
            player1.activity.coding(player1);
            return true;
        }
        if(s.startsWith("read")){
            player1.activity.read(player1);
            return true;
        }
        if(s.startsWith("work")){
            player1.activity.work(player1);
            return true;
        }
        if(s.startsWith("study")){
            player1.activity.study(player1);
            return true;
        }
        if(s.startsWith("training")){
            player1.activity.physicalTraining(player1);
            return true;
        }
        if(s.startsWith("meditate")){
            player1.activity.meditate(player1);
            return true;
        }
        if(s.startsWith("shower")){
            player1.activity.shower(player1);
            return true;
        }
        if(s.startsWith("print")){
            player1.inventory.printInventory();
            return true;
        }

        if(s.startsWith("add blade")){
            TrainingBlade blade = new TrainingBlade();
            player1.inventory.addItem(blade);
            return true;
        }
        if(s.startsWith("add potion")){
            PotionHp pot = new PotionHp();
            player1.inventory.addItem(pot);
            return true;
        }
        if(s.startsWith("rem potion")){
            PotionHp pot = new PotionHp();
            player1.inventory.removeItem(pot);
            return true;
        }
        if(s.startsWith("rem blade")){
            TrainingBlade blade = new TrainingBlade();
            player1.inventory.removeItem(blade);
            return true;
        }
        if(s.startsWith("equip")){
            TrainingBlade blade = new TrainingBlade();
            player1.equipInventory.setBlade(player1.inventory, blade);
            return true;
        }



        return false;
    }
}
