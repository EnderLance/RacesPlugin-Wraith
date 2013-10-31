package ca.enderlance.races;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Races extends JavaPlugin
{
	public static Races plugin;
	public final Logger logger = Logger.getLogger("Minecraft");

	public void onEnable()
	{
		org.bukkit.plugin.PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " is ready to bite you!");
		getCommand("w").setExecutor(new CmdMaster(this));
	}
	
	public void onDisable() 
	{
		org.bukkit.plugin.PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " has been disabled.");
		saveConfig();
	}
	
	//public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	//{
	//	if (label.equalsIgnoreCase("myrace") || label.equalsIgnoreCase("mr"))
	//	{
	//		if (args.length == 3)
	//		{
	//			if (args[0].equalsIgnoreCase("set"))
	//			{
	//				Player player = (Player) sender;
	//				if(player.hasPermission("myrace.set"))
	//					Player tplayer = player.getServer().getPlayer(args[1]);
	//					PermissionAttachment at = tplayer.addAttachment(plugin);
	//					at.setPermission("myRace.isRace." + args[2], true);
	//				}
	//			}
	//		}
	//	}
	//	return true;
	//}
	
	public void onRightClick(PlayerInteractEntityEvent e)
	{
		Player player = (Player) e.getPlayer();
		Entity tentity = (Player) e.getRightClicked();
		drain(player, tentity, 1.00);
	}
	
	public void drain(Player player, Entity entity, double damage)
	{
		if (player.hasPermission("myrace.wraith.drain1") && !player.hasPermission("myrace.wraith.drain2"))
		{
			if ((entity instanceof LivingEntity))
			{
				((LivingEntity) entity).setHealth(((LivingEntity) entity).getHealth() - damage);
				player.setHealth(player.getHealth() + damage/2);
				player.sendMessage(ChatColor.DARK_GRAY + "You have devoured a soul.");
			}
			//else if(entity instanceof Player)
			//{
			//	((Player) entity).damage(damage*2);
			//}
		}
		else if (player.hasPermission("myrace.wraith.drain2") && !player.hasPermission("myrace.wraith.drain3"))
		{
			if ((entity instanceof LivingEntity))
			{
				((LivingEntity) entity).setHealth(((LivingEntity) entity).getHealth() - damage);
				player.setHealth(player.getHealth() + damage/2);
				player.sendMessage(ChatColor.DARK_GRAY + "You have devoured a soul.");
			}
			//else if(entity instanceof Player)
			//{
			//	((Player) entity).damage(damage*4);
			//}
		}
		else if (player.hasPermission("myrace.wraith.drain3"))
		{
			if ((entity instanceof LivingEntity))
			{
				((LivingEntity) entity).setHealth(((LivingEntity) entity).getHealth() - damage);
				player.setHealth(player.getHealth() + damage/2);
				player.sendMessage(ChatColor.DARK_GRAY + "You have devoured a soul.");
			}
			//else if(entity instanceof Player)
			//{
			//
			//	player.setHealth(player.getHealth() + damage/2);
			//	player.sendMessage(ChatColor.DARK_GRAY + "You have devoured a soul.");
			//}
		}
	}
	
	@EventHandler
    public void onPlayerToggleSneak(PlayerToggleSneakEvent event)
	{
		Player[] players;
		Player player = (Player) event.getPlayer();
		if(player.hasPermission("myrace.wraith.dissipate"))
		{
			players = getServer().getOnlinePlayers();
			if(event.isSneaking() == true && player.isFlying() == false)
			{
				for(int i = 0; i< players.length; i++)
				{
					players[i].hidePlayer(player);
					Location loc = event.getPlayer().getLocation();
					//event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 0);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 0);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 1);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 2);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 3);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 4);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 5);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 6);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 7);
					loc.setY(loc.getY()+0.5);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 0);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 1);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 2);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 3);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 4);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 5);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 6);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 7);
					loc.setY(loc.getY()+0.5);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 0);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 1);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 2);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 3);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 4);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 5);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 6);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 7);
					loc.setY(loc.getY()+0.5);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 0);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 1);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 2);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 3);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 4);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 5);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 6);
					event.getPlayer().getWorld().playEffect(loc, Effect.SMOKE, 7);
				}
			}
			else{
	    		for(int i = 0; i< players.length; i++)
	    		{
					players[i].showPlayer((Player) event.getPlayer());
				}	
			}
		}
	}
}
