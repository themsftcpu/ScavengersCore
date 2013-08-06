package scavengersBuildTeam.core;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info("[Scavengers Plugin]: " + pdfFile.getName() + "Has been disabled.");
	}
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info("[Scavengers Plugin]: " + pdfFile.getName() + "Version " + pdfFile.getVersion() + "Has been disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if(commandLabel.equals("WhoIsBoh")){
			player.sendMessage(ChatColor.RED + "A bad person. If you ever see him, tell him he sucks."); //Mumble, tell me what to put in the quotes.
		}
		return false;
	}
}
