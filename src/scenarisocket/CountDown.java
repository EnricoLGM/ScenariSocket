package scenarisocket;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enrico
 */
public class CountDown extends Thread {
    private final int durata;
    
    public CountDown(int d){
        durata = d;
    }
    
    @Override
    public void run(){
        System.out.println("Inizio\n");
        visualizza();
        System.out.println("Fine\n");
    }
    
    public void visualizza(){
        for(int i=durata/1000;i>0;i--){
            try {
                System.out.println(i);
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CountDown.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
