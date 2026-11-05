/*
 * Decompiled with CFR 0.152.
 */
public class je
extends fk {
    private int a;
    private int b;
    private int c;
    private String[] d;

    public je() {
    }

    public je(int n2, int n3, int n4, String[] stringArray) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = new String[]{stringArray[0], stringArray[1], stringArray[2], stringArray[3]};
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readShort();
        this.c = ep2.readInt();
        this.d = new String[4];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.d[i2] = ep2.c(15);
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeShort(this.b);
        ep2.writeInt(this.c);
        for (int i2 = 0; i2 < 4; ++i2) {
            ep2.a(this.d[i2]);
        }
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public String[] f() {
        return this.d;
    }
}

