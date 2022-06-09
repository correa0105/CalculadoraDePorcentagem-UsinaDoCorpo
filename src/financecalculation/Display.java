package financecalculation;

import java.text.DecimalFormat;

public class Display extends javax.swing.JFrame {

    public Display() {
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

        title = new javax.swing.JLabel();
        textDe = new javax.swing.JLabel();
        result = new javax.swing.JButton();
        result_SubTotal = new javax.swing.JLabel();
        textPara = new javax.swing.JLabel();
        resultPercent = new javax.swing.JTextField();
        campValue1 = new javax.swing.JTextField();
        campValue2 = new javax.swing.JTextField();
        campValue3 = new javax.swing.JTextField();
        campValue4 = new javax.swing.JTextField();
        textDe2 = new javax.swing.JLabel();
        result1 = new javax.swing.JButton();
        textPara1 = new javax.swing.JLabel();
        resultPercent1 = new javax.swing.JTextField();
        campValue5 = new javax.swing.JTextField();
        campValue6 = new javax.swing.JTextField();
        textDe3 = new javax.swing.JLabel();
        result3 = new javax.swing.JButton();
        textPara2 = new javax.swing.JLabel();
        resultPercent2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Porcentagem");
        setMaximumSize(new java.awt.Dimension(540, 430));
        setMinimumSize(new java.awt.Dimension(540, 430));
        setPreferredSize(new java.awt.Dimension(616, 430));
        setResizable(false);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 51, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Calculadora de Porcentagem (%)");

        textDe.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textDe.setText("UM VALOR AUMENTOU/DIMINUIU DE");

        result.setBackground(new java.awt.Color(242, 113, 49));
        result.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        result.setText("CALCULAR →");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        result_SubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textPara.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textPara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPara.setText("PARA");

        resultPercent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resultPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultPercentActionPerformed(evt);
            }
        });

        campValue1.setBackground(new java.awt.Color(255, 51, 0));
        campValue1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue1ActionPerformed(evt);
            }
        });

        campValue2.setBackground(new java.awt.Color(255, 51, 0));
        campValue2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue2ActionPerformed(evt);
            }
        });

        campValue3.setBackground(new java.awt.Color(255, 51, 0));
        campValue3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue3ActionPerformed(evt);
            }
        });

        campValue4.setBackground(new java.awt.Color(255, 51, 0));
        campValue4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue4ActionPerformed(evt);
            }
        });

        textDe2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textDe2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textDe2.setText("O VALOR DE");

        result1.setBackground(new java.awt.Color(242, 113, 49));
        result1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        result1.setText("CALCULAR →");
        result1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result1ActionPerformed(evt);
            }
        });

        textPara1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textPara1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPara1.setText("É QUAL PORCENTAGEM DE");

        resultPercent1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resultPercent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultPercent1ActionPerformed(evt);
            }
        });

        campValue5.setBackground(new java.awt.Color(255, 51, 0));
        campValue5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue5ActionPerformed(evt);
            }
        });

        campValue6.setBackground(new java.awt.Color(255, 51, 0));
        campValue6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campValue6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campValue6ActionPerformed(evt);
            }
        });

        textDe3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textDe3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textDe3.setText("QUANTO É");

        result3.setBackground(new java.awt.Color(242, 113, 49));
        result3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        result3.setText("CALCULAR →");
        result3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result3ActionPerformed(evt);
            }
        });

        textPara2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textPara2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPara2.setText("POR CENTO, DE");

        resultPercent2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resultPercent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultPercent2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 347, Short.MAX_VALUE)
                .addComponent(result_SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(textDe3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPara2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campValue6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textDe2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPara1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(result1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultPercent1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(textDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(result)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(result3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultPercent2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textPara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(campValue2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textDe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textPara1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(campValue4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(result1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultPercent1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textDe3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textPara2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(campValue6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(result3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultPercent2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addComponent(result_SubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        CalculationResume result = new CalculationResume();
        DecimalFormat df = new DecimalFormat("#.##");
        double value1 = Double.parseDouble(campValue1.getText());
        double value2 = Double.parseDouble(campValue2.getText());

        result.aumentouOuDiminuiu(value1, value2);

        resultPercent.setText(String.valueOf(df.format(result.getTotal())+"%"));
    }//GEN-LAST:event_resultActionPerformed

    private void resultPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultPercentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultPercentActionPerformed

    private void campValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue2ActionPerformed

    private void campValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue1ActionPerformed

    private void campValue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue3ActionPerformed

    private void campValue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue4ActionPerformed

    private void result1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result1ActionPerformed
        CalculationResume result = new CalculationResume();
        DecimalFormat df = new DecimalFormat("#.##");
        double value1 = Double.parseDouble(campValue3.getText());
        double value2 = Double.parseDouble(campValue4.getText());

        result.equivaleHa(value1, value2);

        resultPercent1.setText(String.valueOf(df.format(result.getTotal())+"%"));
    }//GEN-LAST:event_result1ActionPerformed

    private void resultPercent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultPercent1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultPercent1ActionPerformed

    private void campValue5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue5ActionPerformed

    private void campValue6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campValue6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campValue6ActionPerformed

    private void result3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result3ActionPerformed
        CalculationResume result = new CalculationResume();
        DecimalFormat df = new DecimalFormat("#.##");
        double value1 = Double.parseDouble(campValue5.getText());
        double value2 = Double.parseDouble(campValue6.getText());

        result.quantoE(value1, value2);

        resultPercent2.setText(String.valueOf(df.format(result.getTotal())));
    }//GEN-LAST:event_result3ActionPerformed

    private void resultPercent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultPercent2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultPercent2ActionPerformed

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campValue1;
    private javax.swing.JTextField campValue2;
    private javax.swing.JTextField campValue3;
    private javax.swing.JTextField campValue4;
    private javax.swing.JTextField campValue5;
    private javax.swing.JTextField campValue6;
    private javax.swing.JButton result;
    private javax.swing.JButton result1;
    private javax.swing.JButton result3;
    private javax.swing.JTextField resultPercent;
    private javax.swing.JTextField resultPercent1;
    private javax.swing.JTextField resultPercent2;
    private javax.swing.JLabel result_SubTotal;
    private javax.swing.JLabel textDe;
    private javax.swing.JLabel textDe2;
    private javax.swing.JLabel textDe3;
    private javax.swing.JLabel textPara;
    private javax.swing.JLabel textPara1;
    private javax.swing.JLabel textPara2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}