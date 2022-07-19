
package br.com.DAO;

import br.com.DTO.PessoaDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PessoaDAO {
    
    
    Connection con;
    PreparedStatement pstm; //Preparando a conexão
    
    
    public void CadastrarCliente(PessoaDTO objPessoaDTO) throws ClassNotFoundException{
        
        String sql = "INSERT INTO clientes (name, cpf, email, date, sexo, password) VALUES (?,?,?,?,?,?)"; //Inserindo na tabela do banco de dados
        con = new ConexaoDAO().conexaoBD(); 
        
        try {
            
           pstm = con.prepareStatement(sql);
           pstm.setString(1, objPessoaDTO.getName());
           pstm.setString(2, objPessoaDTO.getCpf());
           pstm.setString(3, objPessoaDTO.getEmail());
           pstm.setString(4, objPessoaDTO.getDate());
           pstm.setString(5, objPessoaDTO.getSexo());
           pstm.setString(6, objPessoaDTO.getPassword());
           
           
           pstm.execute();
           pstm.close();
            
            
        } catch (SQLException e) {
        }
    }
    
}
