/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;

public class dt
extends du {
    private String b;

    public dt() {
        this.b = "";
    }

    public dt(String string) {
        this.b = string;
        if (string == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }

    @Override
    void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.b);
    }

    @Override
    void a(DataInput dataInput, int n2) {
        this.b = dataInput.readUTF();
    }

    @Override
    public byte a() {
        return 8;
    }

    @Override
    public String toString() {
        return "\"" + this.b + "\"";
    }

    @Override
    public du b() {
        return new dt(this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            dt dt2 = (dt)object;
            return this.b == null && dt2.b == null || this.b != null && this.b.equals(dt2.b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    @Override
    public String a_() {
        return this.b;
    }
}

