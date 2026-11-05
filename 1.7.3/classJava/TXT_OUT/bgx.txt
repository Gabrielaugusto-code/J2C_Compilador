/*
 * Decompiled with CFR 0.152.
 */
import java.net.UnknownHostException;

class bgx
implements Runnable {
    final /* synthetic */ bgw a;

    bgx(bgw bgw2) {
        this.a = bgw2;
    }

    @Override
    public void run() {
        try {
            bgw.b(this.a).i().a(bgw.a(this.a));
        }
        catch (UnknownHostException unknownHostException) {
            bgw.a((bgw)this.a).e = -1L;
            bgw.a((bgw)this.a).d = (Object)((Object)a.e) + "Can't resolve hostname";
        }
        catch (Exception exception) {
            bgw.a((bgw)this.a).e = -1L;
            bgw.a((bgw)this.a).d = (Object)((Object)a.e) + "Can't connect to server.";
        }
    }
}

