/*
 * Decompiled with CFR 0.152.
 */
public class aod
extends ani {
    public String[] a = new String[]{"", "", "", ""};
    public int i = -1;
    private boolean j = true;
    private xq k;

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Text1", this.a[0]);
        dg2.a("Text2", this.a[1]);
        dg2.a("Text3", this.a[2]);
        dg2.a("Text4", this.a[3]);
    }

    @Override
    public void a(dg dg2) {
        this.j = false;
        super.a(dg2);
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a[i2] = dg2.j("Text" + (i2 + 1));
            if (this.a[i2].length() <= 15) continue;
            this.a[i2] = this.a[i2].substring(0, 15);
        }
    }

    @Override
    public fk m() {
        String[] stringArray = new String[4];
        System.arraycopy(this.a, 0, stringArray, 0, 4);
        return new hy(this.c, this.d, this.e, stringArray);
    }

    public boolean a() {
        return this.j;
    }

    public void a(boolean bl2) {
        this.j = bl2;
        if (!bl2) {
            this.k = null;
        }
    }

    public void a(xq xq2) {
        this.k = xq2;
    }

    public xq b() {
        return this.k;
    }
}

