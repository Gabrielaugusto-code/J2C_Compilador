/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class gf
extends fk {
    private int a;
    private abu[] b;

    public gf() {
    }

    public gf(int n2, List list) {
        this.a = n2;
        this.b = new abu[list.size()];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            abu abu2 = (abu)list.get(i2);
            this.b[i2] = abu2 == null ? null : abu2.m();
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readUnsignedByte();
        int n2 = ep2.readShort();
        this.b = new abu[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b[i2] = ep2.c();
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
        ep2.writeShort(this.b.length);
        for (abu abu2 : this.b) {
            ep2.a(abu2);
        }
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public int c() {
        return this.a;
    }

    public abu[] d() {
        return this.b;
    }
}

