package kuuy.addtional.Meta;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Kuyhopper extends BlockHopper {
	
    @SideOnly(Side.CLIENT)
    private static IIcon field_149921_b;
    @SideOnly(Side.CLIENT)
    private IIcon field_149923_M;
    @SideOnly(Side.CLIENT)
    private static IIcon field_149924_N;

	public Kuyhopper() {
		this.setHardness(0.5F);
		this.setResistance(10.0F);
		this.setStepSound(Block.soundTypeGlass);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(0.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_149923_M : this.field_149921_b;
    }

    public static int getDirectionFromMetadata(int p_149918_0_)
    {
        return p_149918_0_ & 7;
    }

    public static boolean func_149917_c(int p_149917_0_)
    {
        return (p_149917_0_ & 8) != 8;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149921_b = p_149651_1_.registerIcon("kuuymeta:kuyhopper_outside");
        this.field_149923_M = p_149651_1_.registerIcon("kuuymeta:kuyhopper_top");
        this.field_149924_N = p_149651_1_.registerIcon("kuuymeta:kuyhopper_inside");}
    
    @SideOnly(Side.CLIENT)
    public static IIcon getHopperIcon(String p_149916_0_)
    {
        return p_149916_0_.equals("kuuymeta:kuyhopper_outside") ? Kuyhopper.field_149921_b : (p_149916_0_.equals("kuuymeta:hopper_inside") ? Kuyhopper.field_149924_N : null);
    }
    
    @SideOnly(Side.CLIENT)
    public String getItemIconName()
    {
        return "kuuymeta:kuyhopper";
    }

    
}