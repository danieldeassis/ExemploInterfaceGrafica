/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.es;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author sala302b
 */
public class CalculadoraPilha extends javax.swing.JFrame {

    ArrayList<Double> listaNumeros = new ArrayList();

    /**
     * Creates new form CalculadoraPilha
     */
    public CalculadoraPilha() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void atualizaJListNumeros() {
        //Criar o model do JList
        DefaultListModel model = new DefaultListModel();

        /*
        Percorre o ArrayList listaNumeros de 1 em 1
        da posição 0 até a última posição ( size - 1 )
         */
 /*for (int i = 0; i < listaNumeros.size(); i++) {
            Double numTemp = listaNumeros.get(i);
            model.addElement( numTemp );
        }*/
 /*
        Percorre o ArrayList do primeiro ao último elemento
        passando cada valor para a variável numTemp
         */
        for (Double numTemp : listaNumeros) {
            model.addElement(numTemp);
        }

        //'Despejar' (set) o model no JList
        jListNumeros.setModel(model);

        campoFormatNumero.setText("");
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
        botaoSoma = new javax.swing.JButton();
        botaoEmpilhar = new javax.swing.JButton();
        botaoSub = new javax.swing.JButton();
        botaoDiv = new javax.swing.JButton();
        botaoMult = new javax.swing.JButton();
        campoFormatNumero = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNumeros = new javax.swing.JList<>();
        labelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 185, 247));

        botaoSoma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoSoma.setText("+");
        botaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSomaActionPerformed(evt);
            }
        });

        botaoEmpilhar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoEmpilhar.setText("Empilhar");
        botaoEmpilhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEmpilharActionPerformed(evt);
            }
        });

        botaoSub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoSub.setText("-");
        botaoSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubActionPerformed(evt);
            }
        });

        botaoDiv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoDiv.setText("/");
        botaoDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivActionPerformed(evt);
            }
        });

        botaoMult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoMult.setText("*");
        botaoMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultActionPerformed(evt);
            }
        });

        campoFormatNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        campoFormatNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jListNumeros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jListNumeros);

        labelResultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelResultado.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoFormatNumero)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoEmpilhar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoFormatNumero)
                    .addComponent(botaoEmpilhar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(botaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(labelResultado)
                        .addGap(19, 19, 19)))
                .addGap(24, 24, 24))
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

    private void botaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomaActionPerformed
        //Obtem o resultado Atual da Calculadora
        String resultadoAtual = labelResultado.getText();
        
        //Começa a soma com o resultado obtido;
        Double soma = Double.parseDouble(resultadoAtual);

        for (Double numTemp : listaNumeros) {
            soma = soma + numTemp;
        }

        labelResultado.setText(soma + "");

        //Limpa (zera) todos os números do ArrayList
        listaNumeros.clear();

        //Despeja o ArrayList no Jlist
        atualizaJListNumeros();
    }//GEN-LAST:event_botaoSomaActionPerformed

    private void botaoMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultActionPerformed
        //Obtem o resultado Atual da Calculadora
        String resultadoAtual = labelResultado.getText();

        //Começa a multiplicação com o resultado obtido;
        Double mult = Double.parseDouble(resultadoAtual);

        for (Double numTemp : listaNumeros) {
            mult = mult * numTemp;
        }

        labelResultado.setText(mult + "");

        //Limpa (zera) todos os números do ArrayList
        listaNumeros.clear();

        //Despeja o ArrayList no Jlist
        atualizaJListNumeros();
    }//GEN-LAST:event_botaoMultActionPerformed

    private void botaoEmpilharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEmpilharActionPerformed

        String leitura = campoFormatNumero.getValue().toString();

        Double valor = Double.parseDouble(leitura);

        //Salvar o valor no ArrayList
        listaNumeros.add(valor);

        //Atualizar o JList
        atualizaJListNumeros();

    }//GEN-LAST:event_botaoEmpilharActionPerformed

    private void botaoSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubActionPerformed
        //Obtem o resultado atual da calculadora
        String resultadoAtual = labelResultado.getText();

        //Começa a subtração com o resultado obtido;
        Double sub = Double.parseDouble(resultadoAtual);

        for (int i = 0; i < listaNumeros.size(); i++) {
            sub = sub - listaNumeros.get(i);
        }

        labelResultado.setText(sub + "");

        //Limpa (zera) todos os números do ArrayList
        listaNumeros.clear();

        //Despeja o ArrayList no Jlist
        atualizaJListNumeros();
    }//GEN-LAST:event_botaoSubActionPerformed

    private void botaoDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivActionPerformed
        //Obtem o resultado atual da calculadora
        String resultadoAtual = labelResultado.getText();
        
        //começa a divisão com o resultado obtido
        Double div = Double.parseDouble(resultadoAtual);
       
        for (int i = 0; i < listaNumeros.size(); i++) {
            div = div / listaNumeros.get(i);
        }

        labelResultado.setText(div + "");

        //Limpa (zera) todos os números do ArrayList
        listaNumeros.clear();

        //Despeja o ArrayList no Jlist
        atualizaJListNumeros();
    }//GEN-LAST:event_botaoDivActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraPilha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDiv;
    private javax.swing.JButton botaoEmpilhar;
    private javax.swing.JButton botaoMult;
    private javax.swing.JButton botaoSoma;
    private javax.swing.JButton botaoSub;
    private javax.swing.JFormattedTextField campoFormatNumero;
    private javax.swing.JList<String> jListNumeros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelResultado;
    // End of variables declaration//GEN-END:variables
}
