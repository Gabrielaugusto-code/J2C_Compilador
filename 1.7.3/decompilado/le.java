/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public class le
implements Callable {
    final /* synthetic */ MinecraftServer a;

    public le(MinecraftServer minecraftServer) {
        this.a = minecraftServer;
    }

    public String a() {
        return MinecraftServer.a(this.a).k() + " / " + MinecraftServer.a(this.a).l() + "; " + MinecraftServer.a((MinecraftServer)this.a).a;
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

