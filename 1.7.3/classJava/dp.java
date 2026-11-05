/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

public class dp
extends du {
    private List b = new ArrayList();
    private byte c = 0;

    @Override
    void a(DataOutput dataOutput) {
        this.c = !this.b.isEmpty() ? ((du)this.b.get(0)).a() : (byte)0;
        dataOutput.writeByte(this.c);
        dataOutput.writeInt(this.b.size());
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            ((du)this.b.get(i2)).a(dataOutput);
        }
    }

    @Override
    void a(DataInput dataInput, int n2) {
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.c = dataInput.readByte();
        int n3 = dataInput.readInt();
        this.b = new ArrayList();
        for (int i2 = 0; i2 < n3; ++i2) {
            du du2 = du.a(this.c);
            du2.a(dataInput, n2 + 1);
            this.b.add(du2);
        }
    }

    @Override
    public byte a() {
        return 9;
    }

    @Override
    public String toString() {
        String string = "[";
        int n2 = 0;
        for (du du2 : this.b) {
            string = string + "" + n2 + ':' + du2 + ',';
            ++n2;
        }
        return string + "]";
    }

    public void a(du du2) {
        if (this.c == 0) {
            this.c = du2.a();
        } else if (this.c != du2.a()) {
            System.err.println("WARNING: Adding mismatching tag types to tag list");
            return;
        }
        this.b.add(du2);
    }

    public void a(int n2, du du2) {
        if (n2 < 0 || n2 >= this.b.size()) {
            System.err.println("WARNING: index out of bounds to set tag in tag list");
            return;
        }
        if (this.c == 0) {
            this.c = du2.a();
        } else if (this.c != du2.a()) {
            System.err.println("WARNING: Adding mismatching tag types to tag list");
            return;
        }
        this.b.set(n2, du2);
    }

    public du a(int n2) {
        return (du)this.b.remove(n2);
    }

    public dg b(int n2) {
        if (n2 < 0 || n2 >= this.b.size()) {
            return new dg();
        }
        du du2 = (du)this.b.get(n2);
        if (du2.a() == 10) {
            return (dg)du2;
        }
        return new dg();
    }

    public int[] c(int n2) {
        if (n2 < 0 || n2 >= this.b.size()) {
            return new int[0];
        }
        du du2 = (du)this.b.get(n2);
        if (du2.a() == 11) {
            return ((dm)du2).c();
        }
        return new int[0];
    }

    public double d(int n2) {
        if (n2 < 0 || n2 >= this.b.size()) {
            return 0.0;
        }
        du du2 = (du)this.b.get(n2);
        if (du2.a() == 6) {
            return ((dj)du2).g();
        }
        return 0.0;
    }

    public float e(int n2) {
        if (n2 < 0 || n2 >= this.b.size()) {
            return 0.0f;
        }
        du du2 = (du)this.b.get(n2);
        if (du2.a() == 5) {
            return ((dl)du2).h();
        }
        return 0.0f;
    }

    public String f(int n2) {
        if (n2 < 0 || n2 >= this.b.size()) {
            return "";
        }
        du du2 = (du)this.b.get(n2);
        if (du2.a() == 8) {
            return du2.a_();
        }
        return du2.toString();
    }

    public int c() {
        return this.b.size();
    }

    @Override
    public du b() {
        dp dp2 = new dp();
        dp2.c = this.c;
        for (du du2 : this.b) {
            du du3 = du2.b();
            dp2.b.add(du3);
        }
        return dp2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            dp dp2 = (dp)object;
            if (this.c == dp2.c) {
                return ((Object)this.b).equals(dp2.b);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ ((Object)this.b).hashCode();
    }

    public int d() {
        return this.c;
    }
}

