/**
 * @author MCPfannkuchenYT
 */
package work.mgnet.customitemsapi.listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import work.mgnet.customitemsapi.CustomItemsAPI;
import work.mgnet.customitemsapi.data.CustomItemStack;
import work.mgnet.customitemsapi.data.CustomRecipe;
import work.mgnet.customitemsapi.data.CustomSword;
import work.mgnet.customitemsapi.data.CustomSwordRecipe;

public class AntiCraftListener implements Listener {
	
	// Unimportant!
	@EventHandler
	public void onCraft(PrepareItemCraftEvent e) {
		if (e.getInventory().getResult() == null) return; 
		for (CustomRecipe recipe : CustomItemsAPI.recipes) {
			if (e.getInventory().getResult().hasItemMeta() && e.getInventory().getRecipe().getResult().getItemMeta().hasDisplayName() && e.getInventory().getResult().getItemMeta().getDisplayName().equalsIgnoreCase(CustomItemStack.fromCiSforCrafting(recipe.getResult()).getItemMeta().getDisplayName())) {
				ItemStack topleft = e.getInventory().getItem(1);
				ItemStack topmid = e.getInventory().getItem(2);
				ItemStack topright = e.getInventory().getItem(3);
				ItemStack midleft = e.getInventory().getItem(4);
				ItemStack midmid = e.getInventory().getItem(5);
				ItemStack midright = e.getInventory().getItem(6);
				ItemStack bottomright = e.getInventory().getItem(7);
				ItemStack bottommid = e.getInventory().getItem(8);
				ItemStack bottomleft = e.getInventory().getItem(9);
				if (!isPossible(topleft, recipe.getTopleft())) break;
				if (!isPossible(topmid, recipe.getTopmid())) break;
				if (!isPossible(topright, recipe.getTopright())) break;
				if (!isPossible(midleft, recipe.getMiddleleft())) break;
				if (!isPossible(midmid, recipe.getMiddlemid())) break;
				if (!isPossible(midright, recipe.getMiddleright())) break;
				if (!isPossible(bottomright, recipe.getDownright())) break;
				if (!isPossible(bottommid, recipe.getDownmid())) break;
				if (!isPossible(bottomleft, recipe.getDownleft())) break;
				return;
			}
		}
		for (CustomSwordRecipe recipe : CustomItemsAPI.recipesSword) {
			if (e.getInventory().getResult().hasItemMeta() && e.getInventory().getRecipe().getResult().getItemMeta().hasDisplayName() && e.getInventory().getResult().getItemMeta().getDisplayName().equalsIgnoreCase(CustomSword.fromCiSforCrafting(recipe.getResult()).getItemMeta().getDisplayName())) {
				ItemStack topleft = e.getInventory().getItem(1);
				ItemStack topmid = e.getInventory().getItem(2);
				ItemStack topright = e.getInventory().getItem(3);
				ItemStack midleft = e.getInventory().getItem(4);
				ItemStack midmid = e.getInventory().getItem(5);
				ItemStack midright = e.getInventory().getItem(6);
				ItemStack bottomright = e.getInventory().getItem(7);
				ItemStack bottommid = e.getInventory().getItem(8);
				ItemStack bottomleft = e.getInventory().getItem(9);
				if (!isPossible(topleft, recipe.getTopleft())) e.getInventory().setResult(null);
				if (!isPossible(topmid, recipe.getTopmid())) e.getInventory().setResult(null);
				if (!isPossible(topright, recipe.getTopright())) e.getInventory().setResult(null);
				if (!isPossible(midleft, recipe.getMiddleleft())) e.getInventory().setResult(null);
				if (!isPossible(midmid, recipe.getMiddlemid())) e.getInventory().setResult(null);
				if (!isPossible(midright, recipe.getMiddleright())) e.getInventory().setResult(null);
				if (!isPossible(bottomright, recipe.getDownright())) e.getInventory().setResult(null);
				if (!isPossible(bottommid, recipe.getDownmid())) e.getInventory().setResult(null);
				if (!isPossible(bottomleft, recipe.getDownleft())) e.getInventory().setResult(null);
				return;
			}
		}
		for (int i = 1; i < 10; i++) {
			try {
				if (e.getInventory().getItem(i).getItemMeta().hasCustomModelData() || e.getInventory().getItem(i).getItemMeta().isUnbreakable()) {
					e.getInventory().setResult(null);
				}
			} catch (Exception exc) {
				
			}
		}
		
	}
	
	public boolean isPossible(ItemStack in, CustomItemStack in2) {
		if (in == null) return true;
		if (in2 == null) return true;
		if (in.getType() == Material.AIR) return true;
		if (in2.getMaterial() == Material.AIR) return true;
		try {
			if (!in2.hasCustomModelData()) return true;
			return in.getItemMeta().getCustomModelData() == in2.getCustomModelData();
		} catch (Exception e) {
			return false;
		}
	}
	
}
