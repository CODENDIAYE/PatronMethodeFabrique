/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import Oriental.*;
import TroisFormage.*;
import Reine.*;
/**
 *
 * @author EL Hadji Code
 */
public abstract class  AbstractFactory {
    
    public static AbstractFactory createFactory(String type){
        AbstractFactory factory;
        if(type.equalsIgnoreCase("fr")){
            factory = new FactoryFR();
        }
        else if(type.equalsIgnoreCase("sn")){
             factory = new FactorySN();
        }
        else{
             factory = new FactoryUS();
        }
        
        return factory;
        
}
    //abstract AbstractFactory getFactory();
    public abstract AbstractOriental creatorOriental();
   public abstract AbstractTroisFormage creatorTroisFormage();
   public abstract AbstractReine creatorReine();
    
    
}
