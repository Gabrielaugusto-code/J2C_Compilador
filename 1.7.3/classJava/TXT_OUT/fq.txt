/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fq
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte i;
    private byte j;
    private byte k;
    private rv l;
    private List m;

    public fq() {
    }

    public fq(rm rm2) {
        this.a = rm2.x();
        this.b = (byte)qx.a(rm2);
        this.c = rm2.as.a(rm2.s);
        this.d = oy.c(rm2.t * 32.0);
        this.e = rm2.as.a(rm2.u);
        this.i = (byte)(rm2.y * 256.0f / 360.0f);
        this.j = (byte)(rm2.z * 256.0f / 360.0f);
        this.k = (byte)(rm2.aO * 256.0f / 360.0f);
        double d2 = 3.9;
        double d3 = rm2.v;
        double d4 = rm2.w;
        double d5 = rm2.x;
        if (d3 < -d2) {
            d3 = -d2;
        }
        if (d4 < -d2) {
            d4 = -d2;
        }
        if (d5 < -d2) {
            d5 = -d2;
        }
        if (d3 > d2) {
            d3 = d2;
        }
        if (d4 > d2) {
            d4 = d2;
        }
        if (d5 > d2) {
            d5 = d2;
        }
        this.f = (int)(d3 * 8000.0);
        this.g = (int)(d4 * 8000.0);
        this.h = (int)(d5 * 8000.0);
        this.l = rm2.y();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.b = ep2.readByte() & 0xFF;
        this.c = ep2.readInt();
        this.d = ep2.readInt();
        this.e = ep2.readInt();
        this.i = ep2.readByte();
        this.j = ep2.readByte();
        this.k = ep2.readByte();
        this.f = ep2.readShort();
        this.g = ep2.readShort();
        this.h = ep2.readShort();
        this.m = rv.b(ep2);
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.writeByte(this.b & 0xFF);
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
        ep2.writeInt(this.e);
        ep2.writeByte(this.i);
        ep2.writeByte(this.j);
        ep2.writeByte(this.k);
        ep2.writeShort(this.f);
        ep2.writeShort(this.g);
        ep2.writeShort(this.h);
        this.l.a(ep2);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public List c() {
        if (this.m == null) {
            this.m = this.l.c();
        }
        return this.m;
    }

    @Override
    public String b() {
        return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f, xd=%.2f, yd=%.2f, zd=%.2f", this.a, this.b, Float.valueOf((float)this.c / 32.0f), Float.valueOf((float)this.d / 32.0f), Float.valueOf((float)this.e / 32.0f), Float.valueOf((float)this.f / 8000.0f), Float.valueOf((float)this.g / 8000.0f), Float.valueOf((float)this.h / 8000.0f));
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.f;
    }

    public int j() {
        return this.g;
    }

    public int k() {
        return this.h;
    }

    public byte l() {
        return this.i;
    }

    public byte m() {
        return this.j;
    }

    public byte n() {
        return this.k;
    }
}

