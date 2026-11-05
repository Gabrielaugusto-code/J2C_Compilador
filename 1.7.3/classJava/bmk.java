/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class bmk
implements Comparator {
    int a;
    int b;

    public bmk(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public int a(bmw bmw2, bmw bmw3) {
        int n2 = bmw2.a - this.a;
        int n3 = bmw2.c - this.b;
        int n4 = bmw3.a - this.a;
        int n5 = bmw3.c - this.b;
        int n6 = n2 * n2 + n3 * n3;
        int n7 = n4 * n4 + n5 * n5;
        return ComparisonChain.start().compare(n7, n6).result();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bmw)object, (bmw)object2);
    }
}

