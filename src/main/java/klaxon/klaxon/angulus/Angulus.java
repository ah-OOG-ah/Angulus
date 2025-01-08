package klaxon.klaxon.angulus;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION, dependencies = "required:tconstruct")
public class Angulus {
    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);
    public static final CommonProxy proxy = new CommonProxy();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Gloria, gloria, in excelsis Deo!");

        MinecraftForge.EVENT_BUS.register(proxy);
    }
}
