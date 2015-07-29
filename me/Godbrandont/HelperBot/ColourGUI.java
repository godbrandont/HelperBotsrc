package me.Godbrandont.HelperBot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ColourGUI implements CommandExecutor, Listener {

	public static void colorSelector(Player player) {
		Inventory color = Bukkit.createInventory(null, 45, ChatColor.BLACK + "Color Selector");
		
		ItemStack color0 = new ItemStack(Material.STAINED_CLAY, 1, (byte)15);
		ItemMeta color0Meta = color0.getItemMeta();
		color0Meta.setDisplayName(ChatColor.BLACK + "Black");
		color0Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&0"));
		color0.setItemMeta(color0Meta);
		color.setItem(10,color0);
		
		ItemStack color1 = new ItemStack(Material.STAINED_CLAY, 1, (byte)11);
		ItemMeta color1Meta = color1.getItemMeta();
		color1Meta.setDisplayName(ChatColor.DARK_BLUE + "Dark Blue");
		color1Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&1"));
		color1.setItemMeta(color1Meta);
		color.setItem(11,color1);
		
		ItemStack color2 = new ItemStack(Material.STAINED_CLAY, 1, (byte)13);
		ItemMeta color2Meta = color2.getItemMeta();
		color2Meta.setDisplayName(ChatColor.DARK_GREEN + "Dark Green");
		color2Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&2"));
		color2.setItemMeta(color2Meta);
		color.setItem(12,color2);
		
		ItemStack color3 = new ItemStack(Material.STAINED_CLAY, 1, (byte)3);
		ItemMeta color3Meta = color3.getItemMeta();
		color3Meta.setDisplayName(ChatColor.DARK_AQUA + "Dark Aqua");
		color3Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&3"));
		color3.setItemMeta(color3Meta);
		color.setItem(13,color3);
		
		ItemStack color4 = new ItemStack(Material.STAINED_CLAY, 1, (byte)14);
		ItemMeta color4Meta = color4.getItemMeta();
		color4Meta.setDisplayName(ChatColor.DARK_RED + "Dark Red");
		color4Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&4"));
		color4.setItemMeta(color4Meta);
		color.setItem(14,color4);
		
		ItemStack color5 = new ItemStack(Material.STAINED_CLAY, 1, (byte)10);
		ItemMeta color5Meta = color5.getItemMeta();
		color5Meta.setDisplayName(ChatColor.DARK_PURPLE + "Dark Purple");
		color5Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&5"));
		color5.setItemMeta(color5Meta);
		color.setItem(15,color5);
		
		ItemStack color6 = new ItemStack(Material.STAINED_CLAY, 1, (byte)4);
		ItemMeta color6Meta = color6.getItemMeta();
		color6Meta.setDisplayName(ChatColor.GOLD + "Gold");
		color6Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&6"));
		color6.setItemMeta(color6Meta);
		color.setItem(16,color6);
		
		
		ItemStack color7 = new ItemStack(Material.STAINED_CLAY, 1, (byte)9);
		ItemMeta color7Meta = color7.getItemMeta();
		color7Meta.setDisplayName(ChatColor.GRAY + "Gray");
		color7Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&7"));
		color7.setItemMeta(color7Meta);
		color.setItem(19,color7);
		
		ItemStack color8 = new ItemStack(Material.STAINED_CLAY, 1, (byte)7);
		ItemMeta color8Meta = color8.getItemMeta();
		color8Meta.setDisplayName(ChatColor.DARK_GRAY + "Dark Gray");
		color8Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&8"));
		color8.setItemMeta(color8Meta);
		color.setItem(20,color8);
		
		ItemStack color9 = new ItemStack(Material.WOOL, 1, (byte)11);
		ItemMeta color9Meta = color9.getItemMeta();
		color9Meta.setDisplayName(ChatColor.BLUE + "Blue");
		color9Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&9"));
		color9.setItemMeta(color9Meta);
		color.setItem(21,color9);
		
		ItemStack color10 = new ItemStack(Material.WOOL, 1, (byte)5);
		ItemMeta color10Meta = color10.getItemMeta();
		color10Meta.setDisplayName(ChatColor.GREEN + "Green");
		color10Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&a"));
		color10.setItemMeta(color10Meta);
		color.setItem(22,color10);
		
		ItemStack color11 = new ItemStack(Material.WOOL, 1, (byte)3);
		ItemMeta color11Meta = color11.getItemMeta();
		color11Meta.setDisplayName(ChatColor.AQUA + "Aqua");
		color11Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&b"));
		color11.setItemMeta(color11Meta);
		color.setItem(23,color11);
		
		ItemStack color12 = new ItemStack(Material.WOOL, 1, (byte)14);
		ItemMeta color12Meta = color12.getItemMeta();
		color12Meta.setDisplayName(ChatColor.RED + "Red");
		color12Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&c"));
		color12.setItemMeta(color12Meta);
		color.setItem(24,color12);
		
		ItemStack color13 = new ItemStack(Material.WOOL, 1, (byte)2);
		ItemMeta color13Meta = color13.getItemMeta();
		color13Meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Light Purple");
		color13Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&d"));
		color13.setItemMeta(color13Meta);
		color.setItem(25,color13);
		
		ItemStack color14 = new ItemStack(Material.WOOL, 1, (byte)4);
		ItemMeta color14Meta = color14.getItemMeta();
		color14Meta.setDisplayName(ChatColor.YELLOW + "Yellow");
		color14Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&e"));
		color14.setItemMeta(color14Meta);
		color.setItem(28,color14);
		
		ItemStack color15 = new ItemStack(Material.WOOL, 1);
		ItemMeta color15Meta = color15.getItemMeta();
		color15Meta.setDisplayName(ChatColor.WHITE + "White");
		color15Meta.setLore(Arrays.asList(ChatColor.GRAY + "Color Code: " + ChatColor.GOLD + "&f"));
		color15.setItemMeta(color15Meta);
		color.setItem(29,color15);
		
		ItemStack format = new ItemStack(Material.ENDER_PEARL, 1);
		ItemMeta formatMeta = format.getItemMeta();
		formatMeta.setDisplayName(ChatColor.GREEN + "Formatting");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Bold: " + ChatColor.GOLD + "&l -" + ChatColor.RED + ChatColor.BOLD + " Hello!");
		lore.add(ChatColor.GRAY + "Strikethrough: " + ChatColor.GOLD + "&m -" + ChatColor.RED + ChatColor.STRIKETHROUGH + " Hello!");
		lore.add(ChatColor.GRAY + "Underline: " + ChatColor.GOLD + "&n -" + ChatColor.RED + ChatColor.UNDERLINE + " Hello!");
		lore.add(ChatColor.GRAY + "Italic: " + ChatColor.GOLD + "&o -" + ChatColor.RED + ChatColor.ITALIC + " Hello!");
		lore.add("");
		lore.add(ChatColor.GRAY + "Reset: " + ChatColor.GOLD + "&r -" + ChatColor.RED + " Resets formatting.");
		formatMeta.setLore(lore);
		format.setItemMeta(formatMeta);
		color.setItem(34,format);
		
		player.openInventory(color);
		

	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("color")) {
			if (!p.hasPermission("helperbot.color")) {
				p.sendMessage(Messages.noPermission());
			}else{
				colorSelector(p);
			}
		}
		
		
		return true;
		
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
	if(ChatColor.stripColor(e.getInventory().getName()).equalsIgnoreCase("Color Selector")){
		e.setCancelled(true);
		
		if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) {
			return;
		}
	}
	}
}
