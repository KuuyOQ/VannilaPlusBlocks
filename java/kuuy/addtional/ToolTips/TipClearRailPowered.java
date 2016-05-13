package kuuy.addtional.ToolTips;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class TipClearRailPowered extends ItemBlock {

public TipClearRailPowered(Block block) {
super(block);
}

public void addInformation(ItemStack stack, EntityPlayer player, List list,
boolean show) {
list.add(StatCollector.translateToLocal("tile.clearrailpoweredtip.name"));
list.add(StatCollector.translateToLocal("tile.clearrailpoweredtip2.name"));
list.add(StatCollector.translateToLocal("tile.clearrailpoweredtip3.name"));

}
}