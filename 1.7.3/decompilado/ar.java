/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ar
extends y {
    @Override
    public String c() {
        return "gamemode";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.gamemode.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length > 0) {
            agb agb2 = this.h(ac2, stringArray[0]);
            mp mp2 = stringArray.length >= 2 ? ar.d(ac2, stringArray[1]) : ar.b(ac2);
            ((xq)mp2).a(agb2);
            mp2.R = 0.0f;
            fi fi2 = new fi("gameMode." + agb2.b(), new Object[0]);
            if (mp2 != ac2) {
                ar.a(ac2, 1, "commands.gamemode.success.other", mp2.b_(), fi2);
            } else {
                ar.a(ac2, 1, "commands.gamemode.success.self", fi2);
            }
            return;
        }
        throw new ch("commands.gamemode.usage", new Object[0]);
    }

    protected agb h(ac ac2, String string) {
        if (string.equalsIgnoreCase(agb.b.b()) || string.equalsIgnoreCase("s")) {
            return agb.b;
        }
        if (string.equalsIgnoreCase(agb.c.b()) || string.equalsIgnoreCase("c")) {
            return agb.c;
        }
        if (string.equalsIgnoreCase(agb.d.b()) || string.equalsIgnoreCase("a")) {
            return agb.d;
        }
        return aga.a(ar.a(ac2, string, 0, agb.values().length - 2));
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return ar.a(stringArray, "survival", "creative", "adventure");
        }
        if (stringArray.length == 2) {
            return ar.a(stringArray, this.d());
        }
        return null;
    }

    protected String[] d() {
        return MinecraftServer.G().D();
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return n2 == 1;
    }
}

