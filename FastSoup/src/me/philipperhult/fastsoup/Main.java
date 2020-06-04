package me.philipperhult.fastsoup;

import org.bukkit.plugin.java.JavaPlugin;

import me.philipperhult.fastsoup.commands.FastSoup;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
//		saveDefaultConfig();
		new FastSoup(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	

}
