/*
 * Decompiled with CFR 0.152.
 */
final class ob
implements od {
    ob() {
    }

    @Override
    public String a(int n2) {
        double d2 = (double)n2 / 100.0;
        double d3 = d2 / 1000.0;
        if (d3 > 0.5) {
            return ny.n().format(d3) + " km";
        }
        if (d2 > 0.5) {
            return ny.n().format(d2) + " m";
        }
        return n2 + " cm";
    }
}

