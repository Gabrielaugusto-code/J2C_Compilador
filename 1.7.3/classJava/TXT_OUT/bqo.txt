/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bqo {
    private final int a;
    private final Set b = new HashSet(256);
    private final List c = new ArrayList(256);
    private int d;
    private int e;
    private final int f;
    private final int g;
    private final boolean h;
    private final int i;

    public bqo(int n2, int n3, boolean bl2, int n4, int n5) {
        this.a = n5;
        this.f = n2;
        this.g = n3;
        this.h = bl2;
        this.i = n4;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public void a(bqw bqw2) {
        bqp bqp2 = new bqp(bqw2, this.a);
        if (this.i > 0) {
            bqp2.a(this.i);
        }
        this.b.add(bqp2);
    }

    public void c() {
        Object[] objectArray = this.b.toArray(new bqp[this.b.size()]);
        Arrays.sort(objectArray);
        for (Object object : objectArray) {
            if (this.a((bqp)object)) continue;
            String string = String.format("Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", ((bqp)object).a().g(), ((bqp)object).a().a(), ((bqp)object).a().b());
            throw new bqr((bqp)object, string);
        }
        if (this.h) {
            this.d = oy.b(this.d);
            this.e = oy.b(this.e);
        }
    }

    public List d() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.c) {
            ((bqq)object).a(arrayList);
        }
        ArrayList arrayList2 = Lists.newArrayList();
        for (bqq bqq2 : arrayList) {
            bqp bqp2 = bqq2.a();
            bqw bqw2 = bqp2.a();
            bqw2.a(this.d, this.e, bqq2.b(), bqq2.c(), bqp2.e());
            arrayList2.add(bqw2);
        }
        return arrayList2;
    }

    private static int b(int n2, int n3) {
        return (n2 >> n3) + ((n2 & (1 << n3) - 1) == 0 ? 0 : 1) << n3;
    }

    private boolean a(bqp bqp2) {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (((bqq)this.c.get(i2)).a(bqp2)) {
                return true;
            }
            bqp2.d();
            if (((bqq)this.c.get(i2)).a(bqp2)) {
                return true;
            }
            bqp2.d();
        }
        return this.b(bqp2);
    }

    private boolean b(bqp bqp2) {
        bqq bqq2;
        boolean bl2;
        int n2;
        int n3;
        boolean bl3;
        int n4 = Math.min(bqp2.b(), bqp2.c());
        boolean bl4 = bl3 = this.d == 0 && this.e == 0;
        if (this.h) {
            boolean bl5;
            boolean bl6;
            n3 = oy.b(this.d);
            n2 = oy.b(this.e);
            int n5 = oy.b(this.d + n4);
            int n6 = oy.b(this.e + n4);
            boolean bl7 = n5 <= this.f;
            boolean bl8 = bl6 = n6 <= this.g;
            if (!bl7 && !bl6) {
                return false;
            }
            boolean bl9 = n3 != n5;
            boolean bl10 = bl5 = n2 != n6;
            bl2 = bl9 ^ bl5 ? !bl9 : bl7 && n3 <= n2;
        } else {
            n3 = this.d + n4 <= this.f ? 1 : 0;
            int n7 = n2 = this.e + n4 <= this.g ? 1 : 0;
            if (n3 == 0 && n2 == 0) {
                return false;
            }
            bl2 = n3 != 0 && (bl3 || this.d <= this.e);
        }
        n3 = Math.max(bqp2.b(), bqp2.c());
        if (oy.b((bl2 ? this.e : this.d) + n3) > (bl2 ? this.g : this.f)) {
            return false;
        }
        if (bl2) {
            if (bqp2.b() > bqp2.c()) {
                bqp2.d();
            }
            if (this.e == 0) {
                this.e = bqp2.c();
            }
            bqq2 = new bqq(this.d, 0, bqp2.b(), this.e);
            this.d += bqp2.b();
        } else {
            bqq2 = new bqq(0, this.e, this.d, bqp2.c());
            this.e += bqp2.c();
        }
        bqq2.a(bqp2);
        this.c.add(bqq2);
        return true;
    }

    static /* synthetic */ int a(int n2, int n3) {
        return bqo.b(n2, n3);
    }
}

