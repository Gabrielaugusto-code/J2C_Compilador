/*
 * Decompiled with CFR 0.152.
 */
class beu
implements Runnable {
    final /* synthetic */ bvf a;
    final /* synthetic */ bet b;

    beu(bet bet2, bvf bvf2) {
        this.b = bet2;
        this.a = bvf2;
    }

    @Override
    public void run() {
        try {
            bet.a(this.b, this.a.h());
        }
        catch (bwa bwa2) {
            bet.g().error("Could not get stat");
        }
    }
}

