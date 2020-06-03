package me.philipperhult.flycommand;

import org.bukkit.plugin.java.JavaPlugin;

import me.philipperhult.flycommand.commands.FlyCommand;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		saveDefaultConfig();
		new FlyCommand(this);
	}
}
