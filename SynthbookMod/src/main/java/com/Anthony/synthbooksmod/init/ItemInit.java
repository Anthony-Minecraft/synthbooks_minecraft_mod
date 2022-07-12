package com.Anthony.synthbooksmod.init;

import com.Anthony.synthbooksmod.SynthbookMod;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			SynthbookMod.MOD_ID);
	// Begin items
	public static final RegistryObject<Item> BERRY_SKIN = register("berry_skin",
			() -> new Item(new Item.Properties()
					.tab(SynthbookMod.SYNTHBOOK_TAB)
					));
	
	public static final RegistryObject<Item> BERRY_OIL = register("berry_oil",
			() -> new Item(new Item.Properties()
					.tab(SynthbookMod.SYNTHBOOK_TAB)
					));
	
	public static final RegistryObject<Item> TREATED_BERRY_SKIN = register("treated_berry_skin",
			() -> new Item(new Item.Properties()
					.tab(SynthbookMod.SYNTHBOOK_TAB)
					));
	
	public static final RegistryObject<Item> BERRY_PRESS_USED = register("berry_press_used",
			() -> new Item(new Item.Properties()
					.tab(SynthbookMod.SYNTHBOOK_TAB)
					));
	
	public static final RegistryObject<Item> BERRY_PRESS = register("berry_press",
			() -> new Item(new Item.Properties()
					.tab(SynthbookMod.SYNTHBOOK_TAB)
					.craftRemainder(BERRY_PRESS_USED.get())
					));
	
	public static final RegistryObject<Item> BERRY_PRESS_RECYCLED = register("berry_press_recycled",
			() -> new Item(new Item.Properties()
					.tab(SynthbookMod.SYNTHBOOK_TAB)
					.craftRemainder(BERRY_PRESS_USED.get())
					));
	
	public static final RegistryObject<Item> BERRY_LEATHER = register("berry_leather",
			() -> new Item(new Item.Properties()
					.tab(SynthbookMod.SYNTHBOOK_TAB)
					));
	
	public static final RegistryObject<Item> OIL = register("oil",
			() -> new Item(new Item.Properties()
					.tab(SynthbookMod.SYNTHBOOK_TAB)
					));
	// end items
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name,  item);
	}
}
