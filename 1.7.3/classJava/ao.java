/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ao
extends y {
    @Override
    public String c() {
        return "enchant";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.enchant.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 2) {
            dp dp2;
            mp mp2 = ao.d(ac2, stringArray[0]);
            int n2 = ao.a(ac2, stringArray[1], 0, aek.b.length - 1);
            int n3 = 1;
            abu abu2 = mp2.bE();
            if (abu2 == null) {
                throw new cc("commands.enchant.noItem", new Object[0]);
            }
            aek aek2 = aek.b[n2];
            if (aek2 == null) {
                throw new cd("commands.enchant.notFound", n2);
            }
            if (!aek2.a(abu2)) {
                throw new cc("commands.enchant.cantEnchant", new Object[0]);
            }
            if (stringArray.length >= 3) {
                n3 = ao.a(ac2, stringArray[2], aek2.d(), aek2.b());
            }
            if (abu2.p() && (dp2 = abu2.r()) != null) {
                for (int i2 = 0; i2 < dp2.c(); ++i2) {
                    aek aek3;
                    short s2 = dp2.b(i2).e("id");
                    if (aek.b[s2] == null || (aek3 = aek.b[s2]).a(aek2)) continue;
                    throw new cc("commands.enchant.cantCombine", aek2.c(n3), aek3.c(dp2.b(i2).e("lvl")));
                }
            }
            abu2.a(aek2, n3);
            ao.a(ac2, "commands.enchant.success", new Object[0]);
            return;
        }
        throw new ch("commands.enchant.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return ao.a(stringArray, this.d());
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

