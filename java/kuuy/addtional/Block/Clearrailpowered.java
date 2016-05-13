package kuuy.addtional.Block;

	import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuuy.addtional.Main;
import net.minecraft.block.BlockRailPowered;

	public class Clearrailpowered extends BlockRailPowered {

		public Clearrailpowered() {
			this.setCreativeTab(Main.tabkuuynotnormal);
		}


		@Override
	    public boolean isOpaqueCube() {
	       return false;
	    }

		public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
		
		
		
		@SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 1;
	    }
		
		public int getMobilityFlag()
	    {
	        return 0;
	    }
		
		@SideOnly(Side.CLIENT)
	    public String getItemIconName()
	    {
	        return "kuuymeta:tile/clearrailpowered";
	    }
		
	}


