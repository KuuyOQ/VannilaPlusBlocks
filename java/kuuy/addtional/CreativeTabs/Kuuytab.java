package kuuy.addtional.CreativeTabs;
 
import kuuy.addtional.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class Kuuytab extends CreativeTabs {
 
	public Kuuytab(String label) {
		super(label);
	}
 
	@Override
	public Item getTabIconItem() {
		return Main.kuytab;
	}
 
}
