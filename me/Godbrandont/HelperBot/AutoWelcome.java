package me.Godbrandont.HelperBot;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class AutoWelcome implements Listener, CommandExecutor{
	
	public static void autoWelcome()
	{
		for (Player pl : Bukkit.getOnlinePlayers()) {
			pl.chat("Welcome!");
		}
	}
	
	public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if(alias.equalsIgnoreCase("testwelcome"))
        {
        	autoWelcome();
        }
		
		return true;
	}
}
