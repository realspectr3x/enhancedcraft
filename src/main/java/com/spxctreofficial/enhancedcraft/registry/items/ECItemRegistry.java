package com.spxctreofficial.enhancedcraft.registry.items;

import com.spxctreofficial.enhancedcraft.EnhancedCraft;
import com.spxctreofficial.enhancedcraft.registry.armor.CustomArmorMaterials;
import com.spxctreofficial.enhancedcraft.registry.blocks.ECBlockRegistry;
import com.spxctreofficial.enhancedcraft.registry.items.foodstuffs.GoldenHead;
import com.spxctreofficial.enhancedcraft.registry.items.foodstuffs.PrimordialCatalyst;
import com.spxctreofficial.enhancedcraft.registry.items.foodstuffs.TomYumStew;
import com.spxctreofficial.enhancedcraft.registry.items.misc.*;
import com.spxctreofficial.enhancedcraft.registry.items.tools.*;
import com.spxctreofficial.enhancedcraft.registry.sounds.ECSoundRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ECItemRegistry {
	// Item Definitions
	public static final Item ETHERIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.EPIC));
	public static final Item ETHERIUM_ORE_ITEM = new BlockItem(ECBlockRegistry.ETHERIUM_ORE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Item ETHERIUM_BLOCK_ITEM = new BlockItem(ECBlockRegistry.ETHERIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Item ETHERIUM_HELMET = new ArmorItem(CustomArmorMaterials.ETHERIUM_ARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item ETHERIUM_CHESTPLATE = new ArmorItem(CustomArmorMaterials.ETHERIUM_ARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item ETHERIUM_LEGGINGS = new ArmorItem(CustomArmorMaterials.ETHERIUM_ARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item ETHERIUM_BOOTS = new ArmorItem(CustomArmorMaterials.ETHERIUM_ARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item ETHERIUM_SWORD = new EtheriumSwordItem(new EtheriumToolMaterial());
	public static final Item ETHERIUM_PICKAXE = new EtheriumPickaxeItem(new EtheriumToolMaterial());
	public static final Item ETHERIUM_AXE = new EtheriumAxeItem(new EtheriumToolMaterial());
	public static final Item ETHERIUM_SHOVEL = new EtheriumShovelItem(new EtheriumToolMaterial());
	public static final Item ETHERIUM_HOE = new EtheriumHoeItem(new EtheriumToolMaterial());
	public static final Item ETHERIUM_GODSLAYER_PERK = new EtheriumGodslayerPerk();

	public static final Item OBSIDIAN_SWORD = new ObsidianSwordItem(new ObsidianToolMaterial());
	public static final Item OBSIDIAN_PICKAXE = new ObsidianPickaxeItem(new ObsidianToolMaterial());
	public static final Item OBSIDIAN_AXE = new ObsidianAxeItem(new ObsidianToolMaterial());
	public static final Item OBSIDIAN_SHOVEL = new ObsidianShovelItem(new ObsidianToolMaterial());
	public static final Item OBSIDIAN_HOE = new ObsidianHoeItem(new ObsidianToolMaterial());

	public static final Item GIANT_SWORD = new GiantSwordItem(new GiantToolMaterial());

	public static final Item GEMSTONE_BLOCK_ITEM = new BlockItem(ECBlockRegistry.GEMSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Item GEMSTONE_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item GEMSTONE_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder().hunger(3).saturationModifier(9.6f).alwaysEdible()
					.statusEffect((new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 20, 1)), 1f)
					.statusEffect((new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 30, 0)), 1f)
					.statusEffect((new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,20 * 30, 0)), 1f)
					.build()));
	public static final Item GEMFUEL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

	public static final Item PRIMORDIAL_CATALYST = new PrimordialCatalyst();
	public static final Item TOM_YUM_STEW = new TomYumStew();
	public static final Item GOLDEN_HEAD = new GoldenHead();

	public static final Item SWORD_OF_THE_NIGHT = new SwordOfTheNight(new SwordOfTheNightToolMaterial());

	public static final Item QUICK_EQUIP_KIT = new QuickEquipKit();

	public static final Item AECORON = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item AECORON_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item AECORON_HELMET = new ArmorItem(CustomArmorMaterials.AECORON_ARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item AECORON_CHESTPLATE = new ArmorItem(CustomArmorMaterials.AECORON_ARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item AECORON_LEGGINGS = new ArmorItem(CustomArmorMaterials.AECORON_ARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item AECORON_BOOTS = new ArmorItem(CustomArmorMaterials.AECORON_ARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item AECORON_PICKAXE =  new AecoronPickaxeItem(new AecoronToolMaterial());
	public static final Item AECORON_AXE =  new AecoronAxeItem(new AecoronToolMaterial());
	public static final Item AECORON_SHOVEL =  new AecoronShovelItem(new AecoronToolAlternateMaterial());
	public static final Item AECORON_HOE =  new AecoronHoeItem(new AecoronToolMaterial());
	public static final Item SHATTERED_TRIDENT_MOLD = new TridentMolds.TridentMoldShattered();
	public static final Item DAMAGED_TRIDENT_MOLD = new TridentMolds.TridentMoldDamaged();
	public static final Item TRIDENT_MOLD = new TridentMolds.TridentMold();

	public static final Item BRONZE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item BRONZE_ORE_ITEM = new BlockItem(ECBlockRegistry.BRONZE_ORE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Item BRONZE_BLOCK_ITEM = new BlockItem(ECBlockRegistry.BRONZE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Item BRONZE_HELMET = new ArmorItem(CustomArmorMaterials.BRONZE_ARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item BRONZE_CHESTPLATE = new ArmorItem(CustomArmorMaterials.BRONZE_ARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item BRONZE_LEGGINGS = new ArmorItem(CustomArmorMaterials.BRONZE_ARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item BRONZE_BOOTS = new ArmorItem(CustomArmorMaterials.BRONZE_ARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item BRONZE_SWORD = new BronzeSwordItem(new BronzeToolMaterial());
	public static final Item BRONZE_PICKAXE = new BronzePickaxeItem(new BronzeToolMaterial());
	public static final Item BRONZE_AXE = new BronzeAxeItem(new BronzeToolAlternateMaterial());
	public static final Item BRONZE_SHOVEL = new BronzeShovelItem(new BronzeToolMaterial());
	public static final Item BRONZE_HOE = new BronzeHoeItem(new BronzeToolAlternateMaterial());

	public static final Item METAL_ALLOY = new Item(new Item.Settings().group(ItemGroup.MATERIALS).rarity(Rarity.UNCOMMON));
	public static final Item ALLOY_HELMET = new ArmorItem(CustomArmorMaterials.ALLOY_ARMOR, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item ALLOY_CHESTPLATE = new ArmorItem(CustomArmorMaterials.ALLOY_ARMOR, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item ALLOY_LEGGINGS = new ArmorItem(CustomArmorMaterials.ALLOY_ARMOR, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item ALLOY_BOOTS = new ArmorItem(CustomArmorMaterials.ALLOY_ARMOR, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item ALLOY_SWORD = new AlloySwordItem(new AlloySwordMaterial());
	public static final Item ALLOY_PICKAXE = new AlloyPickaxeItem(new AlloyToolAlternateMaterial());
	public static final Item ALLOY_AXE = new AlloyAxeItem(new AlloyToolMaterial());
	public static final Item ALLOY_SHOVEL = new AlloyShovelItem(new AlloyToolMaterial());
	public static final Item ALLOY_HOE = new AlloyHoeItem(new AlloyToolMaterial());

	public static final Item NETHERRACK_SWORD = new NetherrackSwordItem(new NetherrackToolMaterial());
	public static final Item NETHERRACK_PICKAXE = new NetherrackPickaxeItem(new NetherrackToolMaterial());
	public static final Item NETHERRACK_AXE = new NetherrackAxeItem(new NetherrackToolAlternateMaterial());
	public static final Item NETHERRACK_SHOVEL = new NetherrackShovelItem(new NetherrackToolAlternateMaterial());
	public static final Item NETHERRACK_HOE = new NetherrackHoeItem(new NetherrackToolAlternateMaterial());

	public static final Item SOAKED_HANDS_MUSIC_DISC = new SoakedHandsMusicDisc(0, ECSoundRegistry.SOAKED_HANDS_SOUND_EVENT);
	public static final Item YEAY = new Yeay();

	public static final Item OTHERSTONE_BLOCK_ITEM = new BlockItem(ECBlockRegistry.OTHERSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Item EARTHSTONE_BLOCK_ITEM = new BlockItem(ECBlockRegistry.EARTHSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

	public static final Item COBALT_ORE_ITEM = new BlockItem(ECBlockRegistry.COBALT_ORE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

	public static final Item FORTISTEEL_EARTHSTONE_ITEM = new BlockItem(ECBlockRegistry.FORTISTEEL_EARTHSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Item FORTISTEEL_OTHERSTONE_ITEM = new BlockItem(ECBlockRegistry.FORTISTEEL_OTHERSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

	public static final Item PURIGOLD_EARTHSTONE_ITEM = new BlockItem(ECBlockRegistry.PURIGOLD_EARTHSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
	public static final Item PURIGOLD_OTHERSTONE_ITEM = new BlockItem(ECBlockRegistry.PURIGOLD_OTHERSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

	public static final Item SMART_PEARL = new SmartPearlItem();
	public static final Item FIREBALL = new FireballItem();
	public static final Item GAY_FIREBALL = new GayFireballItem();
	public static final Item TROLL_TNT_BLOCK_ITEM = new BlockItem(ECBlockRegistry.TROLL_TNT_BLOCK, new Item.Settings());

	// Item Registry
	public static void register() {

		// Item Registry
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium"), ETHERIUM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_ore"), ETHERIUM_ORE_ITEM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_block"), ETHERIUM_BLOCK_ITEM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_helmet"), ETHERIUM_HELMET);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_chestplate"), ETHERIUM_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_leggings"), ETHERIUM_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_boots"), ETHERIUM_BOOTS);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_sword"), ETHERIUM_SWORD);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_pickaxe"), ETHERIUM_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_axe"), ETHERIUM_AXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_shovel"), ETHERIUM_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_hoe"), ETHERIUM_HOE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_godslayer_perk"), ETHERIUM_GODSLAYER_PERK);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_sword"), OBSIDIAN_SWORD);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_axe"), OBSIDIAN_AXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_shovel"), OBSIDIAN_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_hoe"), OBSIDIAN_HOE);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "giant_sword"), GIANT_SWORD);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "gemstone"), GEMSTONE_BLOCK_ITEM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "gemstone_shard"), GEMSTONE_SHARD);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "gemfuel"), GEMFUEL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "gemstone_apple"), GEMSTONE_APPLE);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "primordial_catalyst"), PRIMORDIAL_CATALYST);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "tom_yum_stew"), TOM_YUM_STEW);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "golden_head"), GOLDEN_HEAD);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "sword_of_the_night"), SWORD_OF_THE_NIGHT);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "quick_equip_kit"), QUICK_EQUIP_KIT);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron"), AECORON);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_ingot"), AECORON_INGOT);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_helmet"), AECORON_HELMET);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_chestplate"), AECORON_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_leggings"), AECORON_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_boots"), AECORON_BOOTS);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_pickaxe"), AECORON_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_axe"), AECORON_AXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_shovel"), AECORON_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "aecoron_hoe"), AECORON_HOE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "trident_mold"), TRIDENT_MOLD);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "trident_mold_damaged"), DAMAGED_TRIDENT_MOLD);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "trident_mold_shattered"), SHATTERED_TRIDENT_MOLD);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_ingot"), BRONZE_INGOT);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_ore"), BRONZE_ORE_ITEM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_block"), BRONZE_BLOCK_ITEM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_helmet"), BRONZE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_chestplate"), BRONZE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_leggings"), BRONZE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_boots"), BRONZE_BOOTS);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_sword"), BRONZE_SWORD);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_pickaxe"), BRONZE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_axe"), BRONZE_AXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_shovel"), BRONZE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_hoe"), BRONZE_HOE);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "metal_alloy"), METAL_ALLOY);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_helmet"), ALLOY_HELMET);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_chestplate"), ALLOY_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_leggings"), ALLOY_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_boots"), ALLOY_BOOTS);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_sword"), ALLOY_SWORD);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_pickaxe"), ALLOY_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_axe"), ALLOY_AXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_shovel"), ALLOY_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_hoe"), ALLOY_HOE);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "netherrack_sword"), NETHERRACK_SWORD);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "netherrack_pickaxe"), NETHERRACK_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "netherrack_axe"), NETHERRACK_AXE);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "netherrack_shovel"), NETHERRACK_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "netherrack_hoe"), NETHERRACK_HOE);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "music_disc_soaked_hands"), SOAKED_HANDS_MUSIC_DISC);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "yeay"), YEAY);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "otherstone"), OTHERSTONE_BLOCK_ITEM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "earthstone"), EARTHSTONE_BLOCK_ITEM);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "cobalt_ore"), COBALT_ORE_ITEM);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "fortisteel_ore_earthstone"), FORTISTEEL_EARTHSTONE_ITEM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "fortisteel_ore_otherstone"), FORTISTEEL_OTHERSTONE_ITEM);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "purigold_ore_earthstone"), PURIGOLD_EARTHSTONE_ITEM);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "purigold_ore_otherstone"), PURIGOLD_OTHERSTONE_ITEM);

		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "smart_pearl"), SMART_PEARL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "fireball"), FIREBALL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "catastrophically_gay_fireball"), GAY_FIREBALL);
		Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "troll_tnt"), TROLL_TNT_BLOCK_ITEM);

		// Fuel Registry
		FuelRegistry.INSTANCE.add(GEMFUEL, 1200 * 5);
	}
}
