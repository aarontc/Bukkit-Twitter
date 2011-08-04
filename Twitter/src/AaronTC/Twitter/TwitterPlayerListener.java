package AaronTC.Twitter;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Handle events for all Player related events
 * @author AaronTC
 */
public class TwitterPlayerListener extends PlayerListener {
    private final Twitter plugin;

    public TwitterPlayerListener(Twitter instance) {
        plugin = instance;
    }

    //Insert Player related code here
}

