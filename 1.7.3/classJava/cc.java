/*
 * Decompiled with CFR 0.152.
 */
public class cc
extends RuntimeException {
    private Object[] a;

    public cc(String string, Object ... objectArray) {
        super(string);
        this.a = objectArray;
    }

    public Object[] a() {
        return this.a;
    }
}

