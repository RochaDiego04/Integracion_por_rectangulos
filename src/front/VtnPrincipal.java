
package front;

import back.Valores;
import javax.swing.JOptionPane;

public class VtnPrincipal extends javax.swing.JFrame {

    Valores objIntegracion = null;
    
    public VtnPrincipal() {
        initComponents();
        objIntegracion = new Valores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabMetodoRectangulo = new javax.swing.JTabbedPane();
        tabIngresarDatos = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSuperior = new javax.swing.JLabel();
        txtSuperior = new javax.swing.JTextField();
        lblSimInte = new javax.swing.JLabel();
        lblFunción = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtInferior = new javax.swing.JTextField();
        lblInferior = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumRect = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblFix = new javax.swing.JLabel();
        txtFix = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tabMostrarCalculo = new javax.swing.JPanel();
        btn_Calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabMetodoRectangulo.setBackground(new java.awt.Color(204, 204, 204));
        tabMetodoRectangulo.setForeground(new java.awt.Color(0, 0, 0));

        tabIngresarDatos.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("\"Integración númerica por Rectangulos.\"");

        lblSuperior.setForeground(new java.awt.Color(0, 0, 0));
        lblSuperior.setText("Valor Superior");

        txtSuperior.setBackground(new java.awt.Color(204, 204, 204));
        txtSuperior.setForeground(new java.awt.Color(0, 0, 0));

        lblFunción.setForeground(new java.awt.Color(0, 0, 0));
        lblFunción.setText("Función");

        txtFuncion.setBackground(new java.awt.Color(204, 204, 204));
        txtFuncion.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("dx");

        txtInferior.setBackground(new java.awt.Color(204, 204, 204));
        txtInferior.setForeground(new java.awt.Color(0, 0, 0));

        lblInferior.setForeground(new java.awt.Color(0, 0, 0));
        lblInferior.setText("Valor Inferior");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Número de rectangulos:");

        txtNumRect.setBackground(new java.awt.Color(204, 204, 204));
        txtNumRect.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("n =");

        lblFix.setForeground(new java.awt.Color(0, 0, 0));
        lblFix.setText("Fix a utilizar:");

        txtFix.setBackground(new java.awt.Color(204, 204, 204));
        txtFix.setForeground(new java.awt.Color(0, 0, 0));
        txtFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFixActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar Datos");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenesINR/Simbolo Integral.png"))); // NOI18N

        javax.swing.GroupLayout tabIngresarDatosLayout = new javax.swing.GroupLayout(tabIngresarDatos);
        tabIngresarDatos.setLayout(tabIngresarDatosLayout);
        tabIngresarDatosLayout.setHorizontalGroup(
            tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSuperior)
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumRect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(113, 113, 113))
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInferior)
                            .addComponent(lblSimInte))
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                        .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblFix)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                        .addComponent(lblFunción)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)))
                                .addGap(113, 113, 113))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabIngresarDatosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar)
                                .addGap(31, 31, 31))))))
            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblTitulo))
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(txtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabIngresarDatosLayout.setVerticalGroup(
            tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuperior)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumRect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFix))
                        .addGap(44, 44, 44))
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addComponent(txtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblSimInte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblFunción)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(2, 2, 2)
                        .addComponent(txtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInferior)
                    .addComponent(btnGuardar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tabMetodoRectangulo.addTab("Ingresar", tabIngresarDatos);

        tabMostrarCalculo.setBackground(new java.awt.Color(255, 255, 255));

        btn_Calcular.setText("Calcular");

        javax.swing.GroupLayout tabMostrarCalculoLayout = new javax.swing.GroupLayout(tabMostrarCalculo);
        tabMostrarCalculo.setLayout(tabMostrarCalculoLayout);
        tabMostrarCalculoLayout.setHorizontalGroup(
            tabMostrarCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMostrarCalculoLayout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        tabMostrarCalculoLayout.setVerticalGroup(
            tabMostrarCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMostrarCalculoLayout.createSequentialGroup()
                .addGap(0, 193, Short.MAX_VALUE)
                .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        tabMetodoRectangulo.addTab("Mostrar", tabMostrarCalculo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tabMetodoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tabMetodoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFixActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        objIntegracion.setLimiteSuperior(Double.parseDouble(txtSuperior.getText()));
        objIntegracion.setLimiteSuperior(Double.parseDouble(txtInferior.getText()));
        objIntegracion.setNumeroRectangulos(Integer.parseInt(txtNumRect.getText()));
        objIntegracion.setFuncion(txtFuncion.getText());
        JOptionPane.showMessageDialog(this, "Datos guardados con exito", "Guardar datos", 1);

    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFix;
    private javax.swing.JLabel lblFunción;
    private javax.swing.JLabel lblInferior;
    private javax.swing.JLabel lblSimInte;
    private javax.swing.JLabel lblSuperior;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel tabIngresarDatos;
    private javax.swing.JTabbedPane tabMetodoRectangulo;
    private javax.swing.JPanel tabMostrarCalculo;
    private javax.swing.JTextField txtFix;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtInferior;
    private javax.swing.JTextField txtNumRect;
    private javax.swing.JTextField txtSuperior;
    // End of variables declaration//GEN-END:variables
}
