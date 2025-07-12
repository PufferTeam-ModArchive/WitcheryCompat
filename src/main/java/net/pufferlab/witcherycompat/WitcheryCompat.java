package net.pufferlab.witcherycompat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.block.Block;
import net.pufferlab.witcherycompat.blocks.BlockStockadeModded;
import net.pufferlab.witcherycompat.itemblocks.ItemBlockStockadeModded;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.pufferlab.witcherycompat.Tags;

@Mod(modid = WitcheryCompat.MODID, version = Tags.VERSION, name = "WitcheryCompat", acceptedMinecraftVersions = "[1.7.10]", dependencies = "required-after:gtnhmixins@[2.0.1,);" + "required-after:unimixins@[0.0.20,);")
public class WitcheryCompat {

    public static final String MODID = "witcherycompat";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "net.pufferlab.witcherycompat.ClientProxy", serverSide = "net.pufferlab.witcherycompat.CommonProxy")
    public static CommonProxy proxy;

    public static Block stockade_bop;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        stockade_bop = new BlockStockadeModded(Constants.bopWoodTypes, "biomesoplenty");

        GameRegistry.registerBlock(stockade_bop, ItemBlockStockadeModded.class, "stockade_bop");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
