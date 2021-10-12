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

        btn_Limpa = new javax.swing.JButton();
        btn_Res = new javax.swing.JButton();
        btn_Sum = new javax.swing.JButton();
        btn_Sub = new javax.swing.JButton();
        btn_Mult = new javax.swing.JButton();
        btn_Div = new javax.swing.JButton();
        btn_Seno = new javax.swing.JButton();
        btn_Cos = new javax.swing.JButton();
        btn_Tangente = new javax.swing.JButton();
        btn_Num2 = new javax.swing.JButton();
        btn_Num3 = new javax.swing.JButton();
        btn_Num5 = new javax.swing.JButton();
        btn_Num4 = new javax.swing.JButton();
        btn_Num6 = new javax.swing.JButton();
        btn_Num7 = new javax.swing.JButton();
        btn_Num8 = new javax.swing.JButton();
        btn_Num9 = new javax.swing.JButton();
        btn_Num0 = new javax.swing.JButton();
        btn_Num1 = new javax.swing.JButton();
        btn_Ponto = new javax.swing.JButton();
        btn_Pi = new javax.swing.JButton();
        btn_Euler = new javax.swing.JButton();
        btn_Log = new javax.swing.JButton();
        btn_Exp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Valor1 = new javax.swing.JTextField();
        lbl_Op = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setResizable(false);

        btn_Limpa.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
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

        btn_Num1.setLabel("1");
        btn_Num1.setName("btn_mult"); // NOI18N
        btn_Num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Num1MouseClicked(evt);
            }
        });

        btn_Ponto.setToolTipText("");
        btn_Ponto.setLabel(".");
        btn_Ponto.setName("btn_res"); // NOI18N
        btn_Ponto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PontoMouseClicked(evt);
            }
        });

        btn_Pi.setText("Pi");
        btn_Pi.setName("btn_mult"); // NOI18N
        btn_Pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PiMouseClicked(evt);
            }
        });

        btn_Euler.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btn_Euler.setText("Euler");
        btn_Euler.setActionCommand("Eul");
        btn_Euler.setName("btn_mult"); // NOI18N
        btn_Euler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EulerMouseClicked(evt);
            }
        });

        btn_Log.setText("log");
        btn_Log.setName("btn_mult"); // NOI18N
        btn_Log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LogMouseClicked(evt);
            }
        });

        btn_Exp.setText("exp");
        btn_Exp.setName("btn_mult"); // NOI18N
        btn_Exp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ExpMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Calculadora Cientifica");

        lbl_Op.setText("Operador: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Euler, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Pi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Limpa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Sum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Exp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Log, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_Tangente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_Seno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_Cos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Op))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Op))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Num2)
                            .addComponent(btn_Num3)
                            .addComponent(btn_Num1)
                            .addComponent(btn_Div)
                            .addComponent(btn_Pi))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Num5)
                                    .addComponent(btn_Num4)
                                    .addComponent(btn_Num6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Num7)
                                    .addComponent(btn_Num8)
                                    .addComponent(btn_Num9)
                                    .addComponent(btn_Sub))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Ponto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Limpa)
                                    .addComponent(btn_Sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Mult)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Seno)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Euler, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Cos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Tangente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Exp, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(btn_Res, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Calculadora Científica");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Operadores
    private void btn_SumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SumMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("+");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText())); //Seta o valor_1
        jTextField_Valor1.setText("");
        lbl_Op.setText("Operador: " + CalcCientifica.getOperador());

    }//GEN-LAST:event_btn_SumMouseClicked

    private void btn_SubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SubMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("-");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText()));
        jTextField_Valor1.setText("");
        lbl_Op.setText("Operador: " + CalcCientifica.getOperador());
    }//GEN-LAST:event_btn_SubMouseClicked

    private void btn_MultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MultMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("*");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText()));
        jTextField_Valor1.setText("");
        lbl_Op.setText("Operador: " + CalcCientifica.getOperador());
    }//GEN-LAST:event_btn_MultMouseClicked

    private void btn_DivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DivMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("/");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText()));
        jTextField_Valor1.setText("");
        lbl_Op.setText("Operador: " + CalcCientifica.getOperador());
    }//GEN-LAST:event_btn_DivMouseClicked

    private void btn_ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ResMouseClicked
        // TODO add your handling code here:
        //
        if (!jTextField_Valor1.getText().isBlank() && CalcCientifica.getOperador() != "") {
            //CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText())); //Seta o valor_1
            CalcCientifica.setValor2(Double.parseDouble(jTextField_Valor1.getText())); //Seta o valor_1
            if (CalcCientifica.getOperador() == "+" || CalcCientifica.getOperador() == "-" || CalcCientifica.getOperador() == "*" || CalcCientifica.getOperador() == "/") {
                //CalcCientifica.setValor2(Double.parseDouble(jTextField_Valor2.getText())); //Seta o valor_1
                lbl_Op.setText("Operador: " + CalcCientifica.getOperador());
                JOptionPane.showMessageDialog(null, "Resultado: " + CalcCientifica.getValor1() + " " + CalcCientifica.getOperador() + " " + CalcCientifica.getValor2() + " = " + CtrlCalcCientifica.RealizarCalculo(CalcCientifica)); //Passa para o controle o objeto CalcCientifica.);
            } else {
                if (CalcCientifica.getOperador() == "seno" || CalcCientifica.getOperador() == "cos" || CalcCientifica.getOperador() == "tang") { //operadores trigonométricos
                    lbl_Op.setText("Operador: " + CalcCientifica.getOperador());
                    JOptionPane.showMessageDialog(null, CtrlCalcCientifica.RealizarCalculo(CalcCientifica));
                } else {
                    if (CalcCientifica.getOperador() == "log" || CalcCientifica.getOperador() == "exp") {
                        lbl_Op.setText("Operador: " + CalcCientifica.getOperador());
                        JOptionPane.showMessageDialog(null, CtrlCalcCientifica.RealizarCalculo(CalcCientifica));
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "AVISO: Verifique se foi informado os valores e o operador corretamente.");
        }

    }//GEN-LAST:event_btn_ResMouseClicked

    private void btn_LimpaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LimpaMouseClicked
        // TODO add your handling code here:
        jTextField_Valor1.setText("");
        //jTextField_Valor2.setText("");
        CalcCientifica.setOperador("");
        lbl_Op.setText("Operador:");
    }//GEN-LAST:event_btn_LimpaMouseClicked

    private void btn_SenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SenoMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("seno");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText())); //Seta o valor_1
        lbl_Op.setText("Operador: " + CalcCientifica.getOperador());
    }//GEN-LAST:event_btn_SenoMouseClicked

    private void btn_CosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CosMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("cosseno");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText()));
        lbl_Op.setText("Operador: " + CalcCientifica.getOperador());

    }//GEN-LAST:event_btn_CosMouseClicked

    private void btn_TangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TangenteMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("tangente");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText()));
        lbl_Op.setText("Operador: " + CalcCientifica.getOperador());
    }//GEN-LAST:event_btn_TangenteMouseClicked

    private void btn_Num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num2MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "2");
    }//GEN-LAST:event_btn_Num2MouseClicked

    private void btn_Num3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num3MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "3");
    }//GEN-LAST:event_btn_Num3MouseClicked

    private void btn_Num5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num5MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "5");
    }//GEN-LAST:event_btn_Num5MouseClicked

    private void btn_Num4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num4MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "4");
    }//GEN-LAST:event_btn_Num4MouseClicked

    private void btn_Num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num6MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "6");
    }//GEN-LAST:event_btn_Num6MouseClicked

    private void btn_Num7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num7MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "7");
    }//GEN-LAST:event_btn_Num7MouseClicked

    private void btn_Num8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num8MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "8");
    }//GEN-LAST:event_btn_Num8MouseClicked

    private void btn_Num9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num9MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "9");
    }//GEN-LAST:event_btn_Num9MouseClicked

    private void btn_Num0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num0MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "0");

    }//GEN-LAST:event_btn_Num0MouseClicked

    private void btn_Num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Num1MouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + "1");

    }//GEN-LAST:event_btn_Num1MouseClicked

    private void btn_PontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PontoMouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        jTextField_Valor1.setText(Valor + ".");
    }//GEN-LAST:event_btn_PontoMouseClicked

    private void btn_PiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PiMouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        String PI = String.valueOf(Math.PI);
        if (jTextField_Valor1.getText().equals(PI)) {
            System.out.println("Valor de PI já foi inserido");
        } else {
            jTextField_Valor1.setText(Valor + PI);
        }
    }//GEN-LAST:event_btn_PiMouseClicked

    private void btn_EulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EulerMouseClicked
        // TODO add your handling code here:
        String Valor = jTextField_Valor1.getText();
        String Euler = String.valueOf(Math.E);
        if (jTextField_Valor1.getText().equals(Euler)) {
            System.out.println("Valor de Euler já foi inserido");
        } else {
            jTextField_Valor1.setText(Valor + Euler);
        }
    }//GEN-LAST:event_btn_EulerMouseClicked

    private void btn_LogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("log");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText()));
        //jTextField_Valor1.setText("");
    }//GEN-LAST:event_btn_LogMouseClicked

    private void btn_ExpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExpMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("exp");
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText()));
        //jTextField_Valor1.setText("");
    }//GEN-LAST:event_btn_ExpMouseClicked

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
    private javax.swing.JButton btn_Euler;
    private javax.swing.JButton btn_Exp;
    private javax.swing.JButton btn_Limpa;
    private javax.swing.JButton btn_Log;
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
    private javax.swing.JButton btn_Pi;
    private javax.swing.JButton btn_Ponto;
    private javax.swing.JButton btn_Res;
    private javax.swing.JButton btn_Seno;
    private javax.swing.JButton btn_Sub;
    private javax.swing.JButton btn_Sum;
    private javax.swing.JButton btn_Tangente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField_Valor1;
    private javax.swing.JLabel lbl_Op;
    // End of variables declaration//GEN-END:variables
}
