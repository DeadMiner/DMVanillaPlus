package d3adm1n3r.dmvanillaplus.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import d3adm1n3r.dmvanillaplus.Reference;

public class DMVPitems {
	
	public static Item stone_brick;
	public static Item sandstone_brick;
	public static Item red_sandstone_brick;
	
	public static void init() {
		stone_brick = new Item().setUnlocalizedName("stone_brick");
		sandstone_brick = new Item().setUnlocalizedName("sandstone_brick");
		red_sandstone_brick = new Item().setUnlocalizedName("red_sandstone_brick");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(stone_brick, stone_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sandstone_brick, sandstone_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(red_sandstone_brick, red_sandstone_brick.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(stone_brick);
		registerRender(sandstone_brick);
		registerRender(red_sandstone_brick);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
