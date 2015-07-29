package me.Godbrandont.HelperBot;


import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	// PERMISSIONS:
	// helperbot.calculator : Use the calculator
	// helperbot.autocorrectexempt : Makes exempt from auto correct
	// helperbot.autoquestionexempt : Makes exempt from auto questions
	// helperbot.dpexempt : Makes exempt from asking about drop parties
	// helperbot.help : Shows the help page
	// helperbot.color : Shows the color selector
	
	public static boolean isHelperEnabled = false;
	public static int cooldownID;
	public static int helpmessagedelayID;
	
	public void onEnable()
	{
		registerListeners();
		saveDefaultConfig();
		registerCommands();
		
	}
	
	public void onDisable()
	{
		saveDefaultConfig();
	}
	
	public void registerListeners()
	{
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new AutoQuestionListener(this), this);
		pm.registerEvents(new AutoCorrectListener(this), this);
		pm.registerEvents(new Crafting(), this);
		pm.registerEvents(new DPPrevention(), this);
		pm.registerEvents(new ColourGUI(), this);
	}
	
	public void registerCommands()
	{
		this.getCommand("helperbot").setExecutor(new Help());
		this.getCommand("testwelcome").setExecutor(new AutoWelcome());
		this.getCommand("color").setExecutor(new ColourGUI());
		
		this.getCommand("add").setExecutor(new Calculator());
		this.getCommand("subtract").setExecutor(new Calculator());
		this.getCommand("multiply").setExecutor(new Calculator());
		this.getCommand("divide").setExecutor(new Calculator());
	}

	
	@SuppressWarnings("deprecation")
	public void HelperBotCooldown()
	{
		Cooldown.cooldown = 5;
		cooldownID = getServer().getScheduler().scheduleSyncRepeatingTask(this, new Cooldown(this), 20l, 20l);
	}
		
	public void stopHelperBotCooldown(){
		getServer().getScheduler().cancelTask(cooldownID);
	}
	
	
	//BELOW ARE CONCEPT IDEAS THAT DIDN'T WORK BUT I HAVE ARCHIVED FOR POSSIBLE FUTURE USE
	
/*	public boolean OnCommand(CommandSender s, Command c, String l, String [] args)
	{		
		if(l.equalsIgnoreCase("ask"))
		{
			if (args.length == 1)
	        {
	                if (args[0].contains("leave") && args[0].contains("spawn") || args[0].contains("exit") && args[0].contains("spawn") || args[0].contains("depart") && args[0].contains("spawn") || args[0].contains("go out of") && args[0].contains("spawn"))
	                {
	                	s.sendMessage("You asked: " + args[0]);
	                	s.sendMessage("Answer Found: You can leave spawn via the biome portals scattered around spawn.");
	                	s.sendMessage("If this was not the answer you were looking for, please try again or contact a staff member.");
	                	return true;
	                }
	                else if (args[0].contains("helper") || args[0].contains("staff") || args[0].contains("apply"))
	                {
	                	s.sendMessage("You asked: " + args[0]);
	                	s.sendMessage("Answer Found: You can apply for helper on our website after you have played on the server for longer than 5 days.");
	                	s.sendMessage("If this was not the answer you were looking for, please try again or contact a staff member.");
	                	return true;
	                }
	                s.sendMessage("Sorry, no answer could be found for your question.");
	                s.sendMessage("You asked: " + args[0]);
	                return false;
	        }
	        s.sendMessage("You have not entered a question!");
	        return false;
		}
		return false;
		
	}*/ 
	
	/*@Override
	public boolean onCommand(CommandSender s, Command c, String l, String [] args)
	{		
		if(l.equalsIgnoreCase("helper"))
		{
			if(!isHelperEnabled)
			{
				s.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + "HelperBot" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " Helper bot enabled! Type a question in the chat that you wish to ask. Or type /helper again to disable the helper bot.");
				isHelperEnabled = true;
				return true;
			}
			else
			{
				s.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.BLUE + "HelperBot" + ChatColor.DARK_GRAY + "]" + ChatColor.RED + " Helper bot disabled! Type /helper again to re-enable the helper bot.");
				isHelperEnabled = false;
				return true;
			}
		}
		return false;
		
	}*/
	
	
}
