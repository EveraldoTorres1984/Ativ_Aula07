/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ativ_aula07;

import javax.swing.JOptionPane;

/**
 *
 * @author torre
 */
public class Disciplinas {
    
    public void atividade01(){
        
        String d[] = {"Português", "Matemática", "Física", "História", "Geografia"};
        double nota[] = new double[5];
        String result = "";
        double soma = 0;
        
        for (int i = 0; i < d.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + d[i]));
            result += d[i] + ": " + nota[i] + "\n";
           soma += nota[i];
        }
            
        double media = soma/5;
        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, "A média geral é: " + media);
        
    }
        
}
        
        
    
