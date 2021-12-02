/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.lang.reflect.Constructor;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author pupil
 */
public class MyGui extends JFrame{
    private JLabel jLabelTitle;
    private JTextField jTextFieldSetText;
    
//import constructor
    public MyGui() {
        initComponent();
        
    }

    private void initComponent() {
        //чтобы программа завершалась по нажатию на крестик
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //window in the middle of screen
        setLocationRelativeTo(null);//works weird
        //устанавливаем размеры окна
        setSize(new Dimension(400,250));
        //set minimum size
        setMinimumSize(new Dimension(400,250));
        
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        jLabelTitle = new JLabel("Hello, JKTV20!");//инициизуем
        //выравнивание элемента по центру окна. это не работает со следующим элементом
        jLabelTitle.setHorizontalAlignment(JLabel.CENTER);
        jLabelTitle.setVerticalAlignment(JLabel.CENTER);      
        this.add(jLabelTitle, BorderLayout.CENTER);
        
        jTextFieldSetText = new JTextField();
        jTextFieldSetText.setText("555");
        jTextFieldSetText.setHorizontalAlignment(JTextField.CENTER);
        jTextFieldSetText.setMaximumSize(new Dimension(300, 50)); //размер элемента
        
        this.getContentPane().add(jTextFieldSetText);
        this.getContentPane().add(jLabelTitle);
        pack();
    }
    
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new MyGui().setVisible(true);
            }
        });
    }
    
}
