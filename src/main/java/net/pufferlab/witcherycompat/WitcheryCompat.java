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

@Mod(modid = WitcheryCompat.MODID, version = Tags.VERSION, name = "WitcheryCompat", acceptedMinecraftVersions = "[1.7.10]")
public class WitcheryCompat {

    public static final String MODID = "witcherycompat";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "net.pufferlab.witcherycompat.ClientProxy", serverSide = "net.pufferlab.witcherycompat.CommonProxy")
    public static CommonProxy proxy;

    public static Block stockade_bop;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        stockade_bop = new BlockStockadeModded(Constants.bopWoodTypes, "biomesoplenty");

        GameRegistry.registerBlock(stockade_bop, ItemBlockStockadeModded.class, "stockade_bop");
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
