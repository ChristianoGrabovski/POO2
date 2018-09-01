/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;
import model.Programador;
import sun.security.krb5.SCDynamicStoreConfig;

/**
 *
 * @author crfranco
 */
public class MemoryDataBank implements IDao<Programador>{
    
    private List<Programador> memoryDataBank = new ArrayList<>(); 

    @Override
    public void save(Programador t) {
        memoryDataBank.add(t);
        
    }
    
    

    @Override
    public Programador getOne(int id) {
       Programador a = null;
       if(memoryDataBank.contains(id)){
           a = memoryDataBank.get(id);
           return a;
       }
       else{
          System.out.print("esse programador n existe na lista");
       }
        return a;
        
    }

    @Override
    public List<Programador> list() {
        return null ;
    
    }

    @Override
    public void update(Programador t) {
        if(memoryDataBank.contains(t)){
            memoryDataBank.remove(t);
            memoryDataBank.add(t);
        }
        
        
    }

    @Override
    public void delete(int id) {
        if(memoryDataBank.contains(id)){
        memoryDataBank.remove(id);
        System.out.print("programador" + id + "removido");
        }
        else{
            System.out.print("Esse programador nao esta na lista");
        }
        
    
    }
    
}
