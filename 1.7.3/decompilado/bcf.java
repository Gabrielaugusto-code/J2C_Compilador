/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class bcf
extends bcl {
    private static bor a = new bor();
    private static final List f = new ArrayList();
    private final bbo g;
    private String h;
    private String i;
    private String r;
    private bch s;
    private bau t;
    private baw u;

    public bcf(bbo bbo2) {
        this.g = bbo2;
    }

    @Override
    public void r_() {
        this.n.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.h = bsc.a("createWorld.customize.presets.title", new Object[0]);
        this.i = bsc.a("createWorld.customize.presets.share", new Object[0]);
        this.r = bsc.a("createWorld.customize.presets.list", new Object[0]);
        this.u = new baw(this.q, 50, 40, this.l - 100, 20);
        this.s = new bch(this);
        this.u.f(1230);
        this.u.a(this.g.e());
        this.t = new bau(0, this.l / 2 - 155, this.m - 28, 150, 20, bsc.a("createWorld.customize.presets.select", new Object[0]));
        this.n.add(this.t);
        this.n.add(new bau(1, this.l / 2 + 5, this.m - 28, 150, 20, bsc.a("gui.cancel", new Object[0])));
        this.g();
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        this.u.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    protected void a(char c2, int n2) {
        if (!this.u.a(c2, n2)) {
            super.a(c2, n2);
        }
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 0 && this.p()) {
            this.g.a(this.u.b());
            this.k.a(this.g);
        } else if (bau2.k == 1) {
            this.k.a(this.g);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.s.a(n2, n3, f2);
        this.a(this.q, this.h, this.l / 2, 8, 0xFFFFFF);
        this.b(this.q, this.i, 50, 30, 0xA0A0A0);
        this.b(this.q, this.r, 50, 70, 0xA0A0A0);
        this.u.f();
        super.a(n2, n3, f2);
    }

    @Override
    public void c() {
        this.u.a();
        super.c();
    }

    public void g() {
        boolean bl2;
        this.t.l = bl2 = this.p();
    }

    private boolean p() {
        return this.s.k > -1 && this.s.k < f.size() || this.u.b().length() > 1;
    }

    private static void a(String string, abs abs2, agl agl2, ark ... arkArray) {
        bcf.a(string, abs2, agl2, null, arkArray);
    }

    private static void a(String string, abs abs2, agl agl2, List list, ark ... arkArray) {
        arj arj2 = new arj();
        for (int i2 = arkArray.length - 1; i2 >= 0; --i2) {
            arj2.c().add(arkArray[i2]);
        }
        arj2.a(agl2.ay);
        arj2.d();
        if (list != null) {
            for (String string2 : list) {
                arj2.b().put(string2, new HashMap());
            }
        }
        f.add(new bcg(abs2, string, arj2.toString()));
    }

    static /* synthetic */ bor h() {
        return a;
    }

    static /* synthetic */ float a(bcf bcf2) {
        return bcf2.e;
    }

    static /* synthetic */ float b(bcf bcf2) {
        return bcf2.e;
    }

    static /* synthetic */ float c(bcf bcf2) {
        return bcf2.e;
    }

    static /* synthetic */ float d(bcf bcf2) {
        return bcf2.e;
    }

    static /* synthetic */ List i() {
        return f;
    }

    static /* synthetic */ bch e(bcf bcf2) {
        return bcf2.s;
    }

    static /* synthetic */ baw f(bcf bcf2) {
        return bcf2.u;
    }

    static {
        bcf.a("Classic Flat", abs.a(aie.c), agl.p, Arrays.asList("village"), new ark(1, aie.c), new ark(2, aie.d), new ark(1, aie.h));
        bcf.a("Tunnelers' Dream", abs.a(aie.b), agl.r, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new ark(1, aie.c), new ark(5, aie.d), new ark(230, aie.b), new ark(1, aie.h));
        bcf.a("Water World", abs.a(aie.i), agl.p, Arrays.asList("village", "biome_1"), new ark(90, aie.j), new ark(5, aie.m), new ark(5, aie.d), new ark(5, aie.b), new ark(1, aie.h));
        bcf.a("Overworld", abs.a(aie.H), agl.p, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new ark(1, aie.c), new ark(3, aie.d), new ark(59, aie.b), new ark(1, aie.h));
        bcf.a("Snowy Kingdom", abs.a(aie.aC), agl.A, Arrays.asList("village", "biome_1"), new ark(1, aie.aC), new ark(1, aie.c), new ark(3, aie.d), new ark(59, aie.b), new ark(1, aie.h));
        bcf.a("Bottomless Pit", abv.G, agl.p, Arrays.asList("village", "biome_1"), new ark(1, aie.c), new ark(3, aie.d), new ark(2, aie.e));
        bcf.a("Desert", abs.a(aie.m), agl.q, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new ark(8, aie.m), new ark(52, aie.A), new ark(3, aie.b), new ark(1, aie.h));
        bcf.a("Redstone Ready", abv.ax, agl.q, new ark(52, aie.A), new ark(3, aie.b), new ark(1, aie.h));
    }
}

