package com.madebyhq.modarch;

import net.minecraftforge.client.MinecraftForgeClient;
import com.madebyhq.modarch.CommonProxy;

public class ClientProxy extends CommonProxy {
	@ Override
	public void registerRenderers() {
        //MinecraftForgeClient.preloadTexture(ITEMS_PNG);
        MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
}
