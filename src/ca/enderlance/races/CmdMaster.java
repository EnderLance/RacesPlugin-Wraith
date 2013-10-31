package ca.enderlance.races;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CmdMaster
{
	private Races plugin;
	
	public boolean commandMaster(CommandSender sender, Command cmd, String label, String[] args)
	{
		Player player = (Player) sender;
		if(player.hasPermission("myrace.wraith.cmd"))
		{
			if(label.equalsIgnoreCase("w"))
			{
				if(args.length == 0)
				{
					player.sendMessage(ChatColor.DARK_GRAY + "-------- WRAITH --------");
					player.sendMessage("");
					player.sendMessage(ChatColor.DARK_RED + "/w show " + ChatColor.DARK_GRAY + "-- Display all wraiths.");
					player.sendMessage(ChatColor.DARK_RED + "/w reap <player> " + ChatColor.DARK_GRAY + "-- Steal health from a specified player.");
					player.sendMessage("");
				}
				else if(args.length == 1)
				{
					if(args[0].equalsIgnoreCase("show") || args[0].equalsIgnoreCase("s"))
					{
						
					}
				}
				else if(args.length == 2)
				{
					if(args[0].equalsIgnoreCase("reap") || args[0].equalsIgnoreCase("r"))
					{
						
					}
				}
			}
		}
		return true;
	}
	
	public boolean reapSoul(Player player, Player tplayer, double damage)
	{
	    if(player.hasPermission("myrace.wraith.reap"))
	    {
	        player.sendMessage(ChatColor.DARK_GRAY + "You have reaped " + tplayer.getName() + "'s soul.");
	        damage = player.getLevel()/10;
	        double heal = damage/2;
	        double playerHealth = (double) player.getHealth();
	        tplayer.damage(damage);
	        player.setHealth(playerHealth + heal);
	    }
	    return true;
	}
}
