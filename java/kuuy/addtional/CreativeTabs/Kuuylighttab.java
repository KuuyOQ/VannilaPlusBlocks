package kuuy.addtional.CreativeTabs;
 
import kuuy.addtional.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class Kuuylighttab extends CreativeTabs {
 
	public Kuuylighttab(String label) {
		super(label);
		this.setBackgroundImageName("kuuylighttab.png");
        this.setNoTitle();
	}
 
	@Override
	public Item getTabIconItem() {
		return Main.Brc;
	}
 
}