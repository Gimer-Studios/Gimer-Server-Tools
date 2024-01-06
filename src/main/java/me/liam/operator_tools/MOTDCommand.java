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

        String newMOTD = String.join(" ", args);

        plugin.setDynamicMOTD(newMOTD);

        sender.sendMessage(ChatColor.GREEN + "Server MOTD updated to: " + newMOTD);

        return true;
    }
}