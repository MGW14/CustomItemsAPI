/**
 * @author MCPfannkuchenYT
 */
package work.mgnet.customitemsapi.data;

import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_16_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.minecraft.server.v1_16_R1.NBTTagCompound;

public class CustomItemStack {
	
	private Material material; // Material
	private boolean hasCustomModelData; // Not important for you
	private int customModelData; // CMD
	private int amount; // Count
	private String name; // DisplayName USE §f!
	
	// This is a Constructor. Who could have known
	public CustomItemStack(Material material, boolean hasCustomModelData, int customModelData, int amount, String name) {
		this.material = material;
		this.hasCustomModelData = hasCustomModelData;
		this.customModelData = customModelData;
		this.amount = amount;
		this.name = name;
	}
	
	// Getters!
	public Material getMaterial() {
		return material;
	}
	public boolean hasCustomModelData() {
		return hasCustomModelData;
	}
	public int getCustomModelData() {
		return customModelData;
	}
	public int getAmount() {
		return amount;
	}
	public String getName() {
		return name;
	}
	
	// Create a Custom Item Stack from an Item Stack
	public static CustomItemStack fromItemStack(ItemStack is) {
		if (!is.hasItemMeta()) return new CustomItemStack(is.getType(), false, 0, is.getAmount(), is.getType().toString());
		ItemMeta meta = is.getItemMeta();
		return new CustomItemStack(is.getType(), meta.hasCustomModelData(), meta.getCustomModelData(), is.getAmount(), meta.getDisplayName());
	}
	
	// Create ItemStack from CIS
	public static ItemStack fromCiS(CustomItemStack cis) {
		ItemStack is = new ItemStack(cis.getMaterial(), cis.getAmount());
		ItemMeta ism = is.getItemMeta();
		ism.setDisplayName(cis.getName());
		if (cis.hasCustomModelData()) ism.setCustomModelData(cis.getCustomModelData());
		is.setItemMeta(ism);
		return is;
	}
	
	// Not important for you!
	public static ItemStack fromCiSforCrafting(CustomItemStack cis) {
		ItemStack is = new ItemStack(cis.getMaterial(), cis.getAmount());
		ItemMeta ism = is.getItemMeta();
		ism.setDisplayName(cis.getName());
		is.setItemMeta(ism);
		if (cis.hasCustomModelData()) {
			net.minecraft.server.v1_16_R1.ItemStack is2 = CraftItemStack.asNMSCopy(is);
			NBTTagCompound tag = is2.getOrCreateTag();
			tag.setInt("CustomModelData", cis.getCustomModelData());
			is2.setTag(tag);
			is = CraftItemStack.asBukkitCopy(is2);
		}
		return is;
	}
	
}
