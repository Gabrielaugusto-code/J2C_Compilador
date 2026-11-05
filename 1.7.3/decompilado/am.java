/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class am
extends y {
    @Override
    public String c() {
        return "effect";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.effect.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length < 2) throw new ch("commands.effect.usage", new Object[0]);
        mp mp2 = am.d(ac2, stringArray[0]);
        if (stringArray[1].equals("clear")) {
            if (mp2.aP().isEmpty()) {
                throw new cc("commands.effect.failure.notActive.all", mp2.b_());
            }
            mp2.aO();
            am.a(ac2, "commands.effect.success.removed.all", mp2.b_());
            return;
        } else {
            int n2 = am.a(ac2, stringArray[1], 1);
            int n3 = 600;
            int n4 = 30;
            int n5 = 0;
            if (n2 < 0 || n2 >= qm.a.length || qm.a[n2] == null) {
                throw new cd("commands.effect.notFound", n2);
            }
            if (stringArray.length >= 3) {
                n4 = am.a(ac2, stringArray[2], 0, 1000000);
                n3 = qm.a[n2].b() ? n4 : n4 * 20;
            } else if (qm.a[n2].b()) {
                n3 = 1;
            }
            if (stringArray.length >= 4) {
                n5 = am.a(ac2, stringArray[3], 0, 255);
            }
            if (n4 == 0) {
                if (!mp2.k(n2)) throw new cc("commands.effect.failure.notActive", new fi(qm.a[n2].a(), new Object[0]), mp2.b_());
                mp2.m(n2);
                am.a(ac2, "commands.effect.success.removed", new fi(qm.a[n2].a(), new Object[0]), mp2.b_());
                return;
            } else {
                qn qn2 = new qn(n2, n3, n5);
                mp2.c(qn2);
                am.a(ac2, "commands.effect.success", new fi(qn2.f(), new Object[0]), n2, n5, mp2.b_(), n4);
            }
        }
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return am.a(stringArray, this.d());
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

