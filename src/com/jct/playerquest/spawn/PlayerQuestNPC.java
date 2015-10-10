package com.jct.playerquest.spawn;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class PlayerQuestNPC {

	protected Player linkedplayer;
	
	protected Entity linkedEntity;
	
	
	
	
	public PlayerQuestNPC(Entity linked) {
		
		linkedplayer = null;
		
		
	}
	
	public void tick() {
		Location loc = linkedplayer.getLocation();
		//Check if linked
		
		
		//Remove or readd or do **** all
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
