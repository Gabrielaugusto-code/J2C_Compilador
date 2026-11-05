/*
 * Decompiled with CFR 0.152.
 */
public class fj
extends IllegalArgumentException {
    public fj(fi fi2, String string) {
        super(String.format("Error parsing: %s: %s", fi2, string));
    }

    public fj(fi fi2, int n2) {
        super(String.format("Invalid index %d requested for %s", n2, fi2));
    }

    public fj(fi fi2, Throwable throwable) {
        super(String.format("Error while parsing: %s", fi2), throwable);
    }
}

