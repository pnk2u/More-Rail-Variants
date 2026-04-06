package de.pnku.mstv_mrailv.init.loot;

import de.pnku.mstv_mrailv.MoreRailVariants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

public class MrailvLootConditions {

    public static void registerMrailvLootConditions() {
        Registry.register(BuiltInRegistries.LOOT_CONDITION_TYPE, MoreRailVariants.asId("is_mod_loaded"), IsModLoadedPredicate.CODEC);
    }
}
