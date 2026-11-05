/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.ArrayUtils
 */
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.GenericFutureListener;
import org.apache.commons.lang3.ArrayUtils;

class bkl
implements jp {
    private boolean d = false;
    final /* synthetic */ bki a;
    final /* synthetic */ ef b;
    final /* synthetic */ bkk c;

    bkl(bkk bkk2, bki bki2, ef ef2) {
        this.c = bkk2;
        this.a = bki2;
        this.b = ef2;
    }

    @Override
    public void a(jr jr2) {
        CharSequence charSequence;
        js js2 = jr2.c();
        this.a.d = js2.a() != null ? js2.a().d() : "";
        if (js2.c() != null) {
            this.a.g = js2.c().a();
            this.a.f = js2.c().b();
        } else {
            this.a.g = "Old";
            this.a.f = 0;
        }
        if (js2.b() != null) {
            this.a.c = (Object)((Object)a.h) + "" + js2.b().b() + "" + (Object)((Object)a.i) + "/" + (Object)((Object)a.h) + js2.b().a();
            if (ArrayUtils.isNotEmpty((Object[])js2.b().c())) {
                charSequence = new StringBuilder();
                for (GameProfile gameProfile : js2.b().c()) {
                    if (((StringBuilder)charSequence).length() > 0) {
                        ((StringBuilder)charSequence).append("\n");
                    }
                    ((StringBuilder)charSequence).append(gameProfile.getName());
                }
                if (js2.b().c().length < js2.b().b()) {
                    if (((StringBuilder)charSequence).length() > 0) {
                        ((StringBuilder)charSequence).append("\n");
                    }
                    ((StringBuilder)charSequence).append("... and ").append(js2.b().b() - js2.b().c().length).append(" more ...");
                }
                this.a.i = ((StringBuilder)charSequence).toString();
            }
        } else {
            this.a.c = (Object)((Object)a.i) + "???";
        }
        if (js2.d() != null) {
            charSequence = js2.d();
            if (((String)charSequence).startsWith("data:image/png;base64,")) {
                this.a.a(((String)charSequence).substring("data:image/png;base64,".length()));
            } else {
                bkk.c().error("Invalid server icon (unknown format)");
            }
        } else {
            this.a.a(null);
        }
        this.b.a(new jz(azi.K()), new GenericFutureListener[0]);
        this.d = true;
    }

    @Override
    public void a(jq jq2) {
        long l2 = jq2.c();
        long l3 = azi.K();
        this.a.e = l3 - l2;
        this.b.a(new fh("Finished"));
    }

    @Override
    public void a(fa fa2) {
        if (!this.d) {
            bkk.c().error("Can't ping " + this.a.b + ": " + fa2.c());
            this.a.d = (Object)((Object)a.e) + "Can't connect to server.";
            this.a.c = "";
            bkk.a(this.c, this.a);
        }
    }

    @Override
    public void a(ek ek2, ek ek3) {
        if (ek3 != ek.c) {
            throw new UnsupportedOperationException("Unexpected change in protocol to " + (Object)((Object)ek3));
        }
    }

    @Override
    public void a() {
    }
}

