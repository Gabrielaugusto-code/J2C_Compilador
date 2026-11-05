/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.server.MinecraftServer;

public class nj
implements jy {
    private final MinecraftServer a;
    private final ef b;

    public nj(MinecraftServer minecraftServer, ef ef2) {
        this.a = minecraftServer;
        this.b = ef2;
    }

    @Override
    public void a(fa fa2) {
    }

    @Override
    public void a(ek ek2, ek ek3) {
        if (ek3 != ek.c) {
            throw new UnsupportedOperationException("Unexpected change in protocol to " + (Object)((Object)ek3));
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void a(ka ka2) {
        this.b.a(new jr(this.a.at()), new GenericFutureListener[0]);
    }

    @Override
    public void a(jz jz2) {
        this.b.a(new jq(jz2.c()), new GenericFutureListener[0]);
    }
}

