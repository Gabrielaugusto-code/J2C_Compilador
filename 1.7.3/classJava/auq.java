/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class auq
extends auv {
    public ags a;
    public boolean b;
    public int c;
    public auk d;
    public List e;
    public List i = new ArrayList();
    public List j = new ArrayList();

    public auq() {
    }

    public auq(ags ags2, int n2, Random random, int n3, int n4, List list, int n5) {
        super(null, 0, random, n3, n4);
        this.a = ags2;
        this.e = list;
        this.c = n5;
        agl agl2 = ags2.a(n3, n4);
        this.b = agl2 == agl.q || agl2 == agl.F;
    }

    public ags e() {
        return this.a;
    }
}

