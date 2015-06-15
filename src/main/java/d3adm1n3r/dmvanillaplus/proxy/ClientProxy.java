package d3adm1n3r.dmvanillaplus.proxy;

import d3adm1n3r.dmvanillaplus.init.DMVPblocks;
import d3adm1n3r.dmvanillaplus.init.DMVPitems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		DMVPblocks.registerRenders();
		DMVPitems.registerRenders();
	}
}
