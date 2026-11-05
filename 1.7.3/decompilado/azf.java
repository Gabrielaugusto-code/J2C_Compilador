/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class azf
implements Comparable {
    private static final List a = new ArrayList();
    private static final oq b = new oq();
    private static final Set c = new HashSet();
    private final String d;
    private final int e;
    private final String f;
    private int g;
    private boolean h;
    private int i;

    public static void a(int n2) {
        if (n2 == 0) {
            return;
        }
        azf azf2 = (azf)b.a(n2);
        if (azf2 != null) {
            ++azf2.i;
        }
    }

    public static void a(int n2, boolean bl2) {
        if (n2 == 0) {
            return;
        }
        azf azf2 = (azf)b.a(n2);
        if (azf2 != null) {
            azf2.h = bl2;
        }
    }

    public static void a() {
        for (azf azf2 : a) {
            azf2.j();
        }
    }

    public static void b() {
        b.c();
        for (azf azf2 : a) {
            b.a(azf2.g, azf2);
        }
    }

    public static Set c() {
        return c;
    }

    public azf(String string, int n2, String string2) {
        this.d = string;
        this.g = n2;
        this.e = n2;
        this.f = string2;
        a.add(this);
        b.a(n2, this);
        c.add(string2);
    }

    public boolean d() {
        return this.h;
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        if (this.i == 0) {
            return false;
        }
        --this.i;
        return true;
    }

    private void j() {
        this.i = 0;
        this.h = false;
    }

    public String g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.g;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public int a(azf azf2) {
        int n2 = bsc.a(this.f, new Object[0]).compareTo(bsc.a(azf2.f, new Object[0]));
        if (n2 == 0) {
            n2 = bsc.a(this.d, new Object[0]).compareTo(bsc.a(azf2.d, new Object[0]));
        }
        return n2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((azf)object);
    }
}

