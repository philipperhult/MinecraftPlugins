package me.philipperhult.stomperclass.effect;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import me.philipperhult.stomperclass.Main;

public class StomperEffect implements Listener {
	
	public StomperEffect (Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler(priority = EventPriority.HIGH)
    public void OnEntityDamage(EntityDamageEvent e) {
        if(e.getEntity() instanceof Player && e.getCause() == DamageCause.FALL) {
            Player p = (Player)e.getEntity();
            for (Entity entity : p.getNearbyEntities(5, 5, 5)) {
                if (entity instanceof Player) {
                    Player nearbyPlayer = (Player)entity;
                    nearbyPlayer.damage(e.getDamage());
                }
            }
 
            if (e.getDamage() > 4.0) {
                p.damage(4.0);
                e.setCancelled(true);
            }
        }
    }
}
