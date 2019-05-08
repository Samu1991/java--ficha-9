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
public enum areaAssociada {
    Recursos_Humanos, Secretaria;
    
    public String areaAssociada(areaAssociada area){
        
        switch(area){
            case Recursos_Humanos:
                return "Recursos Humanos";
            case Secretaria:
                return "Secretaria";
            default:
                return "";
        }
    }
}
