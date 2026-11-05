/*
 * Decompiled with CFR 0.152.
 */
class bgg
implements Runnable {
    final /* synthetic */ bga a;

    private bgg(bga bga2) {
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
                bga.a(this.a, bvf2.d());
                bga.b(this.a).put(bgf.c.toString(), true);
            }
        }
        catch (bwa bwa2) {
            bga.g().error("Couldn't get token count", (Throwable)bwa2);
            bga.a(this.a, 0);
        }
    }

    /* synthetic */ bgg(bga bga2, bgb bgb2) {
        this(bga2);
    }
}

