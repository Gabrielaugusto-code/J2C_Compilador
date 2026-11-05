/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class az
extends y {
    @Override
    public List b() {
        return Arrays.asList("w", "msg");
    }

    @Override
    public String c() {
        return "tell";
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public String c(ac ac2) {
        return "commands.message.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new ch("commands.message.usage", new Object[0]);
        }
        mp mp2 = az.d(ac2, stringArray[0]);
        if (mp2 == null) {
            throw new cf();
        }
        if (mp2 == ac2) {
            throw new cf("commands.message.sameTarget", new Object[0]);
        }
        fa fa2 = az.a(ac2, stringArray, 1, !(ac2 instanceof xq));
        fi fi2 = new fi("commands.message.display.incoming", ac2.c_(), fa2.f());
        fi fi3 = new fi("commands.message.display.outgoing", mp2.c_(), fa2.f());
        fi2.b().a(a.h).b(true);
        fi3.b().a(a.h).b(true);
        mp2.a(fi2);
        ac2.a(fi3);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        return az.a(stringArray, MinecraftServer.G().D());
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

