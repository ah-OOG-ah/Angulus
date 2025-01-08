package klaxon.klaxon.angulus;

import static slimeknights.tconstruct.tools.harvest.TinkerHarvestTools.excavator;
import static slimeknights.tconstruct.tools.harvest.TinkerHarvestTools.hammer;
import static slimeknights.tconstruct.tools.harvest.TinkerHarvestTools.lumberAxe;

import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import slimeknights.tconstruct.library.events.TinkerToolEvent;

public class CommonProxy {
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onExtraBlockBreak(TinkerToolEvent.ExtraBlockBreak event) {
        if (event.tool != excavator && event.tool != hammer && event.tool != lumberAxe)
            return;

        event.distance = 0;
    }
}
