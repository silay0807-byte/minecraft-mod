package com.pancor.tacz;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafxmod.FMLJavaModLoadingContext;

@Mod("pancor")
public class PancorJackhammer {
    public static final String MOD_ID = "pancor";

    public PancorJackhammer() {
        IEventBus modEventBus = FMLJavaModLoadingContext.getInstance().getModEventBus();
        
        modEventBus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        // Client setup will be done here
    }
}
