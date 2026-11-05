/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class bcu
extends Thread {
    final /* synthetic */ bct a;

    bcu(bct bct2, String string) {
        this.a = bct2;
        super(string);
    }

    @Override
    public void run() {
        bal bal2 = this.a.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        boolean bl2 = false;
        for (int i2 = 0; i2 < 3; ++i2) {
            try {
                Boolean bl3 = bvf2.b();
                if (bl3.booleanValue()) {
                    bct.a(this.a);
                }
                bct.a(bl3);
            }
            catch (bwb bwb2) {
                bl2 = true;
            }
            catch (bwa bwa2) {
                bct.g().error("Couldn't connect to Realms");
            }
            catch (IOException iOException) {
                bct.g().error("Couldn't parse response connecting to Realms");
            }
            if (!bl2) break;
            try {
                Thread.sleep(10000L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

