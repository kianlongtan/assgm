
package pharmacyinventorymangementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Tan
 */
public class GUI extends javax.swing.JFrame {

        Vector<String> M_CN = new Vector<String>();
	Vector<String> M_N = new Vector<String>();
	Vector<String> M_Q = new Vector<String>();
	Vector<String> M_SP = new Vector<String>();
	Vector<String> M_TP = new Vector<String>(); 
	
	String typed = new String();// To store string typed by User/Admin
	String temp = new String();
	int count = 0;
        
    public GUI() {
        initComponents();
    }
    
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Addbutton = new javax.swing.JButton();
        Editbutton = new javax.swing.JButton();
        Deletebutton = new javax.swing.JButton();
        Viewbutton = new javax.swing.JButton();
        Searchbutton = new javax.swing.JButton();
        Closebutton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(163, 235, 220));

        jLabel1.setBackground(new java.awt.Color(102, 255, 0));
        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 2, 24)); // NOI18N
        jLabel1.setText("Welcome to pharmacy inventory mangement system");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacyinventorymangementsystem/welcome pharmacy.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        Addbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacyinventorymangementsystem/add.jpg"))); // NOI18N
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });

        Editbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacyinventorymangementsystem/edit.jpg"))); // NOI18N
        Editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbuttonActionPerformed(evt);
            }
        });

        Deletebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacyinventorymangementsystem/delete.jpg"))); // NOI18N
        Deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebuttonActionPerformed(evt);
            }
        });

        Viewbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacyinventorymangementsystem/view.jpg"))); // NOI18N
        Viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbuttonActionPerformed(evt);
            }
        });

        Searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacyinventorymangementsystem/search.jpg"))); // NOI18N
        Searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbuttonActionPerformed(evt);
            }
        });

        Closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacyinventorymangementsystem/exit.jpg"))); // NOI18N
        Closebutton.setToolTipText("");
        Closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClosebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Viewbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deletebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Closebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Editbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Searchbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Viewbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Closebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbuttonActionPerformed
        new SearchFrameGUI().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_SearchbuttonActionPerformed

    private void ClosebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClosebuttonActionPerformed
         System.exit(0);
    }//GEN-LAST:event_ClosebuttonActionPerformed

    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed
        new AddFrameGUI().setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_AddbuttonActionPerformed

    private void EditbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbuttonActionPerformed
        new EditFrameGUI().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_EditbuttonActionPerformed

    private void ViewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbuttonActionPerformed
        
        new ViewFrameGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewbuttonActionPerformed

    private void DeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebuttonActionPerformed
        
        new DeleteFrameGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DeletebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JButton Closebutton;
    private javax.swing.JButton Deletebutton;
    private javax.swing.JButton Editbutton;
    private javax.swing.JButton Searchbutton;
    private javax.swing.JButton Viewbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
