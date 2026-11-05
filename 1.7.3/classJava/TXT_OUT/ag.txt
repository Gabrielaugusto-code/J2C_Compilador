/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ag
extends y {
    @Override
    public String c() {
        return "ban";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String c(ac ac2) {
        return "commands.ban.usage";
    }

    @Override
    public boolean a(ac ac2) {
        return MinecraftServer.G().af().e().b() && super.a(ac2);
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].length() > 0) {
            mp mp2 = MinecraftServer.G().af().e(stringArray[0]);
            kc kc2 = new kc(stringArray[0]);
            kc2.a(ac2.b_());
            if (stringArray.length >= 2) {
                kc2.b(ag.a(ac2, stringArray, 1).c());
            }
            MinecraftServer.G().af().e().a(kc2);
            if (mp2 != null) {
                mp2.a.c("You are banned from this server.");
            }
            ag.a(ac2, "commands.ban.success", stringArray[0]);
            return;
        }
        throw new ch("commands.ban.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1) {
            return ag.a(stringArray, MinecraftServer.G().D());
        }
        return null;
    }
}

