
package formulario;

import BD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Alterar extends javax.swing.JFrame {
    //Classe de Inicialização
    public Alterar() {
        initComponents();
        pesquisar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPesquisar = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnSalvarAlteracao = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 540));
        getContentPane().setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\Update.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(600, 10, 75, 76);

        jLabel1.setFont(new java.awt.Font("Kimberley Bl", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 58, 186));
        jLabel1.setText("Atualizar Dados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 20, 700, 42);

        txtNome.setBackground(new java.awt.Color(181, 182, 255));
        txtNome.setForeground(new java.awt.Color(56, 58, 186));
        txtNome.setSelectedTextColor(new java.awt.Color(56, 58, 186));
        txtNome.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtSobrenome.setBackground(new java.awt.Color(181, 182, 255));
        txtSobrenome.setForeground(new java.awt.Color(56, 58, 186));
        txtSobrenome.setCaretColor(new java.awt.Color(56, 58, 186));
        txtSobrenome.setSelectedTextColor(new java.awt.Color(56, 58, 186));
        txtSobrenome.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtSenha.setBackground(new java.awt.Color(181, 182, 255));
        txtSenha.setForeground(new java.awt.Color(56, 58, 186));
        txtSenha.setSelectedTextColor(new java.awt.Color(56, 58, 186));
        txtSenha.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(79, 82, 255));
        jLabel2.setText("Nome");

        jLabel3.setForeground(new java.awt.Color(79, 82, 255));
        jLabel3.setText("Sobrenome");

        label.setForeground(new java.awt.Color(79, 82, 255));
        label.setText("Senha");

        jLabel5.setForeground(new java.awt.Color(79, 82, 255));
        jLabel5.setText("Tipo");

        txtTipo.setBackground(new java.awt.Color(181, 182, 255));
        txtTipo.setForeground(new java.awt.Color(56, 58, 186));
        txtTipo.setSelectedTextColor(new java.awt.Color(56, 58, 186));
        txtTipo.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(79, 82, 255));
        jLabel6.setText("URL");

        txtUrl.setBackground(new java.awt.Color(181, 182, 255));
        txtUrl.setForeground(new java.awt.Color(56, 58, 186));
        txtUrl.setSelectedTextColor(new java.awt.Color(56, 58, 186));
        txtUrl.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(79, 82, 255));
        jLabel4.setText("ID");

        txtIdUsuario.setBackground(new java.awt.Color(181, 182, 255));
        txtIdUsuario.setEnabled(false);
        txtIdUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdUsuarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addComponent(txtUrl)
                            .addComponent(txtSenha))))
                .addGap(115, 115, 115))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 70, 700, 200);

        tabelaPesquisar.setBackground(new java.awt.Color(212, 213, 255));
        tabelaPesquisar.setForeground(new java.awt.Color(79, 82, 255));
        tabelaPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Usuário", "Nome", "Sobrenome", "Url", "Tipo", "Senha"
            }
        ));
        tabelaPesquisar.setGridColor(new java.awt.Color(143, 148, 176));
        tabelaPesquisar.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelaPesquisar.setSelectionForeground(new java.awt.Color(79, 82, 255));
        tabelaPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPesquisarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPesquisar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 280, 680, 110);

        btnSair.setBackground(new java.awt.Color(150, 0, 25));
        btnSair.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(620, 460, 62, 24);

        btnSalvarAlteracao.setBackground(new java.awt.Color(56, 58, 186));
        btnSalvarAlteracao.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAlteracao.setText("Alterar");
        btnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAlteracao);
        btnSalvarAlteracao.setBounds(300, 410, 97, 36);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\barraBaixo.png")); // NOI18N
        jLabel7.setText("jLabel3");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 420, 700, 86);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão de sair
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    
    //Faz a seleção das duas tabelas do banco e insere na tabela
    Conexao con = new Conexao(); 
    public void pesquisar(){
                                            
        try {
            Connection c=con.conectar();
            PreparedStatement pesquisarStmt = c.prepareStatement("SELECT * FROM usuario INNER JOIN login ON usuario.idUsuario = login.fk_idUsuario;");  
            ResultSet rs = pesquisarStmt.executeQuery();                          
            //Exibindo dados da pesquisa na tabela
            DefaultTableModel model;
            model = (DefaultTableModel) tabelaPesquisar.getModel();
            model.setNumRows(0);
            while(rs.next()){
                model.addRow(
                new Object[]{
                    rs.getString("IdUsuario"),
                    rs.getString("Nome"),
                    rs.getString("Sobrenome"),
                    rs.getString("Url"),
                    rs.getString("Tipo"),
                    rs.getString("Senha")
                });                                             
            }    
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "ERROR, problemas ao se conectar com o Banco de Dados!");
            System.out.println("ERRO ALTERAR, método PESQUISAR- " + erro);
        }
    }
    
    
    private void btnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoActionPerformed
        //Update dos dados na tabela
        try {
            Connection c=con.conectar();
            PreparedStatement alterarStmt = c.prepareStatement("UPDATE Usuario INNER JOIN Login ON Usuario.IdUsuario = Login.fk_idUsuario SET Nome=?, Sobrenome=?, idUsuario=?, Url=?, Tipo=?, Senha=? WHERE idUsuario=?;"); 
            alterarStmt.setString(1, txtNome.getText());
            alterarStmt.setString(2, txtSobrenome.getText());
            alterarStmt.setString(3, txtIdUsuario.getText());
            alterarStmt.setString(4, txtUrl.getText());
            alterarStmt.setString(5, txtTipo.getText());
            alterarStmt.setString(6, txtSenha.getText());
            alterarStmt.setString(7, txtIdUsuario.getText());
            alterarStmt.execute();
            alterarStmt.close();
            JOptionPane.showMessageDialog(null, "Banco de dados atualizado com sucesso!");
            con.desconectar();         
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERROR, problemas ao alterar os dados do Banco de Dados!");
            System.out.println("ERRO em ALTERAR -> UPDATE " + erro);
        }finally{
            con.desconectar();
        }                                        
    }//GEN-LAST:event_btnSalvarAlteracaoActionPerformed
    //Faz a insersão do código da linha clicada nas labels
    private void tabelaPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisarMouseClicked
        int linha = tabelaPesquisar.getSelectedRow();
        txtIdUsuario.setText(tabelaPesquisar.getValueAt(linha, 0).toString());
        txtNome.setText(tabelaPesquisar.getValueAt(linha, 1).toString());
        txtSobrenome.setText(tabelaPesquisar.getValueAt(linha, 2).toString());
        txtUrl.setText(tabelaPesquisar.getValueAt(linha, 3).toString());
        txtTipo.setText(tabelaPesquisar.getValueAt(linha, 4).toString());
        txtSenha.setText(tabelaPesquisar.getValueAt(linha, 5).toString());
    }//GEN-LAST:event_tabelaPesquisarMouseClicked

    private void txtIdUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdUsuarioKeyReleased

    }//GEN-LAST:event_txtIdUsuarioKeyReleased

 
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
            java.util.logging.Logger.getLogger(Alterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTable tabelaPesquisar;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
