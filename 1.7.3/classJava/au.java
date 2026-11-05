/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

public class au
extends y {
    @Override
    public String c() {
        return "help";
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public String c(ac ac2) {
        return "commands.help.usage";
    }

    @Override
    public List b() {
        return Arrays.asList("?");
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        List list = this.d(ac2);
        int n2 = 7;
        int n3 = (list.size() - 1) / n2;
        int n4 = 0;
        try {
            n4 = stringArray.length == 0 ? 0 : au.a(ac2, stringArray[0], 1, n3 + 1) - 1;
        }
        catch (cd cd2) {
            Map map = this.d();
            aa aa2 = (aa)map.get(stringArray[0]);
            if (aa2 != null) {
                throw new ch(aa2.c(ac2), new Object[0]);
            }
            if (oy.a(stringArray[0], -1) != -1) {
                throw cd2;
            }
            throw new cg();
        }
        int n5 = Math.min((n4 + 1) * n2, list.size());
        fi fi2 = new fi("commands.help.header", n4 + 1, n3 + 1);
        fi2.b().a(a.c);
        ac2.a(fi2);
        for (int i2 = n4 * n2; i2 < n5; ++i2) {
            aa aa3 = (aa)list.get(i2);
            fi fi3 = new fi(aa3.c(ac2), new Object[0]);
            fi3.b().a(new ey(ez.e, "/" + aa3.c() + " "));
            ac2.a(fi3);
        }
        if (n4 == 0 && ac2 instanceof xq) {
            fi fi4 = new fi("commands.help.footer", new Object[0]);
            fi4.b().a(a.k);
            ac2.a(fi4);
        }
    }

    protected List d(ac ac2) {
        List list = MinecraftServer.G().H().a(ac2);
        Collections.sort(list);
        return list;
    }

    protected Map d() {
        return MinecraftServer.G().H().a();
    }
}

