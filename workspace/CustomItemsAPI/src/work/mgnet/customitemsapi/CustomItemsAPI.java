/**
 * @author MCPfannkuchenYT
 */
package work.mgnet.customitemsapi;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import work.mgnet.customitemsapi.data.CustomRecipe;
import work.mgnet.customitemsapi.data.CustomSwordRecipe;
import work.mgnet.customitemsapi.listener.AntiCraftListener;

public class CustomItemsAPI extends JavaPlugin {
	
	public static ArrayList<CustomRecipe> recipes = new ArrayList<CustomRecipe>(); // List with Recipes
	public static ArrayList<CustomSwordRecipe> recipesSword = new ArrayList<CustomSwordRecipe>(); // List with SwordRecipes
	
	@Override
	public void onLoad() {
		this.getLogger().info("Loading CustomItemsAPI"); 
	}
	
	@Override
	public void onEnable() {
		this.getLogger().info("Enabling CustomItemsAPI");
		for (CustomRecipe customRecipe : recipes) { // Add Recipes
			Bukkit.addRecipe(customRecipe.getRecipe(UUID.randomUUID().toString(), this));
		}
		for (CustomSwordRecipe customRecipe : recipesSword) { // Add more Recipes
			Bukkit.addRecipe(customRecipe.getRecipe(UUID.randomUUID().toString(), this));
		}
		Bukkit.getPluginManager().registerEvents(new AntiCraftListener(), this); // Register Recipes
	}
	
}