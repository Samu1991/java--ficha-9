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
public class PersonManagement extends containerofobjectapi.ContainerOfObjects{

    public PersonManagement(Object[] object) {
        super(object);
    }

    public PersonManagement(int maxSize) {
        super(maxSize);
    }

    public PersonManagement() {
    }
    public boolean adicionar(Pessoa pessoa){
        return addObject(pessoa);
    }
    public Object remover(int posicao){
        return removeObject(posicao);
    }
    
}
