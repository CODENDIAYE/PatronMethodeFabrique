/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Oriental.AbstractOriental;
import Oriental.OrientalUS;
import Reine.AbstractReine;
import Reine.ReineUS;
import TroisFormage.AbstractTroisFormage;
import TroisFormage.TroisFormageUS;

/**
 *
 * @author EL Hadji Code
 */
public class FactoryUS extends AbstractFactory{

    @Override
    public AbstractOriental creatorOriental() {
        return(new OrientalUS());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
 public  AbstractTroisFormage creatorTroisFormage() {
        return(new TroisFormageUS());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
  public  AbstractReine creatorReine() {
        return(new ReineUS());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
