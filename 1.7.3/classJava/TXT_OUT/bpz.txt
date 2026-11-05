/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class bpz {
    private static bpz a = null;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;

    private bpz(boolean bl2, boolean bl3, int n2, int n3, int n4, int n5, int n6) {
        this.g = bl2;
        this.b = n2;
        this.d = n3;
        this.c = n4;
        this.e = n5;
        this.h = bl3;
        this.f = n6;
    }

    public bpz() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    public bpz(int n2, int n3, int n4) {
        this(false, false, n2, n3, n2, n3, n4);
    }

    public bpz(int n2, int n3, int n4, int n5, int n6) {
        this(true, false, n2, n3, n4, n5, n6);
    }

    public void a() {
        if (this.equals(a)) {
            return;
        }
        if (a == null || this.h != a.b()) {
            a = this;
            if (this.h) {
                GL11.glDisable((int)3042);
                return;
            }
            GL11.glEnable((int)3042);
        }
        GL14.glBlendEquation((int)this.f);
        if (this.g) {
            GL14.glBlendFuncSeparate((int)this.b, (int)this.d, (int)this.c, (int)this.e);
        } else {
            GL11.glBlendFunc((int)this.b, (int)this.d);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bpz)) {
            return false;
        }
        bpz bpz2 = (bpz)object;
        if (this.f != bpz2.f) {
            return false;
        }
        if (this.e != bpz2.e) {
            return false;
        }
        if (this.d != bpz2.d) {
            return false;
        }
        if (this.h != bpz2.h) {
            return false;
        }
        if (this.g != bpz2.g) {
            return false;
        }
        if (this.c != bpz2.c) {
            return false;
        }
        return this.b == bpz2.b;
    }

    public int hashCode() {
        int n2 = this.b;
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.d;
        n2 = 31 * n2 + this.e;
        n2 = 31 * n2 + this.f;
        n2 = 31 * n2 + (this.g ? 1 : 0);
        n2 = 31 * n2 + (this.h ? 1 : 0);
        return n2;
    }

    public boolean b() {
        return this.h;
    }

    public static bpz a(JsonObject jsonObject) {
        if (jsonObject == null) {
            return new bpz();
        }
        int n2 = 32774;
        int n3 = 1;
        int n4 = 0;
        int n5 = 1;
        int n6 = 0;
        boolean bl2 = true;
        boolean bl3 = false;
        if (ol.a(jsonObject, "func") && (n2 = bpz.a(jsonObject.get("func").getAsString())) != 32774) {
            bl2 = false;
        }
        if (ol.a(jsonObject, "srcrgb") && (n3 = bpz.b(jsonObject.get("srcrgb").getAsString())) != 1) {
            bl2 = false;
        }
        if (ol.a(jsonObject, "dstrgb") && (n4 = bpz.b(jsonObject.get("dstrgb").getAsString())) != 0) {
            bl2 = false;
        }
        if (ol.a(jsonObject, "srcalpha")) {
            n5 = bpz.b(jsonObject.get("srcalpha").getAsString());
            if (n5 != 1) {
                bl2 = false;
            }
            bl3 = true;
        }
        if (ol.a(jsonObject, "dstalpha")) {
            n6 = bpz.b(jsonObject.get("dstalpha").getAsString());
            if (n6 != 0) {
                bl2 = false;
            }
            bl3 = true;
        }
        if (bl2) {
            return new bpz();
        }
        if (bl3) {
            return new bpz(n3, n4, n5, n6, n2);
        }
        return new bpz(n3, n4, n2);
    }

    private static int a(String string) {
        String string2 = string.trim().toLowerCase();
        if (string2.equals("add")) {
            return 32774;
        }
        if (string2.equals("subtract")) {
            return 32778;
        }
        if (string2.equals("reversesubtract")) {
            return 32779;
        }
        if (string2.equals("reverse_subtract")) {
            return 32779;
        }
        if (string2.equals("min")) {
            return 32775;
        }
        if (string2.equals("max")) {
            return 32776;
        }
        return 32774;
    }

    private static int b(String string) {
        String string2 = string.trim().toLowerCase();
        string2 = string2.replaceAll("_", "");
        string2 = string2.replaceAll("one", "1");
        string2 = string2.replaceAll("zero", "0");
        if ((string2 = string2.replaceAll("minus", "-")).equals("0")) {
            return 0;
        }
        if (string2.equals("1")) {
            return 1;
        }
        if (string2.equals("srccolor")) {
            return 768;
        }
        if (string2.equals("1-srccolor")) {
            return 769;
        }
        if (string2.equals("dstcolor")) {
            return 774;
        }
        if (string2.equals("1-dstcolor")) {
            return 775;
        }
        if (string2.equals("srcalpha")) {
            return 770;
        }
        if (string2.equals("1-srcalpha")) {
            return 771;
        }
        if (string2.equals("dstalpha")) {
            return 772;
        }
        if (string2.equals("1-dstalpha")) {
            return 773;
        }
        return -1;
    }
}

