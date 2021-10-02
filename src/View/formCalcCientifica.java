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
        jButton5 = new javax.swing.JButton();
        btn_Res = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Sum = new javax.swing.JButton();
        btn_Sub = new javax.swing.JButton();
        btn_Mult = new javax.swing.JButton();
        btn_Div = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextField_Valor2.setName("txt_valor"); // NOI18N

        jTextField_Valor1.setName("txt_valor"); // NOI18N

        jButton5.setText("AC");
        jButton5.setToolTipText("");
        jButton5.setName("btn_res"); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Res, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_Valor2)
                        .addComponent(jTextField_Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Sum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Div, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jTextField_Valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Sum)
                    .addComponent(btn_Sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mult)
                    .addComponent(btn_Div))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Res)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btn_Mult.getAccessibleContext().setAccessibleName("*");
        btn_Div.getAccessibleContext().setAccessibleName("/");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Operadores
    private void btn_SumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SumMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("+".charAt(0));
        
    }//GEN-LAST:event_btn_SumMouseClicked

    private void btn_SubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SubMouseClicked
        // TODO add your handling code here:
       CalcCientifica.setOperador("-".charAt(0));
    }//GEN-LAST:event_btn_SubMouseClicked

    private void btn_MultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MultMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("*".charAt(0));
    }//GEN-LAST:event_btn_MultMouseClicked

    private void btn_DivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DivMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setOperador("/".charAt(0));
    }//GEN-LAST:event_btn_DivMouseClicked

    private void btn_ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ResMouseClicked
        // TODO add your handling code here:
        CalcCientifica.setValor1(Double.parseDouble(jTextField_Valor1.getText())); //Seta o valor_1
        CalcCientifica.setValor2(Double.parseDouble(jTextField_Valor2.getText())); //Seta o valor_2
        //
        
        JOptionPane.showMessageDialog(null, "Resultado"+ CtrlCalcCientifica.RealizarCalculo(CalcCientifica)); //Passa para o controle o objeto CalcCientifica.);              
        
    }//GEN-LAST:event_btn_ResMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCalcCientifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Div;
    private javax.swing.JButton btn_Mult;
    private javax.swing.JButton btn_Res;
    private javax.swing.JButton btn_Sub;
    private javax.swing.JButton btn_Sum;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_Valor1;
    private javax.swing.JTextField jTextField_Valor2;
    // End of variables declaration//GEN-END:variables
}
