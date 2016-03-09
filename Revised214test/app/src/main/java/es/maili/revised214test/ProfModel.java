package es.maili.revised214test;

import java.util.ArrayList;

/**
 * Created by Dan on 08-Mar-16.
 */
public class ProfModel {
    private ArrayList<String> profs= new ArrayList();
    public ProfModel(){
        profs.add("JWong");
        profs.add("Esmaili");
        profs.add("McKenna");
        profs.add("Fodor");
    }
    public String getRandomProf(){
        return profs.get((int)(Math.random()*profs.size()));
    }
    public void addProf(String s){
        profs.add(s);
    }
    
}
