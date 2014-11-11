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
public class MessageGenerator {
    private List<String> randomMessage;

    public MessageGenerator() {
        randomMessage = new ArrayList</*String(Optional)*/>();
        randomMessage.add("How are you today?");
        randomMessage.add("Happy Birthday!");
        randomMessage.add("I'm part of a list!");
        randomMessage.add("Who are you?");
        randomMessage.add("We have Veggies!");
    }
    
    public void addAMessage(String newMsg){
        randomMessage.add(newMsg);
        Set<String> removeDupes = new LinkedHashSet<>(randomMessage);
        randomMessage = new ArrayList<>(removeDupes);
    }
    
    public void removeAMessage(String remMsg){
        Random r = new Random(System.nanoTime());
        int idx = r.nextInt(randomMessage.size());
        randomMessage.remove(idx);
    }
    
    public String getMessage(){
        Random r = new Random(System.nanoTime());
        int idx = r.nextInt(randomMessage.size());
        String msg = randomMessage.get(idx);
        return msg;
    }

    public List<String> getRandomMessage() {
        return randomMessage;
    }

    public void setRandomMessage(List<String> randomMessage) {
        this.randomMessage = randomMessage;
    }
    
    
}
