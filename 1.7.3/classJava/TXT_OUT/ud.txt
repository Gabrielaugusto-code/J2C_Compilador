/*
 * Decompiled with CFR 0.152.
 */
public class ud
extends ul {
    vk a;
    rm b;

    public ud(vk vk2) {
        super(vk2, false, true);
        this.a = vk2;
        this.a(1);
    }

    @Override
    public boolean a() {
        uq uq2 = this.a.bZ();
        if (uq2 == null) {
            return false;
        }
        this.b = uq2.b(this.a);
        if (!this.a(this.b, false)) {
            if (this.c.aH().nextInt(20) == 0) {
                this.b = uq2.c(this.a);
                return this.a(this.b, false);
            }
            return false;
        }
        return true;
    }

    @Override
    public void c() {
        this.a.d(this.b);
        super.c();
    }
}

