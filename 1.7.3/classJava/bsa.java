/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;

class bsa
implements Function {
    final /* synthetic */ brz a;

    bsa(brz brz2) {
        this.a = brz2;
    }

    public String a(brt brt2) {
        return brt2.b();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((brt)object);
    }
}

