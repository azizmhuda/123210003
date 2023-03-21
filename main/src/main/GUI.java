/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class main {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}

 class GUI extends JFrame implements ActionListener{
   String angka;
    
   JTextField fLength = new JTextField(5);
   JTextField fWidth = new JTextField(5);
   JTextField fHeight = new JTextField(5);

   JLabel judul = new JLabel("Cuboid Calculator");
   JLabel length = new JLabel("Length");
   JLabel width = new JLabel("Width");
   JLabel height = new JLabel("Height");
   JLabel result = new JLabel("result :");
   JLabel Lpp = new JLabel();
   JLabel Kpp = new JLabel();
   JLabel Vb = new JLabel();
   JLabel LPbalok = new JLabel();

   JButton count = new JButton("Count");
   JButton reset = new JButton("Reset");

   public GUI(){
	setTitle("Calculator");
	setDefaultCloseOperation(3);
	setSize(350,400);
       
	setLayout(null);
	add(fLength);
	add(fWidth);
	add(fHeight);
	add(judul);
	add(length);
	add(width);
	add(height);
	add(result);
	add(count);
	add(reset);
        add(Lpp);
        add(Kpp);
        add(Vb);
        add(LPbalok);

	judul.setBounds(120,10,120,20);
        length.setBounds(10,35,120,20);
        fLength.setBounds(130,35,150,20);
        width.setBounds(10,60,120,20);
        fWidth.setBounds(130,60,150,20);
        height.setBounds(10,85,120,20);
        fHeight.setBounds(130,85,150,20);
        result.setBounds(145,110,120,20);
        count.setBounds(80,320,80,20);
        reset.setBounds(180,320,80,20);
        setVisible(true);
        
        count.addActionListener(this);
        fLength.addActionListener(this);
        fWidth.addActionListener(this);
        fHeight.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
   }
   
   @Override
   public void actionPerformed(ActionEvent e){
       if(e.getSource() == count){
           
           String l = fLength.getText();
           int numLength = Integer.parseInt(l);
           String w = fWidth.getText();
           int numWidth = Integer.parseInt(w);
           String h = fHeight.getText();
           int numHeight = Integer.parseInt(h);
           
           int LPersegi = numLength * numWidth;
           int KPersegi = 2*numLength + 2*numWidth;
           int VBalok = numLength*numWidth*numHeight;
           int LPBalok = 2*(numLength*numWidth + numLength*numHeight + numWidth*numHeight);
           
           String strLuas = Integer.toString(LPersegi);
           Lpp.setBounds(10,135,120,20);
           Lpp.setText("Luas pp : " + strLuas);
           
           String strKeliling = Integer.toString(KPersegi);
           Kpp.setBounds(10,160,120,20);
           Kpp.setText("Keliling pp : " + strKeliling);
           
           String strVolume = Integer.toString(VBalok);
           Vb.setBounds(10,185,120,20);
           Vb.setText("Volume balok : " + strVolume);
           
           String strLPBalok = Integer.toString(LPBalok);
           LPbalok.setBounds(10,210,300,20);
           LPbalok.setText("Luas permukaan balok : " + strLPBalok);
           
           //result.setText(strLuas);
       }
       
       /*
       if(e.getSource() == reset){
           fHeight.setText("");
           fWidth.setText("");
           fLength.setText("");
       }
       */
   }
}


//luas persegi panjang = p*l
//keliling persegi panjang = 2p + 2l
//volume balok = p*l*t
//luas permukaan balok = 2(pl + lt + pt)