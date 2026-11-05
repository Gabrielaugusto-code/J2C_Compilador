/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class bn
extends y {
    @Override
    public String c() {
        return "setidletimeout";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String c(ac ac2) {
        return "commands.setidletimeout.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            int n2 = bn.a(ac2, stringArray[0], 0);
            MinecraftServer.G().d(n2);
            bn.a(ac2, "commands.setidletimeout.success", new Object[]{n2});
            return;
        }
        throw new ch("commands.setidletimeout.usage", new Object[0]);
    }
}

