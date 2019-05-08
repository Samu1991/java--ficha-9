/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg9.pp.parte.pkg2;

import Enums.areaAssociada;
import Enums.habLiterarias;
/**
 *
 * @author samum
 */
public class Administrativo extends Pessoa {
    private areaAssociada area;
    private habLiterarias hab;
    private String dataInicio;
    private float percContrato;
    private String datafim;
    
    public Administrativo(areaAssociada area, habLiterarias hab, String dataInicio, float percContrato, String datafim, String cod, String nome, int nif, String morada, int telefone) {
        super(cod, nome, nif, morada, telefone);
        this.area=area;
        this.hab=hab;
        this.dataInicio= dataInicio;
        this.percContrato= percContrato;
        this.datafim= datafim;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public float getPercContrato() {
        return percContrato;
    }

    public void setPercContrato(float percContrato) {
        this.percContrato = percContrato;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }
    

    public habLiterarias getHab() {
        return hab;
    }

    public void setHab(habLiterarias hab) {
        this.hab = hab;
    }
    

    public areaAssociada getArea() {
        return area;
    }

    public void setArea(areaAssociada area) {
        this.area = area;
    }
    
    @Override
    public int nHoras(){
        return (int) (percContrato*40/100);
    }
    
}
