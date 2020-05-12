/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import controlopticadelaluz.Principal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class Reloj implements Runnable{

    Principal PP;
    
    public Reloj(Principal aThis) {
        PP = aThis;
        //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
   
        int hora = 0;
        int minutos = 0;
        int segundos = 0;
        String textoHora = "";
        
        while (true) {
            
            try {
                
                 Calendar calendario = new GregorianCalendar();
            hora =calendario.get(Calendar.HOUR_OF_DAY);
            minutos = calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND);
            textoHora = ""+hora+":"+minutos+":"+segundos;
            PP.darTexto("Hora:"+textoHora);
            Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }

    
      
  
}
