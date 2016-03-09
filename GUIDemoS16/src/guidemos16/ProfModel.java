/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemos16;

import java.util.ArrayList;

/**
 *
 * @author Dan
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
