
package ec.edu.ups.vista;


import javax.swing.JButton;
import javax.swing.JOptionPane;


public class TresRaya extends javax.swing.JFrame {

    private int turno,contp,contimp;
    private boolean gano=false;
    public javax.swing.JButton[][] cuadro; 
    
    
    
    public TresRaya() {
        initComponents();
        setTitle("Tres en raya");
        setSize(310, 385);
        setLocation(300,200);
        setLocationRelativeTo(null);
        turno=contp=contimp=1;
        cuadro= new JButton[][]{{btnUno,btnDos,btnTres},{btnCuatro,btnCinco,btnSeis},{btnSiete,btnOcho,btnNueve}};
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNueve = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        getContentPane().add(btnNueve);
        btnNueve.setBounds(220, 280, 60, 40);

        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUno);
        btnUno.setBounds(20, 110, 60, 40);

        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDos);
        btnDos.setBounds(120, 110, 60, 40);

        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        getContentPane().add(btnTres);
        btnTres.setBounds(220, 110, 60, 40);

        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuatro);
        btnCuatro.setBounds(20, 190, 60, 40);

        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCinco);
        btnCinco.setBounds(120, 190, 60, 40);

        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeis);
        btnSeis.setBounds(220, 190, 60, 40);

        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiete);
        btnSiete.setBounds(20, 280, 60, 40);

        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        getContentPane().add(btnOcho);
        btnOcho.setBounds(120, 280, 60, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Tres en Raya");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 220, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/3raya.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 90, 290, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
    
       dato(btnUno);
       btnUno.setEnabled(false);
       
       
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
       dato(btnDos);
       btnUno.setEnabled(false);
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
       dato(btnTres);
       btnUno.setEnabled(false);
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
       dato(btnCuatro);
       btnUno.setEnabled(false);
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        dato(btnCinco);
       btnUno.setEnabled(false);
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
       dato(btnSeis);
       btnUno.setEnabled(false);
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
       dato(btnSiete);
       btnUno.setEnabled(false);
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
       dato(btnOcho);
       btnUno.setEnabled(false);
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        dato(btnNueve);
       btnUno.setEnabled(false);
    }//GEN-LAST:event_btnNueveActionPerformed

    
    public void dato(JButton cuadro){
    
        if (!gano){
        
            if (cuadro.getText().equals("")){
            
                if (turno%2==1){
                
                    cuadro.setText("x");
                    cuadro.setForeground(java.awt.Color.red);
                    if (contimp>=3){
                    
                       verificar("x");
                    }
                    contimp++;
                }else{
                
                    cuadro.setText("o");
                    cuadro.setForeground(java.awt.Color.red);
                    if (contimp>=3){
                    
                       verificar("o");
                    }
                    contimp++;
                }
                turno++;
            }
        }
    }
    
    public void verificar(String parametro){
    
        int contador=0;
        int a = 0,b = 0;
        boolean reinicio=false;
        for(int x=0;x<2;x++){
        
            for(int i=0;i<cuadro.length;i++){
            
                for (int j=0;j<cuadro.length;j++){
                
                    if (x==0){
                    
                        a=i;
                        b=j;
                    }else{
                    
                        a=j;
                        b=i;
                        
                    }
                    if (cuadro[a][b].getText().equals(parametro)){
                        contador++;
                    }
                }
                
                if (!gano && contador==3){
                
                    JOptionPane.showMessageDialog(null, "tres en raya");
                    if(JOptionPane.showInternalConfirmDialog(null, "desea reiniciar el juego")==0){
                    
                        nuevo();
                        reinicio=true;
                    }else{
                    
                        gano=false;
                    }
                    break;
                }
                contador=0;
            }
            
        }
    }
    
    public void nuevo(){
    
        gano = false;
        turno=contp=contimp=2;
        for(int i=0;i<cuadro.length;i++){
        
            for(int j=0;j<cuadro.length;j++){
            
                cuadro[i][j].setText("");
            }
        }
    }
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
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TresRaya().setVisible(true);
            }
        });
    }
    public void maquina(){
    
        int p=(int)Math.random()*9;
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
