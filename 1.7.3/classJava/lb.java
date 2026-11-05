/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class lb
extends Thread {
    final /* synthetic */ MinecraftServer a;

    public lb(MinecraftServer minecraftServer, String string) {
        this.a = minecraftServer;
        super(string);
    }

    @Override
    public void run() {
        this.a.run();
    }
}

