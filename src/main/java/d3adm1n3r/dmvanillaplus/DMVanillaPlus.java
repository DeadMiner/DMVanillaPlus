package d3adm1n3r.dmvanillaplus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import d3adm1n3r.dmvanillaplus.init.DMVPblocks;
import d3adm1n3r.dmvanillaplus.init.DMVPitems;
import d3adm1n3r.dmvanillaplus.proxy.CommonProxy;

@Mod (modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class DMVanillaPlus {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		DMVPblocks.init();
		DMVPblocks.register();
		DMVPitems.init();
		DMVPitems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
