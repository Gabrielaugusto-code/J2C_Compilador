/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class add
extends abs {
    public add() {
        this.e(1);
    }

    public static boolean a(dg dg2) {
        if (!adc.a(dg2)) {
            return false;
        }
        if (!dg2.b("title", 8)) {
            return false;
        }
        String string = dg2.j("title");
        if (string == null || string.length() > 16) {
            return false;
        }
        return dg2.b("author", 8);
    }

    @Override
    public String n(abu abu2) {
        dg dg2;
        String string;
        if (abu2.p() && !pe.b(string = (dg2 = abu2.q()).j("title"))) {
            return string;
        }
        return super.n(abu2);
    }

    @Override
    public void a(abu abu2, xq xq2, List list, boolean bl2) {
        dg dg2;
        String string;
        if (abu2.p() && !pe.b(string = (dg2 = abu2.q()).j("author"))) {
            list.add((Object)((Object)a.h) + dc.a("book.byAuthor", string));
        }
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        xq2.b(abu2);
        return abu2;
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public boolean e(abu abu2) {
        return true;
    }
}

