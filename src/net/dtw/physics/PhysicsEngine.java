/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dtw.physics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import net.dtw.engine.Engine;

/**
 *
 * @author Tiedye <tiedye1@hotmail.com>
 */
public class PhysicsEngine implements Engine {
    
    private final ArrayList<Physical> objects;

    private boolean started;
    private long time;
    
    public PhysicsEngine() {
        objects = new ArrayList<>();
        started = false;
    }
    
    public void addPhysical(Physical physical){
        objects.add(physical);
    }

    @Override
    public void update() {
        if (!started) return;
        long now = System.nanoTime();
        double dt = (now-time)/1e9;
        time = now;
        advance(dt);
    }
    
    public void start(){
        started = true;
        time = System.nanoTime();
    }
    
    public void stop(){
        started = false;
    }
    
    private void advance(double t){
        // sort object by distance from the top
        Collections.sort(objects, (Physical o1, Physical o2) -> Double.compare(o1.getBounds().getTop(), o2.getBounds().getTop()));
        
        // when iterating through objects, start at the top and check all objects after that could reach
    }
    
}
