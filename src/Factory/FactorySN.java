/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Oriental.AbstractOriental;
import Reine.AbstractReine;
import TroisFormage.AbstractTroisFormage;
import Oriental.OrientalSN;
import Reine.ReineSN;
import TroisFormage.TroisFormageSN;

/**
 *
 * @author EL Hadji Code
 */
public class FactorySN extends AbstractFactory{

    @Override
    public AbstractOriental creatorOriental() {
        return (new OrientalSN());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public AbstractTroisFormage creatorTroisFormage() {
        
        return(new TroisFormageSN());
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
  public  AbstractReine creatorReine() {
        return(new ReineSN());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
