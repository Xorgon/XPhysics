package me.xorgon.xphysics.Mechanics;

import me.xorgon.xphysics.XPhysics;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Map;

/**
 * Acceleration class.
 */
public class Acceleration {

    private XPhysics xphys;

    Map<Player,Vector> lastVelocities = new HashMap<Player, Vector>();
    Map<Player,Vector> accelerations = new HashMap<Player, Vector>();

    public Acceleration(XPhysics xphys) {
        this.xphys = xphys;
    }

    public void updateAcceleration(Player player){
        Vector lastVelocity = lastVelocities.get(player);
        Vector velocity = xphys.getVelocity().getVelocity(player);
        Vector acceleration = new Vector(velocity.getX(),velocity.getY(),velocity.getZ()).subtract(lastVelocity);
    }

    public Vector getAcceleration(Player player){
        return accelerations.get(player);
    }

    public void setAcceleration(Player player, Vector acceleration){
        accelerations.remove(player);
        accelerations.put(player, acceleration);
    }

    public void setLastVelocity(Player player, Vector velocity){
        lastVelocities.remove(player);
        lastVelocities.put(player, velocity);
    }
}
