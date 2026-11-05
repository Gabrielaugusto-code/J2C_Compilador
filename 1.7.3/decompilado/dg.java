/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dg
extends du {
    private static final Logger b = LogManager.getLogger();
    private Map c = new HashMap();

    @Override
    void a(DataOutput dataOutput) {
        for (String string : this.c.keySet()) {
            du du2 = (du)this.c.get(string);
            dg.a(string, du2, dataOutput);
        }
        dataOutput.writeByte(0);
    }

    @Override
    void a(DataInput dataInput, int n2) {
        byte by2;
        if (n2 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.c.clear();
        while ((by2 = dg.a(dataInput)) != 0) {
            String string = dg.b(dataInput);
            du du2 = dg.a(by2, string, dataInput, n2 + 1);
            this.c.put(string, du2);
        }
    }

    public Set c() {
        return this.c.keySet();
    }

    @Override
    public byte a() {
        return 10;
    }

    public void a(String string, du du2) {
        this.c.put(string, du2);
    }

    public void a(String string, byte by2) {
        this.c.put(string, new df(by2));
    }

    public void a(String string, short s2) {
        this.c.put(string, new ds(s2));
    }

    public void a(String string, int n2) {
        this.c.put(string, new dn(n2));
    }

    public void a(String string, long l2) {
        this.c.put(string, new dq(l2));
    }

    public void a(String string, float f2) {
        this.c.put(string, new dl(f2));
    }

    public void a(String string, double d2) {
        this.c.put(string, new dj(d2));
    }

    public void a(String string, String string2) {
        this.c.put(string, new dt(string2));
    }

    public void a(String string, byte[] byArray) {
        this.c.put(string, new de(byArray));
    }

    public void a(String string, int[] nArray) {
        this.c.put(string, new dm(nArray));
    }

    public void a(String string, boolean bl2) {
        this.a(string, bl2 ? (byte)1 : 0);
    }

    public du a(String string) {
        return (du)this.c.get(string);
    }

    public byte b(String string) {
        du du2 = (du)this.c.get(string);
        if (du2 != null) {
            return du2.a();
        }
        return 0;
    }

    public boolean c(String string) {
        return this.c.containsKey(string);
    }

    public boolean b(String string, int n2) {
        byte by2 = this.b(string);
        if (by2 == n2) {
            return true;
        }
        if (n2 == 99) {
            return by2 == 1 || by2 == 2 || by2 == 3 || by2 == 4 || by2 == 5 || by2 == 6;
        }
        if (by2 > 0) {
            b.warn("NBT tag {} was of wrong type; expected {}, found {}", new Object[]{string, dg.g(n2), dg.g(by2)});
        }
        return false;
    }

    public byte d(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return 0;
            }
            return ((dv)this.c.get(string)).f();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public short e(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return 0;
            }
            return ((dv)this.c.get(string)).e();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public int f(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return 0;
            }
            return ((dv)this.c.get(string)).d();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public long g(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return 0L;
            }
            return ((dv)this.c.get(string)).c();
        }
        catch (ClassCastException classCastException) {
            return 0L;
        }
    }

    public float h(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return 0.0f;
            }
            return ((dv)this.c.get(string)).h();
        }
        catch (ClassCastException classCastException) {
            return 0.0f;
        }
    }

    public double i(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return 0.0;
            }
            return ((dv)this.c.get(string)).g();
        }
        catch (ClassCastException classCastException) {
            return 0.0;
        }
    }

    public String j(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return "";
            }
            return ((du)this.c.get(string)).a_();
        }
        catch (ClassCastException classCastException) {
            return "";
        }
    }

    public byte[] k(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return new byte[0];
            }
            return ((de)this.c.get(string)).c();
        }
        catch (ClassCastException classCastException) {
            throw new s(this.a(string, 7, classCastException));
        }
    }

    public int[] l(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return new int[0];
            }
            return ((dm)this.c.get(string)).c();
        }
        catch (ClassCastException classCastException) {
            throw new s(this.a(string, 11, classCastException));
        }
    }

    public dg m(String string) {
        try {
            if (!this.c.containsKey(string)) {
                return new dg();
            }
            return (dg)this.c.get(string);
        }
        catch (ClassCastException classCastException) {
            throw new s(this.a(string, 10, classCastException));
        }
    }

    public dp c(String string, int n2) {
        try {
            if (this.b(string) != 9) {
                return new dp();
            }
            dp dp2 = (dp)this.c.get(string);
            if (dp2.c() > 0 && dp2.d() != n2) {
                return new dp();
            }
            return dp2;
        }
        catch (ClassCastException classCastException) {
            throw new s(this.a(string, 9, classCastException));
        }
    }

    public boolean n(String string) {
        return this.d(string) != 0;
    }

    public void o(String string) {
        this.c.remove(string);
    }

    @Override
    public String toString() {
        String string = "{";
        for (String string2 : this.c.keySet()) {
            string = string + string2 + ':' + this.c.get(string2) + ',';
        }
        return string + "}";
    }

    public boolean d() {
        return this.c.isEmpty();
    }

    private b a(String string, int n2, ClassCastException classCastException) {
        b b2 = b.a(classCastException, "Reading NBT data");
        k k2 = b2.a("Corrupt NBT tag", 1);
        k2.a("Tag type found", new dh(this, string));
        k2.a("Tag type expected", new di(this, n2));
        k2.a("Tag name", string);
        return b2;
    }

    @Override
    public du b() {
        dg dg2 = new dg();
        for (String string : this.c.keySet()) {
            dg2.a(string, ((du)this.c.get(string)).b());
        }
        return dg2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            dg dg2 = (dg)object;
            return ((Object)this.c.entrySet()).equals(dg2.c.entrySet());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ ((Object)this.c).hashCode();
    }

    private static void a(String string, du du2, DataOutput dataOutput) {
        dataOutput.writeByte(du2.a());
        if (du2.a() == 0) {
            return;
        }
        dataOutput.writeUTF(string);
        du2.a(dataOutput);
    }

    private static byte a(DataInput dataInput) {
        return dataInput.readByte();
    }

    private static String b(DataInput dataInput) {
        return dataInput.readUTF();
    }

    static du a(byte by2, String string, DataInput dataInput, int n2) {
        du du2 = du.a(by2);
        try {
            du2.a(dataInput, n2);
        }
        catch (IOException iOException) {
            b b2 = b.a(iOException, "Loading NBT data");
            k k2 = b2.a("NBT Tag");
            k2.a("Tag name", string);
            k2.a("Tag type", by2);
            throw new s(b2);
        }
        return du2;
    }

    static /* synthetic */ Map a(dg dg2) {
        return dg2.c;
    }
}

