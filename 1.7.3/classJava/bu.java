/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bu
extends y {
    @Override
    public String c() {
        return "tp";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.tp.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1) {
            mp mp2;
            if (stringArray.length == 2 || stringArray.length == 4) {
                mp2 = bu.d(ac2, stringArray[0]);
                if (mp2 == null) {
                    throw new cf();
                }
            } else {
                mp2 = bu.b(ac2);
            }
            if (stringArray.length == 3 || stringArray.length == 4) {
                if (mp2.o != null) {
                    int n2 = stringArray.length - 3;
                    double d2 = bu.a(ac2, mp2.s, stringArray[n2++]);
                    double d3 = bu.a(ac2, mp2.t, stringArray[n2++], 0, 0);
                    double d4 = bu.a(ac2, mp2.u, stringArray[n2++]);
                    mp2.a((qr)null);
                    mp2.a(d2, d3, d4);
                    bu.a(ac2, "commands.tp.success.coordinates", mp2.b_(), d2, d3, d4);
                }
            } else if (stringArray.length == 1 || stringArray.length == 2) {
                mp mp3 = bu.d(ac2, stringArray[stringArray.length - 1]);
                if (mp3 == null) {
                    throw new cf();
                }
                if (mp3.o != mp2.o) {
                    bu.a(ac2, "commands.tp.notSameDimension", new Object[0]);
                    return;
                }
                mp2.a((qr)null);
                mp2.a.a(mp3.s, mp3.t, mp3.u, mp3.y, mp3.z);
                bu.a(ac2, "commands.tp.success", mp2.b_(), mp3.b_());
            }
            return;
        }
        throw new ch("commands.tp.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1 || stringArray.length == 2) {
            return bu.a(stringArray, MinecraftServer.G().D());
        }
        return null;
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

