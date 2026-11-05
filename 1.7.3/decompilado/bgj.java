/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;

class bgj
implements jp {
    private boolean d = false;
    final /* synthetic */ bvo a;
    final /* synthetic */ ef b;
    final /* synthetic */ bgi c;

    bgj(bgi bgi2, bvo bvo2, ef ef2) {
        this.c = bgi2;
        this.a = bvo2;
        this.b = ef2;
    }

    @Override
    public void a(jr jr2) {
        js js2 = jr2.c();
        if (js2.b() != null) {
            this.a.n = (Object)((Object)a.h) + "" + js2.b().b();
        }
        this.b.a(new jz(azi.K()), new GenericFutureListener[0]);
        this.d = true;
    }

    @Override
    public void a(jq jq2) {
        this.b.a(new fh("Finished"));
    }

    @Override
    public void a(fa fa2) {
        if (!this.d) {
            bgi.c().error("Can't ping " + this.a.g + ": " + fa2.c());
        }
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
}

