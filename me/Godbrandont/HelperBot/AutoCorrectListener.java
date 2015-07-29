package me.Godbrandont.HelperBot;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AutoCorrectListener implements Listener{
	
	Main plugin;
	
	public AutoCorrectListener(Main pl) {
		plugin = pl;
	}
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e)
	{
		Player p = e.getPlayer();
		String message = e.getMessage().toLowerCase();
		if(!p.hasPermission("helperbot.autocorrectexempt") || p.isOp())
		{
			//Welcome
			
			for (Player pl : Bukkit.getOnlinePlayers()) {
				String pln = pl.getName();
			
			if (message.contains("welcome to the server") || message.contains("welcome to qubecraft") || message.contains("welcome, " + pln) || message.contains("welcome to qc")) {
				return;
			}
			else if(message.contains("welcum") || message.contains("welcoem") || message.contains("welcome1") || message.contains("wecloem") || message.contains("whale cum") || 
					message.contains("whalecum") || message.contains("wlecoem") || message.contains("wcleome") || message.contains("wlcolem") || 
					message.contains("wlcom") || message.contains("wlcoeme") || message.contains("wlecome") || message.contains("welceom") || 
					message.contains("welcomm") || message.contains("elcome!") && !message.equals("Welcome!"))
			{
				e.setMessage("Welcome!");	
			}
			}
		}
	}
}
