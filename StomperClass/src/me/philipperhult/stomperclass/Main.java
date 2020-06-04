package me.philipperhult.stomperclass;

import org.bukkit.plugin.java.JavaPlugin;

import me.philipperhult.stomperclass.effect.StomperEffect;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new StomperEffect(this);
	}
	
	@Override
	public void onDisable() {
		
	}

}
