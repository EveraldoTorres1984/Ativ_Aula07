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
public class Pesquisa {
    public void atividade03(){
        
        String d[] = {"0 - Português", "1 - Matemática", "2 - Física", "3 - História", " 4 - Geografia"};

         

        int[] vetor = {0,1,2,3,4}; 

        double nota[] = new double[5];
        String result = "";
        
        
        for (int i = 0; i < d.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + d[i]));
            result += d[i] + ": " + nota[i] + "\n";
           
        }
           
           
        JOptionPane.showMessageDialog(null, result);

        int indice = Integer.parseInt(JOptionPane.showInputDialog("Escolha o codigo  da Disciplina(de 0 a 4): "));
        JOptionPane.showMessageDialog(null,  d[indice] + " Nota: " + nota[indice]);

        

        
        
        
        
    }
    
}
