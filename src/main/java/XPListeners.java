import Mechanics.Velocity;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Listeners for XPhysics.
 */
public class XPListeners implements Listener {
    private XPhysics plugin;
    private Velocity velocity;

    public XPListeners(XPhysics plugin, Velocity velocity){
        this.plugin = plugin;
        this.velocity = velocity;
    }

    @EventHandler
    public void onPlayerMove (PlayerMoveEvent event){
        Player player = event.getPlayer();
        Location location = player.getLocation();
        velocity.updateLocation(player, location.toVector());
    }
    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event){
        Player player = event.getPlayer();
        velocity.setCurrentPosition(player, player.getLocation().toVector());
    }
}
