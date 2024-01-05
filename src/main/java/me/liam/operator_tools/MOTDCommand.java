package me.liam.operator_tools;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MOTDCommand implements CommandExecutor {

    private final OperatorTools plugin;

    public MOTDCommand(OperatorTools plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /motd <NewMOTD>");
            return true;
        }

        // Combine the arguments to form the new MOTD
        String newMOTD = String.join(" ", args);

        // Set the new MOTD using the main plugin class method
        plugin.setMOTD(newMOTD);

        // Notify the sender
        sender.sendMessage(ChatColor.GREEN + "Server MOTD updated to: " + newMOTD);

        return true;
    }
}
