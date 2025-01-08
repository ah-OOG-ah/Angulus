package klaxon.klaxon.angulus;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import slimeknights.tconstruct.library.modifiers.Modifier;

@Mod.EventBusSubscriber
public class CommonProxy {
    private Modifier modExpanderCorner;

    public void preInit() {
        modExpanderCorner =
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> evt) {
        var registry = evt.getRegistry();


    }
}
