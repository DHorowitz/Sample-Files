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
public class MapSquare extends Map {
    
    public MapSquare(int[] d)
    {
        super(d);
    }
    
    protected int function(int v)
    {
        return v * v;
    }
    
}
