/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ua
extends sz {
    private xm a;
    private vk b;
    private int c;
    private boolean d;

    public ua(xm xm2) {
        this.a = xm2;
        this.a(3);
    }

    @Override
    public boolean a() {
        if (this.a.d() >= 0) {
            return false;
        }
        if (!this.a.o.w()) {
            return false;
        }
        List list = this.a.o.a(vk.class, this.a.C.b(6.0, 2.0, 6.0));
        if (list.isEmpty()) {
            return false;
        }
        for (vk vk2 : list) {
            if (vk2.cb() <= 0) continue;
            this.b = vk2;
            break;
        }
        return this.b != null;
    }

    @Override
    public boolean b() {
        return this.b.cb() > 0;
    }

    @Override
    public void c() {
        this.c = this.a.aH().nextInt(320);
        this.d = false;
        this.b.m().h();
    }

    @Override
    public void d() {
        this.b = null;
        this.a.m().h();
    }

    @Override
    public void e() {
        this.a.j().a(this.b, 30.0f, 30.0f);
        if (this.b.cb() == this.c) {
            this.a.m().a(this.b, 0.5);
            this.d = true;
        }
        if (this.d && this.a.f(this.b) < 4.0) {
            this.b.a(false);
            this.a.m().h();
        }
    }
}

