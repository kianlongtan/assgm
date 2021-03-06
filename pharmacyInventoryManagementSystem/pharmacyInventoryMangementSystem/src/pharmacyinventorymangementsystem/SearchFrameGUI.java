/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyinventorymangementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Tan
 */
public class SearchFrameGUI extends javax.swing.JFrame {

        Vector<String> M_CN = new Vector<String>();
	Vector<String> M_N = new Vector<String>();
	Vector<String> M_Q = new Vector<String>();
	Vector<String> M_SP = new Vector<String>();
	Vector<String> M_TP = new Vector<String>(); 
	
	String typed = new String();// To store string typed by User/Admin
	String temp = new String();
	int count = 0;
        static int Q = 0;
    
    
    public SearchFrameGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MTPtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SearchBackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MNtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MQtxt = new javax.swing.JTextField();
        MCNtxt = new javax.swing.JTextField();
        MSPtxt = new javax.swing.JTextField();
        SearchMButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Medicine Code Number :");

        SearchBackButton.setText("BACK");
        SearchBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBackButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Medicine Name:");

        jLabel3.setText("Quantity(Units) :");

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel6.setText("Search Medicine Data");

        jLabel4.setText("Price in Single Unit :");

        jLabel5.setText("Total Price :");

        MCNtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCNtxtActionPerformed(evt);
            }
        });

        SearchMButton.setText("Search");
        SearchMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(SearchMButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addComponent(SearchBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MCNtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(MNtxt)
                                    .addComponent(MQtxt)
                                    .addComponent(MSPtxt)
                                    .addComponent(MTPtxt))))
                        .addContainerGap())))
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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBackButton)
                    .addComponent(SearchMButton))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBackButtonActionPerformed
        new GUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SearchBackButtonActionPerformed

    private void MCNtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCNtxtActionPerformed
        
    }//GEN-LAST:event_MCNtxtActionPerformed

    private void SearchMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMButtonActionPerformed
        LoadPreviousData();
        SearchMedicineData();
    }//GEN-LAST:event_SearchMButtonActionPerformed

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
    
    
    
    
    public void SearchMedicineData(){//The search box

        String search;
        int j = 0;
        boolean found = false;

        search = JOptionPane.showInputDialog("Please Enter an ID");

        for(int i = 0;i < M_CN.size(); i++)
        {
            if(M_CN.elementAt(i).equals(search)){
                found = true;
                j = i;
                break;
            }
        }
        if(found == true){

            MCNtxt.setText(M_CN.elementAt(j));
            MNtxt.setText(M_N.elementAt(j));
            MQtxt.setText(M_Q.elementAt(j));
            MSPtxt.setText(M_SP.elementAt(j));
            MTPtxt.setText(M_TP.elementAt(j));
        }
        else{
            JOptionPane.showMessageDialog(null,"To Search, enter a User ID","Search Data", JOptionPane.QUESTION_MESSAGE);
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
            java.util.logging.Logger.getLogger(SearchFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFrameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MCNtxt;
    private javax.swing.JTextField MNtxt;
    private javax.swing.JTextField MQtxt;
    private javax.swing.JTextField MSPtxt;
    private javax.swing.JTextField MTPtxt;
    private javax.swing.JButton SearchBackButton;
    private javax.swing.JButton SearchMButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
