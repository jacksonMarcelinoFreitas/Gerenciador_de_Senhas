
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public String porta="3306";
    public String nomServidor="localhost";
    public String db="gerenciar_senhas";
    public String user="root";
    public String pass="jackson1500";
    Connection conn = null;  
    
    //Método Coneectar
    public Connection conectar(){
        try {
            String ruta="jdbc:mysql://";
            String servidor=nomServidor+":"+porta+"/";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(ruta+servidor+db,user,pass);
            if(conn != null){
                System.out.println("Conexão com o Banco de Dados realizada com sucesso!!!");
            }else if(conn == null){
                throw new SQLException();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Seu usuário está errado! Error: "+e.getMessage());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Seu usuário está errado! Error: "+e.getMessage());
        }finally{
            return conn;
        }
    }
        public void desconectar(){
        conn = null;
        System.out.println("Desconectado do banco de dados!");
    }
}