/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.server.MinecraftServer;

public abstract class afg
implements ac {
    private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
    private int b;
    private boolean c = true;
    private fa d = null;
    private String e = "";
    private String f = "@";

    public int g() {
        return this.b;
    }

    public fa h() {
        return this.d;
    }

    public void a(dg dg2) {
        dg2.a("Command", this.e);
        dg2.a("SuccessCount", this.b);
        dg2.a("CustomName", this.f);
        if (this.d != null) {
            dg2.a("LastOutput", fb.a(this.d));
        }
        dg2.a("TrackOutput", this.c);
    }

    public void b(dg dg2) {
        this.e = dg2.j("Command");
        this.b = dg2.f("SuccessCount");
        if (dg2.b("CustomName", 8)) {
            this.f = dg2.j("CustomName");
        }
        if (dg2.b("LastOutput", 8)) {
            this.d = fb.a(dg2.j("LastOutput"));
        }
        if (dg2.b("TrackOutput", 1)) {
            this.c = dg2.n("TrackOutput");
        }
    }

    @Override
    public boolean a(int n2, String string) {
        return n2 <= 2;
    }

    public void a(String string) {
        this.e = string;
    }

    public String i() {
        return this.e;
    }

    public void a(afs afs2) {
        MinecraftServer minecraftServer;
        if (afs2.E) {
            this.b = 0;
        }
        if ((minecraftServer = MinecraftServer.G()) != null && minecraftServer.ab()) {
            ab ab2 = minecraftServer.H();
            this.b = ab2.a(this, this.e);
        } else {
            this.b = 0;
        }
    }

    @Override
    public String b_() {
        return this.f;
    }

    @Override
    public fa c_() {
        return new fh(this.b_());
    }

    public void b(String string) {
        this.f = string;
    }

    @Override
    public void a(fa fa2) {
        if (this.c && this.d() != null && !this.d().E) {
            this.d = new fh("[" + a.format(new Date()) + "] ").a(fa2);
            this.e();
        }
    }

    public abstract void e();

    public abstract int f();

    public abstract void a(ByteBuf var1);

    public void b(fa fa2) {
        this.d = fa2;
    }
}

