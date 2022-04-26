/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scenarisocket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrico
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int porta=2000;
        int tempoAtt;
        
        try {
            Client c=new Client(InetAddress.getLocalHost(), porta);
            System.out.println(c.letturaStringa());
            tempoAtt=Integer.parseInt(c.letturaStringa());
            CountDown timer=new CountDown(tempoAtt);
            timer.start();
            c.chiusura();
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
