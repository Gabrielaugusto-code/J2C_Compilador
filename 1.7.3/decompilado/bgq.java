/*
 * Decompiled with CFR 0.152.
 */
class bgq
extends bfi {
    private final long c;
    private final String d;
    private final bvx e;
    final /* synthetic */ bgp a;

    public bgq(bgp bgp2, long l2, String string, bvx bvx2) {
        this.a = bgp2;
        this.c = l2;
        this.d = string;
        this.e = bvx2;
    }

    @Override
    public void run() {
        bal bal2 = bgp.a(this.a).M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        String string = bsc.a("mco.reset.world.resetting.screen.title", new Object[0]);
        this.b(string);
        try {
            if (this.c()) {
                return;
            }
            if (this.e != null) {
                bvf2.e(this.c, this.e.a);
            } else {
                bvf2.d(this.c, this.d);
            }
            if (this.c()) {
                return;
            }
            bgp.c(this.a).a(bgp.b(this.a));
        }
        catch (bwa bwa2) {
            if (this.c()) {
                return;
            }
            bgp.g().error("Couldn't reset world");
            this.a(bwa2.toString());
        }
        catch (Exception exception) {
            if (this.c()) {
                return;
            }
            bgp.g().error("Couldn't reset world");
            this.a(exception.toString());
        }
    }
}

