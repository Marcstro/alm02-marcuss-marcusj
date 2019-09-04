/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcu
 */
public class testRandomGenerator {
    
    RandomGenerator rg = new RandomGenerator();
    
    @Test
    public void testgetOneRandomNumber(){
        for(int x=0; x<100; x++){
            assertTrue(rg.whatFactorToConsider() < 4 && rg.whatFactorToConsider() > -1);
        }
    }
    
}
