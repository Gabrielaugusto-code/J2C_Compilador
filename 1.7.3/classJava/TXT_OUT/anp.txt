/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

class anp
extends afg {
    final /* synthetic */ ano a;

    anp(ano ano2) {
        this.a = ano2;
    }

    @Override
    public r f_() {
        return new r(this.a.c, this.a.d, this.a.e);
    }

    @Override
    public afs d() {
        return this.a.w();
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.a.e();
    }

    @Override
    public void e() {
        this.a.w().g(this.a.c, this.a.d, this.a.e);
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void a(ByteBuf byteBuf) {
        byteBuf.writeInt(this.a.c);
        byteBuf.writeInt(this.a.d);
        byteBuf.writeInt(this.a.e);
    }
}

