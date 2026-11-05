/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class nb
implements GenericFutureListener {
    final /* synthetic */ fh a;
    final /* synthetic */ na b;

    nb(na na2, fh fh2) {
        this.b = na2;
        this.a = fh2;
    }

    public void operationComplete(Future future) {
        this.b.a.a(this.a);
    }
}

