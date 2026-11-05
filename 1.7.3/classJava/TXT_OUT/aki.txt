/*
 * Decompiled with CFR 0.152.
 */
public class aki
extends ani {
    private abu a;

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        if (dg2.b("RecordItem", 10)) {
            this.a(abu.a(dg2.m("RecordItem")));
        } else if (dg2.f("Record") > 0) {
            this.a(new abu(abs.d(dg2.f("Record")), 1, 0));
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        if (this.a() != null) {
            dg2.a("RecordItem", this.a().b(new dg()));
            dg2.a("Record", abs.b(this.a().b()));
        }
    }

    public abu a() {
        return this.a;
    }

    public void a(abu abu2) {
        this.a = abu2;
        this.e();
    }
}

