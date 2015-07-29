package me.Godbrandont.HelperBot;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Crafting implements Listener {
	
	public static void planks(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Planks");
		
		ItemStack planks = new ItemStack(Material.LOG);
		inv.setItem(5, planks);

		player.openInventory(inv);
		
		
	}
	
	public static void sticks(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Sticks");
		
		ItemStack sticks = new ItemStack(Material.WOOD);
		inv.setItem(5, sticks);
		inv.setItem(8, sticks);

		player.openInventory(inv);
		
		
	}
	
	public static void torch(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Torch");
		
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(8, stick);
		ItemStack coal = new ItemStack(Material.COAL);
		inv.setItem(5, coal);

		player.openInventory(inv);
		
		
	}
	
	public static void workbench(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Workbench");
		
		ItemStack wood = new ItemStack(Material.WOOD);
		inv.setItem(5, wood);
		inv.setItem(6, wood);
		inv.setItem(8, wood);
		inv.setItem(9, wood);

		player.openInventory(inv);
		
		
	}
	
	public static void chest(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Chest");
		
		ItemStack wood = new ItemStack(Material.WOOD);
		inv.setItem(1, wood);
		inv.setItem(2, wood);
		inv.setItem(3, wood);
		inv.setItem(4, wood);
		inv.setItem(6, wood);
		inv.setItem(7, wood);
		inv.setItem(8, wood);
		inv.setItem(9, wood);

		player.openInventory(inv);
		
		
	}
	
	public static void furnace(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Furnace");
		
		ItemStack cstone = new ItemStack(Material.COBBLESTONE);
		inv.setItem(1, cstone);
		inv.setItem(2, cstone);
		inv.setItem(3, cstone);
		inv.setItem(4, cstone);
		inv.setItem(6, cstone);
		inv.setItem(7, cstone);
		inv.setItem(8, cstone);
		inv.setItem(9, cstone);

		player.openInventory(inv);
		
		
	}
	
	public static void ladder(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Ladder");
		
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(1, stick);
		inv.setItem(3, stick);
		inv.setItem(4, stick);
		inv.setItem(5, stick);
		inv.setItem(6, stick);
		inv.setItem(7, stick);
		inv.setItem(9, stick);


		player.openInventory(inv);
		
		
	}
	
	public static void fence(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Fence");
		
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(5, stick);
		inv.setItem(8, stick);
		ItemStack wood = new ItemStack(Material.WOOD);
		inv.setItem(4, wood);
		inv.setItem(6, wood);
		inv.setItem(7, wood);
		inv.setItem(9, wood);


		player.openInventory(inv);
		
		
	}
	
	public static void boat(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Boat");
		
		ItemStack wood = new ItemStack(Material.WOOD);
		inv.setItem(4, wood);
		inv.setItem(6, wood);
		inv.setItem(7, wood);
		inv.setItem(8, wood);
		inv.setItem(9, wood);


		player.openInventory(inv);
		
		
	}
	
	public static void slab(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Slab");
		
		ItemStack wood = new ItemStack(Material.WOOD);
		inv.setItem(7, wood);
		inv.setItem(8, wood);
		inv.setItem(9, wood);


		player.openInventory(inv);
		
		
	}
	
	public static void sign(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Sign");
		
		ItemStack wood = new ItemStack(Material.WOOD);
		inv.setItem(1, wood);
		inv.setItem(2, wood);
		inv.setItem(3, wood);
		inv.setItem(4, wood);
		inv.setItem(5, wood);
		inv.setItem(6, wood);
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(8, stick);


		player.openInventory(inv);
		
		
	}
	
	public static void door(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Door");
		
		ItemStack wood = new ItemStack(Material.WOOD);
		inv.setItem(1, wood);
		inv.setItem(2, wood);
		inv.setItem(4, wood);
		inv.setItem(5, wood);
		inv.setItem(7, wood);
		inv.setItem(8, wood);

		player.openInventory(inv);
		
		
	}
	
	public static void painting(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Painting");
		
		ItemStack wool = new ItemStack(Material.WOOL);
		inv.setItem(5, wool);
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(1, stick);
		inv.setItem(2, stick);
		inv.setItem(3, stick);
		inv.setItem(4, stick);
		inv.setItem(6, stick);
		inv.setItem(7, stick);
		inv.setItem(8, stick);
		inv.setItem(9, stick);

		player.openInventory(inv);
		
		
	}
	
	public static void bed(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Bed");
		
		ItemStack wood = new ItemStack(Material.WOOD);
		inv.setItem(7, wood);
		inv.setItem(8, wood);
		inv.setItem(9, wood);
		ItemStack wool = new ItemStack(Material.WOOL);
		inv.setItem(4, wool);
		inv.setItem(5, wool);
		inv.setItem(6, wool);

		player.openInventory(inv);
		
		
	}
	
	public static void pickaxe(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Pickaxe");
		
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(5, stick);
		inv.setItem(6, stick);
		ItemStack diamond = new ItemStack(Material.DIAMOND);
		inv.setItem(1, diamond);
		inv.setItem(2, diamond);
		inv.setItem(3, diamond);

		player.openInventory(inv);
		
		
	}
	
	public static void shovel(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Shovel");
		
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(5, stick);
		inv.setItem(6, stick);
		ItemStack diamond = new ItemStack(Material.DIAMOND);
		inv.setItem(2, diamond);

		player.openInventory(inv);
		
		
	}
	
	public static void axe(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Axe");
		
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(5, stick);
		inv.setItem(6, stick);
		ItemStack diamond = new ItemStack(Material.DIAMOND);
		inv.setItem(2, diamond);
		inv.setItem(3, diamond);
		inv.setItem(6, diamond);

		player.openInventory(inv);
		
		
	}
	
	public static void hoe(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Hoe");
		
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(5, stick);
		inv.setItem(6, stick);
		ItemStack diamond = new ItemStack(Material.DIAMOND);
		inv.setItem(2, diamond);
		inv.setItem(3, diamond);

		player.openInventory(inv);
		
		
	}
	
	public static void fishingrod(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Fishing Rod");
		
		ItemStack stick = new ItemStack(Material.STICK);
		inv.setItem(7, stick);
		inv.setItem(5, stick);
		inv.setItem(3, stick);
		ItemStack string = new ItemStack(Material.STRING);
		inv.setItem(6, string);
		inv.setItem(9, string);

		player.openInventory(inv);
		
		
	}
	
	public static void flintandsteel(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Flint and Steel");
		
		ItemStack iron = new ItemStack(Material.IRON_INGOT);
		inv.setItem(4, iron);
		ItemStack flint = new ItemStack(Material.FLINT);
		inv.setItem(8, flint);

		player.openInventory(inv);
		
		
	}
	
	public static void shears(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Shears");
		
		ItemStack iron = new ItemStack(Material.IRON_INGOT);
		inv.setItem(5, iron);
		inv.setItem(7, iron);

		player.openInventory(inv);
		
		
	}
	
	public static void bucket(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Bucket");
		
		ItemStack iron = new ItemStack(Material.IRON_INGOT);
		inv.setItem(4, iron);
		inv.setItem(6, iron);
		inv.setItem(8, iron);

		player.openInventory(inv);
		
		
	}
	
	public static void clock(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Clock");
		
		ItemStack gold = new ItemStack(Material.GOLD_INGOT);
		inv.setItem(2, gold);
		inv.setItem(4, gold);
		inv.setItem(6, gold);
		inv.setItem(8, gold);
		ItemStack redstone = new ItemStack(Material.REDSTONE);
		inv.setItem(5, redstone);

		player.openInventory(inv);
		
		
	}
	
	public static void compass(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Compass");
		
		ItemStack iron = new ItemStack(Material.IRON_INGOT);
		inv.setItem(2, iron);
		inv.setItem(4, iron);
		inv.setItem(6, iron);
		inv.setItem(8, iron);
		ItemStack redstone = new ItemStack(Material.REDSTONE);
		inv.setItem(5, redstone);

		player.openInventory(inv);
		
		
	}
	
	public static void map(Player player) {
		
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Map");
		
		ItemStack paper = new ItemStack(Material.PAPER);
		inv.setItem(1, paper);
		inv.setItem(2, paper);
		inv.setItem(3, paper);
		inv.setItem(4, paper);
		inv.setItem(6, paper);
		inv.setItem(7, paper);
		inv.setItem(8, paper);
		inv.setItem(9, paper);
		ItemStack compass = new ItemStack(Material.COMPASS);
		inv.setItem(5, compass);

		player.openInventory(inv);
		
		
	}

	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) { 
		Player p = e.getPlayer();
		String msg = e.getMessage().toLowerCase();
		if (msg.contains("how") && (msg.contains("craft") || msg.contains("make"))) {
			if (msg.contains("planks") || msg.contains("wood")) {
				planks(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft planks!");
			}
			if (msg.contains("stick")) {
				sticks(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft sticks!");
			}
			if (msg.contains("torch")) {
				torch(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft torches!");
			}
			if (msg.contains("workbench") || msg.contains("crafting table") || msg.contains("crafting bench")) {
				workbench(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft workbenches!");
			}
			if (msg.contains("chest")) {
				chest(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft chests!");
			}
			if (msg.contains("furnace")) {
				furnace(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft furnaces!");
			}
			if (msg.contains("ladder")) {
				ladder(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft ladders!");
			}
			if (msg.contains("fence")) {
				fence(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft fences!");
			}
			if (msg.contains("boat")) {
				boat(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft boats!");
			}
			if (msg.contains("slab")) {
				slab(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft slabs!");
			}
			if (msg.contains("sign")) {
				sign(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft signs!");
			}
			if (msg.contains("door")) {
				door(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft doors!");
			}
			if (msg.contains("painting")) {
				painting(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft paintings!");
			}
			if (msg.contains("bed")) {
				bed(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft beds!");
			}
			if (msg.contains("pickaxe") || msg.contains("pick")) {
				pickaxe(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft pickaxes!");
			}
			if (msg.contains("shovel") || msg.contains("spade")) {
				shovel(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft shovels!");
			}
			if (msg.contains("axe")) {
				axe(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft axes!");
			}
			if (msg.contains("hoe")) {
				hoe(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft hoes!");
			}
			if (msg.contains("rod") || (msg.contains("fishing") && msg.contains("rod"))) {
				fishingrod(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft fishing rods!");
			}
			
			if (msg.contains("flintandsteel") || (msg.contains("flint") && msg.contains("steel"))) {
				flintandsteel(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft a flint and steel!");
			}
			
			if (msg.contains("shears")) {
				shears(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft shears!");
			}
			if (msg.contains("bucket")) {
				bucket(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft buckets!");
			}
			if (msg.contains("clock") || msg.contains("watch")) {
				clock(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft clocks!");
			}
			if (msg.contains("compass")) {
				compass(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft compasses!");
			}
			if (msg.contains("map")) {
				map(p);
				e.setCancelled(true);
				p.sendMessage(ChatColor.YELLOW + "Here is how you craft maps!");
			}
		}else{
			return;
		}
	}
	
	@EventHandler
	public void onInteract(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Planks")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Sticks")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Torch")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Workbench")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Chest")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Furnace")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Ladder")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Fence")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Boat")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Slab")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Sign")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Door")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Painting")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Bed")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Pickaxe")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Shovel")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Axe")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Hoe")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Fishing Rod")) {
			e.setCancelled(true);
			
		}
		
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Flint and Steel")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Shears")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Bucket")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Clock")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Compass")) {
			e.setCancelled(true);
			
		}
		if (e.getClickedInventory().getName().equals(""+ChatColor.DARK_AQUA + ChatColor.BOLD + "Crafting: Map")) {
			e.setCancelled(true);
			
		}
	}

}
