package work.mgnet.customstructuresapi.manager;

import java.util.ArrayList;
import java.util.Random;

public class StructureManager {
	
	/**
	 * @author MCPfannkuchenYT
	 * @version 1.0
	 */
	
	private ArrayList<Structure> structures = new ArrayList<Structure>(); // List with Structures
	
	public ArrayList<Structure> getStructures() {
		/**
		 * This Method returns all Structures
		 */
		return structures; // Get Structure
	}
	
	public void addStructure(Structure structure) {
		/**
		 * This Method adds a Structure
		 */
		structures.add(structure); // Add Structure
	}
	
	public void removeStructure(Structure structure) {
		/**
		 * This Method remove a Structure
		 */
		structures.remove(structure); // Remove Structure
	}
	
	public Structure random() {
		/**
		 * Returns a random Structure
		 */
		return structures.get(new Random().nextInt(structures.size())); // Get Random Structure
	}
	
}
