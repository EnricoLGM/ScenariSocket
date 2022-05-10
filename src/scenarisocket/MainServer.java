/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scenarisocket;

/**
 *
 * @author Enrico
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int porta=2000;
        int tempoAtt=20000;
        
        Server s=new Server(porta, tempoAtt);
        //CountDown timer=new CountDown(tempoAtt);
        
        /*s.attendi();
        s.scrittura("Tempo di ascolto del server: "+(tempoAtt/1000)+" secondi");
        s.scrittura(String.valueOf(tempoAtt));*/
        //timer.start();
        //s.chiusuraConnessione();
        
        while(true) {
            s.attendiHandler();
        }
    }
    
}
