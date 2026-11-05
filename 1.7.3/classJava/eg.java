/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;

class eg
implements Runnable {
    final /* synthetic */ ek a;
    final /* synthetic */ ek b;
    final /* synthetic */ fk c;
    final /* synthetic */ GenericFutureListener[] d;
    final /* synthetic */ ef e;

    eg(ef ef2, ek ek2, ek ek3, fk fk2, GenericFutureListener[] genericFutureListenerArray) {
        this.e = ef2;
        this.a = ek2;
        this.b = ek3;
        this.c = fk2;
        this.d = genericFutureListenerArray;
    }

    @Override
    public void run() {
        if (this.a != this.b) {
            this.e.a(this.a);
        }
        ef.a(this.e).writeAndFlush((Object)this.c).addListeners(this.d).addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}

