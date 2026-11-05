/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class bfu {
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    List a = new ArrayList();
    String[] b;
    String[] c;
    String[][] d;
    int e;
    int f;

    public bfu(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.g = n2;
        this.h = n3;
        this.i = n4;
        this.j = n5;
        this.e = n6;
        this.f = n7;
        this.a();
    }

    private void a() {
        this.b();
        this.a.add(new bau(5005, this.i, this.j + 1, 212, 20, this.c()));
        this.a.add(new bau(5006, this.i, this.j + 25, 212, 20, this.d()));
    }

    private void b() {
        this.b = new String[]{bsc.a("options.difficulty.peaceful", new Object[0]), bsc.a("options.difficulty.easy", new Object[0]), bsc.a("options.difficulty.normal", new Object[0]), bsc.a("options.difficulty.hard", new Object[0])};
        this.c = new String[]{bsc.a("selectWorld.gameMode.survival", new Object[0]), bsc.a("selectWorld.gameMode.creative", new Object[0]), bsc.a("selectWorld.gameMode.adventure", new Object[0])};
        this.d = new String[][]{{bsc.a("selectWorld.gameMode.survival.line1", new Object[0]), bsc.a("selectWorld.gameMode.survival.line2", new Object[0])}, {bsc.a("selectWorld.gameMode.creative.line1", new Object[0]), bsc.a("selectWorld.gameMode.creative.line2", new Object[0])}, {bsc.a("selectWorld.gameMode.adventure.line1", new Object[0]), bsc.a("selectWorld.gameMode.adventure.line2", new Object[0])}};
    }

    private String c() {
        String string = bsc.a("options.difficulty", new Object[0]);
        return string + ": " + this.b[this.e];
    }

    private String d() {
        String string = bsc.a("selectWorld.gameMode", new Object[0]);
        return string + ": " + this.c[this.f];
    }

    void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 5005) {
            this.e = (this.e + 1) % this.b.length;
            bau2.j = this.c();
        } else if (bau2.k == 5006) {
            this.f = (this.f + 1) % this.c.length;
            bau2.j = this.d();
        }
    }

    public void a(bcl bcl2, ban ban2) {
        bcl2.b(ban2, this.d[this.f][0], this.i, this.j + 50, 0xA0A0A0);
        bcl2.b(ban2, this.d[this.f][1], this.i, this.j + 60, 0xA0A0A0);
    }
}

