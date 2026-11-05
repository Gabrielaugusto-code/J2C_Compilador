/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class asn
extends arx {
    public ask b;
    public List c;
    public List d;
    public ArrayList e = new ArrayList();

    public asn() {
    }

    public asn(Random random, int n2, int n3) {
        super(random, n2, n3);
        this.c = new ArrayList();
        for (ask ask2 : arw.b()) {
            ask2.c = 0;
            this.c.add(ask2);
        }
        this.d = new ArrayList();
        for (ask ask2 : arw.c()) {
            ask2.c = 0;
            this.d.add(ask2);
        }
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
    }
}

