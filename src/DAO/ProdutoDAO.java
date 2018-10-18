/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.Produto;
import connection.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ProdutoDAO {
    ConexaoSQLite conexaosqlite = new ConexaoSQLite();

    public ProdutoDAO() { 
        conexaosqlite.conectar();
    }
    
    
    public void gravaProduto(Produto p){
                
        String sql = "insert into Produto("
              + "nome_produto,"
              + "quantidade,"
              + "data_compra,"
              + "descricao"
              +") values(?,?,?,?);";
         
        PreparedStatement preparedStatement = conexaosqlite.criarPreparedStatemant(sql);   
        try {
            preparedStatement.setString(1, p.getNomeProduto());
            preparedStatement.setInt(2, p.getQuantidadeProduto());
            preparedStatement.setString(3, p.getDataCompra());
            preparedStatement.setString(4, p.getDescricao());
            
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto Salvo com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("erro ao salvar: " + e);
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            conexaosqlite.desconectar();
            
        }
    }
    public void deletarProduto(Produto p){
                
        String sql = "delete from Produto where id = ?";
         
        PreparedStatement preparedStatement = conexaosqlite.criarPreparedStatemant(sql);   
        try {
            preparedStatement.setInt(1, p.getId());
            
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("erro ao excluir: " + e);
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            conexaosqlite.desconectar();
            
        }
    }
    
     public void atualizarProduto(Produto p){
                
        String sql = "update Produto "
              + "set nome_produto = ?,"
              + "quantidade = ?,"
              + "data_compra = ?,"
              + "descricao = ?"
              + "where id = ?;";
               
         
        PreparedStatement preparedStatement = conexaosqlite.criarPreparedStatemant(sql);   
        try {
            preparedStatement.setString(1, p.getNomeProduto());
            preparedStatement.setInt(2, p.getQuantidadeProduto());
            preparedStatement.setString(3, p.getDataCompra());
            preparedStatement.setString(4, p.getDescricao());
            preparedStatement.setInt(5, p.getId());
            
            int resultado = preparedStatement.executeUpdate();
//            String a = resultado == 1?"deu certo":"nao deu";
//            System.out.println(a);
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("erro ao salvar: " + e);
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            conexaosqlite.desconectar();
            
        }
    }
    

    @Override
    public void finalize() throws Throwable{
        try {
            conexaosqlite.desconectar();
        } finally {
            super.finalize();
        }
    }
}
