/*
 * kuuymeta Vannilaaddtionalblocks mod 1.7.10 1.1_a
 */

package kuuy.addtional;
import java.util.ArrayList;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import kuuy.addtional.CreativeTabs.Kuuylighttab;
import kuuy.addtional.CreativeTabs.Kuuytab;
import kuuy.addtional.CreativeTabs.Kuyitemtab;
import kuuy.addtional.Meta.Colored;
import kuuy.addtional.Meta.ColoredEndb;
import kuuy.addtional.Meta.ColoredIce;
import kuuy.addtional.Meta.Coloredglass;
import kuuy.addtional.Meta.Coloreditem;
import kuuy.addtional.Meta.Coloredlight;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "kuuymeta";
	public static final String MODNAME = "VannilaAddtionalBlocks";
	public static final String VERSION = "1.1b";
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
	public static Item kuytab;
	public static ToolMaterial PAW;
	public static CreativeTabs tabkuuy = new Kuuytab("Kuuytab");
	public static CreativeTabs tabkuuyitem = new Kuyitemtab("Kuuyitemtab");
	public static CreativeTabs tabkuuylight = new Kuuylighttab("Kuuylighttab");
	public static ItemStack hammer;
	public static ArrayList<ItemStack> listAllhammers = new ArrayList<ItemStack>();
	public static ItemStack hammerFromFML;

//EventHanler
@EventHandler
public void parInit(FMLPreInitializationEvent event)
{
	/*
	 * tools hammer.chisel etc....
	 */
	STT = (ItemST)(new ItemST()).setUnlocalizedName("STT").setTextureName("kuuymeta:hammerstone").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(STT, "STT");
	DHM = (Itemdiamondhammer)(new Itemdiamondhammer()).setUnlocalizedName("DHM").setTextureName("kuuymeta:hammerdiamond").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(DHM, "DHM");
    IHM = (Itemironhammer)(new Itemironhammer()).setUnlocalizedName("IHM").setTextureName("kuuymeta:hammeriron").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(IHM, "IHM");
	IDC = (Itemdiamondchisel)(new Itemdiamondchisel()).setUnlocalizedName("IDC").setTextureName("kuuymeta:chiseldiamond").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(IDC, "IDC");
	ITC = (Itemironchisel)(new Itemironchisel()).setUnlocalizedName("ITC").setTextureName("kuuymeta:chiseliron").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(ITC, "ITC");
	STC = (Itemstonechisel)(new Itemstonechisel()).setUnlocalizedName("STC").setTextureName("kuuymeta:chiselstone").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(STC, "STC");
	IDS = (Itemdiamondsaw)(new Itemdiamondsaw()).setUnlocalizedName("IDS").setTextureName("kuuymeta:diamondsaw").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(IDS, "IDS");
	IIS = (Itemironsaw)(new Itemironsaw()).setUnlocalizedName("IIS").setTextureName("kuuymeta:ironsaw").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(IIS, "IIS");
	ISS = (Itemstonesaw)(new Itemstonesaw()).setUnlocalizedName("ISS").setTextureName("kuuymeta:stonesaw").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(ISS, "ISS");
	IIF = (Itemironfile)(new Itemironfile()).setUnlocalizedName("IIF").setTextureName("kuuymeta:ironfile").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(IIF, "IIF");
	IDF = (Itemdiamondfile)(new Itemdiamondfile()).setUnlocalizedName("IDF").setTextureName("kuuymeta:diamondfile").setCreativeTab(Main.tabkuuyitem).setFull3D();
	GameRegistry.registerItem(IDF, "IDF");
	PAW = EnumHelper.addToolMaterial("PAW", 3, 3, 50F, 0.5F, 30)
	.setRepairItem(new ItemStack(Main.paw));

	//commentout pawpackaxe WIP
    /*pawpickaxe = new Pawpickaxe(PAW)
    .setCreativeTab(Main.tabkuuyitem)
    .setUnlocalizedName("pawpickaxe")
    .setTextureName("kuuymeta:pawpickaxe");
    GameRegistry.registerItem(pawpickaxe, "pawpickaxe");*/

	/*
	 * Blocks
	 * ENDB
	 */
	kuytiles9 = new ColoredEndb()
	.setBlockName("kuytiles9")
	.setBlockTextureName("kuuymeta:tile9/test9");
	GameRegistry.registerBlock(kuytiles9, Coloreditem.class, "kuytiles9");
	//cubeBlocks
	kuytiles = new Colored()
	.setBlockName("kuytiles")
	.setBlockTextureName("kuuymeta:tile/test");
	GameRegistry.registerBlock(kuytiles, Coloreditem.class, "kuytiles");
	 //Bricks
	kuytiles2 = new Colored()
	.setBlockName("kuytiles2")
	.setBlockTextureName("kuuymeta:tile2/test2");
	GameRegistry.registerBlock(kuytiles2, Coloreditem.class, "kuytiles2");
	//cobblestone,Bricks
	kuytiles3 = new Colored()
	.setBlockName("kuytiles3")
	.setBlockTextureName("kuuymeta:tile3/test3");
	GameRegistry.registerBlock(kuytiles3, Coloreditem.class, "kuytiles3");
    //jem
	kuytiles4 = new Colored()
	.setBlockName("kuytiles4")
	.setBlockTextureName("kuuymeta:tile4/test4");
	GameRegistry.registerBlock(kuytiles4, Coloreditem.class, "kuytiles4");
	//lightBlocks
	kuytiles5 = new Coloredlight()
	.setBlockName("kuytiles5")
	.setBlockTextureName("kuuymeta:tile5/test5");
	GameRegistry.registerBlock(kuytiles5, Coloreditem.class, "kuytiles5");
	//oregem
	kuytiles6 = new Colored()
	.setBlockName("kuytiles6")
	.setBlockTextureName("kuuymeta:tile6/test6");
	GameRegistry.registerBlock(kuytiles6, Coloreditem.class, "kuytiles6");
	//glass
	kuytiles7 = new Coloredglass()
	.setBlockName("kuytiles7")
	.setBlockTextureName("kuuymeta:tile7/test7");
	GameRegistry.registerBlock(kuytiles7, Coloreditem.class, "kuytiles7");
    //Frost
	kuytiles8 = new ColoredIce()
	.setBlockName("kuytiles8")
	.setBlockTextureName("kuuymeta:tile8/test8");
	GameRegistry.registerBlock(kuytiles8, Coloreditem.class, "kuytiles8");

	//creativetab icon items
     kuytab = new Item()
	.setUnlocalizedName("kuystab")
	.setTextureName("kuuymeta:kuuystab");
	GameRegistry.registerItem(kuytab, "kuystab");
	Brc = new Item()
	.setUnlocalizedName("Brc")
	.setTextureName("kuuymeta:brc");
	GameRegistry.registerItem(Brc, "Brc");

	/*
	 * Items
	 */
	//colorstones
	paw = new Item()
	.setCreativeTab(Main.tabkuuyitem)
	.setUnlocalizedName("paw")
	.setTextureName("kuuymeta:paw");
	GameRegistry.registerItem(paw, "paw");
	pawup = new Item()
	.setCreativeTab(Main.tabkuuyitem)
	.setUnlocalizedName("pawup")
	.setTextureName("kuuymeta:pawup");
	GameRegistry.registerItem(pawup, "pawup");
	pawlight = new Item()
	.setCreativeTab(Main.tabkuuyitem)
	.setUnlocalizedName("pawlight")
	.setTextureName("kuuymeta:pawlight");
	GameRegistry.registerItem(pawlight, "pawlight");
	pawuper = new Item()
	.setCreativeTab(Main.tabkuuyitem)
	.setUnlocalizedName("pawuper")
	.setTextureName("kuuymeta:pawuper");
	GameRegistry.registerItem(pawuper, "pawuper");
	pawglass = new Item()
	.setCreativeTab(Main.tabkuuyitem)
	.setUnlocalizedName("pawglass")
	.setTextureName("kuuymeta:pawglass");
	GameRegistry.registerItem(pawglass, "pawglass");

	/*
	 * Recipes
	 */
    //tool recipes
	GameRegistry.addRecipe(new ItemStack(Main.STT),
		    "FFF",
		    "FFF",
		    "TXT",
		    'F',Blocks.cobblestone,
		    'T',Main.paw,
		    'X',Items.stick);
	GameRegistry.addRecipe(new ItemStack(Main.IHM),
	        "FFF",
	        "FFF",
	        "TXT",
	        'F',Items.iron_ingot,
	        'T',Main.paw,
	        'X',Items.stick);
	GameRegistry.addRecipe(new ItemStack(Main.DHM),
	        "FFF",
	        "FFF",
	        "TXT",
	        'F',Items.diamond,
	        'T',Main.paw,
	        'X',Items.stick);
	GameRegistry.addRecipe(new ItemStack(Main.STC),
	        " TF",
	        " FT",
	        "X  ",
	        'F',Blocks.cobblestone,
	        'T',Main.paw,
	        'X',Items.stick);
	GameRegistry.addRecipe(new ItemStack(Main.ITC),
	        " TF",
	        " FT",
	        "X  ",
	        'F',Items.iron_ingot,
	        'T',Main.paw,
	        'X',Items.stick);
	GameRegistry.addRecipe(new ItemStack(Main.IDC),
	        " TF",
	        " FT",
	        "X  ",
	        'F',Items.diamond,
	        'T',Main.paw,
	        'X',Items.stick);
	GameRegistry.addRecipe(new ItemStack(Main.pawpickaxe),
	        "FFF",
	        " X ",
	        " X ",
	        'F',Main.paw,
	        'X',Items.stick);
    //Item Recipes
	GameRegistry.addShapelessRecipe(new ItemStack(Main.paw,64),
			new ItemStack(Items.redstone), new ItemStack(Items.dye,1,OreDictionary.WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(Main.pawup,64),
			new ItemStack(Items.redstone), new ItemStack(Items.dye,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Items.sugar));
	GameRegistry.addShapelessRecipe(new ItemStack(Main.pawlight,64),
			new ItemStack(Items.redstone), new ItemStack(Items.dye,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Items.glowstone_dust));
	GameRegistry.addShapelessRecipe(new ItemStack(Main.pawuper,64),
			new ItemStack(Items.redstone), new ItemStack(Items.dye,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Items.iron_ingot));
	GameRegistry.addShapelessRecipe(new ItemStack(Main.pawglass,64),
			new ItemStack(Items.redstone), new ItemStack(Items.dye,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Items.coal,1,OreDictionary.WILDCARD_VALUE));
	 //Settings Oredictionary
	OreDictionary.registerOre("hammer", new ItemStack(Main.STT, 1, 32767));
	OreDictionary.registerOre("hammer", new ItemStack(Main.IHM, 1, 32767));
	OreDictionary.registerOre("hammer", new ItemStack(Main.DHM, 1, 32767));
	OreDictionary.registerOre("chisel", new ItemStack(Main.IDC, 1, 32767));
	OreDictionary.registerOre("chisel", new ItemStack(Main.ITC, 1, 32767));
	OreDictionary.registerOre("chisel", new ItemStack(Main.STC, 1, 32767));
	OreDictionary.registerOre("file", new ItemStack(Main.IIF, 1, 32767));
	OreDictionary.registerOre("file", new ItemStack(Main.IDF, 1, 32767));
	OreDictionary.registerOre("saw", new ItemStack(Main.ISS, 1, 32767));
	OreDictionary.registerOre("saw", new ItemStack(Main.IIS, 1, 32767));
	OreDictionary.registerOre("saw", new ItemStack(Main.IDS, 1, 32767));
	//Block Recipes
	//tile9
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 0), new Object[]{ "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 1), new Object[]{ "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 2), new Object[]{ "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 3), new Object[]{ " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 4), new Object[]{ "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 5), new Object[]{ "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 6), new Object[]{ "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 7), new Object[]{ "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 8), new Object[]{ "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 9), new Object[]{ "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 10), new Object[]{ "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 11), new Object[]{ "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 12), new Object[]{ "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 13), new Object[]{ "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 14), new Object[]{ "A  ", "  C", "  B", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles9, 2, 15), new Object[]{ "B  ", "  C", "  A", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Blocks.stained_hardened_clay,1,0)}));
	//tile8
	GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,0),"AB ","   ","   ",'A',Main.paw,'B',Blocks.stained_hardened_clay);
	GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,1)," AB","   ","   ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,2),"A  ","B  ","   ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,3),"A  "," B ","   ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,4),"B  ","A  ","   ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,5),"A  ","   ","B  ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,6),"A  "," B ","   ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,7),"B  "," A ","   ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,8),"A  ","  B","   ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,9),"B  ","  A","   ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,10),"A  ","   "," B ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,11),"B  ","   "," A ",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,12),"A  ","   ","  B",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,13),"B  ","   ","  A",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,14),"   ","A  ","  B",'A',Main.paw,'B',Blocks.ice);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,15),"B  ","   ","  A",'A',Main.paw,'B',Blocks.ice);
	//tile7
	GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,0),"AB ","   ","   ",'A',Main.pawglass,'B',Blocks.sand);
	GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,1)," AB","   ","   ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,2),"A  ","B  ","   ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,3),"A  "," B ","   ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,4),"B  ","A  ","   ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,5),"A  ","   ","B  ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,6),"A  "," B ","   ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,7),"B  "," A ","   ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,8),"A  ","  B","   ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,9),"B  ","  A","   ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,10),"A  ","   "," B ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,11),"B  ","   "," A ",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,12),"A  ","   ","  B",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,13),"B  ","   ","  A",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,14),"   ","A  ","  B",'A',Main.pawglass,'B',Blocks.sand);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles7,2,15),"B  ","   ","  A",'A',Main.pawglass,'B',Blocks.sand);
	//tile6
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 0), new Object[]{ "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 1), new Object[]{ "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 2), new Object[]{ "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 3), new Object[]{ " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 4), new Object[]{ "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 5), new Object[]{ "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 6), new Object[]{ "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 7), new Object[]{ "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 8), new Object[]{ "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 9), new Object[]{ "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 10), new Object[]{ "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 11), new Object[]{ "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 12), new Object[]{ "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 13), new Object[]{ "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 14), new Object[]{ "A  ", "  C", "  B", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles6, 2, 15), new Object[]{ "B  ", "  C", "  A", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    //tile5
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,0),"AB ","   ","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,1),"A B","   ","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,2)," AB","   ","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,3),"A  ","B  ","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,4),"B  ","A  ","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,5),"A  ","   ","B  ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,6),"A  "," B ","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,7),"B  "," A ","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,8),"A  ","  B","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,9),"B  ","  A","   ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,10),"A  ","   "," B ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,11),"B  ","   "," A ",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,12),"A  ","   ","  B",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,13),"B  ","   ","  A",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,14),"   ","A  ","  B",'A',Main.pawlight,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles5,2,15),"B  ","   ","  A",'A',Main.pawlight,'B',Blocks.stone);
	//tile4
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 0), new Object[]{ "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 1), new Object[]{ "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 2), new Object[]{ "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 3), new Object[]{ " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 4), new Object[]{ "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 5), new Object[]{ "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 6), new Object[]{ "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 7), new Object[]{ "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 8), new Object[]{ "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 9), new Object[]{ "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 10), new Object[]{ "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 11), new Object[]{ "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 12), new Object[]{ "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 13), new Object[]{ "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 14), new Object[]{ "A  ", "  C", "  B", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles4, 2, 15), new Object[]{ "B  ", "  C", "  A", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.dirt)}));
    //tile3
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 0), new Object[]{ "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 1), new Object[]{ "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 2), new Object[]{ "AB ", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 3), new Object[]{ " AB", " C ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 4), new Object[]{ "AC ", "B  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 5), new Object[]{ "BC ", "A  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 6), new Object[]{ "AC ", "   ", "B  ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 7), new Object[]{ "BC ", "   ", "A  ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 8), new Object[]{ "A  ", " BC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 9), new Object[]{ "B  ", " AC", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 10), new Object[]{ "A  ", "   ", "CB ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 11), new Object[]{ "B  ", "   ", "CA ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 12), new Object[]{ "A  ", " CB", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 13), new Object[]{ "B  ", " CA", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 14), new Object[]{ "A  ", "  C", "  B", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles3, 2, 15), new Object[]{ "B  ", "  C", "  A", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stonebrick)}));
    //tile2
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 0), new Object[]{ "ABC", "   ", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 1), new Object[]{ "ABA", "C  ", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 2), new Object[]{ "AB ", "C  ", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 3), new Object[]{ " AB", " C ", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 4), new Object[]{ "AC ", "B  ", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 5), new Object[]{ "BC ", "A  ", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 6), new Object[]{ "AC ", "   ", "B  ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 7), new Object[]{ "BC ", "   ", "A  ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 8), new Object[]{ "A  ", " BC", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 9), new Object[]{ "B  ", " AC", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 10), new Object[]{ "A  ", "   ", "CB ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 11), new Object[]{ "B  ", "   ", "CA ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 12), new Object[]{ "A  ", " CB", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 13), new Object[]{ "B  ", " CA", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 14), new Object[]{ "A  ", "  C", "  B", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles2, 2, 15), new Object[]{ "B  ", "  C", "  A", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.paw), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    //tile0
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,0),"AB ","   ","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,1),"A B","   ","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,2)," AB","   ","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,3),"A  ","B  ","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,4),"B  ","A  ","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,5),"A  ","   ","B  ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,6),"A  "," B ","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,7),"B  "," A ","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,8),"A  ","  B","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,9),"B  ","  A","   ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,10),"A  ","   "," B ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,11),"B  ","   "," A ",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,12),"A  ","   ","  B",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,13),"B  ","   ","  A",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,14),"   ","A  ","  B",'A',Main.paw,'B',Blocks.stone);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,15),"B  ","   ","  A",'A',Main.paw,'B',Blocks.stone);}
}
