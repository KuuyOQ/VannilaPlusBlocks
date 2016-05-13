package kuuy.addtional.Meta;


import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuuy.addtional.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHay;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;

public class ColoredTNT extends BlockHay{

	public ColoredTNT() {
		this.setCreativeTab(Main.tabkuuy);
		this.setHardness(0.1F);
		this.setStepSound(Block.soundTypeLadder);
	}
	
	@SideOnly(Side.CLIENT)
    public void addBlockInformation(ItemBlock ItemBlock, EntityPlayer player, List list ) {
        list.add("Sample Text");
    }
	
}




