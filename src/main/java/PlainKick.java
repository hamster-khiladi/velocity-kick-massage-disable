import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.KickedFromServerEvent;
import com.velocitypowered.api.event.player.KickedFromServerEvent.DisconnectPlayer;
import com.velocitypowered.api.plugin.Plugin;

@Plugin(id = "plainkick", name = "PlainKick", version = "1.0")
public class PlainKick {
  // Shows only the backend's kick reason (e.g. the LibertyBans screen),
  // without Velocity's "You were kicked from <server>:" header.
  @Subscribe
  public void onKick(KickedFromServerEvent e) {
    if (e.getResult() instanceof DisconnectPlayer) {
      e.getServerKickReason().ifPresent(r -> e.setResult(DisconnectPlayer.create(r)));
    }
  }
}
