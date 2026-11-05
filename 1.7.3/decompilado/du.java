/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;

public abstract class du {
    public static final String[] a = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]"};

    abstract void a(DataOutput var1);

    abstract void a(DataInput var1, int var2);

    public abstract String toString();

    public abstract byte a();

    protected du() {
    }

    protected static du a(byte by2) {
        switch (by2) {
            case 0: {
                return new dk();
            }
            case 1: {
                return new df();
            }
            case 2: {
                return new ds();
            }
            case 3: {
                return new dn();
            }
            case 4: {
                return new dq();
            }
            case 5: {
                return new dl();
            }
            case 6: {
                return new dj();
            }
            case 7: {
                return new de();
            }
            case 11: {
                return new dm();
            }
            case 8: {
                return new dt();
            }
            case 9: {
                return new dp();
            }
            case 10: {
                return new dg();
            }
        }
        return null;
    }

    public static String g(int n2) {
        switch (n2) {
            case 0: {
                return "TAG_End";
            }
            case 1: {
                return "TAG_Byte";
            }
            case 2: {
                return "TAG_Short";
            }
            case 3: {
                return "TAG_Int";
            }
            case 4: {
                return "TAG_Long";
            }
            case 5: {
                return "TAG_Float";
            }
            case 6: {
                return "TAG_Double";
            }
            case 7: {
                return "TAG_Byte_Array";
            }
            case 11: {
                return "TAG_Int_Array";
            }
            case 8: {
                return "TAG_String";
            }
            case 9: {
                return "TAG_List";
            }
            case 10: {
                return "TAG_Compound";
            }
            case 99: {
                return "Any Numeric Tag";
            }
        }
        return "UNKNOWN";
    }

    public abstract du b();

    public boolean equals(Object object) {
        if (!(object instanceof du)) {
            return false;
        }
        du du2 = (du)object;
        return this.a() == du2.a();
    }

    public int hashCode() {
        return this.a();
    }

    protected String a_() {
        return this.toString();
    }
}

