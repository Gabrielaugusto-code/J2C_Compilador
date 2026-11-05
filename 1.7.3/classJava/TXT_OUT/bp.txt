/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class bp
extends y {
    @Override
    public boolean a(ac ac2) {
        return MinecraftServer.G().L() || super.a(ac2);
    }

    @Override
    public String c() {
        return "seed";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.seed.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        afs afs2 = ac2 instanceof xq ? ((xq)ac2).o : MinecraftServer.G().a(0);
        ac2.a(new fi("commands.seed.success", afs2.H()));
    }
}

