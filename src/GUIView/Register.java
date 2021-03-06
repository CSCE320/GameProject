package GUIView;
import javax.swing.JOptionPane;

import Controller.RegisterCont;

/**Group Names: Tyler Glass, Michael House, Holly Ruyle, Phu Hoang    
 * Project Part: GUI Display - Register View
 * Program Title: Tic-tac-toe Game 
 * Course: CSCE 320 - Software Engineering
 * Date: February 23, 2015
 * Language and Compiler: Java written in eclipse and Netbeans
 * Sources: CSCE 320 references - Trivial Java Example
*/

public class Register extends javax.swing.JFrame {

	
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        userLB = new javax.swing.JLabel();
        passLB = new javax.swing.JLabel();
        rePassLB = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        passTF = new javax.swing.JPasswordField();
        rePassTF = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();
        regButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        setTitle("Register");
        setResizable(false);

        userLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userLB.setText("UserName");

        passLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passLB.setText("New Password");

        rePassLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rePassLB.setText("Retype Password");

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        regButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        regButton.setText("Register");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wavy-orange-background2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(rePassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(rePassLB))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(regButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(userLB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(passLB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(rePassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(backButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(rePassLB))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(regButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(userLB))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(passLB))
            .addComponent(jLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                                       

    /**
     * ActionPerformed according to the backButton.
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        controller.listen("back");
    }                                          

    /**
     * ActionPerformed according to the regButton.
     * @param evt
     */
    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	int hashPass = hash(passTF.getText()+"g3hzpwh46h7j"); // our hashed password with salt
        int hashPass2 = hash(passTF.getText()+"g3hzpwh46h7j"); // our hashed password with salt
        String info = "register_" + userTF.getText() + "_" + hashPass + "_" + hashPass2;
        controller.updateUserInfo(info);
        controller.listen("register");
        userTF.setText("");
        passTF.setText("");
        rePassTF.setText("");
    }    
    
    /**
     * ActionPerformed according to the WindowClosing.
     * @param evt
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        controller.listen("close");
    }

    
    /**
     * hashes the string passed to it 
     * @param pass the string passed to it, for this application it will be password
     * @return the hash code of the string
     */
    public int hash(String pass){        
        return pass.hashCode();        
    }
    
    /**
     * Set the controller to the register view
     * @param controller
     */
    public void setController(RegisterCont controller){
    	this.controller = controller;
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passLB;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel rePassLB;
    private javax.swing.JPasswordField rePassTF;
    private javax.swing.JButton regButton;
    private javax.swing.JLabel userLB;
    private javax.swing.JTextField userTF; 
    private RegisterCont controller;
    // End of variables declaration//GEN-END:variables
}
