
package formulario;

import BD.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastrarLoginSenha extends javax.swing.JFrame {
    
    public CadastrarLoginSenha() {
        initComponents();
        dadosNaComboBox();  
    }
    
    //Método para para colocar elementos do mysql no ComboBox;
    Vector<Integer> idUsuario = new Vector<Integer>();
    public void dadosNaComboBox(){{                                    
        try {
            Connection c=con.conectar();
            PreparedStatement pesquisarStmt = c.prepareStatement("SELECT idUsuario, nome FROM Usuario");  
            ResultSet rs = pesquisarStmt.executeQuery();                          
            //Exibindo dados da pesquisa no ComboBox
            while(rs.next()){
                idUsuario.addElement(rs.getInt(1));                                   
                cbxUsuario.addItem(rs.getString(2));                                       
            }    
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar os dados na COMBO BOX!");
           System.out.println("Ocorreu um erro ao carregar os dados na COMBO BOX!");
           System.out.println("CadastrarLoginSenha -> Método dadosNaComboBox " + erro);
        }finally{
            con.desconectar();
        } 
    }                 
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUrl = new javax.swing.JTextField();
        labelTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxUsuario = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtSenha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 540));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(70, 72, 237))); // NOI18N

        txtUrl.setBackground(new java.awt.Color(181, 182, 255));
        txtUrl.setForeground(new java.awt.Color(70, 72, 237));
        txtUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrlActionPerformed(evt);
            }
        });

        labelTipo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(70, 72, 237));
        labelTipo.setText("Tipo");

        txtTipo.setBackground(new java.awt.Color(181, 182, 255));
        txtTipo.setForeground(new java.awt.Color(70, 72, 237));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 72, 237));
        jLabel4.setText("URL");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 72, 237));
        jLabel5.setText("ID Usuário");

        cbxUsuario.setForeground(new java.awt.Color(70, 72, 237));
        cbxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxUsuarioMouseClicked(evt);
            }
        });
        cbxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTipo)
                                .addGap(18, 18, 18)
                                .addComponent(txtTipo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtUrl))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbxUsuario, 0, 94, Short.MAX_VALUE)
                        .addGap(267, 267, 267)))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 80, 660, 157);

        btnCadastrar.setBackground(new java.awt.Color(79, 82, 255));
        btnCadastrar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Finalizar Cadastro");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 340, 700, 46);

        jLabel3.setFont(new java.awt.Font("Kimberley Bl", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 58, 186));
        jLabel3.setText("Login e Senha");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(6, 17, 690, 42);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(70, 72, 237))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(70, 72, 237));

        txtSenha.setBackground(new java.awt.Color(181, 182, 255));
        txtSenha.setForeground(new java.awt.Color(70, 72, 237));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(70, 72, 237));
        jLabel7.setText("Senha");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(16, 240, 670, 70);

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

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\jacks\\OneDrive - Instituição Adventista de Ensino\\FACUL\\3° Semestre\\Programação Orientada a Objetos\\Trabalho - CRUD\\Imagens\\barraBaixo.png")); // NOI18N
        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 420, 700, 86);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrlActionPerformed

    }//GEN-LAST:event_txtUrlActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrarLoginSenha();
    }//GEN-LAST:event_btnCadastrarActionPerformed
    //Método para inserir elementos na tabela
    Conexao con=new Conexao();
    public void cadastrarLoginSenha(){
        try {
            Connection c=con.conectar();
            PreparedStatement cadastrarStmt=c.prepareStatement("insert into Login(tipo,url,senha,fk_idUsuario) values (?,?,?,?)");
            cadastrarStmt.setString(1, txtTipo.getText()); 
            cadastrarStmt.setString(2, txtUrl.getText());  
            cadastrarStmt.setString(3, txtSenha.getText());         
            cadastrarStmt.setInt(4, cbxUsuario.getSelectedIndex() - 1);         
            cadastrarStmt.execute();
            cadastrarStmt.close();
            JOptionPane.showMessageDialog(null, "Login cadastrado com sucesso!");
            con.desconectar();

        } catch (SQLException erro) {
            System.err.println("Erro ao cadastrar login!");
            System.err.println("CadastrarLoginSenha -> Método cadastrar " + erro);
        }finally{
            con.desconectar();
        }
    }
    
    private void cbxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUsuarioActionPerformed
        
    }//GEN-LAST:event_cbxUsuarioActionPerformed
    
    //Método para selecionar e apresentar na COMBOBOX
//    Conexao conn = new Conexao();
//        public void pesquisar(){{                                    
//            try {
//                Connection c=con.conectar();
//                PreparedStatement pesquisarStmt = c.prepareStatement("SELECT * FROM Usuario");  
//                ResultSet rs = pesquisarStmt.executeQuery();                          
//                //Exibindo dados da pesquisa na tabela
//                DefaultTableModel model;
//                model = (DefaultTableModel) cbxUsuario.getModel();
//                model.setNumRows(0);
//                while(rs.next()){
//                    model.addRow(
//                new Object[]{
//                    rs.getString("Nome")
//                });                                             
//                }    
//            }catch (SQLException e){
//               System.out.println("Ocorreu um erro ao conectar");
//            }   
//        }
//    }
    
    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void cbxUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxUsuarioMouseClicked
        Object item = cbxUsuario.getSelectedItem();  
    }//GEN-LAST:event_cbxUsuarioMouseClicked


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
            java.util.logging.Logger.getLogger(CadastrarLoginSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarLoginSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarLoginSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarLoginSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarLoginSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<Object> cbxUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
