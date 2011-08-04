package AaronTC.Twitter;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * Twitter block listener
 * @author AaronTC
 */
public class TwitterBlockListener extends BlockListener {
    private final Twitter plugin;

    public TwitterBlockListener(final Twitter plugin) {
        this.plugin = plugin;
    }

    //put all Block related code here
}
