package com.zundrel.currency.util;

import com.zundrel.currency.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, com.zundrel.currency.currency.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, com.zundrel.currency.currency.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> TWENTY_DOLLAR_BILL = ITEMS.register("twenty_dollar_bill", ItemBase::new);
    public static final RegistryObject<Item> TEN_DOLLAR_BILL = ITEMS.register("ten_dollar_bill", ItemBase::new);
    public static final RegistryObject<Item> QUARTER = ITEMS.register("quarter", ItemBase::new);
    public static final RegistryObject<Item> PENNY = ITEMS.register("penny", ItemBase::new);
    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel", ItemBase::new);
    public static final RegistryObject<Item> HUNDRED_DOLLAR_BILL = ITEMS.register("hundred_dollar_bill", ItemBase::new);
    public static final RegistryObject<Item> FIVE_DOLLAR_BILL = ITEMS.register("five_dollar_bill", ItemBase::new);
    public static final RegistryObject<Item> FIFTY_DOLLAR_BILL = ITEMS.register("fifty_dollar_bill", ItemBase::new);
    public static final RegistryObject<Item> DIME = ITEMS.register("dime", ItemBase::new);
    public static final RegistryObject<Item> DOLLAR_BILL = ITEMS.register("dollar_bill", ItemBase::new);

    //Blocks
}