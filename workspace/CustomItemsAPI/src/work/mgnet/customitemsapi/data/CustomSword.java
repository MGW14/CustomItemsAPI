/**
 * @author MCPfannkuchenYT
 */
package work.mgnet.customitemsapi.data;

import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_14_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.minecraft.server.v1_14_R1.NBTTagCompound;
import net.minecraft.server.v1_14_R1.NBTTagInt;
import net.minecraft.server.v1_14_R1.NBTTagList;
import net.minecraft.server.v1_14_R1.NBTTagString;

public class CustomSword extends CustomItemStack {
	
	private int attackDamage;
	
	// THIS IS NOT WORKING! ADD IT YOURSELF!
	private Runnable eventOnRightClick;
	private Runnable eventOnLeftClick;
	
	private boolean unbreaking;
	
	// Look at the CustomItemStack JavaDOC
	public CustomSword(Material material, boolean unbreaking, boolean hasCustomModelData, int customModelData,
			int amount, String name, int attackDamage, Runnable eventOnRightClick, Runnable eventOnLeftClick) {
		super(material, hasCustomModelData, customModelData, amount, name);
		this.attackDamage = attackDamage;
		this.unbreaking = unbreaking;
		this.eventOnRightClick = eventOnRightClick;
		this.eventOnLeftClick = eventOnLeftClick;
	}
	
	// Getters
	public int getAttackDamage() {
		return attackDamage;
	}

	public Runnable getEventOnRightClick() {
		return eventOnRightClick;
	}

	public Runnable getEventOnLeftClick() {
		return eventOnLeftClick;
	}

	public boolean isUnbreaking() {
		return unbreaking;
	}
	
	// Not used for you!
	@SuppressWarnings("deprecation")
	public static ItemStack fromCiSforCrafting(CustomSword cis) {
		ItemStack is = new ItemStack(cis.getMaterial(), cis.getAmount());
		ItemMeta itemMeta = is.getItemMeta();
		itemMeta.setDisplayName(cis.getName());
		itemMeta.spigot().setUnbreakable(cis.isUnbreaking());
		is.setItemMeta(itemMeta);
		net.minecraft.server.v1_14_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(is);
        NBTTagCompound compound = (nmsStack.hasTag()) ? nmsStack.getTag() : new NBTTagCompound();
        NBTTagList modifiers = new NBTTagList();
        NBTTagCompound damage = new NBTTagCompound();
        if (cis.hasCustomModelData()) {
			compound.setInt("CustomModelData", cis.getCustomModelData());
		}
        damage.set("AttributeName", new NBTTagString("generic.attackDamage"));
        damage.set("Name", new NBTTagString("generic.attackDamage"));
        damage.set("Amount", new NBTTagInt(cis.attackDamage));
        damage.set("Operation", new NBTTagInt(0));
        damage.set("UUIDLeast", new NBTTagInt(894654));
        damage.set("UUIDMost", new NBTTagInt(2872));
        damage.set("Slot", new NBTTagString("mainhand"));
     
        modifiers.add(damage);
        compound.set("AttributeModifiers", modifiers);
        nmsStack.setTag(compound);
        is = CraftItemStack.asBukkitCopy(nmsStack);
		return is;
	}
	
	@SuppressWarnings("deprecation")
	public static ItemStack fromCiS(CustomSword cis) {
		ItemStack is = new ItemStack(cis.getMaterial(), cis.getAmount());
		ItemMeta itemMeta = is.getItemMeta();
		itemMeta.spigot().setUnbreakable(cis.isUnbreaking());
		itemMeta.setDisplayName(cis.getName());
		is.setItemMeta(itemMeta);
		net.minecraft.server.v1_14_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(is);
        NBTTagCompound compound = (nmsStack.hasTag()) ? nmsStack.getTag() : new NBTTagCompound();
        NBTTagList modifiers = new NBTTagList();
        NBTTagCompound damage = new NBTTagCompound();
        if (cis.hasCustomModelData()) {
			compound.setInt("CustomModelData", cis.getCustomModelData());
		}
        damage.set("AttributeName", new NBTTagString("generic.attackDamage"));
        damage.set("Name", new NBTTagString("generic.attackDamage"));
        damage.set("Amount", new NBTTagInt(cis.attackDamage));
        damage.set("Operation", new NBTTagInt(0));
        damage.set("UUIDLeast", new NBTTagInt(894654));
        damage.set("UUIDMost", new NBTTagInt(2872));
        damage.set("Slot", new NBTTagString("mainhand"));
     
        modifiers.add(damage);
        compound.set("AttributeModifiers", modifiers);
        nmsStack.setTag(compound);
		is = CraftItemStack.asBukkitCopy(nmsStack);
		return is;
	}
	
}
