/*
 * Decompiled with CFR 0.152.
 */
public class gm
extends fk {
    public static final String[] a = new String[]{"tile.bed.notValid", null, null, "gameMode.changed"};
    private int b;
    private float c;

    public gm() {
    }

    public gm(int n2, float f2) {
        this.b = n2;
        this.c = f2;
    }

    @Override
    public void a(ep ep2) {
        this.b = ep2.readUnsignedByte();
        this.c = ep2.readFloat();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.b);
        ep2.writeFloat(this.c);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public int c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }
}

