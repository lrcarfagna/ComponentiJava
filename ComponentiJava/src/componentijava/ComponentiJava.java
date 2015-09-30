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
        ButtonGroup radioButtons = new ButtonGroup();
        JRadioButton radioButton = new JRadioButton("Microsoft");
        JRadioButton radioButton1 = new JRadioButton("Apple");
        
                
        ImageIcon immagineSwing = new ImageIcon("C:\\Users\\Lorenzo\\Desktop\\assisi.jpg");
        
        ImageIcon immagineSwing1 = new ImageIcon("C:\\Users\\Lorenzo\\Desktop\\assisi1.jpg");
        
        JButton contenitoreImmagine = new JButton(immagineSwing);
        
        /* Non funziona il ridimensionamento dell'immagine
        Image immagineRidimensionata = immagineSwing1.getImage();
        immagineRidimensionata.getScaledInstance(immagineSwing.getIconWidth(),immagineSwing.getIconHeight(),java.awt.Image.SCALE_SMOOTH);
        immagineSwing1.setImage(immagineRidimensionata);
        */
        
        contenitoreImmagine.setRolloverIcon(immagineSwing1);
        
        comboBox.addItem("Linux");
        comboBox.addItem("Windows");
        comboBox.addItem("IOS");
        comboBox.addItem("Android");
        
        
        //Aggiungo i radiobuttons al radioButtonGroup
        radioButtons.add(radioButton);
        radioButtons.add(radioButton1);
        
        //Aggiungo i componenti al pannello
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
        
        //Aggiunto il pannello al frame e setto alcune proprietà
        frame.add(pannello);
        frame.setSize(800, 500);
        frame.setVisible(true);
        
        
        
    }
    
}
