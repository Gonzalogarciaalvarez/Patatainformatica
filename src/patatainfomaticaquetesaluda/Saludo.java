/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patatainfomaticaquetesaluda;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Saludo {
    Preguntanombre obx1=new Preguntanombre();

    public Saludo() {
    }
    
    public String Mandar(){
        return obx1.getNombre();
    }
}
