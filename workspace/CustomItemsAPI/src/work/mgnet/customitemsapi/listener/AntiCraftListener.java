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
			ItemStack topleft = e.getInventory().getItem(1);
			ItemStack topmid = e.getInventory().getItem(2);
			ItemStack topright = e.getInventory().getItem(3);
			ItemStack midleft = e.getInventory().getItem(4);
			ItemStack midmid = e.getInventory().getItem(5);
			ItemStack midright = e.getInventory().getItem(6);
			ItemStack bottomright = e.getInventory().getItem(7);
			ItemStack bottommid = e.getInventory().getItem(8);
			ItemStack bottomleft = e.getInventory().getItem(9);
			if (!isPossible(topleft, recipe.getTopleft())) continue;
			if (!isPossible(topmid, recipe.getTopmid())) continue;
			if (!isPossible(topright, recipe.getTopright())) continue;
			if (!isPossible(midleft, recipe.getMiddleleft())) continue;
			if (!isPossible(midmid, recipe.getMiddlemid())) continue;
			if (!isPossible(midright, recipe.getMiddleright())) continue;
			if (!isPossible(bottomright, recipe.getDownright())) continue;
			if (!isPossible(bottommid, recipe.getDownmid())) continue;
			if (!isPossible(bottomleft, recipe.getDownleft())) continue;
			e.getInventory().setResult(CustomItemStack.fromCiSforCrafting(recipe.getResult()));
			return;
		}
		for (CustomSwordRecipe recipe : CustomItemsAPI.recipesSword) {
			ItemStack topleft = e.getInventory().getItem(1);
			ItemStack topmid = e.getInventory().getItem(2);
			ItemStack topright = e.getInventory().getItem(3);
			ItemStack midleft = e.getInventory().getItem(4);
			ItemStack midmid = e.getInventory().getItem(5);
			ItemStack midright = e.getInventory().getItem(6);
			ItemStack bottomright = e.getInventory().getItem(7);
			ItemStack bottommid = e.getInventory().getItem(8);
			ItemStack bottomleft = e.getInventory().getItem(9);
			if (!isPossible(topleft, recipe.getTopleft())) continue;
			if (!isPossible(topmid, recipe.getTopmid())) continue;
			if (!isPossible(topright, recipe.getTopright())) continue;
			if (!isPossible(midleft, recipe.getMiddleleft())) continue;
			if (!isPossible(midmid, recipe.getMiddlemid())) continue;
			if (!isPossible(midright, recipe.getMiddleright())) continue;
			if (!isPossible(bottomright, recipe.getDownright())) continue;
			if (!isPossible(bottommid, recipe.getDownmid())) continue;
			if (!isPossible(bottomleft, recipe.getDownleft())) continue;
			e.getInventory().setResult(CustomSword.fromCiSforCrafting(recipe.getResult()));
			return;
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
		if (in == null && in2 == null) return true;
		try {
			if (!in2.hasCustomModelData() && in.getType() == in2.getMaterial()) return true;
			return in.getItemMeta().getCustomModelData() == in2.getCustomModelData() && in.getType() == in2.getMaterial();
		} catch (Exception e) {
			return false;
		}
	}
	
}
