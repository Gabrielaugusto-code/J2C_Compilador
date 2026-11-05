/*
 * Decompiled with CFR 0.152.
 */
class bfx
implements Runnable {
    final /* synthetic */ bfv a;

    bfx(bfv bfv2) {
        this.a = bfv2;
    }

    @Override
    public void run() {
        try {
            bal bal2 = bfv.b(this.a).M();
            bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
            bvf2.b(((bvs)bfv.d((bfv)this.a).get((int)bfv.c((bfv)this.a))).a);
            bfv.e(this.a);
        }
        catch (bwa bwa2) {
            bfv.g().error("Couldn't reject invite");
        }
    }
}

