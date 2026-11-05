/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class bh
extends y {
    @Override
    public String c() {
        return "save-off";
    }

    @Override
    public String c(ac ac2) {
        return "commands.save-off.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        MinecraftServer minecraftServer = MinecraftServer.G();
        boolean bl2 = false;
        for (int i2 = 0; i2 < minecraftServer.b.length; ++i2) {
            if (minecraftServer.b[i2] == null) continue;
            mm mm2 = minecraftServer.b[i2];
            if (mm2.c) continue;
            mm2.c = true;
            bl2 = true;
        }
        if (!bl2) {
            throw new cc("commands.save-off.alreadyOff", new Object[0]);
        }
        bh.a(ac2, "commands.save.disabled", new Object[0]);
    }
}

