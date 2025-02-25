/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.print.attribute.DateTimeSyntax;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282229
 */
public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;
    
    public PlanoDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
      
    }
       public PlanoDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            PlanoDeSaude e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        planoDeSaude = e ;
        this.operacao = operacao;
        
        preencherFormulario();
        
    }
       
         public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
         
    private void preencherFormulario(){
        
       
        
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldOperadora.setText(planoDeSaude.getOperadora());
        textFieldCategoria.setText(planoDeSaude.getCategoria());
        textFieldCarteirinha.setText(planoDeSaude.getNumero());
        textFieldValidade.setText(planoDeSaude.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
    }
    
    
    
    
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        labelAno = new javax.swing.JLabel();
        spinnerAno = new javax.swing.JSpinner();
        spinnerMes = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        labelMes = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        spinnerDia = new javax.swing.JSpinner();
        labeldia = new javax.swing.JLabel();
        inicioPanel = new javax.swing.JPanel();
        textoLabel = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        labelcategoria = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        labelCarteirinha = new javax.swing.JLabel();
        textFieldCarteirinha = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        buttonExcluir = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        textFieldValidade = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jTree1);

        labelAno.setText("Ano");

        labelMes.setText("Mes");

        labeldia.setText("dia");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        inicioPanel.setBackground(new java.awt.Color(255, 255, 255));
        inicioPanel.setLayout(null);

        textoLabel.setBackground(new java.awt.Color(0, 0, 255));
        textoLabel.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        textoLabel.setForeground(new java.awt.Color(0, 51, 255));
        textoLabel.setText("Adicionar novo Plano");
        inicioPanel.add(textoLabel);
        textoLabel.setBounds(150, 40, 230, 30);

        getContentPane().add(inicioPanel);
        inicioPanel.setBounds(0, 0, 550, 110);

        labelCodigo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(255, 51, 51));
        labelCodigo.setText("Codigo");
        getContentPane().add(labelCodigo);
        labelCodigo.setBounds(10, 140, 70, 16);

        textFieldCodigo.setBackground(new java.awt.Color(255, 204, 51));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldCodigo);
        textFieldCodigo.setBounds(10, 160, 90, 22);

        labelOperadora.setText("Operadora");
        getContentPane().add(labelOperadora);
        labelOperadora.setBounds(20, 210, 90, 20);

        textFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldOperadora);
        textFieldOperadora.setBounds(10, 240, 180, 22);

        labelcategoria.setText("Categoria");
        getContentPane().add(labelcategoria);
        labelcategoria.setBounds(300, 210, 110, 20);
        getContentPane().add(textFieldCategoria);
        textFieldCategoria.setBounds(290, 240, 190, 22);

        labelCarteirinha.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        labelCarteirinha.setForeground(new java.awt.Color(255, 51, 51));
        labelCarteirinha.setText("Numero da Carteirinha");
        getContentPane().add(labelCarteirinha);
        labelCarteirinha.setBounds(10, 290, 160, 18);

        textFieldCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCarteirinhaActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldCarteirinha);
        textFieldCarteirinha.setBounds(10, 310, 200, 22);

        labelValidade.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        labelValidade.setForeground(new java.awt.Color(255, 51, 51));
        labelValidade.setText("Validade");
        getContentPane().add(labelValidade);
        labelValidade.setBounds(300, 290, 150, 16);

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(buttonExcluir);
        buttonExcluir.setBounds(340, 400, 75, 23);

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(450, 400, 75, 23);
        getContentPane().add(textFieldValidade);
        textFieldValidade.setBounds(290, 310, 190, 22);
        try{
            textFieldValidade.setFormatterFactory(new javax.swing.text.
                DefaultFormatterFactory(new javax.swing.text.MaskFormatter
                    ("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        setSize(new java.awt.Dimension(564, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCarteirinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCarteirinhaActionPerformed

    private void textFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
          CharSequence s = " ";
        
        if (textFieldOperadora.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A operadora do plano de saúde é obrigatória!");
            textFieldOperadora.requestFocus();
        } else if (textFieldCategoria.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A categoria do plano de saúde é obrigatória");
            textFieldCategoria.requestFocus();
        } else if (textFieldCarteirinha.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O número do plano de saúde é obrigatório");
            textFieldCarteirinha.requestFocus();
        } else if (textFieldValidade.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(null, "A validade do plano de saúde é obrigatória");
            textFieldValidade.requestFocus();
        } else if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }   
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        dispose();
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void adicionar (){
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setOperadora(textFieldOperadora.getText());
        novoPlanoDeSaude.setCategoria(textFieldCategoria.getText());
        novoPlanoDeSaude.setNumero(textFieldCarteirinha.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(textFieldValidade.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       
        
        PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);
        
        JOptionPane.showMessageDialog(this, "Especialidade gravada com sucesso"
                , "Especialidade",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        
}
      private void editar(){
          
        planoDeSaude.setOperadora(textFieldOperadora.getText());
        planoDeSaude.setCategoria(textFieldCategoria.getText());
        planoDeSaude.setNumero(textFieldCarteirinha.getText());
        planoDeSaude.setValidade(LocalDate.parse(textFieldValidade.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       
        
        
        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        
        JOptionPane.showMessageDialog(
                null,
                "Atualização completa", 
                "Especialidade", 
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelCarteirinha;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JLabel labelcategoria;
    private javax.swing.JLabel labeldia;
    private javax.swing.JSpinner spinnerAno;
    private javax.swing.JSpinner spinnerDia;
    private javax.swing.JSpinner spinnerMes;
    private javax.swing.JTextField textFieldCarteirinha;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JFormattedTextField textFieldValidade;
    private javax.swing.JLabel textoLabel;
    // End of variables declaration//GEN-END:variables
}
