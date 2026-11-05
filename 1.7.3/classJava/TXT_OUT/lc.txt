/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public class lc
implements Callable {
    final /* synthetic */ MinecraftServer a;

    public lc(MinecraftServer minecraftServer) {
        this.a = minecraftServer;
    }

    public String a() {
        return this.a.a.a ? this.a.a.c() : "N/A (disabled)";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

