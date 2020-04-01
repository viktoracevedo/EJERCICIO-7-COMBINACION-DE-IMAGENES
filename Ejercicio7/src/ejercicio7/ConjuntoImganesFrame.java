/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author vikto
 */
public class ConjuntoImganesFrame extends javax.swing.JFrame {

    /**
     * Creates new form ConjuntoImganesFrame
     */
    public ConjuntoImganesFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        imgGeek = new javax.swing.JLabel();
        chkBarbilla = new javax.swing.JCheckBox();
        chkLentes = new javax.swing.JCheckBox();
        chkCabello = new javax.swing.JCheckBox();
        chkDientes = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        chkBarbilla.setText("Barbilla");
        chkBarbilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBarbillaActionPerformed(evt);
            }
        });

        chkLentes.setText("Lentes");
        chkLentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLentesActionPerformed(evt);
            }
        });

        chkCabello.setText("Cabello");
        chkCabello.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCabelloActionPerformed(evt);
            }
        });

        chkDientes.setText("Dientes");
        chkDientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkLentes)
                            .addComponent(chkCabello)
                            .addComponent(chkDientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(imgGeek)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkBarbilla)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(chkBarbilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgGeek)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkLentes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCabello)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkDientes)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkBarbillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBarbillaActionPerformed
        // TODO add your handling code here:

        imgGeek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" +  calculaName())));
    }//GEN-LAST:event_chkBarbillaActionPerformed

    private void chkLentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLentesActionPerformed
        // TODO add your handling code here:
        imgGeek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" +  calculaName())));
    }//GEN-LAST:event_chkLentesActionPerformed

    private void chkCabelloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCabelloActionPerformed
        // TODO add your handling code here:
        imgGeek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" +  calculaName())));
    }//GEN-LAST:event_chkCabelloActionPerformed

    private void chkDientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDientesActionPerformed
        // TODO add your handling code here:

        imgGeek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" +  calculaName())));
    }//GEN-LAST:event_chkDientesActionPerformed

    private String calculaName(){
        String resultado = "geek-";
        resultado = resultado + (chkBarbilla.isSelected() ? "c" : "-");
        resultado = resultado + (chkLentes.isSelected() ? "g" : "-");
        resultado = resultado + (chkCabello.isSelected() ? "h" : "-");
        resultado = resultado + (chkDientes.isSelected() ? "t" : "-");
        return resultado + ".gif";
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
            java.util.logging.Logger.getLogger(ConjuntoImganesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConjuntoImganesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConjuntoImganesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConjuntoImganesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConjuntoImganesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkBarbilla;
    private javax.swing.JCheckBox chkCabello;
    private javax.swing.JCheckBox chkDientes;
    private javax.swing.JCheckBox chkLentes;
    private javax.swing.JLabel imgGeek;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
