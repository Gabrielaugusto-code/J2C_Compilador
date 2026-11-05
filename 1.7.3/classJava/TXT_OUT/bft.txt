/*
 * Decompiled with CFR 0.152.
 */
import java.net.UnknownHostException;

class bft
implements Runnable {
    final /* synthetic */ bvo a;
    final /* synthetic */ bfs b;

    bft(bfs bfs2, bvo bvo2) {
        this.b = bfs2;
        this.a = bvo2;
    }

    @Override
    public void run() {
        try {
            bfq.q().a(this.a);
        }
        catch (UnknownHostException unknownHostException) {
            bfq.p().error("Pinger: Could not resolve host");
        }
    }
}

