/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class bmx
implements Comparator {
    private float a;
    private float b;
    private float c;
    private int[] d;

    public bmx(int[] nArray, float f2, float f3, float f4) {
        this.d = nArray;
        this.a = f2;
        this.b = f3;
        this.c = f4;
    }

    public int a(Integer n2, Integer n3) {
        float f2 = Float.intBitsToFloat(this.d[n2]) - this.a;
        float f3 = Float.intBitsToFloat(this.d[n2 + 1]) - this.b;
        float f4 = Float.intBitsToFloat(this.d[n2 + 2]) - this.c;
        float f5 = Float.intBitsToFloat(this.d[n2 + 8]) - this.a;
        float f6 = Float.intBitsToFloat(this.d[n2 + 9]) - this.b;
        float f7 = Float.intBitsToFloat(this.d[n2 + 10]) - this.c;
        float f8 = Float.intBitsToFloat(this.d[n2 + 16]) - this.a;
        float f9 = Float.intBitsToFloat(this.d[n2 + 17]) - this.b;
        float f10 = Float.intBitsToFloat(this.d[n2 + 18]) - this.c;
        float f11 = Float.intBitsToFloat(this.d[n2 + 24]) - this.a;
        float f12 = Float.intBitsToFloat(this.d[n2 + 25]) - this.b;
        float f13 = Float.intBitsToFloat(this.d[n2 + 26]) - this.c;
        float f14 = Float.intBitsToFloat(this.d[n3]) - this.a;
        float f15 = Float.intBitsToFloat(this.d[n3 + 1]) - this.b;
        float f16 = Float.intBitsToFloat(this.d[n3 + 2]) - this.c;
        float f17 = Float.intBitsToFloat(this.d[n3 + 8]) - this.a;
        float f18 = Float.intBitsToFloat(this.d[n3 + 9]) - this.b;
        float f19 = Float.intBitsToFloat(this.d[n3 + 10]) - this.c;
        float f20 = Float.intBitsToFloat(this.d[n3 + 16]) - this.a;
        float f21 = Float.intBitsToFloat(this.d[n3 + 17]) - this.b;
        float f22 = Float.intBitsToFloat(this.d[n3 + 18]) - this.c;
        float f23 = Float.intBitsToFloat(this.d[n3 + 24]) - this.a;
        float f24 = Float.intBitsToFloat(this.d[n3 + 25]) - this.b;
        float f25 = Float.intBitsToFloat(this.d[n3 + 26]) - this.c;
        float f26 = (f2 + f5 + f8 + f11) * 0.25f;
        float f27 = (f3 + f6 + f9 + f12) * 0.25f;
        float f28 = (f4 + f7 + f10 + f13) * 0.25f;
        float f29 = (f14 + f17 + f20 + f23) * 0.25f;
        float f30 = (f15 + f18 + f21 + f24) * 0.25f;
        float f31 = (f16 + f19 + f22 + f25) * 0.25f;
        float f32 = f26 * f26 + f27 * f27 + f28 * f28;
        float f33 = f29 * f29 + f30 * f30 + f31 * f31;
        return Float.compare(f33, f32);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

