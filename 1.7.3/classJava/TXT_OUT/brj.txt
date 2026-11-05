/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class brj
implements brr {
    protected final List a = new ArrayList();
    private final bsj b;

    public brj(bsj bsj2) {
        this.b = bsj2;
    }

    public void a(brt brt2) {
        this.a.add(brt2);
    }

    @Override
    public Set a() {
        return null;
    }

    @Override
    public brp a(brq brq2) {
        brt brt2 = null;
        brq brq3 = brj.c(brq2);
        for (int i2 = this.a.size() - 1; i2 >= 0; --i2) {
            brt brt3 = (brt)this.a.get(i2);
            if (brt2 == null && brt3.b(brq3)) {
                brt2 = brt3;
            }
            if (!brt3.b(brq2)) continue;
            InputStream inputStream = null;
            if (brt2 != null) {
                inputStream = brt2.a(brq3);
            }
            return new bsb(brq2, brt3.a(brq2), inputStream, this.b);
        }
        throw new FileNotFoundException(brq2.toString());
    }

    @Override
    public List b(brq brq2) {
        ArrayList arrayList = Lists.newArrayList();
        brq brq3 = brj.c(brq2);
        for (brt brt2 : this.a) {
            if (!brt2.b(brq2)) continue;
            InputStream inputStream = brt2.b(brq3) ? brt2.a(brq3) : null;
            arrayList.add(new bsb(brq2, brt2.a(brq2), inputStream, this.b));
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(brq2.toString());
        }
        return arrayList;
    }

    static brq c(brq brq2) {
        return new brq(brq2.b(), brq2.a() + ".mcmeta");
    }
}

