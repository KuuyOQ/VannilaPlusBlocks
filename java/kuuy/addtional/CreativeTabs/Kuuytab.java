package kuuy.addtional.CreativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuuy.addtional.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Kuuytab extends CreativeTabs {
 
    public Kuuytab(int id, String unlocalizedName) {
 
        super(id, unlocalizedName);
        this.setBackgroundImageName("kuuytab.png");
        this.setNoTitle();
    }
 
    @SideOnly(Side.CLIENT)
	@Override
	public Item getTabIconItem() {
		return Main.kuytab;
	}
	
	public boolean hasSearchBar() {
        
        return true;
    }
	
	
 
}
