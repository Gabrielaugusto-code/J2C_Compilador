/*
 * Decompiled with CFR 0.152.
 */
public class hh
extends fk {
    private int[] a;

    public hh() {
    }

    public hh(int ... nArray) {
        this.a = nArray;
    }

    @Override
    public void a(ep ep2) {
        this.a = new int[ep2.readByte()];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = ep2.readInt();
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a.length);
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            ep2.writeInt(this.a[i2]);
        }
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.a[i2]);
        }
        return String.format("entities=%d[%s]", this.a.length, stringBuilder);
    }

    public int[] c() {
        return this.a;
    }
}

