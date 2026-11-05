/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class dj
extends dv {
    private double b;

    dj() {
    }

    public dj(double d2) {
        this.b = d2;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeDouble(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2) {
        this.b = dataInput.readDouble();
    }

    @Override
    public byte a() {
        return 6;
    }

    @Override
    public String toString() {
        return "" + this.b + "d";
    }

    @Override
    public du b() {
        return new dj(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            dj dj2 = (dj)object;
            return this.b == dj2.b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.b);
        return super.hashCode() ^ (int)(l2 ^ l2 >>> 32);
    }

    @Override
    public long c() {
        return (long)Math.floor(this.b);
    }

    @Override
    public int d() {
        return oy.c(this.b);
    }

    @Override
    public short e() {
        return (short)(oy.c(this.b) & 0xFFFF);
    }

    @Override
    public byte f() {
        return (byte)(oy.c(this.b) & 0xFF);
    }

    @Override
    public double g() {
        return this.b;
    }

    @Override
    public float h() {
        return (float)this.b;
    }
}

