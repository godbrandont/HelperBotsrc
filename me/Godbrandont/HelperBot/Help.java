package me.Godbrandont.HelperBot;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("helperbot")) {
			if (p.hasPermission("helperbot.help") || p.getName().equalsIgnoreCase("ExKay") || p.getName().equalsIgnoreCase("Godbrandont")) {
				
				p.sendMessage(ChatColor.GREEN + "------- " + Messages.prefix() + ChatColor.GREEN + " -------");
				p.sendMessage(ChatColor.GOLD + "Player Commands:");
				p.sendMessage(ChatColor.RED + "/(add/subtract/divide/multiply):" + ChatColor.GRAY + " Ingame Calculator");
				p.sendMessage(ChatColor.GOLD + "Staff Commands:");
				p.sendMessage(ChatColor.RED + "/trolllist:" + ChatColor.GRAY + " Shows the list of known trolls on the server.");
				p.sendMessage(ChatColor.RED + "/troll <add/remove>:" + ChatColor.GRAY + " Adds or removes a player from the troll list.");
				p.sendMessage(ChatColor.GOLD + "Administrator Commands:");
				p.sendMessage(ChatColor.RED + "/autowelcome toggle:" + ChatColor.GRAY + " toggles the auto-welcome function.");
				
			}else{
				p.sendMessage(Messages.noPermission());
			}
		}
		
		return true;
	}
}
