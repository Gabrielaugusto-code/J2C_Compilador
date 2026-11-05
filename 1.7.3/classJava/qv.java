/*
 * Decompiled with CFR 0.152.
 */
public enum qv {
    a,
    b,
    c,
    d,
    e,
    f;


    public int a(double d2) {
        double d3 = d2 - ((double)oy.c(d2) + 0.5);
        switch (this) {
            case a: {
                if (d3 < 0.0 ? d3 < -0.3125 : d3 < 0.3125) {
                    return oy.f(d2 * 32.0);
                }
                return oy.c(d2 * 32.0);
            }
            case b: {
                if (d3 < 0.0 ? d3 < -0.3125 : d3 < 0.3125) {
                    return oy.c(d2 * 32.0);
                }
                return oy.f(d2 * 32.0);
            }
            case c: {
                if (d3 > 0.0) {
                    return oy.c(d2 * 32.0);
                }
                return oy.f(d2 * 32.0);
            }
            case d: {
                if (d3 < 0.0 ? d3 < -0.1875 : d3 < 0.1875) {
                    return oy.f(d2 * 32.0);
                }
                return oy.c(d2 * 32.0);
            }
            case e: {
                if (d3 < 0.0 ? d3 < -0.1875 : d3 < 0.1875) {
                    return oy.c(d2 * 32.0);
                }
                return oy.f(d2 * 32.0);
            }
        }
        if (d3 > 0.0) {
            return oy.f(d2 * 32.0);
        }
        return oy.c(d2 * 32.0);
    }
}

