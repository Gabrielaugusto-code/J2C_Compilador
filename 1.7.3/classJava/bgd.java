/*
 * Decompiled with CFR 0.152.
 */
class bgd
implements Runnable {
    final /* synthetic */ bga a;

    private bgd(bga bga2) {
        this.a = bga2;
    }

    @Override
    public void run() {
        if (bga.a(this.a)) {
            this.a();
        }
    }

    private void a() {
        try {
            bal bal2 = azi.B().M();
            if (bal2 != null) {
                bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
                bga.b(this.a, bvf2.f());
                bga.b(this.a).put(bgf.b.toString(), true);
            }
        }
        catch (bwa bwa2) {
            bga.g().error("Couldn't get pending invite count", (Throwable)bwa2);
        }
    }

    /* synthetic */ bgd(bga bga2, bgb bgb2) {
        this(bga2);
    }
}

