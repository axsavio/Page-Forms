
package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoDAO {
   
    
    public Connection conexaoBD() throws ClassNotFoundException{ //Usa o connection para fazer a conexão com o BD
         Connection con = null;
        try {
           Class.forName("com.mysql.jdbc.Driver"); //Classe de Conexão 
           String url =  "jdbc:mysql://localhost:3308/registros?user=root&password=" ; //Driver de Conexão      
           con = DriverManager.getConnection(url);
            
        } catch (SQLException e) { //Retorna se der erro na conexão
            
             System.out.println(e);
        }
        return con;
    }
}
