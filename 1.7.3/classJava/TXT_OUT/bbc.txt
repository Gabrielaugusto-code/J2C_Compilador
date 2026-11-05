/*
 * Decompiled with CFR 0.152.
 */
public class bbc
extends bau {
    private final baf o;

    public bbc(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, null, string);
    }

    public bbc(int n2, int n3, int n4, int n5, int n6, String string) {
        super(n2, n3, n4, n5, n6, string);
        this.o = null;
    }

    public bbc(int n2, int n3, int n4, baf baf2, String string) {
        super(n2, n3, n4, 150, 20, string);
        this.o = baf2;
    }

    public baf c() {
        return this.o;
    }
}

