/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

import java.util.*;

/**
 *
 * @author Matthew
 */
public class RandomMessageGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        MessageGenerator generator = new MessageGenerator();
        System.out.println("Type in your own message in the console!");
        generator.addAMessage(keyboard.nextLine());
        System.out.println(generator.getRandomMessage());
    }
    
}
