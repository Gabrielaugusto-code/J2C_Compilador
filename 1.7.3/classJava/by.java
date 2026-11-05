/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class by
extends y {
    @Override
    public String c() {
        return "time";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.time.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length > 1) {
            if (stringArray[0].equals("set")) {
                int n2 = stringArray[1].equals("day") ? 1000 : (stringArray[1].equals("night") ? 13000 : by.a(ac2, stringArray[1], 0));
                this.a(ac2, n2);
                by.a(ac2, "commands.time.set", new Object[]{n2});
                return;
            }
            if (stringArray[0].equals("add")) {
                int n3 = by.a(ac2, stringArray[1], 0);
                this.b(ac2, n3);
                by.a(ac2, "commands.time.added", new Object[]{n3});
                return;
            }
        }
        throw new ch("commands.time.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return by.a(stringArray, "set", "add");
        }
        if (stringArray.length == 2 && stringArray[0].equals("set")) {
            return by.a(stringArray, "day", "night");
        }
        return null;
    }

    protected void a(ac ac2, int n2) {
        for (int i2 = 0; i2 < MinecraftServer.G().b.length; ++i2) {
            MinecraftServer.G().b[i2].b(n2);
        }
    }

    protected void b(ac ac2, int n2) {
        for (int i2 = 0; i2 < MinecraftServer.G().b.length; ++i2) {
            mm mm2 = MinecraftServer.G().b[i2];
            mm2.b(mm2.J() + (long)n2);
        }
    }
}

