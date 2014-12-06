package me.xorgon.xphysics.Mechanics;

import me.xorgon.xphysics.XPhysics;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Map;

/**
 * Velocity class.
 */
public class Velocity {

    private XPhysics xphys;

    Map<Player,Vector> lastPosition = new HashMap<Player, Vector>();
    Map<Player,Vector> velocities = new HashMap<Player, Vector>();

    public Velocity(XPhysics xphys) {
        this.xphys = xphys;
    }

    public void updateVelocity(Player player){
        Vector vector = player.getLocation().toVector();
        Vector velocity = new Vector(vector.getX(),vector.getY(),vector.getZ());
        velocity.subtract(lastPosition.get(player));
        velocities.put(player, velocity);
        setLastPosition(player, vector);
    }

    public Vector getVelocity(Player player){
        return velocities.get(player);
    }

    public void setLastPosition(Player player, Vector location){
        lastPosition.remove(player);
        lastPosition.put(player, location);
    }

    public Vector getLastPosition(Player player){
        return lastPosition.get(player);
    }

}
