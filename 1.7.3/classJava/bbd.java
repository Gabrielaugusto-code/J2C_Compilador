/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class bbd
extends bba {
    private final List k = Lists.newArrayList();

    public bbd(azi azi2, int n2, int n3, int n4, int n5, int n6, baf ... bafArray) {
        super(azi2, n2, n3, n4, n5, n6);
        this.i = false;
        for (int i2 = 0; i2 < bafArray.length; i2 += 2) {
            baf baf2 = bafArray[i2];
            baf baf3 = i2 < bafArray.length - 1 ? bafArray[i2 + 1] : null;
            bau bau2 = this.a(azi2, n2 / 2 - 155, 0, baf2);
            bau bau3 = this.a(azi2, n2 / 2 - 155 + 160, 0, baf3);
            this.k.add(new bbe(bau2, bau3));
        }
    }

    private bau a(azi azi2, int n2, int n3, baf baf2) {
        if (baf2 == null) {
            return null;
        }
        int n4 = baf2.c();
        return baf2.a() ? new bbg(n4, n2, n3, baf2) : new bbc(n4, n2, n3, baf2, azi2.u.c(baf2));
    }

    public bbe c(int n2) {
        return (bbe)this.k.get(n2);
    }

    @Override
    protected int b() {
        return this.k.size();
    }

    @Override
    public int c() {
        return 400;
    }

    @Override
    protected int d() {
        return super.d() + 32;
    }

    @Override
    public /* synthetic */ bbb b(int n2) {
        return this.c(n2);
    }
}

