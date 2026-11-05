/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class ds
extends dv {
    private short b;

    public ds() {
    }

    public ds(short s2) {
        this.b = s2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeShort(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2) {
        this.b = dataInput.readShort();
    }

    @Override
    public byte a() {
        return 2;
    }

    @Override
    public String toString() {
        return "" + this.b + "s";
    }

    @Override
    public du b() {
        return new ds(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            ds ds2 = (ds)object;
            return this.b == ds2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b;
    }

    @Override
    public long c() {
        return this.b;
    }

    @Override
    public int d() {
        return this.b;
    }

    @Override
    public short e() {
        return this.b;
    }

    @Override
    public byte f() {
        return (byte)(this.b & 0xFF);
    }

    @Override
    public double g() {
        return this.b;
    }

    @Override
    public float h() {
        return this.b;
    }
}

