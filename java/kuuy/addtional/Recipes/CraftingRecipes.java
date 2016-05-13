package kuuy.addtional.Recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import kuuy.addtional.Main;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingRecipes {

	public static void registerRecipe () {


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
	OreDictionary.registerOre("stoneCobble", new ItemStack(Main.kuytiles3, 1, 10));
	OreDictionary.registerOre("stoneCobble", new ItemStack(Main.kuytiles3, 1, 11));
	OreDictionary.registerOre("stoneCobble", new ItemStack(Main.kuytiles3, 1, 12));
	OreDictionary.registerOre("stoneCobble", new ItemStack(Main.kuytiles3, 1, 13));
	OreDictionary.registerOre("stoneCobble", new ItemStack(Main.kuytiles3, 1, 14));
	OreDictionary.registerOre("stoneCobble", new ItemStack(Main.kuytiles3, 1, 15));
	OreDictionary.registerOre("cobblestone", new ItemStack(Main.kuytiles3, 1, 10));
	OreDictionary.registerOre("cobblestone", new ItemStack(Main.kuytiles3, 1, 11));
	OreDictionary.registerOre("cobblestone", new ItemStack(Main.kuytiles3, 1, 12));
	OreDictionary.registerOre("cobblestone", new ItemStack(Main.kuytiles3, 1, 13));
	OreDictionary.registerOre("cobblestone", new ItemStack(Main.kuytiles3, 1, 14));
	OreDictionary.registerOre("cobblestone", new ItemStack(Main.kuytiles3, 1, 15));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 1));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 2));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 3));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 4));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 5));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 6));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 7));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 8));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 9));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 10));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 11));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 12));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 13));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 14));
	OreDictionary.registerOre("stoneSmooth", new ItemStack(Main.kuytiles, 1, 15));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 1));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 2));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 3));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 4));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 5));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 6));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 7));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 8));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 9));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 10));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 11));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 12));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 13));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 14));
	OreDictionary.registerOre("stone", new ItemStack(Main.kuytiles, 1, 15));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 0));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 1));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 2));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 3));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 4));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 5));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 6));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 7));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 8));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 9));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 10));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 11));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 12));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 13));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 14));
	OreDictionary.registerOre("stoneBricks", new ItemStack(Main.kuytiles2, 1, 15));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 0));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 1));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 2));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 3));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 4));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 5));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 6));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 7));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 8));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 9));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 10));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 11));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 12));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 13));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 14));
	OreDictionary.registerOre("bricksStone", new ItemStack(Main.kuytiles2, 1, 15));
	//Block Recipes
	//rail
	GameRegistry.addShapelessRecipe(new ItemStack(Main.ClearRail,1),
			new ItemStack(Blocks.rail), new ItemStack(Blocks.glass));
	GameRegistry.addShapelessRecipe(new ItemStack(Main.ClearRailPowered,1),
			new ItemStack(Blocks.rail), new ItemStack(Blocks.glass), new ItemStack(Items.redstone));
	//tnt
	GameRegistry.addRecipe(new ItemStack(Main.SideTNT,1),"ABA","BAB","ABA",'A',Main.paw,'B',Blocks.sand);
	//tile10
	GameRegistry.addShapelessRecipe(new ItemStack(Main.kuytiles10, 5, 0),
			new ItemStack(Items.stick,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Items.iron_ingot,1,OreDictionary.WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(Main.kuytiles10, 5, 1),
			new ItemStack(Main.pawuper), new ItemStack(Items.iron_ingot,1,OreDictionary.WILDCARD_VALUE));
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles10, 1, 2), new Object[]{ "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Main.pawuper,1,0)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles10, 1, 3), new Object[]{ "ABA", "C  ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawup), Character.valueOf('B'), new ItemStack(Main.pawuper,1,0)}));
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles10,2,4),"AB ","   ","   ",'A',Main.paw,'B',Blocks.planks);
	GameRegistry.addRecipe(new ItemStack(Main.kuytiles10,2,5)," AB","   ","   ",'A',Main.paw,'B',Blocks.planks);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles10,2,6),"A  ","B  ","   ",'A',Main.paw,'B',Blocks.planks);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles10,2,7),"A  "," B ","   ",'A',Main.paw,'B',Blocks.planks);
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles10,2,8),"B  ","A  ","   ",'A',Main.paw,'B',Blocks.planks);
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles10, 1, 9), new Object[]{ "ABC", "   ", "   ", Character.valueOf('C'), "chisel", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Blocks.stone)}));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Main.kuytiles10, 1, 10), new Object[]{ "ABC", "   ", "   ", Character.valueOf('C'), "hammer", Character.valueOf('A'), new ItemStack(Main.pawuper), Character.valueOf('B'), new ItemStack(Main.pawuper)}));
    GameRegistry.addShapelessRecipe(new ItemStack(Main.kuytiles10, 1, 11),
			new ItemStack(Blocks.stone_slab), new ItemStack(Blocks.stone_slab));
    GameRegistry.addShapelessRecipe(new ItemStack(Main.kuytiles10, 1, 12),
			new ItemStack(Blocks.obsidian), new ItemStack(Blocks.obsidian));
    GameRegistry.addShapelessRecipe(new ItemStack(Main.kuytiles10, 1, 13),
			new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone));
    GameRegistry.addShapelessRecipe(new ItemStack(Main.kuytiles10, 1, 14),
			new ItemStack(Blocks.sandstone), new ItemStack(Blocks.sandstone));
    GameRegistry.addShapelessRecipe(new ItemStack(Main.kuytiles10, 1, 15),
			new ItemStack(Blocks.planks,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks,1,OreDictionary.WILDCARD_VALUE));

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
	GameRegistry.addRecipe(new ItemStack(Main.kuytiles8,2,0),"AB ","   ","   ",'A',Main.paw,'B',Blocks.ice);
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
    GameRegistry.addRecipe(new ItemStack(Main.kuytiles,2,15),"B  ","   ","  A",'A',Main.paw,'B',Blocks.stone);

}

}
