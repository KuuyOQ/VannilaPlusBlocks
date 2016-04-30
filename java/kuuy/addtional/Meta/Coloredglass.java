package kuuy.addtional.Meta;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kuuy.addtional.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Coloredglass extends BlockBreakable {

	private IIcon[] iicon = new IIcon[16];

	public Coloredglass() {
		super("ice", Material.ice, false);
		this.setCreativeTab(Main.tabkuuylight);
		this.setHardness(0.5F);
		this.setResistance(10.0F);
		this.setStepSound(Block.soundTypeGlass);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(0.0F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		for (int i = 0; i < 16; i ++) {
			this.iicon[i] = register.registerIcon(this.getTextureName() + "-" + i);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return iicon[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativeTab, List list) {
		for (int i = 0; i < 16; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
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

}