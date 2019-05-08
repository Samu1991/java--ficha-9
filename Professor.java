/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg9.pp.parte.pkg2;

import Enums.habLiterarias;
import Enums.areaCientifica;

/**
 *
 * @author samum
 */
public class Professor extends Pessoa {
    private habLiterarias hab;
    private areaCientifica area;
    private String datainicio;
    private String datafim;
    private int disciplinas[];
    
    public Professor(habLiterarias hab, areaCientifica area, String cod, 
            String nome, int nif, String morada, int telefone, 
            String datainicio, String datafim, int disciplina[]) {
        super(cod, nome, nif, morada, telefone);
        this.hab=hab;
        this.area=area;
        this.datainicio=datainicio;
        this.datafim=datafim;
        this.disciplinas= disciplinas;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public int[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(int[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    

    public habLiterarias getHab() {
        return hab;
    }

    public void setHab(habLiterarias hab) {
        this.hab = hab;
    }

    public areaCientifica getArea() {
        return area;
    }

    public void setArea(areaCientifica area) {
        this.area = area;
    }

    @Override
    public int nHoras() {
    int horas=0;
        
        for(int i=0; i<disciplinas.length;i++){
            horas += disciplinas[i];
        }
        
        return horas;
    }
    
    
}
