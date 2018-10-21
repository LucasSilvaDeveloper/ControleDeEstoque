/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import connection.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe de consulta no banco de dados, tanto listar todo o banco <br>
 * quanto produto especifico.
 * @author Lucas de Oliveira da Silva
 * @version 1.0
 */
public class ProdutoConsultaDAO {

    ConexaoSQLite nova = new ConexaoSQLite();

    /**
     * Metodo default que sempre é executada ao ser instanciada,<br>
     * para que sempre haja conexao quando um dos metodos dessa classe for usado.
     */
    public ProdutoConsultaDAO() {
        try {
            nova.conectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao acessar o banco de dados!");
        }
    }
    
    /**
     * Metodo usado para listar todo o banco de dados, retorna cada instancia<br>
     * numa lista do objeto <b>Produto</b>
     * @return lista de obetos Produto
     */
    public List<Produto> BuscarProdutos(){
        ResultSet resultset = null;
        Statement statement = null;
             
        statement = nova.criarStatement();
        List<Produto> produtos = new ArrayList<Produto>();
            
        try {
           
            String query = "select * from Produto;";
            resultset = statement.executeQuery(query);
            
            while (resultset.next()) {
            
                Produto novo = new Produto();
            
                novo.setId(resultset.getInt("id"));
                novo.setNomeProduto(resultset.getString("nome_produto"));
                novo.setQuantidadeProduto(resultset.getInt("quantidade"));
                novo.setDataCompra(resultset.getString("data_Compra"));
                novo.setDescricao(resultset.getString("descricao"));
                produtos.add(novo);
           
            }
        } catch (SQLException e) {
            System.out.println("Erro! " + e);
        }finally{
            try {
            
                resultset.close();
                statement.close();
                nova.desconectar();        
            
            } catch (SQLException e) {
            System.out.println("Erro!: " + e);
            }
        }
        return produtos;
    }
    
    /**
     * Metodo usado para buscar produto espesificado pelo nome no banco de dados,<br>
     * @param desc nome do produto que é adquirido na view
     * @return lista de produto
     */
    public List<Produto> BuscarProdutosEspecifico(String desc){
        
        ResultSet resultset = null;
        PreparedStatement preparedStatement = null;
        
        String query = "select * from Produto where nome_produto like ?";
        List<Produto> produtos = new ArrayList<Produto>();
            
        try {    
            preparedStatement = nova.criarPreparedStatemant(query); 
            preparedStatement.setString(1,"%"+desc+"%");
            resultset = preparedStatement.executeQuery();  
            
            while (resultset.next()) {
            
                Produto novo = new Produto();
            
                novo.setId(resultset.getInt("id"));
                novo.setNomeProduto(resultset.getString("nome_produto"));
                novo.setQuantidadeProduto(resultset.getInt("quantidade"));
                novo.setDataCompra(resultset.getString("data_Compra"));
                novo.setDescricao(resultset.getString("descricao"));
                produtos.add(novo);
           
            }
        } catch (SQLException e) {
            System.out.println("Erro!: " + e);
        }finally{
            try {
                resultset.close();
                preparedStatement.close();
                nova.desconectar();
                
            } catch (SQLException e) {
            System.out.println("Erro!");
            }
        }
        return produtos;
    }
}
