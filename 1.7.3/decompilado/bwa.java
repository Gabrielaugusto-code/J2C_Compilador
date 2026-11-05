/*
 * Decompiled with CFR 0.152.
 */
public class bwa
extends Exception {
    public final int a;
    public final String b;
    public final int c;
    public final String d;

    public bwa(int n2, String string, int n3, String string2) {
        super(string);
        this.a = n2;
        this.b = string;
        this.c = n3;
        this.d = string2;
    }

    @Override
    public String toString() {
        if (this.c != -1) {
            return "Realms ( ErrorCode: " + this.c + " ): " + this.d;
        }
        return "Realms: " + this.b;
    }
}

