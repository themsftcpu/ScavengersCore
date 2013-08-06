package scavengersBuildTeam.core;

import java.util.logging.Logger;

//import org.bukkit.ChatColor;
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
		logger.info("+----- [SCAVENGERS PLUGIN] -----+");
		logger.info("| Uh-oh, did you restart me?    |");
		logger.info("| Version "+ pdfFile.getVersion() +" Has been disabled.|");
		logger.info("| 'Mumble, what did you do to   |");
		logger.info("|  the server?' - Cpu x9001     |");
		logger.info("+-------------------------------|");
	}
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		logger.info("+----- [SCAVENGERS PLUGIN] -----+");
		logger.info("| Developed in-house by thecpu  |");
		logger.info("| Version "+ pdfFile.getVersion() +" Has been enabled. |");
		logger.info("| 'Houston, we are online and   |");
		logger.info("|  ready to go.' - No one ever  |");
		logger.info("+-------------------------------|");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if(commandLabel.equals("WhoIsBoh")){
			player.sendMessage("A bad person. If you ever see him, tell him he sucks.");
		}
		else if(commandLabel.equals("ILikeBoh")){
			player.sendMessage("How can you?");
			player.setHealth(0); 
		} //If you didn't understand that, it means if the player types /ILikeBoh they get killed.
		return false;
	}
}
