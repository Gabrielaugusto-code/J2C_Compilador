/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class awz
extends axc {
    public int a;
    public int b;
    public byte c;
    public byte d;
    public byte[] e = new byte[16384];
    public List f = new ArrayList();
    private Map i = new HashMap();
    public Map g = new LinkedHashMap();

    public awz(String string) {
        super(string);
    }

    @Override
    public void a(dg dg2) {
        this.c = dg2.d("dimension");
        this.a = dg2.f("xCenter");
        this.b = dg2.f("zCenter");
        this.d = dg2.d("scale");
        if (this.d < 0) {
            this.d = 0;
        }
        if (this.d > 4) {
            this.d = (byte)4;
        }
        int n2 = dg2.e("width");
        int n3 = dg2.e("height");
        if (n2 == 128 && n3 == 128) {
            this.e = dg2.k("colors");
        } else {
            byte[] byArray = dg2.k("colors");
            this.e = new byte[16384];
            int n4 = (128 - n2) / 2;
            int n5 = (128 - n3) / 2;
            for (int i2 = 0; i2 < n3; ++i2) {
                int n6 = i2 + n5;
                if (n6 < 0 && n6 >= 128) continue;
                for (int i3 = 0; i3 < n2; ++i3) {
                    int n7 = i3 + n4;
                    if (n7 < 0 && n7 >= 128) continue;
                    this.e[n7 + n6 * 128] = byArray[i3 + i2 * n2];
                }
            }
        }
    }

    @Override
    public void b(dg dg2) {
        dg2.a("dimension", this.c);
        dg2.a("xCenter", this.a);
        dg2.a("zCenter", this.b);
        dg2.a("scale", this.d);
        dg2.a("width", (short)128);
        dg2.a("height", (short)128);
        dg2.a("colors", this.e);
    }

    public void a(xq xq2, abu abu2) {
        if (!this.i.containsKey(xq2)) {
            axa axa2 = new axa(this, xq2);
            this.i.put(xq2, axa2);
            this.f.add(axa2);
        }
        if (!xq2.bm.c(abu2)) {
            this.g.remove(xq2.b_());
        }
        for (int i2 = 0; i2 < this.f.size(); ++i2) {
            axa axa3 = (axa)this.f.get(i2);
            if (axa3.a.K || !axa3.a.bm.c(abu2) && !abu2.A()) {
                this.i.remove(axa3.a);
                this.f.remove(axa3);
                continue;
            }
            if (abu2.A() || axa3.a.ap != this.c) continue;
            this.a(0, axa3.a.o, axa3.a.b_(), axa3.a.s, axa3.a.u, axa3.a.y);
        }
        if (abu2.A()) {
            this.a(1, xq2.o, "frame-" + abu2.B().x(), abu2.B().b, abu2.B().d, abu2.B().a * 90);
        }
    }

    private void a(int n2, afs afs2, String string, double d2, double d3, double d4) {
        byte by2;
        int n3 = 1 << this.d;
        float f2 = (float)(d2 - (double)this.a) / (float)n3;
        float f3 = (float)(d3 - (double)this.b) / (float)n3;
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.5);
        byte by4 = (byte)((double)(f3 * 2.0f) + 0.5);
        int n4 = 63;
        if (f2 >= (float)(-n4) && f3 >= (float)(-n4) && f2 <= (float)n4 && f3 <= (float)n4) {
            by2 = (byte)((d4 += d4 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.c < 0) {
                int n5 = (int)(afs2.N().g() / 10L);
                by2 = (byte)(n5 * n5 * 34187121 + n5 * 121 >> 15 & 0xF);
            }
        } else if (Math.abs(f2) < 320.0f && Math.abs(f3) < 320.0f) {
            n2 = 6;
            by2 = 0;
            if (f2 <= (float)(-n4)) {
                by3 = (byte)((double)(n4 * 2) + 2.5);
            }
            if (f3 <= (float)(-n4)) {
                by4 = (byte)((double)(n4 * 2) + 2.5);
            }
            if (f2 >= (float)n4) {
                by3 = (byte)(n4 * 2 + 1);
            }
            if (f3 >= (float)n4) {
                by4 = (byte)(n4 * 2 + 1);
            }
        } else {
            this.g.remove(string);
            return;
        }
        this.g.put(string, new axb(this, (byte)n2, by3, by4, by2));
    }

    public byte[] a(abu abu2, afs afs2, xq xq2) {
        axa axa2 = (axa)this.i.get(xq2);
        if (axa2 == null) {
            return null;
        }
        return axa2.a(abu2);
    }

    public void a(int n2, int n3, int n4) {
        super.c();
        for (int i2 = 0; i2 < this.f.size(); ++i2) {
            axa axa2 = (axa)this.f.get(i2);
            if (axa2.b[n2] < 0 || axa2.b[n2] > n3) {
                axa2.b[n2] = n3;
            }
            if (axa2.c[n2] >= 0 && axa2.c[n2] >= n4) continue;
            axa2.c[n2] = n4;
        }
    }

    public void a(byte[] byArray) {
        if (byArray[0] == 0) {
            int n2 = byArray[1] & 0xFF;
            int n3 = byArray[2] & 0xFF;
            for (int i2 = 0; i2 < byArray.length - 3; ++i2) {
                this.e[(i2 + n3) * 128 + n2] = byArray[i2 + 3];
            }
            this.c();
        } else if (byArray[0] == 1) {
            this.g.clear();
            for (int i3 = 0; i3 < (byArray.length - 1) / 3; ++i3) {
                byte by2 = (byte)(byArray[i3 * 3 + 1] >> 4);
                byte by3 = byArray[i3 * 3 + 2];
                byte by4 = byArray[i3 * 3 + 3];
                byte by5 = (byte)(byArray[i3 * 3 + 1] & 0xF);
                this.g.put("icon-" + i3, new axb(this, by2, by3, by4, by5));
            }
        } else if (byArray[0] == 2) {
            this.d = byArray[1];
        }
    }

    public axa a(xq xq2) {
        axa axa2 = (axa)this.i.get(xq2);
        if (axa2 == null) {
            axa2 = new axa(this, xq2);
            this.i.put(xq2, axa2);
            this.f.add(axa2);
        }
        return axa2;
    }
}

