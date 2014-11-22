import Mechanics.Velocity;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class.
 */
public class XPhysics extends JavaPlugin {

    private static XPhysics instance;
    private Velocity velocity;


    @Override
    public void onEnable(){
        velocity = new Velocity();
        Bukkit.getPluginManager().registerEvents(new XPListeners(this, velocity),this);
    }

    @Override
    public void onDisable(){

    }

    public static XPhysics getInstance() {
        return instance;
    }
}
