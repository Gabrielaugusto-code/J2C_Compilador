/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class bdi
extends bba {
    private final bdm k;
    private final azi l;
    private final bbb[] m;
    private int n = 0;

    public bdi(bdm bdm2, azi azi2) {
        super(azi2, bdm2.l, bdm2.m, 63, bdm2.m - 32, 20);
        this.k = bdm2;
        this.l = azi2;
        Object[] objectArray = (azf[])ArrayUtils.clone((Object[])azi2.u.at);
        this.m = new bbb[objectArray.length + azf.c().size()];
        Arrays.sort(objectArray);
        int n2 = 0;
        String string = null;
        for (Object object : objectArray) {
            int n3;
            String string2 = ((azf)object).e();
            if (!string2.equals(string)) {
                string = string2;
                this.m[n2++] = new bdk(this, string2);
            }
            if ((n3 = azi2.l.a(bsc.a(((azf)object).g(), new Object[0]))) > this.n) {
                this.n = n3;
            }
            this.m[n2++] = new bdl(this, (azf)object, null);
        }
    }

    @Override
    protected int b() {
        return this.m.length;
    }

    @Override
    public bbb b(int n2) {
        return this.m[n2];
    }

    @Override
    protected int d() {
        return super.d() + 15;
    }

    @Override
    public int c() {
        return super.c() + 32;
    }

    static /* synthetic */ azi a(bdi bdi2) {
        return bdi2.l;
    }

    static /* synthetic */ bdm b(bdi bdi2) {
        return bdi2.k;
    }

    static /* synthetic */ int c(bdi bdi2) {
        return bdi2.n;
    }
}

