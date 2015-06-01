/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dtw.physics;

import net.dtw.engine.EngineObject;
import net.dtw.math.AABBd;
import net.dtw.math.Vec2d;

/**
 *
 * @author Tiedye <tiedye1@hotmail.com>
 */
public interface Physical extends EngineObject {
    
    // all physical objects have these proporties
    public Vec2d getPos();
    public Vec2d getVel();
    //public double getRot();
    //public double getRVel();
    public AABBd getBounds();
    
    // up to 64 interaction layers, and two masks together to see if two objects interact
    public long getInteractionMask();
    
}
