package kuuy.addtional.Tools;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import kuuy.addtional.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Itemdiamondsaw extends Item
{
    private boolean repair = false;
    public Itemdiamondsaw()
    {
        super();
        this.setMaxStackSize(1);
        this.setMaxDamage(3200); 
    }


    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        return false;
    }


    @Override
    public boolean hasContainerItem()
    {
        return !repair;
    }
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		repair = Main.IDS == event.crafting.getItem();
	}
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        if (itemStack != null && itemStack.getItem() == this)
        {
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        }
        return itemStack;
    }


}