import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Authentication extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form Authentication
     */
    // constructor for authentication
    public Authentication() {
        super("Login");
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        conn = dbconnect.connectDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AccnumtxtLP = new javax.swing.JLabel();
        AccnumLP = new javax.swing.JTextField();
        PinLP = new javax.swing.JTextField();
        Logon = new javax.swing.JButton();
        PintxtLP = new javax.swing.JLabel();
        NewAccount = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("ONLINE BANKING SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 680, -1));

        AccnumtxtLP.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        AccnumtxtLP.setForeground(new java.awt.Color(51, 0, 51));
        AccnumtxtLP.setText("Account Number:");
        getContentPane().add(AccnumtxtLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, 40));

        AccnumLP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AccnumLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccnumLPActionPerformed(evt);
            }
        });
        getContentPane().add(AccnumLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 250, 39));

        PinLP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(PinLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 250, 38));

        Logon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Logon.setForeground(new java.awt.Color(0, 255, 0));
        Logon.setText("Log in");
        Logon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogonActionPerformed(evt);
            }
        });
        getContentPane().add(Logon, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 140, 43));

        PintxtLP.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        PintxtLP.setText("PIN:");
        getContentPane().add(PintxtLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, 38));

        NewAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewAccount.setForeground(new java.awt.Color(255, 0, 0));
        NewAccount.setText("New Account");
        NewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccountActionPerformed(evt);
            }
        });
        getContentPane().add(NewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, -1, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background-banking-banknote-bill-wallpaper-preview.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1600, 1060));

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AccnumLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccnumLPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccnumLPActionPerformed
// create new account 
    private void NewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccountActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Account ob = new Account();
        ob.setVisible(true);
    }//GEN-LAST:event_NewAccountActionPerformed
// authenticate user details with database
    private void LogonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogonActionPerformed
        // TODO add your handling code here:
        String sql = "select * from Account where Acc=? and Pin=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, AccnumLP.getText());
            pst.setString(2, PinLP.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                setVisible(false);
                Loading ob = new Loading();
                ob.setUpLoading();
                ob.setVisible(true);
                rs.close();
                pst.close();
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect login");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                rs.close();
                pst.close();
               
            }catch(Exception e){
                
            }
        }
        
    }//GEN-LAST:event_LogonActionPerformed

    /**
     * @param args HEY GUYS THIS SECTION IS WHERE I ADD THE CODE INTO IT - Natasha
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccnumLP;
    private javax.swing.JLabel AccnumtxtLP;
    private javax.swing.JButton Logon;
    private javax.swing.JButton NewAccount;
    private javax.swing.JTextField PinLP;
    private javax.swing.JLabel PintxtLP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
