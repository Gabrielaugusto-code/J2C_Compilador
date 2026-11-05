/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class dl
extends dv {
    private float b;

    dl() {
    }

    public dl(float f2) {
        this.b = f2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeFloat(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2) {
        this.b = dataInput.readFloat();
    }

    @Override
    public byte a() {
        return 5;
    }

    @Override
    public String toString() {
        return "" + this.b + "f";
    }

    @Override
    public du b() {
        return new dl(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            dl dl2 = (dl)object;
            return this.b == dl2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.b);
    }

    @Override
    public long c() {
        return (long)this.b;
    }

    @Override
    public int d() {
        return oy.d(this.b);
    }

    @Override
    public short e() {
        return (short)(oy.d(this.b) & 0xFFFF);
    }

    @Override
    public byte f() {
        return (byte)(oy.d(this.b) & 0xFF);
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

