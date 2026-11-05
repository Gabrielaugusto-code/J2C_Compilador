/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bd
extends y {
    @Override
    public String c() {
        return "pardon";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String c(ac ac2) {
        return "commands.unban.usage";
    }

    @Override
    public boolean a(ac ac2) {
        return MinecraftServer.G().af().e().b() && super.a(ac2);
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length == 1 && stringArray[0].length() > 0) {
            MinecraftServer.G().af().e().b(stringArray[0]);
            bd.a(ac2, "commands.unban.success", stringArray[0]);
            return;
        }
        throw new ch("commands.unban.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return bd.a(stringArray, MinecraftServer.G().af().e().c().keySet());
        }
        return null;
    }
}

