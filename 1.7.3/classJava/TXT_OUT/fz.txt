/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

public class fz
extends fk {
    private String[] a;

    public fz() {
    }

    public fz(String[] stringArray) {
        this.a = stringArray;
    }

    @Override
    public void a(ep ep2) {
        this.a = new String[ep2.a()];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = ep2.c(Short.MAX_VALUE);
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a.length);
        for (String string : this.a) {
            ep2.a(string);
        }
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public String[] c() {
        return this.a;
    }

    @Override
    public String b() {
        return String.format("candidates='%s'", ArrayUtils.toString((Object)this.a));
    }
}

