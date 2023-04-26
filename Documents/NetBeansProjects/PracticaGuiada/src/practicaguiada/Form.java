/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practicaguiada;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Form extends javax.swing.JFrame {
    
    public Form() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnMensajes = new javax.swing.JButton();
        btnOpciones = new javax.swing.JButton();
        scrollResultados = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuadros de Diálogo");

        btnConfirmar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnEntrada.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnMensajes.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnMensajes.setText("Mensajes");
        btnMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajesActionPerformed(evt);
            }
        });

        btnOpciones.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnOpciones.setText("Opciones");
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });

        txtResultados.setColumns(20);
        txtResultados.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtResultados.setRows(5);
        scrollResultados.setViewportView(txtResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(scrollResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(btnMensajes)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpciones))
                    .addComponent(scrollResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        int valor;
        
        txtResultados.setText("");
        
        valor = JOptionPane.showConfirmDialog(this, "¿Confirmas el movimiento?");
        txtResultados.setText("Respuesta de movimientos: " + valor);
        
        valor = JOptionPane.showConfirmDialog(this, "¿Borrar dato?", "Eliminar información", JOptionPane.OK_CANCEL_OPTION);
        txtResultados.setText(txtResultados.getText() + "\nRespuesta a borrar: " + valor);
        
        valor = JOptionPane.showConfirmDialog(this, "Autorizar el cambio", "Confirmación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        txtResultados.setText(txtResultados.getText() + "\nRespuesta de cambio: " + valor);
        
        ImageIcon icono = new ImageIcon("src/practicaguiada/casa.png");
        valor = JOptionPane.showConfirmDialog(this, "Autoriza transferencia", "Confirmación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icono);
        txtResultados.setText(txtResultados.getText() + "\nRespuesta de transferencia: " + valor);

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        // TODO add your handling code here:
        String respuesta;
        int edad;
        txtResultados.setText("");
        
        respuesta = JOptionPane.showInputDialog("Ingresa nombre:");
        txtResultados.setText("Nombre: " + respuesta + "\n");
        
        respuesta = JOptionPane.showInputDialog(this, "Ingresa edad:");
        edad = Integer.parseInt(respuesta);
        txtResultados.append("Edad: " + edad + "\n");
        
        respuesta = JOptionPane.showInputDialog("Apellido paterno:", "López");
        txtResultados.append("Paterno: " + respuesta + "\n");
        
        respuesta = JOptionPane.showInputDialog(this, "Apellido materno:", "Rosales");
        txtResultados.append("Materno: " + respuesta + "\n");
        
        respuesta = JOptionPane.showInputDialog(this, "Captura domicilio:", "Dato de contacto", JOptionPane.INFORMATION_MESSAGE);
        txtResultados.append("Domicilio: " + respuesta + "\n");
        
        String opciones[] = {"Elige", "Jalisco", "Sinaloa", "Michoacan", "Yucatan"};
        ImageIcon icono = new ImageIcon("src/practicaguiada/casa.png");
        respuesta = JOptionPane.showInputDialog(this, "Estado que colinda con Jalisco:", "Pregunta", JOptionPane.PLAIN_MESSAGE, icono, opciones, "Elije").toString();
        txtResultados.append("Estado: " + respuesta + "\n");

    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajesActionPerformed
        // TODO add your handling code here:
        txtResultados.setText("");
        
        ImageIcon icono = new ImageIcon("src/practicaguiada/casa.png");
        
        JOptionPane.showMessageDialog(null, "Datos capturados.");
        
        JOptionPane.showMessageDialog(null, "Esto es una advertencia", "Informativo", JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Crédito de vivienda aprovado", "Vivienda", JOptionPane.PLAIN_MESSAGE, icono);

    }//GEN-LAST:event_btnMensajesActionPerformed

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        // TODO add your handling code here:
        txtResultados.setText("");
        
        String opciones[] = {"Alfa", "Beta", "Gama", "Epsilon", "Etha", "Otra"};
        
        ImageIcon icono = new ImageIcon("src/practicaguiada/casa.png");
        
        int respuesta;
        
        respuesta = JOptionPane.showOptionDialog(this, "Elige una de las letras", "Letras griegas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icono, opciones, opciones[0]);
        txtResultados.append("Opción numérica: " + respuesta + "\n" + "Opción textual: " + opciones[respuesta]);
        
    }//GEN-LAST:event_btnOpcionesActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnMensajes;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scrollResultados;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
