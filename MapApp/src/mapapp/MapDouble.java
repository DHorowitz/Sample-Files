/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapapp;

/**
 *
 * @author dyhorowitz
 */
public class MapDouble extends Map {
    public MapDouble(int[] d)
    {
        super(d);
    }
    
    protected int function(int v){
        return v * 2;
    }
    
    
}
