/*
 * Decompiled with CFR 0.152.
 */
public class aow {
    public static aox a(dg dg2) {
        int n2 = dg2.f("xPos");
        int n3 = dg2.f("zPos");
        aox aox2 = new aox(n2, n3);
        aox2.g = dg2.k("Blocks");
        aox2.f = new aor(dg2.k("Data"), 7);
        aox2.e = new aor(dg2.k("SkyLight"), 7);
        aox2.d = new aor(dg2.k("BlockLight"), 7);
        aox2.c = dg2.k("HeightMap");
        aox2.b = dg2.n("TerrainPopulated");
        aox2.h = dg2.c("Entities", 10);
        aox2.i = dg2.c("TileEntities", 10);
        aox2.j = dg2.c("TileTicks", 10);
        try {
            aox2.a = dg2.g("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            aox2.a = dg2.f("LastUpdate");
        }
        return aox2;
    }

    public static void a(aox aox2, dg dg2, ags ags2) {
        int n2;
        int n3;
        dg2.a("xPos", aox2.k);
        dg2.a("zPos", aox2.l);
        dg2.a("LastUpdate", aox2.a);
        int[] nArray = new int[aox2.c.length];
        for (int i2 = 0; i2 < aox2.c.length; ++i2) {
            nArray[i2] = aox2.c[i2];
        }
        dg2.a("HeightMap", nArray);
        dg2.a("TerrainPopulated", aox2.b);
        dp dp2 = new dp();
        for (int i3 = 0; i3 < 8; ++i3) {
            int n4;
            n3 = 1;
            for (n2 = 0; n2 < 16 && n3 != 0; ++n2) {
                block3: for (int i4 = 0; i4 < 16 && n3 != 0; ++i4) {
                    for (int i5 = 0; i5 < 16; ++i5) {
                        int n5 = n2 << 11 | i5 << 7 | i4 + (i3 << 4);
                        n4 = aox2.g[n5];
                        if (n4 == 0) continue;
                        n3 = 0;
                        continue block3;
                    }
                }
            }
            if (n3 != 0) continue;
            byte[] byArray = new byte[4096];
            aom aom2 = new aom(byArray.length, 4);
            aom aom3 = new aom(byArray.length, 4);
            aom aom4 = new aom(byArray.length, 4);
            for (n4 = 0; n4 < 16; ++n4) {
                for (int i6 = 0; i6 < 16; ++i6) {
                    for (int i7 = 0; i7 < 16; ++i7) {
                        int n6 = n4 << 11 | i7 << 7 | i6 + (i3 << 4);
                        byte by2 = aox2.g[n6];
                        byArray[i6 << 8 | i7 << 4 | n4] = (byte)(by2 & 0xFF);
                        aom2.a(n4, i6, i7, aox2.f.a(n4, i6 + (i3 << 4), i7));
                        aom3.a(n4, i6, i7, aox2.e.a(n4, i6 + (i3 << 4), i7));
                        aom4.a(n4, i6, i7, aox2.d.a(n4, i6 + (i3 << 4), i7));
                    }
                }
            }
            dg dg3 = new dg();
            dg3.a("Y", (byte)(i3 & 0xFF));
            dg3.a("Blocks", byArray);
            dg3.a("Data", aom2.a);
            dg3.a("SkyLight", aom3.a);
            dg3.a("BlockLight", aom4.a);
            dp2.a(dg3);
        }
        dg2.a("Sections", dp2);
        byte[] byArray = new byte[256];
        for (n3 = 0; n3 < 16; ++n3) {
            for (n2 = 0; n2 < 16; ++n2) {
                byArray[n2 << 4 | n3] = (byte)(ags2.a((int)(aox2.k << 4 | n3), (int)(aox2.l << 4 | n2)).ay & 0xFF);
            }
        }
        dg2.a("Biomes", byArray);
        dg2.a("Entities", aox2.h);
        dg2.a("TileEntities", aox2.i);
        if (aox2.j != null) {
            dg2.a("TileTicks", aox2.j);
        }
    }
}

