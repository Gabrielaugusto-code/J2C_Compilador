/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class mz
implements GenericFutureListener {
    final /* synthetic */ ef a;
    final /* synthetic */ fh b;
    final /* synthetic */ mv c;

    mz(mv mv2, ef ef2, fh fh2) {
        this.c = mv2;
        this.a = ef2;
        this.b = fh2;
    }

    public void operationComplete(Future future) {
        this.a.a(this.b);
    }
}

