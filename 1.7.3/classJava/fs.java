/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.util.List;

public class fs
extends fk {
    private int a;
    private GameProfile b;
    private int c;
    private int d;
    private int e;
    private byte f;
    private byte g;
    private int h;
    private rv i;
    private List j;

    public fs() {
    }

    public fs(xq xq2) {
        this.a = xq2.x();
        this.b = xq2.bI();
        this.c = oy.c(xq2.s * 32.0);
        this.d = oy.c(xq2.t * 32.0);
        this.e = oy.c(xq2.u * 32.0);
        this.f = (byte)(xq2.y * 256.0f / 360.0f);
        this.g = (byte)(xq2.z * 256.0f / 360.0f);
        abu abu2 = xq2.bm.h();
        this.h = abu2 == null ? 0 : abs.b(abu2.b());
        this.i = xq2.y();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.b = new GameProfile(ep2.c(36), ep2.c(16));
        this.c = ep2.readInt();
        this.d = ep2.readInt();
        this.e = ep2.readInt();
        this.f = ep2.readByte();
        this.g = ep2.readByte();
        this.h = ep2.readShort();
        this.j = rv.b(ep2);
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.a(this.b.getId());
        ep2.a(this.b.getName());
        ep2.writeInt(this.c);
        ep2.writeInt(this.d);
        ep2.writeInt(this.e);
        ep2.writeByte(this.f);
        ep2.writeByte(this.g);
        ep2.writeShort(this.h);
        this.i.a(ep2);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public List c() {
        if (this.j == null) {
            this.j = this.i.c();
        }
        return this.j;
    }

    @Override
    public String b() {
        return String.format("id=%d, gameProfile='%s', x=%.2f, y=%.2f, z=%.2f, carried=%d", this.a, this.b, Float.valueOf((float)this.c / 32.0f), Float.valueOf((float)this.d / 32.0f), Float.valueOf((float)this.e / 32.0f), this.h);
    }

    public int d() {
        return this.a;
    }

    public GameProfile e() {
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

    public byte i() {
        return this.f;
    }

    public byte j() {
        return this.g;
    }

    public int k() {
        return this.h;
    }
}

