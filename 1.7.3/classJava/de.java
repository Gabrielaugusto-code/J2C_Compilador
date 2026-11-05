/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class de
extends du {
    private byte[] b;

    de() {
    }

    public de(byte[] byArray) {
        this.b = byArray;
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeInt(this.b.length);
        dataOutput.write(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2) {
        int n3 = dataInput.readInt();
        this.b = new byte[n3];
        dataInput.readFully(this.b);
    }

    @Override
    public byte a() {
        return 7;
    }

    @Override
    public String toString() {
        return "[" + this.b.length + " bytes]";
    }

    @Override
    public du b() {
        byte[] byArray = new byte[this.b.length];
        System.arraycopy(this.b, 0, byArray, 0, this.b.length);
        return new de(byArray);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            return Arrays.equals(this.b, ((de)object).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.b);
    }

    public byte[] c() {
        return this.b;
    }
}

