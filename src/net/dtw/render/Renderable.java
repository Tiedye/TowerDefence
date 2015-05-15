/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dtw.render;

import net.dtw.engine.EngineObject;

/**
 *
 * @author Tiedye <tiedye1@hotmail.com>
 */
public interface Renderable extends EngineObject {
    
    // Create vao
    public void constructRenderable();
    // Destroy vao
    public void destructRenderable();
    
    // mount vao, render, unmount
    public void render();
    
}
