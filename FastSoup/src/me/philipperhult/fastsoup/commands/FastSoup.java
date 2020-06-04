package me.philipperhult.fastsoup.commands;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.philipperhult.fastsoup.Main;

public class FastSoup implements Listener {
	
	public FastSoup(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		
	}
	
	
    @EventHandler(priority = EventPriority.HIGHEST)
	public void onSoup(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		double currHealth = p.getHealth();
		Action a = e.getAction();
		double maxHealth = p.getMaxHealth();
		int addHP = 7;
		if(!(currHealth == maxHealth)) {
			if(!(currHealth == 0)) {
				if((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
					if(p.getItemInHand().getType() == Material.MUSHROOM_SOUP) {
						if(maxHealth-currHealth < 7) {
							p.setHealth(20);
							p.getItemInHand().setType(Material.BOWL);
							p.updateInventory();
						}
						else {
							p.setHealth(currHealth+addHP);
							p.getItemInHand().setType(Material.BOWL);
							p.updateInventory();
						}
					}
				}
			}
		}
	}
    	

}
