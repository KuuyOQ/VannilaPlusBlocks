/*
 * kuuymeta Vannilaaddtionalblocks mod 1.7.10 1.1_a
 */

package kuuy.addtional;

import java.util.ArrayList;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import kuuy.addtional.Block.Clearrail;
import kuuy.addtional.Block.Clearrailpowered;
import kuuy.addtional.CreativeTabs.Kuuylighttab;
import kuuy.addtional.CreativeTabs.Kuuytab;
import kuuy.addtional.CreativeTabs.Kuyitemtab;
import kuuy.addtional.CreativeTabs.Kuynotnormalblocktab;
import kuuy.addtional.KuymetaAchievement.Achievementmeta;
import kuuy.addtional.Meta.Colored;
import kuuy.addtional.Meta.ColoredEndb;
import kuuy.addtional.Meta.ColoredFactory;
import kuuy.addtional.Meta.ColoredIce;
import kuuy.addtional.Meta.ColoredTNT;
import kuuy.addtional.Meta.Coloredglass;
import kuuy.addtional.Meta.Coloreditem;
import kuuy.addtional.Meta.Coloredlight;
import kuuy.addtional.Meta.Kuyhopper;
import kuuy.addtional.Recipes.CraftingRecipes;
import kuuy.addtional.ToolTips.TipClearRail;
import kuuy.addtional.ToolTips.TipClearRailPowered;
import kuuy.addtional.ToolTips.TipTNT;
import kuuy.addtional.Tools.ItemST;
import kuuy.addtional.Tools.Itemdiamondchisel;
import kuuy.addtional.Tools.Itemdiamondfile;
import kuuy.addtional.Tools.Itemdiamondhammer;
import kuuy.addtional.Tools.Itemdiamondsaw;
import kuuy.addtional.Tools.Itemironchisel;
import kuuy.addtional.Tools.Itemironfile;
import kuuy.addtional.Tools.Itemironhammer;
import kuuy.addtional.Tools.Itemironsaw;
import kuuy.addtional.Tools.Itemstonechisel;
import kuuy.addtional.Tools.Itemstonesaw;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "kuuymeta";
	public static final String MODNAME = "VannilaAddtionalBlocks";
	public static final String VERSION = "1.2";
	public static Item Brc;
	public static Main instance;
	public static ItemST STT;
	public static Itemdiamondhammer DHM;
	public static Itemironhammer IHM;
	public static Itemstonechisel STC;
	public static Itemironchisel ITC;
	public static Itemdiamondchisel IDC;
	public static Itemstonesaw ISS;
	public static Itemironsaw IIS;
	public static Itemdiamondsaw IDS;
	public static Itemironfile IIF;
	public static Itemdiamondfile IDF;
	public static Item paw;
	public static Item pawup;
	public static Item pawlight;
	public static Item pawuper;
	public static Item pawglass;
	public static Item metapaw;
	public static Item pawpickaxe;
	public static Block kuytiles;
	public static Block kuytiles2;
	public static Block kuytiles3;
	public static Block kuytiles4;
	public static Block kuytiles5;
	public static Block kuytiles6;
	public static Block kuytiles7;
	public static Block kuytiles8;
	public static Block kuytiles9;
	public static Block kuytiles10;
	public static Block kuytiles11;
	public static Block kuyhopper;
	public static Block ClearRail;
	public static Block ClearRailPowered;
	public static Block SideTNT;
	public static Item kuytab;
	public static ToolMaterial PAW;
	public static CreativeTabs tabkuuy = new Kuuytab(CreativeTabs.getNextID(), "Kuuytab");
	public static CreativeTabs tabkuuyitem = new Kuyitemtab("Kuuyitemtab");
	public static CreativeTabs tabkuuylight = new Kuuylighttab("Kuuylighttab");
	public static CreativeTabs tabkuuynotnormal = new Kuynotnormalblocktab("Kuuynotnormaltab");
	public static ItemStack hammer;
	public static ArrayList<ItemStack> listAllhammers = new ArrayList<ItemStack>();
	public static ItemStack hammerFromFML;
	public static Achievement starpaw;
	public static Achievement starpawup;
	public static AchievementPage vannilaaddtionalblocks;
	public static CraftingRecipes Recipes;

	// EventHanler
	@EventHandler
	public void parInit(FMLPreInitializationEvent event) {
	
		/*
		 * tools hammer.chisel etc....
		 */
		STT = (ItemST) (new ItemST()).setUnlocalizedName("STT").setTextureName("kuuymeta:hammerstone")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(STT, "STT");
		DHM = (Itemdiamondhammer) (new Itemdiamondhammer()).setUnlocalizedName("DHM")
				.setTextureName("kuuymeta:hammerdiamond").setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(DHM, "DHM");
		IHM = (Itemironhammer) (new Itemironhammer()).setUnlocalizedName("IHM").setTextureName("kuuymeta:hammeriron")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(IHM, "IHM");
		IDC = (Itemdiamondchisel) (new Itemdiamondchisel()).setUnlocalizedName("IDC")
				.setTextureName("kuuymeta:chiseldiamond").setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(IDC, "IDC");
		ITC = (Itemironchisel) (new Itemironchisel()).setUnlocalizedName("ITC").setTextureName("kuuymeta:chiseliron")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(ITC, "ITC");
		STC = (Itemstonechisel) (new Itemstonechisel()).setUnlocalizedName("STC").setTextureName("kuuymeta:chiselstone")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(STC, "STC");
		IDS = (Itemdiamondsaw) (new Itemdiamondsaw()).setUnlocalizedName("IDS").setTextureName("kuuymeta:diamondsaw")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(IDS, "IDS");
		IIS = (Itemironsaw) (new Itemironsaw()).setUnlocalizedName("IIS").setTextureName("kuuymeta:ironsaw")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(IIS, "IIS");
		ISS = (Itemstonesaw) (new Itemstonesaw()).setUnlocalizedName("ISS").setTextureName("kuuymeta:stonesaw")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(ISS, "ISS");
		IIF = (Itemironfile) (new Itemironfile()).setUnlocalizedName("IIF").setTextureName("kuuymeta:ironfile")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(IIF, "IIF");
		IDF = (Itemdiamondfile) (new Itemdiamondfile()).setUnlocalizedName("IDF").setTextureName("kuuymeta:diamondfile")
				.setCreativeTab(Main.tabkuuyitem).setFull3D();
		GameRegistry.registerItem(IDF, "IDF");
		PAW = EnumHelper.addToolMaterial("PAW", 3, 3, 50F, 0.5F, 30).setRepairItem(new ItemStack(Main.paw));

		// commentout pawpackaxe WIP
		/*
		 * pawpickaxe = new Pawpickaxe(PAW) .setCreativeTab(Main.tabkuuyitem)
		 * .setUnlocalizedName("pawpickaxe")
		 * .setTextureName("kuuymeta:pawpickaxe");
		 * GameRegistry.registerItem(pawpickaxe, "pawpickaxe");
		 */

		/*
		 * Blocks ENDB
		 */
		kuytiles9 = new ColoredEndb().setBlockName("kuytiles9").setBlockTextureName("kuuymeta:tile9/test9");
		GameRegistry.registerBlock(kuytiles9, Coloreditem.class, "kuytiles9");
		// cubeBlocks
		kuytiles = new Colored().setBlockName("kuytiles").setBlockTextureName("kuuymeta:tile/test");
		GameRegistry.registerBlock(kuytiles, Coloreditem.class, "kuytiles");
		// Bricks
		kuytiles2 = new Colored().setBlockName("kuytiles2").setBlockTextureName("kuuymeta:tile2/test2");
		GameRegistry.registerBlock(kuytiles2, Coloreditem.class, "kuytiles2");
		// cobblestone,Bricks
		kuytiles3 = new Colored().setBlockName("kuytiles3").setBlockTextureName("kuuymeta:tile3/test3");
		GameRegistry.registerBlock(kuytiles3, Coloreditem.class, "kuytiles3");
		// jem
		kuytiles4 = new Colored().setBlockName("kuytiles4").setBlockTextureName("kuuymeta:tile4/test4");
		GameRegistry.registerBlock(kuytiles4, Coloreditem.class, "kuytiles4");
		// lightBlocks
		kuytiles5 = new Coloredlight().setBlockName("kuytiles5").setBlockTextureName("kuuymeta:tile5/test5");
		GameRegistry.registerBlock(kuytiles5, Coloreditem.class, "kuytiles5");
		// oregem
		kuytiles6 = new Colored().setBlockName("kuytiles6").setBlockTextureName("kuuymeta:tile6/test6");
		GameRegistry.registerBlock(kuytiles6, Coloreditem.class, "kuytiles6");
		// glass
		kuytiles7 = new Coloredglass().setBlockName("kuytiles7").setBlockTextureName("kuuymeta:tile7/test7");
		GameRegistry.registerBlock(kuytiles7, Coloreditem.class, "kuytiles7");
		// Frost
		kuytiles8 = new ColoredIce().setBlockName("kuytiles8").setBlockTextureName("kuuymeta:tile8/test8");
		GameRegistry.registerBlock(kuytiles8, Coloreditem.class, "kuytiles8");
		// factoryblock
		kuytiles10 = new ColoredFactory().setBlockName("kuytiles10").setBlockTextureName("kuuymeta:tile10/test10");
		GameRegistry.registerBlock(kuytiles10, Coloreditem.class, "kuytiles10");
		// hopper
		kuyhopper = new Kuyhopper().setBlockName("kuyhopper").setBlockTextureName("kuuymeta:tilehopper/kuyhopper");
		GameRegistry.registerBlock(kuyhopper, "kuyhopper");
		// rail
		ClearRail = new Clearrail().setBlockName("ClearRail").setBlockTextureName("kuuymeta:tilerail/clearrail");
		GameRegistry.registerBlock(ClearRail, TipClearRail.class, "clearrail");
		// railpowered
		ClearRailPowered = new Clearrailpowered().setBlockName("ClearRailPowered")
				.setBlockTextureName("kuuymeta:tilerail/clearrailpowered");
		GameRegistry.registerBlock(ClearRailPowered, TipClearRailPowered.class, "clearrailpowered");
		SideTNT = new ColoredTNT().setBlockName("sidetnt").setBlockTextureName("kuuymeta:tiletnt/sidetnt");
		GameRegistry.registerBlock(SideTNT, TipTNT.class, "SideTNT");
		


		// creativetab icon items
		kuytab = new Item().setUnlocalizedName("kuystab").setTextureName("kuuymeta:kuuystab");
		GameRegistry.registerItem(kuytab, "kuystab");
		Brc = new Item().setUnlocalizedName("Brc").setTextureName("kuuymeta:brc");
		GameRegistry.registerItem(Brc, "Brc");

		/*
		 * Items
		 */
		// colorstones
		paw = new Item().setCreativeTab(Main.tabkuuyitem).setUnlocalizedName("paw").setTextureName("kuuymeta:paw");
		GameRegistry.registerItem(paw, "paw");
		pawup = new Item().setCreativeTab(Main.tabkuuyitem).setUnlocalizedName("pawup")
				.setTextureName("kuuymeta:pawup");
		GameRegistry.registerItem(pawup, "pawup");
		pawlight = new Item().setCreativeTab(Main.tabkuuyitem).setUnlocalizedName("pawlight")
				.setTextureName("kuuymeta:pawlight");
		GameRegistry.registerItem(pawlight, "pawlight");
		pawuper = new Item().setCreativeTab(Main.tabkuuyitem).setUnlocalizedName("pawuper")
				.setTextureName("kuuymeta:pawuper");
		GameRegistry.registerItem(pawuper, "pawuper");
		pawglass = new Item().setCreativeTab(Main.tabkuuyitem).setUnlocalizedName("pawglass")
				.setTextureName("kuuymeta:pawglass");
		GameRegistry.registerItem(pawglass, "pawglass");

		starpaw = new Achievement("", "vannilaaddtionalblocks", 0, 0, Main.paw, null);
		starpawup = new Achievement("", "vannilaaddtionalblocks", 2, 0, Main.pawup, starpaw).setSpecial();

		vannilaaddtionalblocks = new AchievementPage("VannilaPlusBlocks", starpaw, starpawup);
		AchievementPage.registerAchievementPage(vannilaaddtionalblocks);

		FMLCommonHandler.instance().bus().register(new Achievementmeta());

		CraftingRecipes.registerRecipe();
	}

}
