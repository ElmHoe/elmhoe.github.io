package uk.co.ElmHoe.Bukkit;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Pex extends JavaPlugin implements Listener{

	
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	public void onDisable(){
		
	}
	@EventHandler
    public void msg(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String msg = event.getMessage();
          if (msg.startsWith("/pex") || msg.startsWith("/permissionsex")) {
                        event.setCancelled(true);
                        player.sendMessage("§4Console only.");
              }
          }
    }
