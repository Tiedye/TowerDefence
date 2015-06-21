/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dtw.towerdefence;

import net.dtw.math.AABBd;
import net.dtw.math.Vec2d;
import net.dtw.render.Renderable;

/**
 *
 * @author Tiedye <tiedye1@hotmail.com>
 */
public abstract class InterfaceObject implements Renderable {
    
    protected AABBd bounds;
    protected boolean dragging;
    protected int zOrder;
    protected boolean dead;
    
    public InterfaceObject (){
        bounds = AABBd.newAABB(0, 0, 0, 0);
        dragging = false;
        zOrder = 0;
        dead = false;
    }
    
    public int getZOrdering(){
        return zOrder;
    }
    
    public AABBd getBoundingBox(){
        return bounds;
    }
    
    public boolean onMouseDown(Vec2d pos, int button){
        return false;
    }
    public boolean onMouseUp(Vec2d pos, int button){
        return false;
    }
    public boolean onMouseMove(Vec2d finalPos, Vec2d delta){
        return false;
    }
    
    public boolean isDragging(){
        return dragging;
    }
    public boolean drag(Vec2d finalPos, Vec2d delta){
        return false;
    }
    
    public boolean onKeyDown(int key){
        return false;
    }
    public boolean onKeyUp(int key){
        return false;
    }
    
    public void setDead(){
        dead = true;
    }
    
    protected int vaoID;

    @Override
    public void constructRenderable() {
        
    }

    @Override
    public void destructRenderable() {
        
    }

    @Override
    public void render() {
        
    }

    @Override
    public boolean isDead() {
        return dead;
    }
    
}
