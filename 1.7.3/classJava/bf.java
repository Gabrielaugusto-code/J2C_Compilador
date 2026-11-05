/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class bf
extends y {
    @Override
    public String c() {
        return "publish";
    }

    @Override
    public String c(ac ac2) {
        return "commands.publish.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        String string = MinecraftServer.G().a(agb.b, false);
        if (string != null) {
            bf.a(ac2, "commands.publish.started", string);
        } else {
            bf.a(ac2, "commands.publish.failed", new Object[0]);
        }
    }
}

