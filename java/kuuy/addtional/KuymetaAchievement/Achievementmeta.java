package kuuy.addtional.KuymetaAchievement;

import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import kuuy.addtional.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;

public class Achievementmeta
{
	
	public int applesFound;
	public int ironFound;
	
	public void crafting(ItemCraftedEvent event)
	{
		if(event.crafting.getItem() == Items.golden_apple)
		{
			event.player.addStat(Main.starpaw, 1);
		}
	}
	
	public void smelting(ItemSmeltedEvent event)
	{
		if(event.smelting.getItem() == Items.gold_ingot)
		{
			event.player.addStat(Main.starpaw, 1);
		}
	}
	
	public void pickup(ItemPickupEvent event)
	{
		if(event.pickedUp.getEntityItem().getItem() == Items.gold_ingot)
		{
			event.player.addStat(Main.starpaw, 1);
		}
		
		if (event.pickedUp.getEntityItem().getItem() == Items.apple)
		 {
			 applesFound = applesFound + 1;

			 this.triggerAchievmentSecond(null);
		 }
		 
		 if (event.pickedUp.getEntityItem().getItem() == Items.iron_ingot)
		 {
			 ironFound = ironFound + 1;

			 this.triggerAchievmentSecond(null);
		 }
	}
	
	 
	 

	private void triggerAchievmentSecond(EntityPlayer player)
	{
		 if(applesFound >= 2)
		 {
			 if(ironFound >= 1)
			 {
	
				 player.addStat(Main.starpawup, 1);
			 
			 }
		 }
	}
}