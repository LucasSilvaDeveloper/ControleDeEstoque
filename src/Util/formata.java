/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import javax.swing.text.PlainDocument;

/**
 * Classe para Validar <b>Mascaras</b>,onde<br>
 * seram contidos valores e metodos para o mesmo.
 * @author Lucas de Oliveira da Silva
 * @version 1.0 
 */
public class formata{
    /**
     *Método usado para Validar mascara de Telefone <br>
     * 
     */
    public static DefaultFormatterFactory telefone(){
        MaskFormatter maskTelefone = null;
        try {
            maskTelefone = new MaskFormatter("(##)#####--####");
            maskTelefone.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"erro ao criar a mascara!: "+ ex);
        }
        return (new DefaultFormatterFactory(maskTelefone, maskTelefone));
    }
    /**
     *Método usado para Validar mascara de Data <br>
     * 
     */
    public static DefaultFormatterFactory data(){
    
        MaskFormatter maskData = null;
        
        try {
            maskData = new MaskFormatter("##/##/####");
            maskData.setPlaceholderCharacter('_');
        } catch (Exception e) {
            System.out.println("erro na mascara!");
        }
        return (new DefaultFormatterFactory(maskData, maskData));
    }
    
}
