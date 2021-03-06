/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Classe para Validar <b>Nomes</b>,onde<br>
 * seram contidos valores e metodos para o mesmo.
 *
 * @author Lucas de Oliveira da Silva
 * @version 1.0
 */
public class ValidaNome extends PlainDocument {

    /**
     * Método usado para Validar o nome em <b>String</b><br>
     * <b>Uso</b><br><br>
     * Objeto.setDocument(new ValidaNome());
     *
     * @param i Posicionamento onde String tera valores adicionados
     * @param string String em questão, onde será feito a validação
     * @param as o atributo a ser associado com a string
     */
    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        super.insertString(i, string.replaceAll("[^a-z|^A-Z |^ ]", ""), as);
    }
}
