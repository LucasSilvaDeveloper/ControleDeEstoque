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
 *
 * @author lucas
 */
public class ConexaoSQLite {
    private Connection conexao;
    
    public boolean conectar(){
        
        try {
            String url = "jdbc:sqlite:BD\\Banco.db";
            this.conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e);
            
            return false; 
        }
        return true;
    }
    
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
    
    public Statement criarStatement(){
            try {
                return this.conexao.createStatement();
            } catch (SQLException e) {
                return null;
            }
        }
    
    public PreparedStatement criarPreparedStatemant(String sql){
        try {
            return this.conexao.prepareStatement(sql);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    
}
