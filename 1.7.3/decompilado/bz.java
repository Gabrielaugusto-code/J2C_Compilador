/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class bz
extends y {
    @Override
    public String c() {
        return "toggledownfall";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.downfall.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        this.d();
        bz.a(ac2, "commands.downfall.success", new Object[0]);
    }

    protected void d() {
        axj axj2;
        axj2.b(!(axj2 = MinecraftServer.G().b[0].N()).p());
    }
}

