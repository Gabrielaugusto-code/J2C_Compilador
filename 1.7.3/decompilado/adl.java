/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class adl
implements adx {
    @Override
    public boolean a(yv yv2, afs afs2) {
        abu abu2 = null;
        ArrayList<abu> arrayList = new ArrayList<abu>();
        for (int i2 = 0; i2 < yv2.a(); ++i2) {
            abu abu3 = yv2.a(i2);
            if (abu3 == null) continue;
            if (abu3.b() instanceof zs) {
                zs zs2 = (zs)abu3.b();
                if (zs2.m_() == zu.a && abu2 == null) {
                    abu2 = abu3;
                    continue;
                }
                return false;
            }
            if (abu3.b() == abv.aR) {
                arrayList.add(abu3);
                continue;
            }
            return false;
        }
        return abu2 != null && !arrayList.isEmpty();
    }

    @Override
    public abu a(yv yv2) {
        float f2;
        float f3;
        int n2;
        int n3;
        abu abu2 = null;
        int[] nArray = new int[3];
        int n4 = 0;
        int n5 = 0;
        zs zs2 = null;
        for (n3 = 0; n3 < yv2.a(); ++n3) {
            abu abu3 = yv2.a(n3);
            if (abu3 == null) continue;
            if (abu3.b() instanceof zs) {
                zs2 = (zs)abu3.b();
                if (zs2.m_() == zu.a && abu2 == null) {
                    abu2 = abu3.m();
                    abu2.b = 1;
                    if (!zs2.c_(abu3)) continue;
                    n2 = zs2.b(abu2);
                    f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    float f4 = (float)(n2 & 0xFF) / 255.0f;
                    n4 = (int)((float)n4 + Math.max(f3, Math.max(f2, f4)) * 255.0f);
                    nArray[0] = (int)((float)nArray[0] + f3 * 255.0f);
                    nArray[1] = (int)((float)nArray[1] + f2 * 255.0f);
                    nArray[2] = (int)((float)nArray[2] + f4 * 255.0f);
                    ++n5;
                    continue;
                }
                return null;
            }
            if (abu3.b() == abv.aR) {
                float[] fArray = vg.bp[air.b(abu3.k())];
                int n6 = (int)(fArray[0] * 255.0f);
                int n7 = (int)(fArray[1] * 255.0f);
                int n8 = (int)(fArray[2] * 255.0f);
                n4 += Math.max(n6, Math.max(n7, n8));
                nArray[0] = nArray[0] + n6;
                nArray[1] = nArray[1] + n7;
                nArray[2] = nArray[2] + n8;
                ++n5;
                continue;
            }
            return null;
        }
        if (zs2 == null) {
            return null;
        }
        n3 = nArray[0] / n5;
        int n9 = nArray[1] / n5;
        n2 = nArray[2] / n5;
        f3 = (float)n4 / (float)n5;
        f2 = Math.max(n3, Math.max(n9, n2));
        n3 = (int)((float)n3 * f3 / f2);
        n9 = (int)((float)n9 * f3 / f2);
        n2 = (int)((float)n2 * f3 / f2);
        int n10 = n3;
        n10 = (n10 << 8) + n9;
        n10 = (n10 << 8) + n2;
        zs2.b(abu2, n10);
        return abu2;
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public abu b() {
        return null;
    }
}

