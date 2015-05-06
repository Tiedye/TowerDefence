/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dtw.render;

/**
 *
 * @author Tiedye <tiedye1@hotmail.com>
 */
public interface Renderable {
    
    public void constructRenderable();
    public void destructRenderable();
    
    public void render();
    
    public boolean isDead();
    
}
