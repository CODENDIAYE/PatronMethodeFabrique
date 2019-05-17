/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Oriental.AbstractOriental;
import Oriental.OrientalFR;
import Reine.AbstractReine;
import Reine.ReineFR;
import TroisFormage.AbstractTroisFormage;
import TroisFormage.TroisFormageFR;

/**
 *
 * @author EL Hadji Code
 */
public class FactoryFR extends AbstractFactory {

  
    @Override
    public AbstractOriental creatorOriental() {
        return (new OrientalFR());
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public AbstractTroisFormage creatorTroisFormage() {
        
        return (new TroisFormageFR());
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public AbstractReine creatorReine() {
        return (new ReineFR());
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
