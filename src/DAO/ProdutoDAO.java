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
 * Classe onde é possivel inserir, atualizar e deletar produtos<br>
 * do banco de dados
 *
 * @author Lucas de Oliveira da Silva
 * @version 1.0
 */
public class ProdutoDAO {

    ConexaoSQLite conexaosqlite = new ConexaoSQLite();

    /**
     * Metodo default que sera executado sempre que instancias um objeto<br>
     * desta classe
     */
    public ProdutoDAO() {
        conexaosqlite.conectar();
    }

    public void atualizaRetiradaProduto(String nome, int quant, int id) {

        String sql = "update Retirada set quantidade = quantidade + ? where id_prod=?;";

        PreparedStatement preparedStatement = conexaosqlite.criarPreparedStatemant(sql);
        try {
            preparedStatement.setInt(1, quant);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println("erro ao salvar: " + e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            conexaosqlite.desconectar();

        }
    }
    
    
    
    public void retiradaProduto(String nome, int quant, int id) {

        String sql = "insert into Retirada("
                + "nome_produto,"
                + "quantidade,"
                + "id_prod"
                + ") values(?,?,?);";

        PreparedStatement preparedStatement = conexaosqlite.criarPreparedStatemant(sql);
        try {
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, quant);
            preparedStatement.setInt(3, id);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto Salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println("erro ao salvar: " + e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            conexaosqlite.desconectar();

        }
    }
    
    
    
    /**
     * Esse metodo é da classe <b>ProdutoDAO</b> que recebe como parametro<br>
     * <b>Objeto Produto</b><br>
     * Produto novo = new Produto();<br>
     *
     * @param p É o objeto com todos os parametros diponiveis para o metodo
     * salva-los<br>
     * no banco de dados.
     */
    public void gravaProduto(Produto p) {

        String sql = "insert into Produto("
                + "nome_produto,"
                + "quantidade,"
                + "data_compra,"
                + "descricao"
                + ") values(?,?,?,?);";

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
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            conexaosqlite.desconectar();

        }
    }

    /**
     * Metodo para excluir um produto no banco de dados
     *
     * @param p Recebe um objeto produto e acessa seu id como parametro para
     * exclusao
     */
    public void deletarProduto(Produto p) {

        String sql = "delete from Produto where id = ?";

        PreparedStatement preparedStatement = conexaosqlite.criarPreparedStatemant(sql);
        try {
            preparedStatement.setInt(1, p.getId());

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");

        } catch (SQLException e) {
            System.out.println("erro ao excluir: " + e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            conexaosqlite.desconectar();

        }
    }

    /**
     * Metodo para atualizar produto no banco de dados
     *
     * @param p recebe como parametro um objeto Produto,<br>
     * contendo os novos dados
     */
    public void atualizarProduto(Produto p) {

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
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            conexaosqlite.desconectar();

        }
    }
}
