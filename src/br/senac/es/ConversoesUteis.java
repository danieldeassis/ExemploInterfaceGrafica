/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.es;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sala302b
 */
public class ConversoesUteis extends javax.swing.JFrame {

    public ConversoesUteis() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoData = new javax.swing.JFormattedTextField();
        campoValorDouble = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoResultados = new javax.swing.JTextArea();
        botaoConverterData = new javax.swing.JButton();
        botaoConverterValorDouble = new javax.swing.JButton();
        campoCPF = new javax.swing.JFormattedTextField();
        botaoConverterCPF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Digite uma data (dd/mm/aaaa)");

        jLabel4.setText("Digite um valor decimal (0,00)");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        campoValorDouble.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        areaTextoResultados.setColumns(20);
        areaTextoResultados.setRows(5);
        jScrollPane1.setViewportView(areaTextoResultados);

        botaoConverterData.setText(">>");
        botaoConverterData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConverterDataActionPerformed(evt);
            }
        });

        botaoConverterValorDouble.setText(">>");
        botaoConverterValorDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConverterValorDoubleActionPerformed(evt);
            }
        });

        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaoConverterCPF.setText(">>");
        botaoConverterCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConverterCPFActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite uma data (dd/mm/aaaa)");

        jLabel3.setText("Digite um valor decimal (0,00)");

        jLabel5.setText("Digite um CPF (apenas números)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(campoValorDouble)
                                    .addComponent(campoData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(botaoConverterData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoConverterValorDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botaoConverterCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoConverterData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoConverterValorDouble)
                            .addComponent(campoValorDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoConverterCPF)
                            .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConverterDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConverterDataActionPerformed

        String resultado;
        String saida = "";

        //uma classe específica para se guardar datas
        Date data = (Date) campoData.getValue();        

        //salvando na String de saída data (tipo date) em seu formato natural
        saida = saida + "Formato Padrão (Sem formatação:) " + data + "\n";
        
        //uma calsse usada para formatar datas de uma forma "simplificada"
        SimpleDateFormat formatadorData = new SimpleDateFormat();

        //Primeiro tipo de formatação apresentado
        formatadorData.applyPattern("d/M/yy");
        resultado = formatadorData.format(data);
        saida = saida + "Formato 1: " + resultado + "\n";

        //Segundo tipo de formatação apresentado
        formatadorData.applyPattern("dd/M/Y");
        resultado = formatadorData.format(data);
        saida = saida + "Formato 2: " + resultado + "\n";

        //Terceiro tipo de formatação apresentado
        formatadorData.applyPattern("d 'de' MMMM 'de' yyyy");
        resultado = formatadorData.format(data);
        saida = saida + "Formato 3: " + resultado + "\n";

        //Quarto tipo de formatação apresentado
        formatadorData.applyPattern("EEEE, d 'de' MMMM 'de' yyyy");
        resultado = formatadorData.format(data);
        saida = saida + "Formato 4: " + resultado + "\n";
        
        //Quarto tipo de formatação apresentado
        formatadorData.applyPattern("yyyy-M-d");
        resultado = formatadorData.format(data);
        saida = saida + "Formato 5 (MySQL): " + resultado + "\n";

        //joga o resultado na caixa de texto
        areaTextoResultados.setText(saida);
        
        //limpa o campo de data
        campoData.setText(null);
    }//GEN-LAST:event_botaoConverterDataActionPerformed

    private void botaoConverterValorDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConverterValorDoubleActionPerformed

        String saida = "";
        
        //Recebendo um valor em formato de double normal
        double valorDouble = Double.parseDouble(campoValorDouble.getValue().toString());

        saida = saida +"Valor double: "+ valorDouble + "\n";
        
        //usando a classe NumberFormat para transformar um double em moeda (Real)
        //o método getCurrencyInstance() obtem a linhagem e país do seu computador
        //o método format() recebe um double e converte na moeda do seu país
        //este valor é uma String que deve ser salva numa variável
        //a variável valorEmReais agora contem o valor formatado na moeda padrão
        String valorEmReais = NumberFormat.getCurrencyInstance().format(valorDouble);
        
        saida = saida +"Valor em Reais: "+ valorEmReais + "\n";
        
        //joga o resultado na caixa de texto
        areaTextoResultados.setText(saida);
        
        //limpa o campo de valor double
        campoValorDouble.setText(null);
    }//GEN-LAST:event_botaoConverterValorDoubleActionPerformed

    private void botaoConverterCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConverterCPFActionPerformed
        
        String saida = "";
        
        String cpf = campoCPF.getValue().toString();
        
        saida = saida + "CPF com máscara: "+cpf+"\n";
        
        //substitui TODOS (All) os pontos "." por vazio ""
        //o "." é um caracter especial (é usado como operador) por isso colocamos \\
        //antes, para que o java entenda que nos referimos ao ponto como um caracter simples
        //e não um operador
        cpf = cpf.replaceAll("\\.", "");
        
        //substitui o primeiro traço "-" por vazio ""
        //o traço não tem importância como caracter especial, por isso não precisamos colocar \\ antes
        cpf = cpf.replaceAll("-", "");
        System.out.println(cpf);
        saida = saida + "CPF sem máscara: "+cpf+"\n";
        
        //joga o resultado na caixa de texto
        areaTextoResultados.setText(saida);
        
        //limpa o campo de valor double
        campoCPF.setText(null);
        
    }//GEN-LAST:event_botaoConverterCPFActionPerformed

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
            java.util.logging.Logger.getLogger(ConversoesUteis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversoesUteis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversoesUteis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversoesUteis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversoesUteis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoResultados;
    private javax.swing.JButton botaoConverterCPF;
    private javax.swing.JButton botaoConverterData;
    private javax.swing.JButton botaoConverterValorDouble;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JFormattedTextField campoValorDouble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
