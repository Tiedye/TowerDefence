/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dtw.render;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Tiedye <tiedye1@hotmail.com>
 */
public class RenderEngine {
    
    private ArrayList<Renderable> objects;
    
    public RenderEngine() {
        objects = new ArrayList<>();
    }
    
    public void render(){
        // remove dead objects, render those not dead
        for (Iterator<Renderable> iterator = objects.iterator(); iterator.hasNext();) {
            Renderable next = iterator.next();
            if (next.isDead()) {
                iterator.remove();
            }else{
                next.render();
            }
        }
    }
    
    public void addRenderable(Renderable renderable) {
        objects.add(renderable);
    }
    
}
