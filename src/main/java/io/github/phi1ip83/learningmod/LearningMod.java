package io.github.phi1ip83.learningmod;

import io.github.phi1ip83.learningmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LearningMod.MOD_ID)
public class LearningMod {
    public static final String MOD_ID = "learning_mod";

    public LearningMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}
