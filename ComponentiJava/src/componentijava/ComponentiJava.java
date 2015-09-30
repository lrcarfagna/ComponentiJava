/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentijava;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Lorenzo
 */
public class ComponentiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Applicazione di prova");
        JPanel pannello = new JPanel();
        JLabel etichetta = new JLabel("Ciao Mondo");
        
        JButton bottone = new JButton("Uscita");
        JComboBox comboBox = new JComboBox();
        JCheckBox checkBox1 = new JCheckBox("Java");
        JCheckBox checkBox2 = new JCheckBox("PHP");
        JCheckBox checkBox3 = new JCheckBox("SQL");
        JRadioButton radioButton = new JRadioButton("M");
        JRadioButton radioButton1 = new JRadioButton("F");
        
                
        ImageIcon immagineSwing = new ImageIcon("C:\\Users\\Lorenzo\\Desktop\\assisi.jpg");
        ImageIcon immagineSwing1 = new ImageIcon("C:\\Users\\Lorenzo\\Desktop\\assisi1.jpg");
        JButton contenitoreImmagine = new JButton(immagineSwing);
        
        contenitoreImmagine.setIcon(immagineSwing1);
        
        comboBox.addItem("Linux");
        comboBox.addItem("Windows");
        comboBox.addItem("IOS");
        comboBox.addItem("Android");
        
        
        
        pannello.add(etichetta);
        pannello.add(bottone);
        pannello.add(comboBox);
        pannello.add(checkBox1);
        pannello.add(checkBox2);
        pannello.add(checkBox3);
        pannello.add(contenitoreImmagine);
        pannello.add(radioButton);
        pannello.add(radioButton1);
        
        pannello.setBackground(Color.green);
        frame.add(pannello);
        frame.setSize(500, 500);
        
        frame.setVisible(true);
        
        
        
    }
    
}
