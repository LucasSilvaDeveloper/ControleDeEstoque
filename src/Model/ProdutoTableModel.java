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
 *
 * @author lucas
 */
public class ProdutoTableModel extends AbstractTableModel{

    private List<Produto> dados = new ArrayList<Produto>();
    private String[] colunas = {"ID", "NOME", "QTD", "DATA COMPRA", "DESCRIÇÃO"};

    //nao permite a edição dos valores da tabela
    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }
    
    @Override
    public String getColumnName(int colunas) {
        return this.colunas[colunas];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length; 
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
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
    
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
	switch(columnIndex)
	{
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
    
    @Override
    public void setValueAt(Object o, int i, int i1) {
        
    }
    
    public void listarProdutos(){
        dados.clear();
        ProdutoConsultaDAO novo = new ProdutoConsultaDAO();
        for(Produto p: novo.BuscarProdutos()){
           this.dados.add(p);
        }
        this.fireTableDataChanged();
    }
    
    public void retornoPesquisaProduto(String novo){
     dados.clear();
        ProdutoConsultaDAO novaPesquisa = new ProdutoConsultaDAO();
        for(Produto t: novaPesquisa.BuscarProdutosEspecifico(novo)){
            this.dados.add(t);
        }
        this.fireTableDataChanged();
    }
    
}
