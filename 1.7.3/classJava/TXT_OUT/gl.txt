/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class gl
extends fk {
    private double a;
    private double b;
    private double c;
    private float d;
    private List e;
    private float f;
    private float g;
    private float h;

    public gl() {
    }

    public gl(double d2, double d3, double d4, float f2, List list, ayp ayp2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = f2;
        this.e = new ArrayList(list);
        if (ayp2 != null) {
            this.f = (float)ayp2.c;
            this.g = (float)ayp2.d;
            this.h = (float)ayp2.e;
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readFloat();
        this.b = ep2.readFloat();
        this.c = ep2.readFloat();
        this.d = ep2.readFloat();
        int n2 = ep2.readInt();
        this.e = new ArrayList(n2);
        int n3 = (int)this.a;
        int n4 = (int)this.b;
        int n5 = (int)this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n6 = ep2.readByte() + n3;
            int n7 = ep2.readByte() + n4;
            int n8 = ep2.readByte() + n5;
            this.e.add(new afk(n6, n7, n8));
        }
        this.f = ep2.readFloat();
        this.g = ep2.readFloat();
        this.h = ep2.readFloat();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeFloat((float)this.a);
        ep2.writeFloat((float)this.b);
        ep2.writeFloat((float)this.c);
        ep2.writeFloat(this.d);
        ep2.writeInt(this.e.size());
        int n2 = (int)this.a;
        int n3 = (int)this.b;
        int n4 = (int)this.c;
        for (afk afk2 : this.e) {
            int n5 = afk2.a - n2;
            int n6 = afk2.b - n3;
            int n7 = afk2.c - n4;
            ep2.writeByte(n5);
            ep2.writeByte(n6);
            ep2.writeByte(n7);
        }
        ep2.writeFloat(this.f);
        ep2.writeFloat(this.g);
        ep2.writeFloat(this.h);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public float c() {
        return this.f;
    }

    public float d() {
        return this.g;
    }

    public float e() {
        return this.h;
    }

    public double f() {
        return this.a;
    }

    public double g() {
        return this.b;
    }

    public double h() {
        return this.c;
    }

    public float i() {
        return this.d;
    }

    public List j() {
        return this.e;
    }
}

