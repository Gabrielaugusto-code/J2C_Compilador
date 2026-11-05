/*
 * Decompiled with CFR 0.152.
 */
class bfl
implements Runnable {
    final /* synthetic */ bfk a;

    bfl(bfk bfk2) {
        this.a = bfk2;
    }

    @Override
    public void run() {
        bal bal2 = bfk.a(this.a).M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            bfk.a(this.a, bvf2.e().a);
        }
        catch (bwa bwa2) {
            bfk.g().error("Couldn't fetch templates");
        }
    }
}

