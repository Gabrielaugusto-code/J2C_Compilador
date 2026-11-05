/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.server.MinecraftServer;

public class ne
implements jh {
    private final MinecraftServer a;
    private final ef b;

    public ne(MinecraftServer minecraftServer, ef ef2) {
        this.a = minecraftServer;
        this.b = ef2;
    }

    @Override
    public void a(jg jg2) {
        switch (jg2.c()) {
            case d: {
                this.b.a(ek.d);
                if (jg2.d() > 4) {
                    fh fh2 = new fh("Outdated server! I'm still on 1.7.3");
                    this.b.a(new jl(fh2), new GenericFutureListener[0]);
                    this.b.a(fh2);
                    break;
                }
                if (jg2.d() < 4) {
                    fh fh3 = new fh("Outdated client! Please use 1.7.3");
                    this.b.a(new jl(fh3), new GenericFutureListener[0]);
                    this.b.a(fh3);
                    break;
                }
                this.b.a(new ng(this.a, this.b));
                break;
            }
            case c: {
                this.b.a(ek.c);
                this.b.a(new nj(this.a, this.b));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + (Object)((Object)jg2.c()));
            }
        }
    }

    @Override
    public void a(fa fa2) {
    }

    @Override
    public void a(ek ek2, ek ek3) {
        if (ek3 != ek.d && ek3 != ek.c) {
            throw new UnsupportedOperationException("Invalid state " + (Object)((Object)ek3));
        }
    }

    @Override
    public void a() {
    }
}

