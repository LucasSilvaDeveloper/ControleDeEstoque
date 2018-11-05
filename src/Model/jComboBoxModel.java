/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author lucas
 */
public class jComboBoxModel extends AbstractListModel implements ComboBoxModel{

    private List<Produto> produto;
    private Produto produtoSelecionado;
    
    public jComboBoxModel() {
        this.produto = new ArrayList<>();
    }
    
    
    
    @Override
    public int getSize() {
        return produto.size();
    }

    @Override
    public Object getElementAt(int i) {
        return this.produto.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        if(o instanceof Produto){
        this.produtoSelecionado = (Produto) o;
        fireContentsChanged(this.produto, 0, this.produto.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.produtoSelecionado;
    }
    
    public void addProduto(Produto produto){
        this.produto.add(produto);
    
    }
}
