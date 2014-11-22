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

    public void XPhysics(Plugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(new XPListeners(this, velocity), plugin);
    }

    public XPhysics getInstance() {
        return instance;
    }
}
