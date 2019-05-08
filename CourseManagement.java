/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha.pkg9.pp.parte.pkg2;

/**
 *
 * @author samum
 */
public class CourseManagement extends containerofobjectapi.ContainerOfObjects{

    public CourseManagement(Object[] object) {
        super(object);
    }

    public CourseManagement(int maxSize) {
        super(maxSize);
    }

    public CourseManagement() {
    }
    public boolean adicionarProfessor(Professor professor){
        return addObject(professor);
    }
    
    public boolean adicionarAluno(Aluno aluno){
        return addObject(aluno);
    }
    
     public Object remover(int posicao){
        return removeObject(posicao);
    }
    
}
