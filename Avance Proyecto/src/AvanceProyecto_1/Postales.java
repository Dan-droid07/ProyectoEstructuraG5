/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvanceProyecto_1;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



/**
 *
 * @author mayor
 */
public class Postales {

    public void aleatorio() {
        int aleatorio;

        aleatorio = (int) (Math.random() * 5);
        aleatorio++;

    }
    
    public void recibirSobre(){
        
        Timer temporizador = new Timer();
        Date tiempo = new Date();
        TimerTask crearSobre = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Un sobre cada: " + tiempo);
                
            }
            
        };
        temporizador.schedule(crearSobre, 0, 10000);
    }
}

