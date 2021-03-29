package it.mike.game;


import it.mike.game.console.ConsoleGame;
import it.mike.game.creature.character.Character;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws JAXBException {

        //Create saveGame xml
        //Use jaxb-stream1.1.0
        //https://github.com/Chavaillaz/jaxb-stream

        Character player1;
        JAXBContext ctx = JAXBContext.newInstance(Character.class);
        Marshaller mat = ctx.createMarshaller();
        mat.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        File file1 = new File("saveGame.xml");
        if (file1.exists()){
            System.out.println("Caricamento save in corso: ");
            Unmarshaller unm = ctx.createUnmarshaller();
            player1 = (Character) unm.unmarshal(file1);
            System.out.println("Il file 'e stato letto");
            player1.inventory.loadTheInventorySaved(player1.savesInventory);
        }else{
            player1 = new Character();
            mat.marshal(player1,file1);
            System.out.println("Il file è stato creato: ");
        }

        //start

        player1.setName("mike");

        ConsoleGame consoleGame = new ConsoleGame();
        String s;
        int close = 0;
        while(close < 10){
            System.out.println("Digita un comando : o help : ");
            Scanner in = new Scanner(System.in); //istanzia un oggetto lettore di tipo Scanner
            s = in.nextLine(); //legge una riga di testo e la memorizza nella variabile s
            System.out.println("Ho letto la riga: " + s);
            //close++;
            if(s.startsWith("close")){
                close = 10;
            }
            boolean command = consoleGame.interpretsCommands(s,player1);
            if(!command && close != 10)
                System.out.println("comando non trovato");


        }
        player1.inventory.saveTheInventory(player1.savesInventory);
        mat.marshal(player1,file1);
        System.out.println("exit ");
    }
}
