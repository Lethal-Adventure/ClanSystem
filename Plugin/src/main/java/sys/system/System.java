package sys.system;

import org.bukkit.plugin.java.JavaPlugin;

public final class System extends JavaPlugin {

    @Override
    public void onEnable() {
        
        loadConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
        
    }
}
