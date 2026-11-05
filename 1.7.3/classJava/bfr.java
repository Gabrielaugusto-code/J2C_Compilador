/*
 * Decompiled with CFR 0.152.
 */
class bfr
implements Runnable {
    final /* synthetic */ bfq a;

    bfr(bfq bfq2) {
        this.a = bfq2;
    }

    @Override
    public void run() {
        try {
            bvo bvo2 = bfq.a(this.a, bfq.a(this.a));
            if (bvo2 != null) {
                bal bal2 = bfq.b(this.a).M();
                bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
                bfq.i().a(bvo2);
                bfq.c(this.a).remove(bvo2);
                bvf2.c(bvo2.a);
                bfq.i().a(bvo2);
                bfq.c(this.a).remove(bvo2);
                bfq.d(this.a);
            }
        }
        catch (bwa bwa2) {
            bfq.p().error("Couldn't configure world");
            bfq.e(this.a).a(new bgh(bwa2, this.a));
        }
    }
}

