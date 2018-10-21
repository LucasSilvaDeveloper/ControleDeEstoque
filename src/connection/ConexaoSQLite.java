/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe para criar a conexao com o banco de dados <b>SQLite</b>
 * @author Lucas de Oliveira da Silva
 * @version 1.0
 */
public class ConexaoSQLite {
    private Connection conexao;

    /**
     * Metodo Construtos default da classe <b>conexaoSQLite</b><br>
     * <b>Uso</b><br>
     * ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
     */
    public ConexaoSQLite() {
    }
    
    /**
     * Metodo para criar a conexao com o banco de dados <b>SQLite</b><br>
     * <b>Uso</b><br><br>
     * ConexaoSQLite conexaoSQLite = new ConexaoSQLite();<br>
     * conexaoSQLite.conectar();
     * 
     * @return caso consiga se conectar retorna <b>verdadeiro</b>, caso não retorna <b>falso</b><Br>
     * contem esse tipo de retorno para ser verificada para fecha após sua utilização<br><br>
     */
    
//    @exception Caso o metodo <b>conectar</b> tenha qualquer tipo de problema ele ira<br>
//     * dispara a exception <b>SQLException</b> e escrevendo na tela, e retornando o valor<b>False</b>
//     * 
    public boolean conectar(){
        try {
            String url = "jdbc:sqlite:c:/Banco/Banco.db";
            this.conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e);           
            return false; 
        }
        return true;
    }
    
    /**
     * Esse metodo serve para desconectar do banco de dados<br>
     * <b>Uso</b><br>
     * ConexaoSQLite conexaoSQLite = new ConexaoSQLite();<br>
     * conexaoSQLite.desconectar();
     * @return um valor booleano para ser verificado se foi desconectado ou nao<br>
     * caso nao seja ele dispara uma <b>exception</b> e printa na tela o erro
     */
    public boolean desconectar(){
        try {
            if(this.conexao.isClosed() == false)
            {
                this.conexao.close();
//                System.out.println("desconectou mano!");
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

        return true;    
    }
    
    /**
     * Esse metodo cria o <b>Statement</b> permitindo comando <b>SQL</b> ao <b>Banco de Dados</b>
     * sem receber parametros do usuario.<br>
     * <b>Uso</b>
     * ConexaoSQLite conexaoSQLite = new ConexaoSQLite();<br>
     * conexaSQLite.criarStatemet();
     * 
     * @return retorna o proprio Objeto Statement para ser utilizado
     */
    public Statement criarStatement(){
            try {
                return this.conexao.createStatement();
            } catch (SQLException e) {
                return null;
            }
        }
    
    /**
     * Esse metodo cria o <b>Statement Preparado</b>, é uma forma pre-processada do Statement que permite<br>
     * a passagem de parametros pelo comando <b>SQL</b> pelo usuario, sendo utilizado para consultar<br>
     * um produto especifico no banco de dados.
     * 
     * @param sql É o parametro que vem pelo campo de pesquisa da view
     * @return retorna o <b>criarPrepareStatement</b> com a String <b>SQL</b> fornecida pelo<br>
     * usuario na view principal
     */
    public PreparedStatement criarPreparedStatemant(String sql){
        try {
            return this.conexao.prepareStatement(sql);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    
}
