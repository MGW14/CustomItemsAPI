/**
 * @author MCPfannkuchenYT
 */
package work.mgnet.customitemsapi.data;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomSwordRecipe {
	
	// Look at the CustomRecipe javadoc!
	private CustomItemStack topleft;
	private CustomItemStack topmid;
	private CustomItemStack topright;
	private CustomItemStack middleleft;
	private CustomItemStack middlemid;
	private CustomItemStack middleright;
	private CustomItemStack downleft;
	private CustomItemStack downmid;
	private CustomItemStack downright;
	
	private CustomSword result;
	
	public CustomSwordRecipe(CustomItemStack topleft, CustomItemStack topmid, CustomItemStack topright,
			CustomItemStack middleleft, CustomItemStack middlemid, CustomItemStack middleright,
			CustomItemStack downleft, CustomItemStack downmid, CustomItemStack downright, CustomSword result) {
		super();
		this.topleft = topleft;
		this.topmid = topmid;
		this.topright = topright;
		this.middleleft = middleleft;
		this.middlemid = middlemid;
		this.middleright = middleright;
		this.downleft = downleft;
		this.downmid = downmid;
		this.downright = downright;
		this.result = result;
	}
	public CustomItemStack getTopleft() {
		return topleft;
	}
	public CustomItemStack getTopmid() {
		return topmid;
	}
	public CustomItemStack getTopright() {
		return topright;
	}
	public CustomItemStack getMiddleleft() {
		return middleleft;
	}
	public CustomItemStack getMiddlemid() {
		return middlemid;
	}
	public CustomItemStack getMiddleright() {
		return middleright;
	}
	public CustomItemStack getDownleft() {
		return downleft;
	}
	public CustomItemStack getDownmid() {
		return downmid;
	}
	public CustomItemStack getDownright() {
		return downright;
	}
	public CustomSword getResult() {
		return result;
	}
	
	public ShapedRecipe getRecipe(String namespaced, JavaPlugin plugin) {
		ShapedRecipe sr = new ShapedRecipe(new NamespacedKey(plugin, namespaced), CustomSword.fromCiSforCrafting(result));
		String a = " ";
		String b = " ";
		String c = " ";
		if (topleft != null) {
			a = "a";
		}
		if (topmid != null) {
			b = "b";
		}
		if (topright != null) {
			c = "c";
		}
		String a2 = " ";
		String b2 = " ";
		String c2 = " ";
		if (middleleft != null) {
			a2 = "x";
		}
		if (middlemid != null) {
			b2 = "y";
		}
		if (middleright != null) {
			c2 = "z";
		}
		String a3 = " ";
		String b3 = " ";
		String c3 = " ";
		if (downleft != null) {
			a3 = "g";
		}
		if (downmid != null) {
			b3 = "h";
		}
		if (downright != null) {
			c3 = "j";
		}
		
		sr.shape(a + b + c, a2 + b2 + c2, a3 + b3 + c3);
		
		if (downleft != null) {
			sr.setIngredient("g".charAt(0), downleft.getMaterial());
		}
		if (downmid != null) {
			sr.setIngredient("h".charAt(0), downmid.getMaterial());
		}
		if (downright != null) {
			sr.setIngredient("j".charAt(0), downright.getMaterial());
		}
		if (middleleft != null) {
			sr.setIngredient("x".charAt(0), middleleft.getMaterial());
		}
		if (middlemid != null) {
			sr.setIngredient("y".charAt(0), middlemid.getMaterial());
		}
		if (middleright != null) {
			sr.setIngredient("z".charAt(0), middleright.getMaterial());
		}
		if (topleft != null) {
			sr.setIngredient("a".charAt(0), topleft.getMaterial());
		}
		if (topmid != null) {
			sr.setIngredient("b".charAt(0), topmid.getMaterial());
		}
		if (topright != null) {
			sr.setIngredient("c".charAt(0), topright.getMaterial());
		}
		return sr;
	}
}
