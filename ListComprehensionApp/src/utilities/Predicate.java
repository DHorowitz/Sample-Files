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
public interface Predicate<D> {
    boolean satisfies(D data);
}
