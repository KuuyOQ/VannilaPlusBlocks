package kuuy.addtional.ToolTips;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class TipTNT extends ItemBlock {

public TipTNT(Block block) {
super(block);
}

public void addInformation(ItemStack stack, EntityPlayer player, List list,
boolean show) {
list.add(StatCollector.translateToLocal("tile.sidetnttip.name"));
list.add(StatCollector.translateToLocal("tile.sidetnttip2.name"));

}
}