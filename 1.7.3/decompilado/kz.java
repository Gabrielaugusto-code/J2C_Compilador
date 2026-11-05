/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class kz
implements pb {
    private long b = MinecraftServer.ap();
    final /* synthetic */ MinecraftServer a;

    public kz(MinecraftServer minecraftServer) {
        this.a = minecraftServer;
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void b(String string) {
    }

    @Override
    public void a(int n2) {
        if (MinecraftServer.ap() - this.b >= 1000L) {
            this.b = MinecraftServer.ap();
            MinecraftServer.av().info("Converting... " + n2 + "%");
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void c(String string) {
    }
}

