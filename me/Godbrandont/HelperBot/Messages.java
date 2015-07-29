package me.Godbrandont.HelperBot;

import org.bukkit.ChatColor;

public class Messages {
	
	static String prefix(){
		return ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + "HelperBot" + ChatColor.DARK_GRAY + "]" + ChatColor.AQUA;
	}

	public static String noPermission() {
		return prefix() + ChatColor.RED + " You don't have permission!";
	}
	
	public static String msgDenizPermission() {
		return prefix() + ChatColor.RED + " Are you sure you need NmExHunTeRz specifically? Please ask your question in chat or message another staff member if it is important.";
	}

}
