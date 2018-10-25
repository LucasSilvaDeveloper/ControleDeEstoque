/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.ProdutoConsultaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o model da table da view
 *
 * @author Lucas de Oliveira da Silva
 * @version 1.0
 */
public class ProdutoTableModel extends AbstractTableModel {

    private List<Produto> dados = new ArrayList<Produto>();
    private String[] colunas = {"ID", "NOME", "QTD", "DATA COMPRA", "DESCRIÇÃO"};

    //nao permite a edição dos valores da tabela
    /**
     * Metodo para impedir que qualquer valor nas linhas<br>
     * da tabela sejam editada na propria tabela
     *
     * @param i nao utilizado
     * @param i1 nao utilizado
     * @return esse retorno impede a edição dos conteiners da tabela
     */
    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    /**
     * metodos para adicionar o nome das colunas da tabela
     *
     * @param colunas nomes das colunas
     * @return usado pela table para pegar os nomes e setar na tabela
     */
    @Override
    public String getColumnName(int colunas) {
        return this.colunas[colunas];
    }

    /**
     * Metodo para montar a quantidade de linhas que a tabela precisa
     *
     * @return retorna o tamanho da tabela
     */
    @Override
    public int getRowCount() {
        return dados.size();
    }

    /**
     * Metodo para retornar quantidade de colunas
     *
     * @return quantidade de colunas
     */
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    /**
     * Metodo utilizado que retorna o valor de uma linha da tabela
     *
     * @param linha Linha da tabela
     * @param coluna Coluna da tabela
     * @return retorna o objeto da linha selecionada
     */
    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getNomeProduto();
            case 2:
                return dados.get(linha).getQuantidadeProduto();
            case 3:
                return dados.get(linha).getDataCompra();
            case 4:
                return dados.get(linha).getDescricao();
        }
        return null;
    }

    /**
     * Metodo que torna possivel o filtro para a tabela poder<br>
     * mostrar os valores por ordem alfabetica, quantidade ou id
     *
     * @param columnIndex recebe qual a coluna selecionada
     * @return retorna o filtro desejado
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            default:
                return String.class;
        }
    }

    /**
     * Metodo não utilizado!
     *
     * @param o
     * @param i
     * @param i1
     */
    @Override
    public void setValueAt(Object o, int i, int i1) {

    }

    /**
     * Metodo que quando iniciado lista todos os produtos da tabela
     */
    public void listarProdutos() {
        dados.clear();
        ProdutoConsultaDAO novo = new ProdutoConsultaDAO();
        for (Produto p : novo.BuscarProdutos()) {
            this.dados.add(p);
        }
        this.fireTableDataChanged();
    }

    /**
     * Metodo para a pesquisa no banco de dados por parametro
     *
     * @param novo string passada como parametro
     */
    public void retornoPesquisaProduto(String novo) {
        dados.clear();
        ProdutoConsultaDAO novaPesquisa = new ProdutoConsultaDAO();
        for (Produto t : novaPesquisa.BuscarProdutosEspecifico(novo)) {
            this.dados.add(t);
        }
        this.fireTableDataChanged();
    }

}
