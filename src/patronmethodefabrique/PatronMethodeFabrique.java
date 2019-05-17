/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronmethodefabrique;

import Factory.AbstractFactory;
import Oriental.AbstractOriental;
import Factory.*;
import Reine.AbstractReine;
import TroisFormage.AbstractTroisFormage;

/**
 *
 * @author EL Hadji Code
 */
public class PatronMethodeFabrique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String pays = "us";
          
             AbstractFactory factory;
            factory = AbstractFactory.createFactory(pays);
            
          AbstractReine reine = factory.creatorReine(); 
           reine.service();
            
             AbstractOriental oriental = factory.creatorOriental(); 
           oriental.service();
               AbstractTroisFormage troisfromage = factory.creatorTroisFormage(); 
            troisfromage.service();
    }
    
}
