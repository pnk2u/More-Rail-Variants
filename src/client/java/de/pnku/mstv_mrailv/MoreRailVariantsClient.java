package de.pnku.mstv_mrailv;

import de.pnku.mstv_mrailv.init.MrailvBlockInit;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.level.block.Block;


public class MoreRailVariantsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		String mcVersion = FabricLoader.getInstance().getModContainer("minecraft").get().getMetadata().getVersion().getFriendlyString();
		boolean isLegacy = mcVersion.contains("1.21.4") || mcVersion.contains("1.21.5");
		boolean isDev = FabricLoader.getInstance().isDevelopmentEnvironment();
		for (Block railBlock : MrailvBlockInit.more_rail_blocks) {
			if (isLegacy) {legacyAddToRenderLayerMap(railBlock, isDev);}
			else {addToRenderLayerMap(railBlock, isDev);}
		}
	}

	private void legacyAddToRenderLayerMap(Block block, boolean isDev) {
		try {
			Class<?> legacyBlockRenderLayerMap = Class.forName("net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap");
            String renderTypeClassName = isDev ? "net.minecraft.client.renderer.RenderType" : "net.minecraft.class_1921";
            Class<?> renderTypeClass = Class.forName(renderTypeClassName);
            String renderTypeCutoutMethodName = isDev ? "cutout" : "method_23581";
			legacyBlockRenderLayerMap.getMethod("putBlock", Block.class, renderTypeClass)
					.invoke(legacyBlockRenderLayerMap.getField("INSTANCE").get(null), block, renderTypeClass.getMethod(renderTypeCutoutMethodName).invoke(null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addToRenderLayerMap(Block block, boolean isDev) {
		try {
			Class<?> blockRenderLayerMap = Class.forName("net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap");
			String chunkSectionLayerClassName = isDev ? "net.minecraft.client.renderer.chunk.ChunkSectionLayer" : "net.minecraft.class_11515";
			Class<?> chunkSectionLayerClass = Class.forName(chunkSectionLayerClassName);
			blockRenderLayerMap.getMethod("putBlock", Block.class, chunkSectionLayerClass)
					.invoke(null, block, chunkSectionLayerClass.getEnumConstants()[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
