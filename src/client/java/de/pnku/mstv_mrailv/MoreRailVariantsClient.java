package de.pnku.mstv_mrailv;

import de.pnku.mstv_mrailv.init.MrailvBlockInit;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;


public class MoreRailVariantsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		String mcVersion = FabricLoader.getInstance().getModContainer("minecraft").get().getMetadata().getVersion().getFriendlyString();
		boolean isLegacy = mcVersion.contains("1.21.4") || mcVersion.contains("1.21.5");
		for (Block railBlock : MrailvBlockInit.more_rail_blocks) {
			if (isLegacy) {legacyAddToRenderLayerMap(railBlock);}
			else {addToRenderLayerMap(railBlock);}
		}
	}

	private void legacyAddToRenderLayerMap(Block block) {
		try {
			Class<?> legacyBlockRenderLayerMap = Class.forName("net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap");
			legacyBlockRenderLayerMap.getMethod("putBlock", Block.class, RenderType.class)
					.invoke(legacyBlockRenderLayerMap.getField("INSTANCE").get(null), block, RenderType.cutout());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addToRenderLayerMap(Block block) {
		try {
			Class<?> blockRenderLayerMap = Class.forName("net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap");
			Class<?> chunkSectionLayerClass = Class.forName("net.minecraft.class_11515");
			blockRenderLayerMap.getMethod("putBlock", Block.class, chunkSectionLayerClass)
					.invoke(null, block, chunkSectionLayerClass.getEnumConstants()[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
