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
 *
 * @author lucas
 */
public class formata{
    /**
     *Método usado para Validar masca de Telefone em <b>String</b><br>
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
     *Método usado para Validar masca de Data em <b>String</b><br>
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
