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
public class Patatainfomaticaquetesaluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Hola, soy la patata informatica.");
        Preguntanombre obx1=new Preguntanombre();
        obx1.setNombre(JOptionPane.showInputDialog("Serias tan amable de decirme tu nombre?"));
        JOptionPane.showMessageDialog(null, "Muchas gracias");
        Saludo obx2= new Saludo();
        JOptionPane.showMessageDialog(null, "Hola "+obx2.Mandar()+(". Encantado de conocerte"));
    }
    
}
