/*
 * Decompiled with CFR 0.152.
 */
import java.text.DateFormat;
import java.util.Date;
import net.minecraft.server.MinecraftServer;

class ber
extends bfj {
    final /* synthetic */ bep a;

    public ber(bep bep2) {
        this.a = bep2;
        super(bep.f(bep2), bep2.l, bep2.m, 32, bep2.m - 64, 36);
    }

    @Override
    protected int a() {
        return bep.g(this.a).size() + 1;
    }

    @Override
    protected void a(int n2, boolean bl2) {
        if (n2 >= bep.g(this.a).size()) {
            return;
        }
        bep.a(this.a, n2);
    }

    @Override
    protected boolean a(int n2) {
        return n2 == bep.h(this.a);
    }

    @Override
    protected boolean b(int n2) {
        return false;
    }

    @Override
    protected int b() {
        return this.a() * 36;
    }

    @Override
    protected void c() {
        this.a.q_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2) {
        if (n2 < bep.g(this.a).size()) {
            this.b(n2, n3, n4, n5, bna2);
        }
    }

    private void b(int n2, int n3, int n4, int n5, bna bna2) {
        bvm bvm2 = (bvm)bep.g(this.a).get(n2);
        this.a.b(bep.i(this.a), "Backup (" + bep.a(this.a, MinecraftServer.ap() - bvm2.b.getTime()) + ")", n3 + 2, n4 + 1, 0xFFFFFF);
        this.a.b(bep.j(this.a), this.a(bvm2.b), n3 + 2, n4 + 12, 0x6C6C6C);
    }

    private String a(Date date) {
        return DateFormat.getDateTimeInstance(3, 3).format(date);
    }
}

