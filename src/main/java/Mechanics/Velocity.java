package Mechanics;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Map;

/**
 * Velocity class.
 */
public class Velocity {

    Map<Player,Vector> lastPosition = new HashMap<Player, Vector>();
    Map<Player,Vector> currentPosition = new HashMap<Player, Vector>();

    public void updateLocation(Player player, Vector location){
        lastPosition.remove(player);
        lastPosition.put(player, currentPosition.get(player));
        currentPosition.remove(player);
        currentPosition.put(player, location);
    }

    public Vector getVelocity(Player player){
        Vector vector = currentPosition.get(player);
        Vector velocity = new Vector(vector.getX(),vector.getY(),vector.getZ());
        velocity.subtract(lastPosition.get(player));
        return velocity;
    }

    public void setCurrentPosition(Player player, Vector location){
        currentPosition.remove(player);
        currentPosition.put(player, location);
    }

    public Vector getCurrentPosition(Player player){
        return currentPosition.get(player);
    }

    public void setLastPosition(Player player, Vector location){
        lastPosition.remove(player);
        lastPosition.put(player, location);
    }

    public Vector getLastPosition(Player player){
        return lastPosition.get(player);
    }

}
