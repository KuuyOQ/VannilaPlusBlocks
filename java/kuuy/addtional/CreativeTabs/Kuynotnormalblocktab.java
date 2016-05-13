package kuuy.addtional.CreativeTabs;
 
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuuy.addtional.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
 
public class Kuynotnormalblocktab extends CreativeTabs {
 
	public Kuynotnormalblocktab(String label) {
		super(label);
		this.setBackgroundImageName("kuuynottab.png");
        this.setNoTitle();
	}
 
	@Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem(){
        ItemStack iStack = new ItemStack(Main.ClearRail);
        return iStack.getItem();
    }
 
}
