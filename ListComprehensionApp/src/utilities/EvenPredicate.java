/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author dyhorowitz
 */
public class EvenPredicate implements Predicate<Integer> {
    public boolean satisfies(Integer data)
    {
        return (data % 2 == 0);
    }
    
    
}
