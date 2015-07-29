package me.Godbrandont.HelperBot;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class Cooldown extends BukkitRunnable{

	public static int cooldown;
	 
	Main plugin;
	
	public Cooldown(Main pl) {
		plugin = pl;
	}

	public void run() {
		if (cooldown <= 0){
			Bukkit.getServer().getScheduler().cancelTask(Main.cooldownID);
			return;
		}
		
		
	cooldown -= 1 ;
		
	}

}
