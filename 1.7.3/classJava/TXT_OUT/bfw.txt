/*
 * Decompiled with CFR 0.152.
 */
class bfw
implements Runnable {
    final /* synthetic */ bfv a;

    bfw(bfv bfv2) {
        this.a = bfv2;
    }

    @Override
    public void run() {
        bal bal2 = bfv.a(this.a).M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            bfv.a(this.a, bvf2.g().a);
        }
        catch (bwa bwa2) {
            bfv.g().error("Couldn't list invites");
        }
    }
}

