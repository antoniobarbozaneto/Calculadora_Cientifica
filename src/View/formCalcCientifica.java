package View;

import Control.CtrlCalcCientifica;
import Model.CalcCientifica;
import javax.swing.JOptionPane;

/*
 * @author Neto Barboza
 */
public class formCalcCientifica extends javax.swing.JFrame {

    CalcCientifica CalcCientifica;
    CtrlCalcCientifica CtrlCalcCientifica;

    public formCalcCientifica() {
        initComponents();
        CalcCientifica = new CalcCientifica();
        CtrlCalcCientifica = new CtrlCalcCientifica();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Valor2 = new javax.swing.JTextField();
        jTextField_Valor1 = new javax.swing.JTextField();
        btn_Limpa = new javax.swing.JButton();
        btn_Res = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Sum = new javax.swing.JButton();
        btn_Sub = new javax.swing.JButton();
        btn_Mult = new javax.swing.JButton();
        btn_Div = new javax.swing.JButton();
        btn_Seno = new javax.swing.JButton();
        btn_Cos = new javax.swing.JButton();
        btn_Tangente = new javax.swing.JButton();
        btn_Num1 = new javax.swing.JButton();
        btn_Num2 = new javax.swing.JButton();
        btn_Num3 = new javax.swing.JButton();
        btn_Num5 = new javax.swing.JButton();
        btn_Num4 = new javax.swing.JButton();
        btn_Num6 = new javax.swing.JButton();
        btn_Num7 = new javax.swing.JButton();
        btn_Num8 = new javax.swing.JButton();
        btn_Num9 = new javax.swing.JButton();
        btn_Num0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextField_Valor2.setName("txt_valor"); // NOI18N

        jTextField_Valor1.setName("txt_valor"); // NOI18N

        btn_Limpa.setText("AC");
        btn_Limpa.setToolTipText("");
        btn_Limpa.setName("btn_res"); // NOI18N
        btn_Limpa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LimpaMouseClicked(evt);
            }
        });

        btn_Res.setText("=");
        btn_Res.setToolTipText("");
        btn_Res.setName("btn_res"); // NOI18N
        btn_Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ResMouseClicked(evt);
            }
        });

        jLabel1.setText("Valor 2:");

        jLabel2.setText("Valor 1:");

        btn_Sum.setLabel("+");
        btn_Sum.setName("btn_mult"); // NOI18N
        btn_Sum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SumMouseClicked(evt);
            }
        });

        btn_Sub.setLabel("-");
        btn_Sub.setName("btn_mult"); // NOI18N
        btn_Sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SubMouseClicked(evt);
            }
        });

        btn_Mult.setText("*");
        btn_Mult.setName("btn_Mult"); // NOI18N
        btn_Mult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MultMouseClicked(evt);
            }
        });

        btn_Div.setText("/");
        btn_Div.setName("btn_mult"); // NOI18N
        btn_Div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DivMouseClicked(evt);
            }
        });

        btn_Seno.setText("seno");
        btn_Seno.setName("btn_mult"); // NOI18N
        btn_Seno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SenoMouseClicked(evt);
            }
        });

        btn_Cos.setText("cosseno");
        btn_Cos.setToolTipText("");
        btn_Cos.setName("btn_mult"); // NOI18N
        btn_Cos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CosMouseClicked(evt);
            }
        });

        btn_Tangente.setText("tangente");
        btn_Tangente.setName("btn_mult"); // NOI18N
        btn_Tangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TangenteMouseClicked(evt);
            }
        });

        btn_Num1.setText("1");
        btn_Num1.setName("btn_mult"); // NOI18N
        btn_Num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num1MouseClicked(evt);
            }
        });

        btn_Num2.setText("2");
        btn_Num2.setName("btn_mult"); // NOI18N
        btn_Num2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num2MouseClicked(evt);
            }
        });

        btn_Num3.setText("3");
        btn_Num3.setName("btn_mult"); // NOI18N
        btn_Num3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num3MouseClicked(evt);
            }
        });

        btn_Num5.setText("5");
        btn_Num5.setName("btn_mult"); // NOI18N
        btn_Num5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num5MouseClicked(evt);
            }
        });

        btn_Num4.setText("4");
        btn_Num4.setName("btn_mult"); // NOI18N
        btn_Num4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num4MouseClicked(evt);
            }
        });

        btn_Num6.setText("6");
        btn_Num6.setName("btn_mult"); // NOI18N
        btn_Num6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num6MouseClicked(evt);
            }
        });

        btn_Num7.setText("7");
        btn_Num7.setName("btn_mult"); // NOI18N
        btn_Num7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num7MouseClicked(evt);
            }
        });

        btn_Num8.setText("8");
        btn_Num8.setName("btn_mult"); // NOI18N
        btn_Num8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num8MouseClicked(evt);
            }
        });

        btn_Num9.setText("9");
        btn_Num9.setName("btn_mult"); // NOI18N
        btn_Num9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num9MouseClicked(evt);
            }
        });

        btn_Num0.setText("0");
        btn_Num0.setName("btn_mult"); // NOI18N
        btn_Num0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num0MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Sum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Limpa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Res, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 2, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Div, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Seno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Tangente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_Valor2)
                    .addComponent(jTextField_Valor1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jTextField_Valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Num1)
                    .addComponent(btn_Num2)
                    .addComponent(btn_Num3)
                    .addComponent(btn_Sum))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Num5)
                    .addComponent(btn_Num4)
                    .addComponent(btn_Num6)
                    .addComponent(btn_Sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Num7)
                    .addComponent(btn_Num8)
                    .addComponent(btn_Num9)
                    .addComponent(btn_Mult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Num0)
                    .addComponent(btn_Limpa)
                    .addComponent(btn_Res)
                    .addComponent(btn_Div))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Seno)
                    .addComponent(btn_Cos)
                    .addComponent(btn_Tangente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Operadores
    private void btn_SumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SumMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("+");

    }//GEN-LAST:event_btn_SumMouseClicked

    private void btn_SubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SubMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("-");
    }//GEN-LAST:event_btn_SubMouseClicked

    private void btn_MultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MultMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("*");
    }//GEN-LAST:event_btn_MultMouseClicked

    private void btn_DivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DivMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("/");
    }//GEN-LAST:event_btn_DivMouseClicked

    private void btn_ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ResMouseClicked
        // TODO add your handling code here:
        //
        if (!jTextField_Valor1.getText().isBlank() && CalcCientifica.getOperador() != "") {
            CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText())); //Seta o valor_1

            if (CalcCientifica.getOperador() == "+" || CalcCientifica.getOperador() == "-" || CalcCientifica.getOperador() == "*" || CalcCientifica.getOperador() == "/") {
                CalcCientifica.setValor2(Double.parseDouble(jTextField_Valor2.getText())); //Seta o valor_1
                JOptionPane.showMessageDialog(null, "Resultado: " + CalcCientifica.getValor1() + " " + CalcCientifica.getOperador() + " " + CalcCientifica.getValor2() + " = " + CtrlCalcCientifica.RealizarCalculo(CalcCientifica)); //Passa para o controle o objeto CalcCientifica.);
            }
            else{
                if(CalcCientifica.getOperador() == "seno" ||CalcCientifica.getOperador() == "cos" ||CalcCientifica.getOperador() == "tang"){ //operadores trigonométricos
                    JOptionPane.showMessageDialog(null, CtrlCalcCientifica.RealizarCalculo(CalcCientifica));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "AVISO: Verifique se foi informado os valores e o operador corretamente.");
        }

    }//GEN-LAST:event_btn_ResMouseClicked

    private void btn_LimpaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LimpaMouseClicked
        // TODO add your handling code here:
        jTextField_Valor1.setText("");
        jTextField_Valor2.setText("");
        CalcCientifica.setOperador("");
    }//GEN-LAST:event_btn_LimpaMouseClicked

    private void btn_SenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SenoMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("seno");
    }//GEN-LAST:event_btn_SenoMouseClicked

    private void btn_CosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CosMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("cos");
    }//GEN-LAST:event_btn_CosMouseClicked

    private void btn_TangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TangenteMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("tang");
    }//GEN-LAST:event_btn_TangenteMouseClicked

    private void btn_Num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num1MouseClicked

    private void btn_Num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num2MouseClicked

    private void btn_Num3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num3MouseClicked

    private void btn_Num5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num5MouseClicked

    private void btn_Num4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num4MouseClicked

    private void btn_Num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num6MouseClicked

    private void btn_Num7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num7MouseClicked

    private void btn_Num8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num8MouseClicked

    private void btn_Num9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num9MouseClicked

    private void btn_Num0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num0MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Num0MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCalcCientifica().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cos;
    private javax.swing.JButton btn_Div;
    private javax.swing.JButton btn_Limpa;
    private javax.swing.JButton btn_Mult;
    private javax.swing.JButton btn_Num0;
    private javax.swing.JButton btn_Num1;
    private javax.swing.JButton btn_Num2;
    private javax.swing.JButton btn_Num3;
    private javax.swing.JButton btn_Num4;
    private javax.swing.JButton btn_Num5;
    private javax.swing.JButton btn_Num6;
    private javax.swing.JButton btn_Num7;
    private javax.swing.JButton btn_Num8;
    private javax.swing.JButton btn_Num9;
    private javax.swing.JButton btn_Res;
    private javax.swing.JButton btn_Seno;
    private javax.swing.JButton btn_Sub;
    private javax.swing.JButton btn_Sum;
    private javax.swing.JButton btn_Tangente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_Valor1;
    private javax.swing.JTextField jTextField_Valor2;
    // End of variables declaration//GEN-END:variables
}
