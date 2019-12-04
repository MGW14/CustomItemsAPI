package work.mgnet.customstructuresapi.manager;

import java.util.List;

import org.bukkit.inventory.ItemStack;

public class Structure {
	
	/**
	 * @author MCPfannkuchenYT
	 * @version 1.0
	 */
	
	// Important part
	private String name; // Saves the Name of the Structure
	private List<BlockLocation> blocks; // List of Blocks that the Structure contains
	
	// Loot table gets rerunned until 5 Items are in the Chest!!!
	private List<ItemStack> commonLoot; // Common Loot 50% 
	private List<ItemStack> uncommonLoot; // Uncommon Loot 10%
	private List<ItemStack> rareLoot; // Rare Loot 2%
	private List<ItemStack> epicLoot; // Epic Loot 1%
	private List<ItemStack> legendaryLoot; // Legendary Loot 0.5%
	
	// Yet again. A Constructor. But wow that are many Parameters!
	public Structure(String name, List<BlockLocation> blocks, List<ItemStack> commonLoot,
			List<ItemStack> uncommonLoot, List<ItemStack> rareLoot, List<ItemStack> epicLoot,
			List<ItemStack> legendaryLoot) {
		/**
		 * Constructor for a Structure
		 */
		this.name = name; // Set Structure Name
		this.blocks = blocks; // Set Blocks
		this.commonLoot = commonLoot; // I will not keep doing this
		this.uncommonLoot = uncommonLoot; // Loot
		this.rareLoot = rareLoot; // Loot
		this.epicLoot = epicLoot; // Loot
		this.legendaryLoot = legendaryLoot; // U good if you get these Items
	}
	
	// A few Getters and Setters
	public String getName() {
		return name; // Get Name
	}
	public void setName(String name) {
		this.name = name; // Set Name
	}
	public List<BlockLocation> getBlocks() {
		return blocks; // Get Blocks
	}
	public void setBlocks(List<BlockLocation> blocks) {
		this.blocks = blocks;// Set Blocks
	}
	public List<ItemStack> getCommonLoot() {
		return commonLoot; // Get Loot
	}
	public void setCommonLoot(List<ItemStack> commonLoot) {
		this.commonLoot = commonLoot; // Set Loot
	}
	public List<ItemStack> getUncommonLoot() {
		return uncommonLoot; // Get Loot
	}
	public void setUncommonLoot(List<ItemStack> uncommonLoot) {
		this.uncommonLoot = uncommonLoot; // Set Loot
	}
	public List<ItemStack> getRareLoot() {
		return rareLoot; // Get Loot
	}
	public void setRareLoot(List<ItemStack> rareLoot) {
		this.rareLoot = rareLoot; // Set Loot
	}
	public List<ItemStack> getEpicLoot() {
		return epicLoot; // Get Loot
	}
	public void setEpicLoot(List<ItemStack> epicLoot) {
		this.epicLoot = epicLoot; // Set Loot
	}
	public List<ItemStack> getLegendaryLoot() {
		return legendaryLoot; // Get Loot
	}
	public void setLegendaryLoot(List<ItemStack> legendaryLoot) {
		this.legendaryLoot = legendaryLoot; // Set Loot
	}
	
}
