/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.es;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author sala302b
 */
public class TelaComLista extends javax.swing.JFrame {

    ArrayList<String> listaNomes = new ArrayList();

    /**
     * Creates new form Tela2
     */
    public TelaComLista() {
        this.initComponents();
        this.setLocationRelativeTo(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        botaoCadastro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNomes = new javax.swing.JList<>();
        botaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(28, 195, 218));
        painelPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                painelPrincipalMouseMoved(evt);
            }
        });

        botaoCadastro.setText("Cadastrar");
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });

        jListNomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListNomesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListNomes);

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void painelPrincipalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelPrincipalMouseMoved
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(painelPrincipal, "Passou o mouse por cima");
        painelPrincipal.setBackground(Color.PINK);
    }//GEN-LAST:event_painelPrincipalMouseMoved

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        // TODO add your handling code here:
        String nome = campoNome.getText();
        listaNomes.add(nome);
        
        //Declarar e intanciar a classe de model para JList
        DefaultListModel model = new DefaultListModel();
        /*model.addElement("Laranja");
        model.addElement("Abacaxi");
        model.addElement("Morango");*/
        
        //Percorrer o ArrayList e preencher a classe model
        for (String temp : listaNomes) {
            model.addElement(temp);
        }
        
        
        //"Despejar" ou setar o modelo no JList
        jListNomes.setModel(model);
        
        System.out.println("Quantidade " + listaNomes.size());
        campoNome.setText(null);
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void jListNomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListNomesMouseClicked
        // TODO add your handling code here:
        int pos = jListNomes.getSelectedIndex();
        
        System.out.println("Você clicou na posição "+pos);
        System.out.println("Valor do ArrayList : " + listaNomes.get(pos));
        
        //Acesso o ArrayList na posição 'pos'
        String nomeTemp = listaNomes.get(pos);
        //O nome que está no ArrayList é setado no campo de texto
        campoNome.setText(nomeTemp);
    }//GEN-LAST:event_jListNomesMouseClicked

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
        
        //obtendo o nome do campo de texto e salvando em nomeTemp
        String nomeTemp = campoNome.getText();
        
        //Verificando se nomeTemp existe no ArrayList
        if (listaNomes.contains(nomeTemp)){
            //Excluindo o nome do ArrayList
            listaNomes.remove(nomeTemp);
            
            //Criando a classe model para preencher o JList
            DefaultListModel model = new DefaultListModel();
            
            //Percorrendo o ArrayList e salvando em model
            for (String nomeTemporario : listaNomes) {
                model.addElement(nomeTemporario);
            }
            
            //Setando o model dentro do JList
            jListNomes.setModel(model);
            
        }else{
            JOptionPane.showMessageDialog(null, "Nome Inexistente");
        }
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaComLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JTextField campoNome;
    private javax.swing.JList<String> jListNomes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
