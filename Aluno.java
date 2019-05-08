/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg9.pp.parte.pkg2;

import Enums.tipoAluno;
/**
 *
 * @author samum
 */
public class Aluno extends Pessoa{
    private String pMatricula;
    private tipoAluno tipo;
     private int disciplinas[];

    public Aluno(tipoAluno tipo,String cod, String nome, int nif, String morada, int telefone, String pMatricula, int disciplinas[]) {
        super(cod, nome, nif, morada, telefone);
        this.pMatricula = pMatricula;
        this.tipo = tipo;
        this.disciplinas = disciplinas;
    }

    public String getpMatricula() {
        return pMatricula;
    }

    public void setpMatricula(String pMatricula) {
        this.pMatricula = pMatricula;
    }

    public int[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(int[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    

    public tipoAluno getTipo() {
        return tipo;
    }

    public void setTipo(tipoAluno tipo) {
        this.tipo = tipo;
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
