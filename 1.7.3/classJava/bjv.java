/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;

class bjv
implements GenericFutureListener {
    final /* synthetic */ SecretKey a;
    final /* synthetic */ bju b;

    bjv(bju bju2, SecretKey secretKey) {
        this.b = bju2;
        this.a = secretKey;
    }

    public void operationComplete(Future future) {
        bju.a(this.b).a(this.a);
    }
}

