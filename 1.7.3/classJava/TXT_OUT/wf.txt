/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

class wf
extends afg {
    final /* synthetic */ we a;

    wf(we we2) {
        this.a = we2;
    }

    @Override
    public void e() {
        this.a.y().b(23, this.i());
        this.a.y().b(24, fb.a(this.h()));
    }

    @Override
    public int f() {
        return 1;
    }

    @Override
    public void a(ByteBuf byteBuf) {
        byteBuf.writeInt(this.a.x());
    }

    @Override
    public r f_() {
        return new r(oy.c(this.a.s), oy.c(this.a.t + 0.5), oy.c(this.a.u));
    }

    @Override
    public afs d() {
        return this.a.o;
    }
}

