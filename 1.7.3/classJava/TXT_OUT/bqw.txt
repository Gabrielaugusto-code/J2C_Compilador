/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bqw
implements pw {
    private final String i;
    protected List a = Lists.newArrayList();
    private bsn j;
    protected boolean b;
    private boolean k;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    private float l;
    private float m;
    private float n;
    private float o;
    protected int g;
    protected int h;

    protected bqw(String string) {
        this.i = string;
    }

    public void a(int n2, int n3, int n4, int n5, boolean bl2) {
        this.c = n4;
        this.d = n5;
        this.b = bl2;
        float f2 = (float)((double)0.01f / (double)n2);
        float f3 = (float)((double)0.01f / (double)n3);
        this.l = (float)n4 / (float)((double)n2) + f2;
        this.m = (float)(n4 + this.e) / (float)((double)n2) - f2;
        this.n = (float)n5 / (float)n3 + f3;
        this.o = (float)(n5 + this.f) / (float)n3 - f3;
        if (this.k) {
            float f4 = 8.0f / (float)n2;
            float f5 = 8.0f / (float)n3;
            this.l += f4;
            this.m -= f4;
            this.n += f5;
            this.o -= f5;
        }
    }

    public void a(bqw bqw2) {
        this.c = bqw2.c;
        this.d = bqw2.d;
        this.e = bqw2.e;
        this.f = bqw2.f;
        this.b = bqw2.b;
        this.l = bqw2.l;
        this.m = bqw2.m;
        this.n = bqw2.n;
        this.o = bqw2.o;
    }

    public int h() {
        return this.c;
    }

    public int i() {
        return this.d;
    }

    @Override
    public int a() {
        return this.e;
    }

    @Override
    public int b() {
        return this.f;
    }

    @Override
    public float c() {
        return this.l;
    }

    @Override
    public float d() {
        return this.m;
    }

    @Override
    public float a(double d2) {
        float f2 = this.m - this.l;
        return this.l + f2 * (float)d2 / 16.0f;
    }

    @Override
    public float e() {
        return this.n;
    }

    @Override
    public float f() {
        return this.o;
    }

    @Override
    public float b(double d2) {
        float f2 = this.o - this.n;
        return this.n + f2 * ((float)d2 / 16.0f);
    }

    @Override
    public String g() {
        return this.i;
    }

    public void j() {
        ++this.h;
        if (this.h >= this.j.a(this.g)) {
            int n2 = this.j.c(this.g);
            int n3 = this.j.c() == 0 ? this.a.size() : this.j.c();
            this.g = (this.g + 1) % n3;
            this.h = 0;
            int n4 = this.j.c(this.g);
            if (n2 != n4 && n4 >= 0 && n4 < this.a.size()) {
                brb.a((int[][])this.a.get(n4), this.e, this.f, this.c, this.d, false, false);
            }
        }
    }

    public int[][] a(int n2) {
        return (int[][])this.a.get(n2);
    }

    public int k() {
        return this.a.size();
    }

    public void b(int n2) {
        this.e = n2;
    }

    public void c(int n2) {
        this.f = n2;
    }

    public void a(BufferedImage[] bufferedImageArray, bsn bsn2, boolean bl2) {
        int n2;
        this.n();
        this.k = bl2;
        int n3 = bufferedImageArray[0].getWidth();
        int n4 = bufferedImageArray[0].getHeight();
        this.e = n3;
        this.f = n4;
        if (bl2) {
            this.e += 16;
            this.f += 16;
        }
        int[][] nArrayArray = new int[bufferedImageArray.length][];
        for (n2 = 0; n2 < bufferedImageArray.length; ++n2) {
            BufferedImage bufferedImage = bufferedImageArray[n2];
            if (bufferedImage == null) continue;
            if (n2 > 0 && (bufferedImage.getWidth() != n3 >> n2 || bufferedImage.getHeight() != n4 >> n2)) {
                throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", n2, bufferedImage.getWidth(), bufferedImage.getHeight(), n3 >> n2, n4 >> n2));
            }
            nArrayArray[n2] = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), nArrayArray[n2], 0, bufferedImage.getWidth());
        }
        if (bsn2 == null) {
            if (n4 != n3) {
                throw new RuntimeException("broken aspect ratio and not an animation");
            }
            this.a(nArrayArray);
            this.a.add(this.a(nArrayArray, n3, n4));
        } else {
            n2 = n4 / n3;
            int n5 = n3;
            int n6 = n3;
            this.f = this.e;
            if (bsn2.c() > 0) {
                Iterator iterator = bsn2.e().iterator();
                while (iterator.hasNext()) {
                    int n7 = (Integer)iterator.next();
                    if (n7 >= n2) {
                        throw new RuntimeException("invalid frameindex " + n7);
                    }
                    this.e(n7);
                    this.a.set(n7, this.a(bqw.a(nArrayArray, n5, n6, n7), n5, n6));
                }
                this.j = bsn2;
            } else {
                ArrayList arrayList = Lists.newArrayList();
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.a.add(this.a(bqw.a(nArrayArray, n5, n6, i2), n5, n6));
                    arrayList.add(new bsm(i2, -1));
                }
                this.j = new bsn(arrayList, this.e, this.f, bsn2.d());
            }
        }
    }

    public void d(int n2) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            int[][] nArray = (int[][])this.a.get(i2);
            if (nArray == null) continue;
            try {
                arrayList.add(brb.a(n2, this.e, nArray));
                continue;
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Generating mipmaps for frame");
                k k2 = b2.a("Frame being iterated");
                k2.a("Frame index", i2);
                k2.a("Frame sizes", new bqx(this, nArray));
                throw new s(b2);
            }
        }
        this.a(arrayList);
    }

    private void a(int[][] nArray) {
        int n2;
        int[] nArray2 = nArray[0];
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (n2 = 0; n2 < nArray2.length; ++n2) {
            if ((nArray2[n2] & 0xFF000000) == 0) continue;
            n4 += nArray2[n2] >> 16 & 0xFF;
            n5 += nArray2[n2] >> 8 & 0xFF;
            n6 += nArray2[n2] >> 0 & 0xFF;
            ++n3;
        }
        if (n3 == 0) {
            return;
        }
        n4 /= n3;
        n5 /= n3;
        n6 /= n3;
        for (n2 = 0; n2 < nArray2.length; ++n2) {
            if ((nArray2[n2] & 0xFF000000) != 0) continue;
            nArray2[n2] = n4 << 16 | n5 << 8 | n6;
        }
    }

    private int[][] a(int[][] nArray, int n2, int n3) {
        if (!this.k) {
            return nArray;
        }
        int[][] nArrayArray = new int[nArray.length][];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int[] nArray2 = nArray[i2];
            if (nArray2 == null) continue;
            int[] nArray3 = new int[(n2 + 16 >> i2) * (n3 + 16 >> i2)];
            System.arraycopy(nArray2, 0, nArray3, 0, nArray2.length);
            nArrayArray[i2] = brb.a(nArray3, n2 >> i2, n3 >> i2, 8 >> i2);
        }
        return nArrayArray;
    }

    private void e(int n2) {
        if (this.a.size() > n2) {
            return;
        }
        for (int i2 = this.a.size(); i2 <= n2; ++i2) {
            this.a.add(null);
        }
    }

    private static int[][] a(int[][] nArray, int n2, int n3, int n4) {
        int[][] nArrayArray = new int[nArray.length][];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int[] nArray2 = nArray[i2];
            if (nArray2 == null) continue;
            nArrayArray[i2] = new int[(n2 >> i2) * (n3 >> i2)];
            System.arraycopy(nArray2, n4 * nArrayArray[i2].length, nArrayArray[i2], 0, nArrayArray[i2].length);
        }
        return nArrayArray;
    }

    public void l() {
        this.a.clear();
    }

    public boolean m() {
        return this.j != null;
    }

    public void a(List list) {
        this.a = list;
    }

    private void n() {
        this.j = null;
        this.a(Lists.newArrayList());
        this.g = 0;
        this.h = 0;
    }

    public String toString() {
        return "TextureAtlasSprite{name='" + this.i + '\'' + ", frameCount=" + this.a.size() + ", rotated=" + this.b + ", x=" + this.c + ", y=" + this.d + ", height=" + this.f + ", width=" + this.e + ", u0=" + this.l + ", u1=" + this.m + ", v0=" + this.n + ", v1=" + this.o + '}';
    }
}

