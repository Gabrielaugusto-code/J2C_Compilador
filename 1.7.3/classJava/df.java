/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class df
extends dv {
    private byte b;

    df() {
    }

    public df(byte by2) {
        this.b = by2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeByte(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2) {
        this.b = dataInput.readByte();
    }

    @Override
    public byte a() {
        return 1;
    }

    @Override
    public String toString() {
        return "" + this.b + "b";
    }

    @Override
    public du b() {
        return new df(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            df df2 = (df)object;
            return this.b == df2.b;
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
        return this.b;
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

