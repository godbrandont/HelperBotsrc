package me.Godbrandont.HelperBot;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class Calculator implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		  if(cmd.getName().equalsIgnoreCase("add")){
			  if (!sender.hasPermission("helperbot.calculator")) {
				  sender.sendMessage(Messages.noPermission());
			  }else{
				  if(args.length == 2){
					     try{
					       long n1 = Long.parseLong(args[0]);//Get no1
					       long n2 = Long.parseLong(args[1]);//Get no2
					       long result = n1 + n2;//
					       sender.sendMessage(ChatColor.GOLD + "Result: " + ChatColor.GREEN + n1 + " + " + n2 + " = " + result);

					     }
					     catch(Exception e){
					    	 sender.sendMessage(ChatColor.RED + "An error occurred. Please try again.");
					     }
					   }
					   else{
					     sender.sendMessage(ChatColor.RED + "Usage: " + ChatColor.GRAY + "/add <number1> <number2>");
					   }
					}
			  }
		  if(cmd.getName().equalsIgnoreCase("subtract")){
			  if (!sender.hasPermission("helperbot.calculator")) {
				  sender.sendMessage(Messages.noPermission());
			  }else{
				  if(args.length == 2){
					     try{
					       long n1 = Long.parseLong(args[0]);//Get no1
					       long n2 = Long.parseLong(args[1]);//Get no2
					       long result = n1 - n2;//
					       sender.sendMessage(ChatColor.GOLD + "Result: " + ChatColor.GREEN + n1 + " - " + n2 + " = " + result);

					     }
					     catch(Exception e){
					    	 sender.sendMessage(ChatColor.RED + "An error occurred. Please try again.");
					     }
					   }
					   else{
					     sender.sendMessage(ChatColor.RED + "Usage: " + ChatColor.GRAY + "/subtract <number1> <number to subtract number1 by>");
					   }
					}
			  }
		  if(cmd.getName().equalsIgnoreCase("multiply")){
			  if (!sender.hasPermission("helperbot.calculator")) {
				  sender.sendMessage(Messages.noPermission());
			  }else{
				  if(args.length == 2){
					     try{
					       long n1 = Long.parseLong(args[0]);//Get no1
					       long n2 = Long.parseLong(args[1]);//Get no2
					       long result = n1 * n2;//
					       sender.sendMessage(ChatColor.GOLD + "Result: " + ChatColor.GREEN + n1 + " x " + n2 + " = " + result);

					     }
					     catch(Exception e){
					    	 sender.sendMessage(ChatColor.RED + "An error occurred. Please try again."); 
					     }
					   }
					   else{
					     sender.sendMessage(ChatColor.RED + "Usage: " + ChatColor.GRAY + "/multiply <number1> <number2>");
					   }
					}
			  }
		  if(cmd.getName().equalsIgnoreCase("divide")){
			  if (!sender.hasPermission("helperbot.calculator")) {
				  sender.sendMessage(Messages.noPermission());
			  }else{
				  if(args.length == 2){
					     try{
					       long n1 = Long.parseLong(args[0]);//Get no1
					       long n2 = Long.parseLong(args[1]);//Get no2
					       long result = n1 / n2;//
					       sender.sendMessage(ChatColor.GOLD + "Result: " + ChatColor.GREEN + n1 + " ÷ " + n2 + " = " + result + ChatColor.GOLD + " to the nearest whole number.");

					     }
					     catch(Exception e){
					    	 sender.sendMessage(ChatColor.RED + "An error occurred. Please try again.");			       
					     }
					   }
					   else{
					     sender.sendMessage(ChatColor.RED + "Usage: " + ChatColor.GRAY + "/divide <number1> <number to divide number1 by>");
					   }
					}
			  }
		  
		return true;
}

}
