/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoConsultaDAO;
import DAO.ProdutoDAO;
import Model.Produto;
import Model.ProdutoTableModel;
import java.util.List;


/**
 *
 * @author lucas
 */
public class produtoController {
    ProdutoDAO novoProduto = new ProdutoDAO();
    
    public void novoProduto(int id, String nomeProduto, int quantidadeProduto, String dataCompra, String descricao){
        Produto novo = new Produto(id, nomeProduto, quantidadeProduto, dataCompra, descricao);
        novoProduto.gravaProduto(novo);
    }
    
    public void atualizarProduto(int id, String nomeProduto, int quantidadeProduto, String dataCompra, String descricao){
        Produto novo = new Produto(id, nomeProduto, quantidadeProduto, dataCompra, descricao);
        novoProduto.atualizarProduto(novo);
    }
    

    public void deletar(int id){
        Produto novo = new Produto();
        novo.setId(id);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.deletarProduto(novo);
    }
    
}
