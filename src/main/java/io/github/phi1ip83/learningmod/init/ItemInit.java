package io.github.phi1ip83.learningmod.init;

import io.github.phi1ip83.learningmod.LearningMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final CreativeModeTab TAB_LEARN = new CreativeModeTab(7, "learn") {
        public ItemStack makeIcon() {
            return new ItemStack(Items.STICK);
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", ()-> new Item(new Item.Properties().tab(TAB_LEARN)));
}
