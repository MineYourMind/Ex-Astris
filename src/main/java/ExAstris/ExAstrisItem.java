package ExAstris;

import cpw.mods.fml.common.registry.GameRegistry;
import ExAstris.Data.ItemData;
import ExAstris.Data.ModData;
import ExAstris.Item.ItemDollThaumic;
import ExAstris.Item.ItemHammerRF;
import ExAstris.Item.ItemHammerThaumium;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import redstonearsenal.item.RAItems;

public class ExAstrisItem {
	public static Item DollThaumic;
	public static Item HammerThaumium;
	public static Item HammerRF;
	
	public static void registerItems()
	{
		DollThaumic = new ItemDollThaumic();
		GameRegistry.registerItem(DollThaumic, ItemData.THAUMIC_DOLL_UNLOCALIZED_NAME);
		
		HammerThaumium = new ItemHammerThaumium();
		GameRegistry.registerItem(HammerThaumium, ItemData.HAMMER_THAUMIUM_UNLOCALIZED_NAME);
		
		HammerRF = new ItemHammerRF();
		GameRegistry.registerItem(HammerRF, ItemData.HAMMER_RF_UNLOCALIZED_NAME);
		
		//GameRegistry.addRecipe(new ShapedOreRecipe(HammerRF, new Object[] { " a ", " ba", "b  ", Character.valueOf('a'), RAItems.ingotElectrumFlux, Character.valueOf('b'), RAItems.rodObsidianFlux }));
	}
}
