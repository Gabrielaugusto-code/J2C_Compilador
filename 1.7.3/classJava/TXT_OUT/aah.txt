/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aah
extends abs {
    private pw a;

    public aah() {
        this.a(true);
        this.f(0);
        this.a(aak.l);
    }

    @Override
    public String a(abu abu2) {
        if (abu2.k() == 1) {
            return "item.charcoal";
        }
        return "item.coal";
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
    }

    @Override
    public pw b_(int n2) {
        if (n2 == 1) {
            return this.a;
        }
        return super.b_(n2);
    }

    @Override
    public void a(px px2) {
        super.a(px2);
        this.a = px2.a("charcoal");
    }
}

