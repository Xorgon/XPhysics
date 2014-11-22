import Mechanics.Acceleration;
import Mechanics.Velocity;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class.
 */
public class XPhysics {

    private XPhysics instance = this;
    private Velocity velocity;
    private Acceleration acceleration;
    private Plugin plugin;

    public void XPhysics(Plugin plugin) {
        this.plugin = plugin;
        this.velocity = new Velocity();
        this.acceleration = new Acceleration();
        plugin.getServer().getPluginManager().registerEvents(new XPListeners(this), plugin);
    }

    public XPhysics getInstance() {
        return instance;
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public Velocity getVelocity() {
        return velocity;
    }

    public Acceleration getAcceleration() {
        return acceleration;
    }
}
