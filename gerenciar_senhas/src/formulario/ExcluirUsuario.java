
package formulario;

import BD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ExcluirUsuario extends javax.swing.JFrame {


    public ExcluirUsuario() {
        initComponents();
        mostrarNaTabela();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPesquisar = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\garbage2.png")); // NOI18N
        jLabel6.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 540));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        txtPesquisar.setBackground(new java.awt.Color(181, 182, 255));
        txtPesquisar.setForeground(new java.awt.Color(79, 82, 255));
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(79, 82, 255));
        jLabel2.setText("Pesquisar por URL");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\lupa.png")); // NOI18N
        jLabel5.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel2)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(6, 105, 688, 100);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\garbage2.png")); // NOI18N
        jLabel7.setText("jLabel4");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(610, 20, 70, 90);

        jLabel1.setFont(new java.awt.Font("Kimberley Bl", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 58, 186));
        jLabel1.setText("Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 45, 688, 42);

        tabelaPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        tabelaPesquisar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        tabelaPesquisar.setForeground(new java.awt.Color(79, 82, 255));
        tabelaPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "ID Usuário"
            }
        ));
        tabelaPesquisar.setSelectionForeground(new java.awt.Color(79, 82, 255));
        tabelaPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPesquisarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPesquisar);
        if (tabelaPesquisar.getColumnModel().getColumnCount() > 0) {
            tabelaPesquisar.getColumnModel().getColumn(0).setResizable(false);
            tabelaPesquisar.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 233, 688, 101);

        btnExcluir.setBackground(new java.awt.Color(56, 58, 186));
        btnExcluir.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-2, 350, 700, 49);

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
        btnSair.setBounds(620, 450, 62, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\barraBaixo.png")); // NOI18N
        jLabel4.setText("jLabel3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 420, 700, 86);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        mostrarNaTabela();
    }//GEN-LAST:event_txtPesquisarKeyReleased
    
    public void mostrarNaTabela(){
        try {
            Connection c=con.conectar();
            PreparedStatement pesquisarStmt = c.prepareStatement("SELECT * FROM Usuario where nome like '%"+txtPesquisar.getText()+"%'");
            ResultSet rs = pesquisarStmt.executeQuery();                          
            //Exibindo dados da pesquisa na tabela
            DefaultTableModel model;
            model = (DefaultTableModel) tabelaPesquisar.getModel();
            model.setNumRows(0);
            while(rs.next()){
                model.addRow(
                new Object[]{
                    rs.getString("nome"),
                    rs.getString("sobrenome"),
                    rs.getString("idUsuario")
                });                                             
            }    
        }catch (SQLException erro){
            
            System.out.println("ocorreu um erro ao conectar");
            System.out.println("ERROR -> ExcluirUsuario -> MostrarNaTabela -> " + erro);
        }
    }
    
    private void tabelaPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisarMouseClicked
        int linha=tabelaPesquisar.getSelectedRow();
        txtPesquisar.setText(tabelaPesquisar.getValueAt(linha, 0).toString());
    }//GEN-LAST:event_tabelaPesquisarMouseClicked
    
    Conexao con=new Conexao();
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Codigo excluir produto
        try {
            Connection c=con.conectar();
            PreparedStatement excluirStmt=c.prepareStatement("DELETE FROM usuario WHERE nome=?");
            excluirStmt.setString(1, txtPesquisar.getText());
            excluirStmt.execute();
            excluirStmt.close();
            JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
            con.desconectar();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este usuário, ele pode possuir logins\nExclua os logins relacionados a este usuário primeiro!");
            System.err.println("Error ao Deletar Registro -> ExcluirUsuario -> " + erro);
        }finally{
            con.desconectar();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


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
            java.util.logging.Logger.getLogger(ExcluirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPesquisar;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
