package d3adm1n3r.dmvanillaplus.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import d3adm1n3r.dmvanillaplus.Reference;
import d3adm1n3r.dmvanillaplus.blocks.DMblocks;

public class DMVPblocks {
	
	public static Block sandbrick;
	public static Block sandbrick_wall;
	public static Block sandstone_block;
	public static Block red_sandbrick;
	public static Block red_sandbrick_wall;
	public static Block red_sandstone_block;
	public static Block stone_cracked;
	public static Block stone_mossy;
	public static Block stonebrick_block;
	public static Block stonebrick_block_cracked;
	public static Block stonebrick_block_mossy;
	public static Block stonebrick_carved_cracked;
	public static Block stonebrick_carved_mossy;
	public static Block stonebrick_tile;
	public static Block stonebrick_tile_cracked;
	public static Block stonebrick_tile_mossy;
	public static Block stonebrick_wall;
	public static Block stonebrick_wall_cracked;
	public static Block stonebrick_wall_mossy;
	public static Block sandstone_pillar;
	public static Block red_sandstone_pillar;
	public static Block stonebrick_pillar;
	public static Block stonebrick_pillar_cracked;
	public static Block stonebrick_pillar_mossy;
	
	public static void init()
	{
		sandbrick = new DMblocks(Material.rock).setUnlocalizedName("sandbrick");
		sandbrick_wall = new DMblocks(Material.rock).setUnlocalizedName("sandbrick_wall");
		sandstone_block = new DMblocks(Material.rock).setUnlocalizedName("sandstone_block");
		red_sandbrick = new DMblocks(Material.rock).setUnlocalizedName("red_sandbrick");
		red_sandbrick_wall = new DMblocks(Material.rock).setUnlocalizedName("red_sandbrick_wall");
		red_sandstone_block = new DMblocks(Material.rock).setUnlocalizedName("red_sandstone_block");
		stone_cracked = new DMblocks(Material.rock).setUnlocalizedName("stone_cracked");
		stone_mossy = new DMblocks(Material.rock).setUnlocalizedName("stone_mossy");
		stonebrick_block = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_block");
		stonebrick_block_cracked = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_block_cracked");
		stonebrick_block_mossy = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_block_mossy");
		stonebrick_carved_cracked = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_carved_cracked");
		stonebrick_carved_mossy = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_carved_mossy");
		stonebrick_tile = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_tile");
		stonebrick_tile_cracked = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_tile_cracked");
		stonebrick_tile_mossy = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_tile_mossy");
		stonebrick_wall = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_wall");
		stonebrick_wall_cracked = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_wall_cracked");
		stonebrick_wall_mossy = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_wall_mossy");
		sandstone_pillar = new DMblocks(Material.rock).setUnlocalizedName("sandstone_pillar");
		red_sandstone_pillar = new DMblocks(Material.rock).setUnlocalizedName("red_sandstone_pillar");
		stonebrick_pillar = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_pillar");
		stonebrick_pillar_cracked = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_pillar_cracked");
		stonebrick_pillar_mossy = new DMblocks(Material.rock).setUnlocalizedName("stonebrick_pillar_mossy");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(sandbrick, sandbrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sandbrick_wall, sandbrick_wall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sandstone_block, sandstone_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(red_sandbrick, red_sandbrick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(red_sandbrick_wall, red_sandbrick_wall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(red_sandstone_block, red_sandstone_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stone_cracked, stone_cracked.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stone_mossy, stone_mossy.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_block, stonebrick_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_block_cracked, stonebrick_block_cracked.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_block_mossy, stonebrick_block_mossy.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_carved_cracked, stonebrick_carved_cracked.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_carved_mossy, stonebrick_carved_mossy.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_tile, stonebrick_tile.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_tile_cracked, stonebrick_tile_cracked.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_tile_mossy, stonebrick_tile_mossy.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_wall, stonebrick_wall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_wall_cracked, stonebrick_wall_cracked.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_wall_mossy, stonebrick_wall_mossy.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sandstone_pillar, sandstone_pillar.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(red_sandstone_pillar, red_sandstone_pillar.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_pillar, stonebrick_pillar.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_pillar_cracked, stonebrick_pillar_cracked.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stonebrick_pillar_mossy, stonebrick_pillar_mossy.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(sandbrick);
		registerRender(sandbrick_wall);
		registerRender(sandstone_block);
		registerRender(red_sandbrick);
		registerRender(red_sandbrick_wall);
		registerRender(red_sandstone_block);
		registerRender(stone_cracked);
		registerRender(stone_mossy);
		registerRender(stonebrick_block);
		registerRender(stonebrick_block_cracked);
		registerRender(stonebrick_block_mossy);
		registerRender(stonebrick_carved_cracked);
		registerRender(stonebrick_carved_mossy);
		registerRender(stonebrick_tile);
		registerRender(stonebrick_tile_cracked);
		registerRender(stonebrick_tile_mossy);
		registerRender(stonebrick_wall);
		registerRender(stonebrick_wall_cracked);
		registerRender(stonebrick_wall_mossy);
		registerRender(sandstone_pillar);
		registerRender(red_sandstone_pillar);
		registerRender(stonebrick_pillar);
		registerRender(stonebrick_pillar_cracked);
		registerRender(stonebrick_pillar_mossy);
	}
	
	public static void  registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
