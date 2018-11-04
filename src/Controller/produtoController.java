/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;

/**
 * Classe para controle de requisições vindas da <b>view</b><br>
 *
 * @author Lucas de Oliveira da Silva<br>
 * @version 1.0
 */
public class produtoController {

    ProdutoDAO novoProduto = new ProdutoDAO();

    /**
     * Metodo Construtor default da Classe <b>ProdutoDAO</b><br>
     * <b>Uso</b><br>
     * ProdutoController produtoController = new ProdutoController();
     */
    public produtoController() {
    }

    /**
     * Esse metodo Constitui de todos os parametros do <b>Produto</b>,<br>
     * serve como intermediador entre a view e o <b>Model</b>,<br>
     * recebendo todos os parametros da view e os direcionando a uma
     * instancia<br>
     * do <b>Objeto Produto</b>.
     *
     * @param id codigo do produto
     * @param nomeProduto nome do produto
     * @param quantidadeProduto quantidade em litros do produto
     * @param valorPorLitro preço do produto por litro
     * @param dataCompra data da compra
     * @param descricao descrição do produto caso haja necessidade
     */
    public void novoProduto(int id, String nomeProduto, int quantidadeProduto,float valorPorLitro,String dataCompra, String descricao) {
        Produto novo = new Produto(id, nomeProduto, quantidadeProduto, valorPorLitro, dataCompra, descricao);
        novoProduto.gravaProduto(novo);
    }

    /**
     * Esse metodo Constitui de todos os parametros do <b>Produto</b>,<br>
     * serve como intermediador entre a view e o <b>Model</b>,<br>
     * recebendo todos os parametros da view e os direcionando a uma
     * instancia<br>
     * do <b>Objeto Produto</b>.
     *
     * @param id novo id
     * @param nomeProduto novo nome
     * @param quantidadeProduto nova quantidade do produto
     * @param valorPorLitro novo preço do produto por litro
     * @param dataCompra nova data da compra
     * @param descricao nova descrição
     */
    public void atualizarProduto(int id, String nomeProduto, int quantidadeProduto, float valorPorLitro, String dataCompra, String descricao) {
        Produto novo = new Produto(id, nomeProduto, quantidadeProduto, valorPorLitro, dataCompra, descricao);
        novoProduto.atualizarProduto(novo);
    }

    /**
     * Esse metodo recebe como id a linha selecionada na table da view
     * principal,<br>
     * serve para excluir o produto selecionado da view<br>
     *
     * @param id id representado pela seleção da tabela da view
     */
    public void deletar(int id) {
        Produto novo = new Produto();
        novo.setId(id);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.deletarProduto(novo);
    }

}
