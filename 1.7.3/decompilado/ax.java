/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ax
extends y {
    @Override
    public String c() {
        return "banlist";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(ac ac2) {
        return (MinecraftServer.G().af().f().b() || MinecraftServer.G().af().e().b()) && super.a(ac2);
    }

    @Override
    public String c(ac ac2) {
        return "commands.banlist.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].equalsIgnoreCase("ips")) {
            ac2.a(new fi("commands.banlist.ips", MinecraftServer.G().af().f().c().size()));
            ac2.a(new fh(ax.a(MinecraftServer.G().af().f().c().keySet().toArray())));
        } else {
            ac2.a(new fi("commands.banlist.players", MinecraftServer.G().af().e().c().size()));
            ac2.a(new fh(ax.a(MinecraftServer.G().af().e().c().keySet().toArray())));
        }
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return ax.a(stringArray, "players", "ips");
        }
        return null;
    }
}

