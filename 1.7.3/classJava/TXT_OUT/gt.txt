/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import org.apache.commons.lang3.Validate;

public class gt
extends fk {
    private String a;
    private int b;
    private int c = Integer.MAX_VALUE;
    private int d;
    private float e;
    private int f;

    public gt() {
    }

    public gt(String string, double d2, double d3, double d4, float f2, float f3) {
        Validate.notNull((Object)string, (String)"name", (Object[])new Object[0]);
        this.a = string;
        this.b = (int)(d2 * 8.0);
        this.c = (int)(d3 * 8.0);
        this.d = (int)(d4 * 8.0);
        this.e = f2;
        this.f = (int)(f3 * 63.0f);
        if (this.f < 0) {
            this.f = 0;
        }
        if (this.f > 255) {
            this.f = 255;
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(256);
        this.b = ep2.readInt();
        this.c = ep2.readInt();
        this.d = ep2.readInt();
        this.e = ep2.readFloat();
        this.f = ep2.readUnsignedByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
        ep2.writeFloat(this.e);
        ep2.writeByte(this.f);
    }

    public String c() {
        return this.a;
    }

    public double d() {
        return (float)this.b / 8.0f;
    }

    public double e() {
        return (float)this.c / 8.0f;
    }

    public double f() {
        return (float)this.d / 8.0f;
    }

    public float g() {
        return this.e;
    }

    public float h() {
        return (float)this.f / 63.0f;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }
}

