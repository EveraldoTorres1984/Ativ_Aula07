/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ativ_aula07;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author torre
 */
public class Pesquisa {
    public void atividade03(){
        
        String d[] = {"1 - Português", "2 - Matemática", "3 - Física", "4 - História", " 5 - Geografia"};
        int[] vetor = {1,2,3,4,5}; 
        double nota[] = new double[5];
        String result = "";
        
        
        for (int i = 0; i < d.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + d[i]));
            result += d[i] + ": " + nota[i] + "\n";
           
        }
            
        JOptionPane.showMessageDialog(null, result);
        Integer.parseInt(JOptionPane.showInputDialog("Escolha o codigo  da Disciplina: " + Arrays.toString(d) ));
        JOptionPane.showMessageDialog(null, nota);
        
        
        
    }
    
}
