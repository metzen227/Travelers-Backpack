package com.tiviacz.travelersbackpack.init;

import com.tiviacz.travelersbackpack.TravelersBackpack;
import com.tiviacz.travelersbackpack.fluids.FluidMilk;
import com.tiviacz.travelersbackpack.fluids.FluidPotion;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids 
{
	public static final ResourceLocation MILK_STILL = new ResourceLocation(TravelersBackpack.MODID, "blocks/milk_still");
	public static final ResourceLocation MILK_FLOW = new ResourceLocation(TravelersBackpack.MODID, "blocks/milk_flow");
	public static final ResourceLocation POTION_STILL = new ResourceLocation(TravelersBackpack.MODID, "blocks/potion_still");
	public static final ResourceLocation POTION_FLOW = new ResourceLocation(TravelersBackpack.MODID, "blocks/potion_flow");
	
	public static FluidMilk MILK;
	public static FluidPotion POTION;
    
    public static void registerFluids()
    {
        POTION = new FluidPotion("potion", POTION_STILL, POTION_FLOW);
		MILK = new FluidMilk("milk", MILK_STILL, MILK_FLOW);

		FluidRegistry.registerFluid(POTION);
		FluidRegistry.registerFluid(MILK);
    }
}