
package formulario;

import BD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class SelecionarUsuarioExistente extends javax.swing.JFrame {


    public SelecionarUsuarioExistente() {
        initComponents();
        mostrarNaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOpenPageCadLoginSenha = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtPesquisarUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSelecionarUsuario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(212, 213, 255));
        setMinimumSize(new java.awt.Dimension(710, 540));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        btnOpenPageCadLoginSenha.setBackground(new java.awt.Color(56, 58, 186));
        btnOpenPageCadLoginSenha.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnOpenPageCadLoginSenha.setForeground(new java.awt.Color(255, 255, 255));
        btnOpenPageCadLoginSenha.setText("Ir para Login");
        btnOpenPageCadLoginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPageCadLoginSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpenPageCadLoginSenha);
        btnOpenPageCadLoginSenha.setBounds(270, 300, 143, 33);

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

        txtPesquisarUsuario.setEditable(false);
        txtPesquisarUsuario.setBackground(new java.awt.Color(212, 213, 255));
        txtPesquisarUsuario.setForeground(new java.awt.Color(56, 58, 186));
        txtPesquisarUsuario.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtPesquisarUsuario.setSelectionColor(new java.awt.Color(56, 58, 186));
        txtPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarUsuarioActionPerformed(evt);
            }
        });
        txtPesquisarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarUsuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisarUsuario);
        txtPesquisarUsuario.setBounds(180, 260, 315, 24);

        jLabel5.setForeground(new java.awt.Color(56, 58, 186));
        jLabel5.setText("Clique na tabela para selecionar");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 80, 190, 16);

        tabelaSelecionarUsuario.setBackground(new java.awt.Color(212, 213, 255));
        tabelaSelecionarUsuario.setForeground(new java.awt.Color(70, 72, 237));
        tabelaSelecionarUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Usuário", "Nome"
            }
        ));
        tabelaSelecionarUsuario.setGridColor(new java.awt.Color(143, 148, 176));
        tabelaSelecionarUsuario.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelaSelecionarUsuario.setSelectionForeground(new java.awt.Color(70, 72, 237));
        tabelaSelecionarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSelecionarUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSelecionarUsuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 670, 130);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\barraBaixo.png")); // NOI18N
        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 420, 700, 86);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void txtPesquisarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarUsuarioKeyReleased
      mostrarNaTabela();                                
    }//GEN-LAST:event_txtPesquisarUsuarioKeyReleased
    
    //Método para selecionar no banco e inserir na tabela e pesquisar na tabela.
    public void mostrarNaTabela(){                               
        try {
            Connection c=con.conectar();
            PreparedStatement pesquisarStmt = c.prepareStatement("SELECT * FROM usuario WHERE nome like '%"+txtPesquisarUsuario.getText()+"%' OR idUsuario like '%"+txtPesquisarUsuario.getText()+"%';");  
            
            ResultSet rs = pesquisarStmt.executeQuery();                          
             //Exibindo dados da pesquisa na tabela
            DefaultTableModel model;
            model = (DefaultTableModel) tabelaSelecionarUsuario.getModel();
            model.setNumRows(0);
            while(rs.next()){
                model.addRow(
                new Object[]{
                    rs.getString("IdUsuario"),
                    rs.getString("Nome"),
                });                                             
            }    
        }catch (SQLException erro) {
            System.out.println("ERROR -> SelecionarUsuarioExistente -> " + erro);
        } 
    }
    
    //Insere na label pesquisar quando clicar na tabela
    private void tabelaSelecionarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSelecionarUsuarioMouseClicked
        int linha = tabelaSelecionarUsuario.getSelectedRow();
        txtPesquisarUsuario.setText(tabelaSelecionarUsuario.getValueAt(linha, 0).toString());
    }//GEN-LAST:event_tabelaSelecionarUsuarioMouseClicked

    private void btnOpenPageCadLoginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPageCadLoginSenhaActionPerformed

        CadastrarLoginSenha cadastrarLoginSenha = new CadastrarLoginSenha();
        cadastrarLoginSenha.setVisible(true);
    }//GEN-LAST:event_btnOpenPageCadLoginSenhaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    
    
    Conexao con = new Conexao();
    private void txtPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarUsuarioActionPerformed
//        try {
//            java.sql.Connection c=con.conectar();
//            PreparedStatement pesquisarStmt = c.prepareStatement("SELECT * FROM Usuario");  
//            ResultSet rs = pesquisarStmt.executeQuery();                          
//            //Exibindo dados da pesquisa na tabela
//            DefaultTableModel model;
//            model = (DefaultTableModel) tabelaSelecionarUsuario.getModel();
//            model.setNumRows(0);
//            while(rs.next()){
//                model.addRow(
//            new Object[]{
//                rs.getString("Nome"),
//                rs.getString("Sobrenome"),
//            });                                             
//            }    
//        }catch (SQLException e){
//           System.out.println("Ocorreu um erro ao conectar");
//        }   
    
    }//GEN-LAST:event_txtPesquisarUsuarioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarUsuarioExistente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpenPageCadLoginSenha;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaSelecionarUsuario;
    private javax.swing.JTextField txtPesquisarUsuario;
    // End of variables declaration//GEN-END:variables
}
