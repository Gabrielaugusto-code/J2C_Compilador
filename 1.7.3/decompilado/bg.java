/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class bg
extends y {
    @Override
    public String c() {
        return "save-all";
    }

    @Override
    public String c(ac ac2) {
        return "commands.save.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        MinecraftServer minecraftServer = MinecraftServer.G();
        ac2.a(new fi("commands.save.start", new Object[0]));
        if (minecraftServer.af() != null) {
            minecraftServer.af().g();
        }
        try {
            boolean bl2;
            mm mm2;
            int n2;
            for (n2 = 0; n2 < minecraftServer.b.length; ++n2) {
                if (minecraftServer.b[n2] == null) continue;
                mm2 = minecraftServer.b[n2];
                bl2 = mm2.c;
                mm2.c = false;
                mm2.a(true, null);
                mm2.c = bl2;
            }
            if (stringArray.length > 0 && "flush".equals(stringArray[0])) {
                ac2.a(new fi("commands.save.flushStart", new Object[0]));
                for (n2 = 0; n2 < minecraftServer.b.length; ++n2) {
                    if (minecraftServer.b[n2] == null) continue;
                    mm2 = minecraftServer.b[n2];
                    bl2 = mm2.c;
                    mm2.c = false;
                    mm2.m();
                    mm2.c = bl2;
                }
                ac2.a(new fi("commands.save.flushEnd", new Object[0]));
            }
        }
        catch (afx afx2) {
            bg.a(ac2, "commands.save.failed", afx2.getMessage());
            return;
        }
        bg.a(ac2, "commands.save.success", new Object[0]);
    }
}

