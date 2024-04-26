/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.noel.numeros;

/**
 *
 * @author Noel Rincón Anaya 181233 Programa de Numeros Pares e Impares con UI
 */
public class Numeros extends javax.swing.JFrame {

    /**
     * Creates new form Numeros
     */
    public Numeros() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        text_Area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        pares = new javax.swing.JButton();
        impares = new javax.swing.JButton();
        primos = new javax.swing.JButton();
        generate_button = new javax.swing.JButton();
        nums_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador De Números");
        setBackground(new java.awt.Color(255, 255, 255));

        text_Area.setColumns(20);
        text_Area.setRows(5);
        jScrollPane1.setViewportView(text_Area);

        jLabel1.setFont(new java.awt.Font("SF Pro Rounded", 1, 24)); // NOI18N
        jLabel1.setText("Generador De Números");

        pares.setText("Pares");
        pares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paresActionPerformed(evt);
            }
        });

        impares.setText("Impares");
        impares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imparesActionPerformed(evt);
            }
        });

        primos.setText("Primos");
        primos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primosActionPerformed(evt);
            }
        });

        generate_button.setText("Generar");
        generate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nums_field, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(generate_button)
                                .addGap(18, 18, 18)
                                .addComponent(pares)
                                .addGap(18, 18, 18)
                                .addComponent(impares)
                                .addGap(18, 18, 18)
                                .addComponent(primos)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nums_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generate_button)
                    .addComponent(pares)
                    .addComponent(impares)
                    .addComponent(primos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imparesActionPerformed
        // TODO add your handling code here:
        String texto = text_Area.getText();
        String[] numeros = texto.split(" ");
        text_Area.setText("");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            int elemento = Integer.parseInt(numeros[i]);
            if (elemento % 2 != 0) {
                String newtext = text_Area.getText();
                newtext = newtext + elemento + " ";
                text_Area.setText(newtext);
            }
        }
    }//GEN-LAST:event_imparesActionPerformed

    private void generate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_buttonActionPerformed
        // TODO add your handling code here:
                text_Area.setText("");
        int cant = Integer.parseInt(nums_field.getText());
        int[] array = new int[cant];
        for (int i = 0; i < cant; i++) {
            String texto = text_Area.getText();
            array[i] = (int) Math.round(Math.random() * 100);
            texto = texto + array[i] + " ";
            text_Area.setText(texto);
        }
    }//GEN-LAST:event_generate_buttonActionPerformed

    private void paresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paresActionPerformed
        // TODO add your handling code here:

        String texto = text_Area.getText();
        String[] numeros = texto.split(" ");
        text_Area.setText("");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            int elemento = Integer.parseInt(numeros[i]);
            if (elemento % 2 == 0) {
                String newtext = text_Area.getText();
                newtext = newtext + elemento + " ";

                text_Area.setText(newtext);
            }
        }
    }//GEN-LAST:event_paresActionPerformed

    private void primosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primosActionPerformed
        // TODO add your handling code here:
        String texto = text_Area.getText();
        String[] numeros = texto.split(" ");
        text_Area.setText("");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            int elemento = Integer.parseInt(numeros[i]);

            if (elemento % 2 != 0) {
                if (elemento % 3 != 0) {
                    if (elemento % 5 != 0) {
                        String newtext = text_Area.getText();
                        newtext = newtext + elemento+ " ";
                        text_Area.setText(newtext);
                    } else {
                        String newtext = text_Area.getText();
                        newtext = newtext + elemento+ " ";
                        text_Area.setText(newtext);
                    }
                } else {
                    System.out.println("Su numero no es primo");
                }
            } else {
                System.out.println("Su numero no es primo");
            }
        }
    }//GEN-LAST:event_primosActionPerformed

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
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generate_button;
    private javax.swing.JButton impares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nums_field;
    private javax.swing.JButton pares;
    private javax.swing.JButton primos;
    private javax.swing.JTextArea text_Area;
    // End of variables declaration//GEN-END:variables
}