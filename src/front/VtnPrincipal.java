package front;

import back.Valores;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VtnPrincipal extends javax.swing.JFrame {

    Valores objIntegracion = null;

    public VtnPrincipal() {
        initComponents();
        objIntegracion = new Valores();
        JTextFieldOnlyNumbers();
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
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btnPorIzquierda = new javax.swing.JButton();
        btnPorDerecha = new javax.swing.JToggleButton();

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
        txtSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuperiorActionPerformed(evt);
            }
        });

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenesINR/Simbolo Integral.png"))); // NOI18N

        txtResultado.setBackground(new java.awt.Color(204, 204, 204));
        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtResultado.setEnabled(false);

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(51, 51, 51));
        lblResultado.setText("RESULTADO");

        btnPorIzquierda.setText("Aprox. Por Izquierda");
        btnPorIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorIzquierdaActionPerformed(evt);
            }
        });

        btnPorDerecha.setText("Aprox. Por Derecha");
        btnPorDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorDerechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabIngresarDatosLayout = new javax.swing.GroupLayout(tabIngresarDatos);
        tabIngresarDatos.setLayout(tabIngresarDatosLayout);
        tabIngresarDatosLayout.setHorizontalGroup(
            tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabIngresarDatosLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSuperior)
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumRect, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInferior)
                            .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(txtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSimInte))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFunción)
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFix)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFix, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabIngresarDatosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addComponent(btnPorIzquierda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPorDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                        .addComponent(txtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblFunción)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(tabIngresarDatosLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(lblSimInte)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabIngresarDatosLayout.createSequentialGroup()
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNumRect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFix))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInferior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPorDerecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPorIzquierda))
                .addGap(18, 18, 18)
                .addGroup(tabIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado))
                .addGap(18, 18, 18))
        );

        tabMetodoRectangulo.addTab("Ingresar", tabIngresarDatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(tabMetodoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tabMetodoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void btnPorIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorIzquierdaActionPerformed

        if (casillas_Vacias()) {
            return;
        }

        double a = Double.parseDouble(txtInferior.getText());
        double b = Double.parseDouble(txtSuperior.getText());

        if (a < b) {
            objIntegracion.setLimiteInferior(Double.parseDouble(txtInferior.getText()));
            objIntegracion.setLimiteSuperior(Double.parseDouble(txtSuperior.getText()));
            objIntegracion.setFuncion(txtFuncion.getText());
            objIntegracion.setNumeroRectangulos(Integer.parseInt(txtNumRect.getText()));
            objIntegracion.setFIX(txtFix.getText());

            objIntegracion.por_Izquierda();
            objIntegracion.calcular_FIX();

            String cadena = String.valueOf(objIntegracion.getAproximacion());
            txtResultado.setText(cadena);
        } else {
            JOptionPane.showMessageDialog(this, "Verifica las entradas!!");
        }


    }//GEN-LAST:event_btnPorIzquierdaActionPerformed

    private void btnPorDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorDerechaActionPerformed
        // TODO add your handling code here:
        if (casillas_Vacias()) {
            return;
        }

        double a = Double.parseDouble(txtInferior.getText());
        double b = Double.parseDouble(txtSuperior.getText());
        if (a < b) {
            casillas_Vacias();
            objIntegracion.setLimiteInferior(Double.parseDouble(txtInferior.getText()));
            objIntegracion.setLimiteSuperior(Double.parseDouble(txtSuperior.getText()));
            objIntegracion.setFuncion(txtFuncion.getText());
            objIntegracion.setNumeroRectangulos(Integer.parseInt(txtNumRect.getText()));
            objIntegracion.setFIX(txtFix.getText());

            objIntegracion.por_Derecha();
            objIntegracion.calcular_FIX();

            String cadena = String.valueOf(objIntegracion.getAproximacion());
            txtResultado.setText(cadena);
        } else {
            JOptionPane.showMessageDialog(this, "Verifica las entradas!!");
        }
    }//GEN-LAST:event_btnPorDerechaActionPerformed

    private void txtSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuperiorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuperiorActionPerformed

    public JTextField[] cajasTexto() {
        JTextField elementsArray[] = {
            txtSuperior,
            txtInferior,
            txtNumRect,
            txtFix,};
        return elementsArray;
    }

    public void JTextFieldOnlyNumbers() {
        for (JTextField jTextField : cajasTexto()) {
            jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    KeyPressed(evt);
                }
            });
        }
    }

    private void KeyPressed(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();

        if (!(key >= 48 && key <= 57) && !(key == 45) && !(key == 46)) {
            evt.consume();
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
            java.util.logging.Logger.getLogger(VtnPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    private boolean casillas_Vacias() {
        if (txtSuperior.getText().isBlank() && txtInferior.getText().isBlank() && txtFuncion.getText().isBlank() && txtNumRect.getText().isBlank() && txtFix.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Todos los campos están vacios!");
            return true;
        }
        if (txtSuperior.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo del limite Superior está vacio!");
            return true;
        }
        if (txtInferior.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo del limite Inferior está vacio!");
            return true;
        }
        if (txtFuncion.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo de la función está vacio!");
            return true;
        }
        if (txtNumRect.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo de numero de rectangulos está vacio!");
            return true;
        }
        if (txtFix.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo de FIX está vacio!");
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPorDerecha;
    private javax.swing.JButton btnPorIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFix;
    private javax.swing.JLabel lblFunción;
    private javax.swing.JLabel lblInferior;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSimInte;
    private javax.swing.JLabel lblSuperior;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel tabIngresarDatos;
    private javax.swing.JTabbedPane tabMetodoRectangulo;
    private javax.swing.JTextField txtFix;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtInferior;
    private javax.swing.JTextField txtNumRect;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtSuperior;
    // End of variables declaration//GEN-END:variables
}
