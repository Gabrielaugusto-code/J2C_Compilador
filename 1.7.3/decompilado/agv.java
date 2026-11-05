/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class agv
extends ags {
    private agl c;
    private float d;

    public agv(agl agl2, float f2) {
        this.c = agl2;
        this.d = f2;
    }

    @Override
    public agl a(int n2, int n3) {
        return this.c;
    }

    @Override
    public agl[] a(agl[] aglArray, int n2, int n3, int n4, int n5) {
        if (aglArray == null || aglArray.length < n4 * n5) {
            aglArray = new agl[n4 * n5];
        }
        Arrays.fill(aglArray, 0, n4 * n5, this.c);
        return aglArray;
    }

    @Override
    public float[] a(float[] fArray, int n2, int n3, int n4, int n5) {
        if (fArray == null || fArray.length < n4 * n5) {
            fArray = new float[n4 * n5];
        }
        Arrays.fill(fArray, 0, n4 * n5, this.d);
        return fArray;
    }

    @Override
    public agl[] b(agl[] aglArray, int n2, int n3, int n4, int n5) {
        if (aglArray == null || aglArray.length < n4 * n5) {
            aglArray = new agl[n4 * n5];
        }
        Arrays.fill(aglArray, 0, n4 * n5, this.c);
        return aglArray;
    }

    @Override
    public agl[] a(agl[] aglArray, int n2, int n3, int n4, int n5, boolean bl2) {
        return this.b(aglArray, n2, n3, n4, n5);
    }

    @Override
    public afk a(int n2, int n3, int n4, List list, Random random) {
        if (list.contains(this.c)) {
            return new afk(n2 - n4 + random.nextInt(n4 * 2 + 1), 0, n3 - n4 + random.nextInt(n4 * 2 + 1));
        }
        return null;
    }

    @Override
    public boolean a(int n2, int n3, int n4, List list) {
        return list.contains(this.c);
    }
}

