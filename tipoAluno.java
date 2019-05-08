/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author samum
 */
public enum tipoAluno {
    Normal, Trabalhador;
    
   public static String tipoAluno(tipoAluno tipo){
            switch(tipo){
                case Normal:
                    return "Aluno em regime de Tempo Integral";
                    
                case Trabalhador:
                    return "Aluno em regime de Trabalhador-Estudante";
                    
                default:
                    return "";
            }
    }
    
}
