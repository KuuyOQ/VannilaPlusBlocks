package kuuy.addtional.CreativeTabs;
 
import kuuy.addtional.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class Kuyitemtab extends CreativeTabs {
 
	public Kuyitemtab(String label) {
		super(label);
		this.setBackgroundImageName("kuuyitemtab.png");
        this.setNoTitle();
	}
 
	@Override
	public Item getTabIconItem() {
		return Main.STT;
	}
 
}