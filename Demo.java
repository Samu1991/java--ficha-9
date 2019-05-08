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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno al1=new Aluno(tipoAluno.Trabalhador,"xico", "123ab", 123456789, "Rua S.Jorge, Boim", 255424423, "01/09/2018", 5);
        PersonManagement pm = new PersonManagement(5);
    }
    
}
