package me.Godbrandont.HelperBot;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class DPPrevention implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		String msg = e.getMessage().toLowerCase();
		Player p = e.getPlayer();
		if (!p.hasPermission("helperbot.dpexempt") || !p.isOp()) {
			if (msg.contains("drop party at spawn") || msg.contains("dp at spawn")) {
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "Please do not host drop parties!");
				
			}
		}else{
			return;
		}

	}

}
