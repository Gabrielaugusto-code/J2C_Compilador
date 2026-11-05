/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.List;

class bge
implements Runnable {
    final /* synthetic */ bga a;

    private bge(bga bga2) {
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
                List list = bvf2.a().a;
                if (list != null) {
                    bga.a(this.a, list);
                    bga.b(this.a, list);
                    bga.b(this.a).put(bgf.a.toString(), true);
                }
            }
        }
        catch (bwa bwa2) {
            bga.g().error("Couldn't get server list", (Throwable)bwa2);
        }
        catch (IOException iOException) {
            bga.g().error("Couldn't parse response from server getting list");
        }
    }

    /* synthetic */ bge(bga bga2, bgb bgb2) {
        this(bga2);
    }
}

