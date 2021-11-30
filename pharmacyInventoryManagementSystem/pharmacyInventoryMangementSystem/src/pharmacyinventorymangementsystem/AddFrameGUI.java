/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyinventorymangementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author Tan
 */

public class AddFrameGUI extends javax.swing.JFrame {
        Vector<String> M_CN = new Vector<String>();
	Vector<String> M_N = new Vector<String>();
	Vector<String> M_Q = new Vector<String>();
	Vector<String> M_SP = new Vector<String>();
	Vector<String> M_TP = new Vector<String>(); 
	
	String typed = new String();// To store string typed by User/Admin
	String temp = new String();
	int count = 0;
  
    public AddFrameGUI() {
        initComponents();
        
    }
   
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MCNtxt = new javax.swing.JTextField();
        MNtxt = new javax.swing.JTextField();
        MQtxt = new javax.swing.JTextField();
        MSPtxt = new javax.swing.JTextField();
        MTPtxt = new javax.swing.JTextField();
        ADDSAVEbutton = new javax.swing.JButton();
        ADDBACKbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Medicine Code Number :");

        jLabel2.setText("Medicine Name:");

        jLabel3.setText("Quantity(Units) :");

        jLabel4.setText("Price in Single Unit :");

        jLabel5.setText("Total Price :");

        MCNtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCNtxtActionPerformed(evt);
            }
        });

        MNtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNtxtActionPerformed(evt);
            }
        });

        ADDSAVEbutton.setText("SAVE");
        ADDSAVEbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDSAVEbuttonActionPerformed(evt);
            }
        });

        ADDBACKbutton.setText("BACK");
        ADDBACKbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBACKbuttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel6.setText("Add Medicine Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ADDSAVEbutton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MCNtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(MNtxt)
                        .addComponent(MQtxt)
                        .addComponent(MSPtxt)
                        .addComponent(MTPtxt))
                    .addComponent(ADDBACKbutton))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MCNtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MNtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(MQtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(MSPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MTPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDSAVEbutton)
                    .addComponent(ADDBACKbutton))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MCNtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCNtxtActionPerformed
         
    }//GEN-LAST:event_MCNtxtActionPerformed

    private void MNtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNtxtActionPerformed

    private void ADDSAVEbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDSAVEbuttonActionPerformed
        LoadPreviousData();
        add();
    }//GEN-LAST:event_ADDSAVEbuttonActionPerformed

    private void ADDBACKbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBACKbuttonActionPerformed
         new GUI().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_ADDBACKbuttonActionPerformed
    
     public void LoadPreviousData(){
        try{
            FileReader inputFile = new FileReader ("Text.txt");
            BufferedReader bufferR = new BufferedReader (inputFile);

            typed = bufferR.readLine();


            for (int i =0 ; i < typed.length() ; i ++){
                if(typed.charAt(i) =='|'){
                    count = count + 1;
                }

                else if(typed.charAt(i) =='/'){
                    M_CN.addElement(temp);
                    temp = "";
                }
                else{
                    temp = temp + typed.charAt(i);
                }
            }
            typed = bufferR.readLine();

            for (int i =0 ; i <typed.length() ; i ++){
                if(typed.charAt(i)=='|'){
                    count = count + 1;
                }

                else if(typed.charAt(i)=='/'){
                    M_N.addElement(temp);
                    temp = "";
                }

                else{
                    temp = temp + typed.charAt(i);
                }
            }
            typed = bufferR.readLine();

            for (int i =0 ; i <typed.length() ; i ++){
                if(typed.charAt(i)=='|'){
                    count = count + 1;
                }

                else if(typed.charAt(i)=='/'){
                    M_Q.addElement(temp);
                    temp = "";
                }

                else{
                    temp = temp + typed.charAt(i);
                }
            }
            typed = bufferR.readLine();

            for (int i =0 ; i <typed.length() ; i ++){
                if(typed.charAt(i)=='|'){
                    count = count + 1;
                }

                else if(typed.charAt(i)=='/'){
                    M_SP.addElement(temp);
                    temp = "";
                }

                else{
                    temp = temp + typed.charAt(i);
                }
            }
            typed = bufferR.readLine();

            for (int i =0 ; i <typed.length() ; i ++){
                if(typed.charAt(i)=='|'){
                    count = count + 1;
                }

                else if(typed.charAt(i)=='/'){
                    M_TP.addElement(temp);
                    temp = "";
                }

                else{
                    temp = temp + typed.charAt(i);
                }
            }

            //JOptionPane.showMessageDialog(null,"File Retrieval Successful!!");
            bufferR.close();

        }

        catch(IOException e){
            //JOptionPane.showMessageDialog(null,"Error");
        }
    }
     
    public void add(){
        typed = MCNtxt.getText();
        M_CN.addElement(typed);

        typed = MNtxt.getText();
        M_N.addElement(typed);

        typed = MQtxt.getText();
        M_Q.addElement(typed);

        typed = MSPtxt.getText();
        M_SP.addElement(typed);

        typed = MTPtxt.getText();
        M_TP.addElement(typed);

        JOptionPane.showMessageDialog(null,"Saved");
        MCNtxt.setText("");  // to clear the input after pressed save
        MNtxt.setText("");
        MQtxt.setText("");
        MSPtxt.setText("");
        MTPtxt.setText("");

        File f1 = new File("text.txt");

        try{

            FileWriter fileW1 = new FileWriter(f1,false);
            BufferedWriter bufferW1 = new BufferedWriter(fileW1);

            for (int i = 0; i < M_CN.size(); i++){
                bufferW1.write("|");
                bufferW1.write(M_CN.elementAt(i));
                bufferW1.write("/");
            }
            bufferW1.newLine();
            for (int i = 0; i < M_N.size(); i++){
                bufferW1.write("|");
                bufferW1.write(M_N.elementAt(i));
                bufferW1.write("/");
            }
            bufferW1.newLine();
            for (int i = 0; i < M_Q.size(); i++){
                bufferW1.write("|");
                bufferW1.write(M_Q.elementAt(i));
                bufferW1.write("/");
            }
            bufferW1.newLine();
            for (int i = 0; i < M_SP.size(); i++){
                bufferW1.write("|");
                bufferW1.write(M_SP.elementAt(i));
                bufferW1.write("/");
            }
            bufferW1.newLine();
            for (int i = 0; i < M_TP.size(); i++){
                bufferW1.write("|");
                bufferW1.write(M_TP.elementAt(i));
                bufferW1.write("/");
            }bufferW1.newLine();

            bufferW1.close();

        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error, try again.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFrameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBACKbutton;
    public javax.swing.JButton ADDSAVEbutton;
    private javax.swing.JTextField MCNtxt;
    private javax.swing.JTextField MNtxt;
    private javax.swing.JTextField MQtxt;
    private javax.swing.JTextField MSPtxt;
    private javax.swing.JTextField MTPtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
