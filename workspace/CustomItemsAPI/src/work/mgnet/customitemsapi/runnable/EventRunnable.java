/**
 * @author MCPfannkuchenYT
 */
package work.mgnet.customitemsapi.runnable;

import org.bukkit.entity.Player;

public class EventRunnable extends Thread {
	
	private Player p; // Not working rn

	public Player getP() {
		return p;
	}

	public void setP(Player p) {
		this.p = p;
	}
	
}
