package net.pufferlab.witcherycompat.mixinplugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gtnewhorizon.gtnhmixins.IEarlyMixinLoader;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.Name("WitcheryCompatEarlyMixins")
@IFMLLoadingPlugin.MCVersion("1.7.10")
public class WitcheryCompatEarlyMixins implements IFMLLoadingPlugin, IEarlyMixinLoader {

    @Override
    public String getMixinConfig() {
        return "mixins.witcherycompat.early.json";
    }

    @Override
    public List<String> getMixins(Set<String> loadedCoreMods) {

        List<String> mixins = new ArrayList<>();

        mixins.add("MixinBlockStockade");
        mixins.add("MixinBlockWitchWoodSlab");
        mixins.add("MixinBlockWitchWoodStairs");

        return mixins;
    }

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
