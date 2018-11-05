/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Classe para objetos do tipo <b>Produto</b>,onde<br>
 * seram contidos valores e metodos para o mesmo.
 *
 * @author Lucas de Oliveira da Silva
 * @version 1.0
 */
public class Produto {

    private int id;
    private String nomeProduto;
    private int quantidadeProduto;
    private Float valordecompra;
    private Float valordevenda;

    public Float getValordecompra() {
        return valordecompra;
    }

    public void setValordecompra(Float valordecompra) {
        this.valordecompra = valordecompra;
    }

    public Float getValordevenda() {
        return valordevenda;
    }

    public void setValordevenda(Float valordevenda) {
        this.valordevenda = valordevenda;
    }
    private String dataCompra;
    private String descricao;
    
    /**
     * Metodo Construtor default da classe <b>Produto</b><br>
     * <b>Uso</b><br>
     * Produto produto = new Produto();
     */
    public Produto() {
    }

    /**
     * Metodo construtor com todos os parametros da classe <b>Produto</b><br>
     * <b>Uso</b><br><br>
     * Produto produto = new Produto(1, "candida", 200, 14/12/2018, "algo
     * relevenate ao produto que nao seja o nome" );
     *
     * @param id codigo de registro que identifica o produto
     * @param nomeProduto nome do produto
     * @param quantidadeProduto valor inteiro da quantidade em litros do Produto
     * @param dataCompra data de aquisição do Produto
     * @param descricao alguma informação relevente do Produto da qual nao seja
     * o proprio nome
     */
    public Produto(String nomeProduto, int quantidadeProduto, float valordecompra, float valordevenda, String dataCompra, String descricao) {
        setNomeProduto(nomeProduto);
        setQuantidadeProduto(quantidadeProduto);
        setValordecompra(valordecompra);
        setValordevenda(valordevenda);
        setDataCompra(dataCompra);
        setDescricao(descricao);
    }

    public Produto(int id, String nomeProduto, int quantidadeProduto, String dataCompra, String descricao) {
        setId(id);
        setNomeProduto(nomeProduto);
        setQuantidadeProduto(quantidadeProduto);
        setDataCompra(dataCompra);
        setDescricao(descricao);
    }
    
    
    
    /**
     *
     * @return int codigo do produto
     */
    public int getId() {
        return id;
    }

    /**
     * passando o codigo do produto para o objeto <b>Produto</b><br>
     * <b>Uso</b><br>
     * Produto produto = new Produto();<br>
     * produto.setID(1);
     *
     * @param id codigo do produto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return String com o nome do produto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * passando o nome do produto para o objeto <b>Produto</b><br>
     * <b>Uso</b><br>
     * Produto produto = new Produto();<br>
     * produto.setNomeProduto("cloro");
     *
     * @param nomeProduto nome do produto
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     *
     * @return int da quantidade em litros do produto
     */
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     * passando a quantidade em litros do produto para o objeto
     * <b>Produto</b><br>
     * <b>Uso</b><br>
     * Produto produto = new Produto();<br>
     * produto.setQuantidadeProduto(100);
     *
     * @param quantidadeProduto valor em litros daquele produto
     */
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    /**
     *
     * @return retorna uma String com a data da compra do produto
     */
    public String getDataCompra() {
        return dataCompra;
    }

    /**
     * passando a Data da compra do produto para o objeto <b>Produto</b><br>
     * <b>Uso</b><br>
     * Produto produto = new Produto();<br>
     * produto.setDataCompra("12/05/2018");
     *
     * @param dataCompra o valor da data é passado no formato de String
     */
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     *
     * @return String da descrição do produto caso haja.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * passando a descrição do produto para o objeto <b>Produto</b><br>
     * <b>Uso</b><br>
     * Produto produto = new Produto();<br>
     * produto.setDescricao("na compra deste objeto algumas peçãs vieram com
     * avarias nas cores");
     *
     * @param descricao alguma informação do produto que nao seja o nome do
     * mesmo
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Essa sobrecarga do metodo toString onde apresenta todos os parametros do
     * objeto <b>Produto</b><br>
     * formatados na saida do proprio java, utilizado para testes
     *
     * @return formatação do objeto em String no console do java
     */
    @Override
    public String toString() {
        return String.format(
                "Id: %d\n"
                + "Nome: %s\n"
                + "Quantidade: %d\n"
                + "Data da compra: %s\n"
                + "Descrição: %s",
                getId(),
                getNomeProduto(),
                getQuantidadeProduto(),
                getDataCompra(),
                getDescricao());
    }

}
