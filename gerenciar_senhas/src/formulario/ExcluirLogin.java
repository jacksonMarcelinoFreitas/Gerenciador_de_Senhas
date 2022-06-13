
package formulario;

import BD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ExcluirLogin extends javax.swing.JFrame {

  
    public ExcluirLogin() {
        initComponents();
        mostrarNaTabela();    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPesquisar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 540));
        getContentPane().setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\garbage2.png")); // NOI18N
        jLabel5.setText("jLabel4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(610, 20, 70, 90);

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
        tabelaPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaPesquisar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        tabelaPesquisar.setForeground(new java.awt.Color(79, 82, 255));
        tabelaPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "URL", "Senha", "Usuário"
            }
        ));
        tabelaPesquisar.setSelectionForeground(new java.awt.Color(79, 82, 255));
        tabelaPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPesquisarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPesquisar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 233, 688, 110);

        txtPesquisar.setBackground(new java.awt.Color(181, 182, 255));
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

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\lupa.png")); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel2)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(6, 105, 688, 100);

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
                .addGap(294, 294, 294)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 360, 688, 49);

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
        btnSair.setBounds(630, 460, 62, 24);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\barraBaixo.png")); // NOI18N
        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 420, 700, 86);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

    Conexao con=new Conexao();
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Codigo excluir produto
        try {
            Connection c=con.conectar();
            PreparedStatement excluirStmt=c.prepareStatement("delete from login where url=?");
            excluirStmt.setString(1, txtPesquisar.getText());    
            excluirStmt.execute();
            excluirStmt.close();
            JOptionPane.showMessageDialog(null, "Produto Deletado com sucesso");
            con.desconectar();           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este login!");
            System.out.println("ERROR -> ExcluirLogin -> " + erro);
        }finally{
            con.desconectar();
        }            
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        mostrarNaTabela();                                                                  
    }//GEN-LAST:event_txtPesquisarKeyReleased
    
    //Método para selecionar e mostrar na tabela
    public void mostrarNaTabela(){
        try {
            Connection c=con.conectar();
            PreparedStatement pesquisarStmt = c.prepareStatement("SELECT * FROM login WHERE url like '%"+txtPesquisar.getText()+"%'");  
            
            ResultSet rs = pesquisarStmt.executeQuery();                          
                 //Exibindo dados da pesquisa na tabela
            DefaultTableModel model;
            model = (DefaultTableModel) tabelaPesquisar.getModel();
            model.setNumRows(0);
            while(rs.next()){
                model.addRow(
                new Object[]{
                    rs.getString("tipo"),
                    rs.getString("url"),
                    rs.getString("senha"),
                    rs.getString("fk_idUsuario")
                });                                             
            }    
        }catch (SQLException erro){
            System.out.println("Ocorreu um erro ao conectar com o Banco de dados!");
            System.out.println("Excluir -> Login ->" + erro);
        }finally{
            con.desconectar();
        }
    }
    
    //Inserir nas labels os elementos quando clicado
    private void tabelaPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisarMouseClicked
        int linha=tabelaPesquisar.getSelectedRow();
        txtPesquisar.setText(tabelaPesquisar.getValueAt(linha, 0).toString());
    }//GEN-LAST:event_tabelaPesquisarMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        
    }//GEN-LAST:event_txtPesquisarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirLogin().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPesquisar;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
