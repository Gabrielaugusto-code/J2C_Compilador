/*
 * Decompiled with CFR 0.152.
 */
class bes
extends bfi {
    private final bvm c;
    final /* synthetic */ bep a;

    private bes(bep bep2, bvm bvm2) {
        this.a = bep2;
        this.c = bvm2;
    }

    @Override
    public void run() {
        this.b(bsc.a("mco.backup.restoring", new Object[0]));
        try {
            if (this.c()) {
                return;
            }
            bal bal2 = bep.c(this.a).M();
            bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
            bvf2.c(bep.b(this.a), this.c.a);
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
            if (this.c()) {
                return;
            }
            this.b().a(bep.d(this.a));
        }
        catch (bwa bwa2) {
            if (this.c()) {
                return;
            }
            bep.g().error("Couldn't restore backup");
            bep.e(this.a).a(new bgh(bwa2, bep.d(this.a)));
        }
        catch (Exception exception) {
            if (this.c()) {
                return;
            }
            bep.g().error("Couldn't restore backup");
            this.a(exception.getLocalizedMessage());
        }
    }

    /* synthetic */ bes(bep bep2, bvm bvm2, beq beq2) {
        this(bep2, bvm2);
    }
}

