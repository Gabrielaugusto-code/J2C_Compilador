/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class bim {
    public float p;
    public boolean q;
    public List r = new ArrayList();
    public boolean s = true;
    private Map a = new HashMap();
    public int t = 64;
    public int u = 32;

    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
    }

    public void a(rm rm2, float f2, float f3, float f4) {
    }

    public bjs a(Random random) {
        return (bjs)this.r.get(random.nextInt(this.r.size()));
    }

    protected void a(String string, int n2, int n3) {
        this.a.put(string, new bjt(n2, n3));
    }

    public bjt a(String string) {
        return (bjt)this.a.get(string);
    }
}

