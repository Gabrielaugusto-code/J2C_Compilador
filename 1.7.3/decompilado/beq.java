/*
 * Decompiled with CFR 0.152.
 */
class beq
implements Runnable {
    final /* synthetic */ bep a;

    beq(bep bep2) {
        this.a = bep2;
    }

    @Override
    public void run() {
        bal bal2 = bep.a(this.a).M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            bep.a(this.a, bvf2.d((long)bep.b((bep)this.a)).a);
        }
        catch (bwa bwa2) {
            bep.g().error("Couldn't request backups", (Throwable)bwa2);
        }
    }
}

