package me.Godbrandont.HelperBot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;


public class AutoQuestionListener implements Listener{
	
	Main plugin;
	
	public AutoQuestionListener(Main pl) {
		plugin = pl;
	}
	
	boolean isPrivate;
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e)
	{
		isPrivate = plugin.getConfig().getBoolean("private");
		Player p = e.getPlayer();
		String message = e.getMessage().toLowerCase();
		if(!p.hasPermission("helperbot.autoquestionexempt") && Cooldown.cooldown <= 0 || p.isOp())
		{
			//How do I leave spawn
			if(message.contains("how") && message.contains("do") && message.contains("i") && message.contains("start") || 
					message.contains("how") && message.contains("leave") && message.contains("spawn") || 
					message.contains("how") &&  message.contains("exit") && message.contains("spawn") || 
					message.contains("how") &&  message.contains("depart") && message.contains("spawn") || 
					message.contains("how") && message.contains("go out of") && message.contains("spawn") || 
					message.contains("where") && message.contains("leave") && message.contains("spawn") 
					|| message.contains("where") && message.contains("exit") && message.contains("spawn") || 
					message.contains("where") && message.contains("depart") && message.contains("spawn") 
					|| message.contains("where") && message.contains("go out of") && message.contains("spawn"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can leave spawn via " + ChatColor.RED + "/portals " + ChatColor.AQUA + "or by simply just walking out.");
						}
						}.runTaskLater(plugin, 1);
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can leave spawn via " + ChatColor.RED + "/portals " + ChatColor.AQUA + "or by simply just walking out.");
					plugin.HelperBotCooldown();
					e.setCancelled(true);
				}
			}
			//Who is the owner
			else if(message.contains("is") && message.contains("owner") && message.contains("server") || 
					message.contains("who") && message.contains("owns") && message.contains("server") || 
					message.contains("who") && message.contains("are") && message.contains("owner") || 
					message.contains("who") && message.contains("are") && message.contains("owna") || 
					message.contains("hoo") && message.contains("is") && message.contains("owna") || 
					message.contains("hoo") && message.contains("is") && message.contains("owner") || 
					message.contains("who") && message.contains("is") && message.contains("owner") || 
					message.contains("who") && message.contains("is") && message.contains("owna"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " The owners are "+ChatColor.DARK_AQUA + "NmExHunTeRz" + ChatColor.AQUA + " and " + ChatColor.DARK_AQUA + "Topburns"+ChatColor.AQUA+".");
						}
						}.runTaskLater(plugin, 1);
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " The owners are "+ChatColor.DARK_AQUA + "NmExHunTeRz" + ChatColor.AQUA + " and " + ChatColor.DARK_AQUA + "Topburns"+ChatColor.AQUA+".");
					plugin.HelperBotCooldown();
					e.setCancelled(true);
				}
			}
			//How do I join a faction
			else if(message.contains("how") && message.contains("join") && message.contains("faction") || 
					message.contains("were") && message.contains("join") && message.contains("clan") || 
					message.contains("where") && message.contains("join") && message.contains("clan") || 
					message.contains("were") && message.contains("join") && message.contains("faction") || 
					message.contains("where") && message.contains("join") && message.contains("faction") || 
					message.contains("can") && message.contains("i") && message.contains("join") && message.contains("faction"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " The best way is to apply for one at " + ChatColor.GOLD + "www.qubecraft.com" + ChatColor.AQUA + "!");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " The best way is to apply for one at " + ChatColor.GOLD + "www.qubecraft.com" + ChatColor.AQUA + "!");
					plugin.HelperBotCooldown();
					e.setCancelled(true);
				}
			}
			//How big is the world border
			else if(message.contains("how") && message.contains("big") && message.contains("world") || message.contains("wht") && message.contains("border") 
					|| message.contains("hwo") && message.contains("border") || message.contains("hwo") && message.contains("big") && message.contains("map") 
					|| message.contains("how") && message.contains("big") && message.contains("map") || message.contains("what") && message.contains("border") 
					|| message.contains("how") && message.contains("border"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " The world border is "+ChatColor.GREEN+"200,000 x 200,000" + ChatColor.AQUA + "blocks.");
						}
						}.runTaskLater(plugin, 1);
					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " The world border is "+ChatColor.GREEN+"200,000 x 200,000" + ChatColor.AQUA + "blocks.");
					plugin.HelperBotCooldown();
					e.setCancelled(true);
				}
			}
			//How do I claim land
			else if(message.contains("hwo") && message.contains("protect") && message.contains("things") || 
					message.contains("hwo") && message.contains("claim") && message.contains("things") || 
					message.contains("how") && message.contains("protect") && message.contains("things") || 
					message.contains("how") && message.contains("claim") && message.contains("things") || 
					message.contains("hwo") && message.contains("protect") && message.contains("stuff") || 
					message.contains("hwo") && message.contains("claim") && message.contains("stuff") || 
					message.contains("how") && message.contains("claim") && message.contains("chests") || 
					message.contains("how") && message.contains("protect") && message.contains("chests") || 
					message.contains("how") && message.contains("claim") && message.contains("land") || 
					message.contains("hwo") && message.contains("claim") && message.contains("land") || 
					message.contains("how") && message.contains("protect") && message.contains("land") || 
					message.contains("how") && message.contains("protect") && message.contains("stuff"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can claim land with " + ChatColor.RED + "/f claim" + ChatColor.AQUA + " as long as you are the moderator/owner of a faction.");
						}
						}.runTaskLater(plugin, 1);
					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can claim land with " + ChatColor.RED + "/f claim" + ChatColor.AQUA + " as long as you are the moderator/owner of a faction.");
					e.setCancelled(true);
				}
			}
			//How do I apply for staff
			else if(message.contains("where") && message.contains("get") && message.contains("helper") || 
					message.contains("how") && message.contains("get") && message.contains("helper") || 
					message.contains("can") && message.contains("i") && message.contains("be") && message.contains("admin") || 
					message.contains("looking") && message.contains("for") && message.contains("staff") || 
					message.contains("hwo") && message.contains("apply") && message.contains("staff") || 
					message.contains("how") && message.contains("apply") && message.contains("staff") || 
					message.contains("how") && message.contains("apply") && message.contains("helper") || 
					message.contains("hwo") && message.contains("apply") && message.contains("helper") || 
					message.contains("where") && message.contains("join") && message.contains("faction") || 
					message.contains("where") && message.contains("apply") && message.contains("helper") || 
					message.contains("can") && message.contains("i") && message.contains("be") && message.contains("staff"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " After playing on our server for 7 days you can apply for helper position at " + ChatColor.GOLD + "www.qubecraft.com");
						}
						}.runTaskLater(plugin, 1);	
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " After playing on our server for 7 days you can apply for helper position at " + ChatColor.GOLD + "www.qubecraft.com");
					e.setCancelled(true);
				}
			}
			//How do I donate
			else if(message.contains("donate") && message.contains("for") && message.contains("obsidian") || 
					message.contains("donate") && message.contains("for") && message.contains("emerald") || 
					message.contains("donate") && message.contains("for") && message.contains("diamond") || 
					message.contains("donate") && message.contains("for") && message.contains("gold") || 
					message.contains("donate") && message.contains("for") && message.contains("iron") || 
					message.contains("can") && message.contains("i") && message.contains("donate") || 
					message.contains("how") && message.contains("do") && message.contains("donate") || 
					message.contains("where") && message.contains("do") && message.contains("donate") || 
					message.contains("how") && message.contains("get") && message.contains("rank") || 
					message.contains("where") && message.contains("get") && message.contains("rank") || 
					message.contains("how") && message.contains("buy") && message.contains("rank") || 
					message.contains("hwo") && message.contains("do") && message.contains("donate") || 
					message.contains("can") && message.contains("i") && message.contains("have") && message.contains("rank") 
					|| message.contains("can") && message.contains("i") && message.contains("buy") && message.contains("rank") 
					|| message.contains("can") && message.contains("i") && message.contains("be") && message.contains("mod"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can support our server by donating for various ranks at " + ChatColor.GOLD + "www.qubecraft.com/webstore");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can support our server by donating for various ranks at " + ChatColor.GOLD + "www.qubecraft.com/webstore");
					e.setCancelled(true);
				}
			}
			//What minigames do you have
			else if(message.contains("what") && message.contains("minigames") || 
					message.contains("how") && message.contains("play") && message.contains("minigames") || 
					message.contains("does") && message.contains("this") && message.contains("minigames") || 
					message.contains("what") && message.contains("games"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can play our minigames by typing " + ChatColor.RED + "/minigames");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can play our minigames by typing " + ChatColor.RED + "/minigames");
					e.setCancelled(true);
				}
			}
			//How do I become member
			else if(message.contains("how") && message.contains("be") && message.contains("member") || 
					message.contains("how") && message.contains("do") && message.contains("rank") && message.contains("up") || 
					message.contains("where") && message.contains("be") && message.contains("member") || 
					message.contains("where") && message.contains("get") && message.contains("member") || 
					message.contains("how") && message.contains("get") && message.contains("member") || 
					message.contains("where") && message.contains("apply") && message.contains("member") || 
					message.contains("how") && message.contains("apply") && message.contains("member") || 
					message.contains("where") && message.contains("sign") && message.contains("up") || 
					message.contains("how") && message.contains("sign") && message.contains("up") || 
					message.contains("how") && message.contains("become") && message.contains("member") || 
					message.contains("where") && message.contains("become") && message.contains("member") || 
					message.contains("gimme") && message.contains("member") || message.contains("give") && message.contains("member") )
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can become a member by signing up at " + ChatColor.GOLD + "www.qubecraft.com");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can become a member by signing up at " + ChatColor.GOLD + "www.qubecraft.com");
					e.setCancelled(true);
				}
			}
			//How do i vote
			else if(message.contains("how") && message.contains("vote") || message.contains("where") && message.contains("vote") || 
					message.contains("how") && message.contains("get") && message.contains("key") || message.contains("link") && message.contains("vote"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can vote for our server at " + ChatColor.GOLD + "www.qubecraft.com/vote");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can vote for our server at " + ChatColor.GOLD + "www.qubecraft.com/vote");
					e.setCancelled(true);
				}
			}
			//How do i get to pvp
			else if(message.contains("how") && message.contains("get") && message.contains("pvp") || 
					message.contains("is") && message.contains("there") && message.contains("arena") || 
					message.contains("how") && message.contains("can") && message.contains("pvp") || 
					message.contains("where") && message.contains("can") && message.contains("pvp") || 
					message.contains("where") && message.contains("pvp"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can teleport to the pvp arena by typing " + ChatColor.RED + "/pvp");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can teleport to the pvp arena by typing " + ChatColor.RED + "/pvp");
					e.setCancelled(true);
				}
			}
			//Do you lose items on death
			else if(message.contains("will") && message.contains("lose") && message.contains("die") ||
					message.contains("do") && message.contains("lose") && message.contains("stuff") && message.contains("die") || 
					message.contains("do") && message.contains("lose") && message.contains("items") && message.contains("die") || 
					message.contains("can you") && message.contains("lose") && message.contains("items") && message.contains("die") 
					|| message.contains("can i") && message.contains("lose") && message.contains("stuff") && message.contains("death") 
					|| message.contains("can i") && message.contains("lose") && message.contains("stuff") && message.contains("die") 
					|| message.contains("can you") && message.contains("lose") && message.contains("stuff") && message.contains("death") 
					|| message.contains("do") && message.contains("lose") && message.contains("stuff") && message.contains("death") 
					|| message.contains("do") && message.contains("lose") && message.contains("items") && message.contains("death") 
					|| message.contains("can you") && message.contains("lose") && message.contains("items") && message.contains("death"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " If you die anywhere on the server, you will lose your items.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " If you die anywhere on the server, you will lose your items.");
					e.setCancelled(true);
				}
			}
			//When does the end open
			else if(message.contains("when") && message.contains("does") && message.contains("end") && message.contains("open") || 
					message.contains("what") && message.contains("time") && message.contains("end") && message.contains("open") ||
					message.contains("what") && message.contains("day") && message.contains("end") && message.contains("open"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " The end opens at 9PM GMT+1 on Fridays.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " The end opens at 9PM GMT+1 on Fridays.");
					e.setCancelled(true);
				}
			}
			//When does the end close
			else if(message.contains("when") && message.contains("does") && message.contains("end") && message.contains("close") || 
					message.contains("what") && message.contains("time") && message.contains("end") && message.contains("close") ||
					message.contains("what") && message.contains("day") && message.contains("end") && message.contains("close"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " The end closes at the end of the weekend on Sundays.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " The end closes at the end of the weekend on Sundays.");
					e.setCancelled(true);
				}
			}
			//Is PvP enabled
			else if(message.contains("is") && message.contains("pvp") && message.contains("enabled") ||
					message.contains("is") && message.contains("there") && message.contains("pvp"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " PvP is enabled anywhere outside of a SafeZone.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " PvP is enabled anywhere outside of a SafeZone.");
					e.setCancelled(true);
				}
			}
			//Where is the owner
			else if(message.equals("owner?") ||message.equals("owna?") || message.equals("owna") || 
					message.contains("where") && message.contains("is") && message.contains("owna") || 
					message.equals("topburns?") || message.equals("nmexhunterz?") || message.equals("nmex?") || 
					message.contains("where") && message.contains("is") && message.contains("topburns") || 
					message.contains("where") && message.contains("is") && message.contains("nmex") || 
					message.contains("where") && message.contains("is") && message.contains("owner"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " The owners of QubeCraft are very busy people, please ask your question and I the Helper Bot, or one of our other staff members will attempt to help you.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " The owners of QubeCraft are very busy people, please ask your question and I the Helper Bot, or one of our other staff members will attempt to help you.");
					e.setCancelled(true);
				}
			}
			//Can I have op
			else if(message.contains("planet") && message.contains("minecraft") && message.contains("op") || 
					message.contains("give me op") || message.equals("pls op") && message.equals("op pls") || 
					message.contains("can i have op"))
			{
				p.sendMessage(Messages.prefix() + " No you cannot have OP.");
				e.setCancelled(true);
				
			}
			//What is helper+
			else if(message.contains("how") && message.contains("do") && message.contains("helper+") || 
					message.contains("what") && message.contains("does") && message.contains("helper+") || 
					message.contains("what") && message.contains("is") && message.contains("helper+"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + ChatColor.BLUE + " Helper"+ChatColor.GRAY+"+ " + ChatColor.AQUA + "is the rank between" + ChatColor.BLUE + " Helper " + ChatColor.AQUA + "and" + ChatColor.DARK_PURPLE + " Moderator " + ChatColor.AQUA + "used to test staff on moderation duties.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + ChatColor.BLUE + " Helper"+ChatColor.GRAY+"+ " + ChatColor.AQUA + "is the rank between" + ChatColor.BLUE + " Helper " + ChatColor.AQUA + "and" + ChatColor.DARK_PURPLE + " Moderator " + ChatColor.AQUA + "used to test staff on moderation duties.");
					e.setCancelled(true);
				}
			}
			//How do i get qubecoins/what is the coinshop
			else if(message.contains("what") && message.contains("qube") && message.contains("coin") || 
					message.contains("where") && message.contains("qube") && message.contains("coin") || 
					message.contains("how") && message.contains("qube") && message.contains("coin") || 
					message.contains("how") && message.contains("spend") && message.contains("qc") || 
					message.contains("what") && message.contains("coinshop") || message.contains("what") && message.contains("qubecoins") || 
					message.contains("how") && message.contains("coinshop") || message.contains("how") && message.contains("qubecoins"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You gain 10 QubeCoins every 10 minutes. You can check your QC balance with " + ChatColor.RED + "/qc" + ChatColor.AQUA + " and you can spend your QC at " + ChatColor.RED + "/warp coinshop");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You gain 10 QubeCoins every 10 minutes. You can check your QC balance with " + ChatColor.RED + "/qc" + ChatColor.AQUA + " and you can spend your QC at " + ChatColor.RED + "/warp coinshop");
					e.setCancelled(true);
				}
			}
			//How do I make money
			else if(message.contains("how") && message.contains("sell") || 
					message.contains("where") && message.contains("sell") || 
					message.contains("where") && message.contains("sell") && message.contains("items") || 
					message.contains("how") && message.contains("sell") && message.contains("items") || 
					message.contains("how") && message.contains("sell") && message.contains("stuff") || 
					message.contains("where") && message.contains("sell") && message.contains("things") || 
					message.contains("how") && message.contains("sell") && message.contains("things") || 
					message.contains("how") && message.contains("make") && message.contains("cash") || 
					message.contains("where") && message.contains("sell") && message.contains("stuff") || 
					message.contains("how") && message.contains("make") && message.contains("money"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can make money by selling items at " + ChatColor.RED + "/shops" + ChatColor.AQUA + " or by voting or donating to our server.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can make money by selling items at " + ChatColor.RED + "/shops" + ChatColor.AQUA + " or by voting or donating to our server.");
					e.setCancelled(true);
				}
			}
			//What is the website
			else if(message.contains("site") && message.contains("link") || message.contains("pls") && message.contains("site") || 
					message.contains("can") && message.contains("have") && message.contains("site") || 
					message.contains("what") && message.contains("is") && message.contains("site"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " Our website is " + ChatColor.GOLD + "www.qubecraft.com");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " Our website is " + ChatColor.GOLD + "www.qubecraft.com");
					e.setCancelled(true);
				}
			}
			//How do i create a faction
			else if(message.contains("what") && message.contains("create") && message.contains("fac") || 
					message.contains("how") && message.contains("make") && message.contains("fac") ||
					message.contains("how") && message.contains("create") && message.contains("fac") || 
					message.contains("what") && message.contains("make") && message.contains("fac"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can make a faction by typing " + ChatColor.RED + "/f create <name>");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can make a faction by typing " + ChatColor.RED + "/f create <name>");
					e.setCancelled(true);
				}
			}
			//How do i kick someone from a faction
			else if(message.contains("how") && message.contains("kick") && message.contains("fac") || 
					message.contains("what") && message.contains("kick") && message.contains("fac") ||
					message.contains("how") && message.contains("remove") && message.contains("from") && message.contains("fac")|| 
					message.contains("what") && message.contains("remove") && message.contains("from") && message.contains("fac"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can kick a faction member using " + ChatColor.RED + "/f kick <name>");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can kick a faction member using " + ChatColor.RED + "/f kick <name>");
					e.setCancelled(true);
				}
			}
			//How do i change the faction tag
			else if(message.contains("how") && message.contains("fac") && message.contains("tag") || 
					message.contains("how") && message.contains("fac") && message.contains("name") ||
					message.contains("command") && message.contains("fac") && message.contains("name")|| 
					message.contains("command") && message.contains("fac") && message.contains("tag"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can change your faction tag by typing " + ChatColor.RED + "/f tag <name>");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can change your faction tag by typing " + ChatColor.RED + "/f tag <name>");
					e.setCancelled(true);
				}
			}
			//How do i change faction titles
			else if(message.contains("how") && message.contains("fac") && message.contains("rank") || 
					message.contains("how") && message.contains("fac") && message.contains("title") ||
					message.contains("command") && message.contains("fac") && message.contains("title")|| 
					message.contains("command") && message.contains("fac") && message.contains("rank"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can set a members' title using " + ChatColor.RED + "/f title <name> <title>");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can set a members' title using " + ChatColor.RED + "/f title <name> <title>");
					e.setCancelled(true);
				}
			}
			//How do i ally factions
			else if(message.contains("how") && message.contains("ally") && message.contains("do") || 
					message.contains("how") && message.contains("ally") && message.contains("can") ||
					message.contains("command") && message.contains("ally"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can ally another faction using " + ChatColor.RED + "/f ally <name>");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can ally another faction using " + ChatColor.RED + "/f ally <name>");
					e.setCancelled(true);
				}
			}
			//How do i enemy factions
			else if(message.contains("how") && message.contains("enemy") && message.contains("do") || 
					message.contains("how") && message.contains("enemy") && message.contains("can") ||
					message.contains("command") && message.contains("enemy"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can enemy a faction using " + ChatColor.RED + "/f enemy <name>");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can enemy a faction using " + ChatColor.RED + "/f enemy <name>");
					e.setCancelled(true);
				}
			}
			//How do i neutral factions
			else if(message.contains("how") && message.contains("neutral") && message.contains("do") || 
					message.contains("how") && message.contains("neutral") && message.contains("can") ||
					message.contains("command") && message.contains("neutral") ||
					message.contains("how") && message.contains("not") && message.contains("enemy") ||
					message.contains("how") && message.contains("not") && message.contains("ally"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can neutral a faction using " + ChatColor.RED + "/f neutral <name>");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can neutral a faction using " + ChatColor.RED + "/f neutral <name>");
					e.setCancelled(true);
				}
			}
			//How do i leave a faction
			else if(message.contains("how") && message.contains("leave") && message.contains("fac") || 
					message.contains("how") && message.contains("exit") && message.contains("fac") ||
					message.contains("command") && message.contains("leave") && message.contains("fac"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can leave your faction by typing " + ChatColor.RED + "/f leave");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can leave your faction by typing " + ChatColor.RED + "/f leave");
					e.setCancelled(true);
				}
			}
			//How do i disband a faction
			else if(message.contains("how") && message.contains("disband") ||
					message.contains("command") && message.contains("disband") ||
					message.contains("how") && message.contains("remove") && message.contains("my") && message.contains("fac") ||
					message.contains("how") && message.contains("get rid") && message.contains("my") && message.contains("fac") ||
					message.contains("command") && message.contains("remove") && message.contains("my") && message.contains("fac") ||
					message.contains("command") && message.contains("get rid") && message.contains("my") && message.contains("fac"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You can disband your faction by typing " + ChatColor.RED + "/f disband");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You can disband your faction by typing " + ChatColor.RED + "/f disband");
					e.setCancelled(true);
				}
			}
			//How do i gain power
			else if(message.contains("how") && message.contains("gain") && message.contains("power") ||
					message.contains("how") && message.contains("get") && message.contains("power"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " You gain 2 faction power for every 10 minutes you are online.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " You gain 2 faction power for every 10 minutes you are online.");
					e.setCancelled(true);
				}
			}
			//Is this the creature server
			else if(message.contains("is") && message.contains("creature") && message.contains("server") ||
					message.contains("what") && message.contains("creature") && message.contains("server") ||
					message.contains("was") && message.contains("creature") && message.contains("server") ||
					message.contains("where") && message.contains("creature") && message.contains("server") ||
					message.contains("why") && message.contains("creature") && message.contains("server"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " This is not the creature server. That server has been shut down and we just happen to have their IP by chance.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " This is not the creature server. That server has been shut down and we just happen to have their IP by chance.");
					e.setCancelled(true);
				}
			}
			//What type of server is this <<<<<<<<<< NEEDS IMPROVING
			else if(message.contains("what") && message.contains("type") && message.contains("server") && message.contains("this")||
					message.contains("what") && message.contains("kind") && message.contains("server") && message.contains("this"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " QubeCraft is a factions/raiding survival server.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " QubeCraft is a factions/raiding survival server.");
					e.setCancelled(true);
				}
			}
			//Where is factions/Where is survival
			else if(message.equals("where is factions")||
					message.equals("where is survival")||
					message.contains("where is the faction") && message.contains("server") ||
					message.contains("where is the faction") && message.contains("world") ||
					message.equals("where is factions?")||
					message.equals("where is survival?")||
					message.equals("where is creative?")||
					message.equals("where is prison?")||
					message.equals("where is creative")||
					message.equals("where is prison")||
					message.equals("where is skyblock?")||
					message.equals("where is skyblock")||
					message.contains("where is the skyblock") && message.contains("server") ||
					message.contains("where is the skyblock") && message.contains("world") ||
					message.contains("where is the survival") && message.contains("server") ||
					message.contains("where is the survival") && message.contains("world") ||
					message.contains("where is the creative") && message.contains("server") ||
					message.contains("where is the creative") && message.contains("world") ||
					message.contains("where is the prison") && message.contains("server") ||
					message.contains("where is the prison") && message.contains("world") ||
					message.contains("where is the skyblock") && message.contains("server") ||
					message.contains("where is the skyblock") && message.contains("world"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " There are no other worlds for seperate gamemodes, there is only one factions/survival world, which you are currently in.");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " There are no other worlds for seperate gamemodes, there is only one factions/survival world, which you are currently in.");
					e.setCancelled(true);
				}
			}
			//How long has the server been up
			else if(message.contains("how") && message.contains("long") && message.contains("server") && message.contains("up")||
					message.contains("when") &&  message.contains("server") && message.contains("made") ||
					message.contains("when") &&  message.contains("server") && message.contains("created") ||
					message.contains("how") &&  message.contains("long") &&  message.contains("qubecraft") && message.contains("up") ||
					message.contains("when") &&  message.contains("qubecraft") && message.contains("created") ||
					message.contains("when") &&  message.contains("qubecraft") && message.contains("made") ||
					message.contains("how") &&  message.contains("qubecraft") && message.contains("up") ||
					message.contains("when") && message.contains("server") && message.contains("up"))
			{
				if(isPrivate == false)
				{
					new BukkitRunnable() {
						public void run() {
							Bukkit.broadcastMessage(Messages.prefix() + " QubeCraft opened on "+ ChatColor.GREEN + "3rd July 2015");
						}
						}.runTaskLater(plugin, 1);					
					plugin.HelperBotCooldown();
				}
				else
				{
					p.sendMessage(Messages.prefix() + " QubeCraft opened on "+ ChatColor.GREEN + "3rd July 2015");
					e.setCancelled(true);
				}
			}
			//QUESTIONS COMPLETED: 34
			//TODO:
			// enjin points / spawner limit / check bal / enchanting tables / anvils / food(warp pigs) / donator shop / crates(keys,location,rewards) 
			// tnt (how many hits,enabled?,obby breaker / can you lock chests / auctions(start,bid,cancel,ignore) / staff commands / current staff members /
			// how to sell/buy (where are shops/shift to sell stacks) / donator commands / how long is combattag / how do i start / kits / ignore players / nicknames(set,colour codes etc) 
			// realname / how to message/mail / view online players(/list) / what is the creature server / tpa(tpaccept/deny) / kill yourself / /seen / what are the rules 
			// how do i get to spawn / what are the warps / casino(how to use/buy coins) / mobarena / mcmmo stuff / can i have youtube rank
			// What rank do i have to be to buy a mall plot / how much are mall plots / where is the mall / what is the mall / How do i create chest shops
			// VOTING DOESNT WORK / I DIDNT GET REWARDS / I DIDNT GET A KEY / How much is (donator rank) / what is the server ip / what is the helper bot
		}
		
	}
	
}
