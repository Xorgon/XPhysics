import Mechanics.Velocity;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class.
 */
public class XPhysics {

    private static XPhysics instance;
    private Velocity velocity;

    public void XPhysics(Plugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(new XPListeners(this, velocity), plugin);
    }

    public static XPhysics getInstance() {
        return instance;
    }
}
