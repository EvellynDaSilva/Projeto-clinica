/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialodadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import java.awt.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282229
 */
public class EspecialidadeDialog extends javax.swing.JDialog {

    
  
          Especialidade especialidade;
    
    public EspecialidadeDialog(
            java.awt.Frame parent, 
            boolean modal
            ) {
        
        super(parent, modal);
        initComponents();
    }
    public EspecialidadeDialog(
            java.awt.Frame parent, 
            boolean modal,
            Especialidade e) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e ;
        
        preencherFormulario();
        
    }
    
    private void preencherFormulario(){
        
        tituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png")));
        tituloLabel.setText("Especialidade - Editar");
        codigoTextField.setText(especialidade.getCodigo().toString());
        adicionarEspecialidadeTextField.setText(especialidade.getNome());
        descricaoTextField.setText(especialidade.getDescricao());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicioPanel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        detalhesPanel = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        buttonExcluir = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        adicionarEspecialidadeLabel = new javax.swing.JLabel();
        adicionarEspecialidadeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        inicioPanel.setBackground(new java.awt.Color(255, 255, 255));
        inicioPanel.setForeground(new java.awt.Color(51, 51, 255));
        inicioPanel.setLayout(null);

        tituloLabel.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(51, 0, 255));
        tituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        tituloLabel.setText("  Especialidade - ADICIONAR ");
        inicioPanel.add(tituloLabel);
        tituloLabel.setBounds(30, 30, 440, 50);

        getContentPane().add(inicioPanel);
        inicioPanel.setBounds(0, 0, 550, 110);

        detalhesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 255))); // NOI18N
        detalhesPanel.setLayout(null);

        descricaoLabel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        descricaoLabel.setForeground(new java.awt.Color(255, 0, 102));
        descricaoLabel.setText("Descirção da Especialidade");
        detalhesPanel.add(descricaoLabel);
        descricaoLabel.setBounds(20, 160, 200, 17);

        descricaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoTextFieldActionPerformed(evt);
            }
        });
        detalhesPanel.add(descricaoTextField);
        descricaoTextField.setBounds(20, 190, 490, 22);

        codigoLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigoLabel.setForeground(new java.awt.Color(255, 51, 51));
        codigoLabel.setText("Código");
        detalhesPanel.add(codigoLabel);
        codigoLabel.setBounds(20, 30, 70, 20);

        codigoTextField.setEditable(false);
        codigoTextField.setBackground(new java.awt.Color(255, 204, 51));
        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });
        detalhesPanel.add(codigoTextField);
        codigoTextField.setBounds(20, 60, 80, 22);

        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonExcluir.setToolTipText("Cancelar");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        detalhesPanel.add(buttonExcluir);
        buttonExcluir.setBounds(390, 240, 40, 30);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/novo-documento.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Salvar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        detalhesPanel.add(buttonAdicionar);
        buttonAdicionar.setBounds(440, 240, 40, 30);

        adicionarEspecialidadeLabel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        adicionarEspecialidadeLabel.setForeground(new java.awt.Color(255, 51, 51));
        adicionarEspecialidadeLabel.setText("Nome da Especialidade");
        detalhesPanel.add(adicionarEspecialidadeLabel);
        adicionarEspecialidadeLabel.setBounds(20, 90, 170, 17);

        adicionarEspecialidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarEspecialidadeTextFieldActionPerformed(evt);
            }
        });
        detalhesPanel.add(adicionarEspecialidadeTextField);
        adicionarEspecialidadeTextField.setBounds(20, 120, 370, 22);

        getContentPane().add(detalhesPanel);
        detalhesPanel.setBounds(10, 120, 530, 310);

        setSize(new java.awt.Dimension(564, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextFieldActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void adicionarEspecialidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarEspecialidadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarEspecialidadeTextFieldActionPerformed

    private void descricaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoTextFieldActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        
           //criar um objeto especialidade
        
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(adicionarEspecialidadeTextField.getText());
        novaEspecialidade.setDescricao(descricaoTextField.getText());
        
        EspecialodadeDAO.gravar(novaEspecialidade);
        JOptionPane.showMessageDialog(this, "Especialidade gravada com sucesso"
                , "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EspecialidadeDialog dialog = new EspecialidadeDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adicionarEspecialidadeLabel;
    private javax.swing.JTextField adicionarEspecialidadeTextField;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JPanel detalhesPanel;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
