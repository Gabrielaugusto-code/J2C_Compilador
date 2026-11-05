/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ai
extends y {
    @Override
    public String c() {
        return "clear";
    }

    @Override
    public String c(ac ac2) {
        return "commands.clear.usage";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        int n2;
        mp mp2 = stringArray.length == 0 ? ai.b(ac2) : ai.d(ac2, stringArray[0]);
        abs abs2 = stringArray.length >= 2 ? ai.f(ac2, stringArray[1]) : null;
        int n3 = n2 = stringArray.length >= 3 ? ai.a(ac2, stringArray[2], 0) : -1;
        if (stringArray.length >= 2 && abs2 == null) {
            throw new cc("commands.clear.failure", mp2.b_());
        }
        int n4 = mp2.bm.a(abs2, n2);
        mp2.bn.b();
        if (!mp2.bE.d) {
            mp2.l();
        }
        if (n4 == 0) {
            throw new cc("commands.clear.failure", mp2.b_());
        }
        ai.a(ac2, "commands.clear.success", mp2.b_(), n4);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return ai.a(stringArray, this.d());
        }
        if (stringArray.length == 2) {
            return ai.a(stringArray, abs.e.b());
        }
        return null;
    }

    protected String[] d() {
        return MinecraftServer.G().D();
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

