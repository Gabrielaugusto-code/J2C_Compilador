/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.IngestServer
 */
import tv.twitch.broadcast.IngestServer;

class bhh
extends bbf {
    final /* synthetic */ bhg k;

    public bhh(bhg bhg2) {
        this.k = bhg2;
        super(bhg.a(bhg2), bhg2.l, bhg2.m, 32, bhg2.m - 35, (int)((double)bhg.b((bhg)bhg2).l.a * 3.5));
        this.a(false);
    }

    @Override
    protected int b() {
        return bhg.c(this.k).Z().v().length;
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        bhg.d((bhg)this.k).u.R = bhg.e((bhg)this.k).Z().v()[n2].serverUrl;
        bhg.f((bhg)this.k).u.b();
    }

    @Override
    protected boolean a(int n2) {
        return bhg.h((bhg)this.k).Z().v()[n2].serverUrl.equals(bhg.g((bhg)this.k).u.R);
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        IngestServer ingestServer = bhg.i(this.k).Z().v()[n2];
        String string = ingestServer.serverUrl.replaceAll("\\{stream_key\\}", "");
        String string2 = (int)ingestServer.bitrateKbps + " kbps";
        String string3 = null;
        buv buv2 = bhg.j(this.k).Z().y();
        if (buv2 != null) {
            if (ingestServer == buv2.c()) {
                string = (Object)((Object)a.k) + string;
                string2 = (int)(buv2.h() * 100.0f) + "%";
            } else if (n2 < buv2.p()) {
                if (ingestServer.bitrateKbps == 0.0f) {
                    string2 = (Object)((Object)a.m) + "Down!";
                }
            } else {
                string2 = (Object)((Object)a.q) + "1234" + (Object)((Object)a.v) + " kbps";
            }
        } else {
            string2 = ingestServer.bitrateKbps == 0.0f ? (Object)((Object)a.m) + "Down!" : (Object)((Object)a.q) + "1234" + (Object)((Object)a.v) + " kbps";
        }
        n3 -= 15;
        if (this.a(n2)) {
            string3 = (Object)((Object)a.j) + "(Preferred)";
        } else if (ingestServer.defaultServer) {
            string3 = (Object)((Object)a.k) + "(Default)";
        }
        this.k.b(bhg.k(this.k), ingestServer.serverName, n3 + 2, n4 + 5, 0xFFFFFF);
        this.k.b(bhg.l(this.k), string, n3 + 2, n4 + bhg.m((bhg)this.k).a + 5 + 3, 0x303030);
        this.k.b(bhg.n(this.k), string2, this.d() - 5 - bhg.o(this.k).a(string2), n4 + 5, 0x808080);
        if (string3 != null) {
            this.k.b(bhg.p(this.k), string3, this.d() - 5 - bhg.q(this.k).a(string3), n4 + 5 + 3 + bhg.r((bhg)this.k).a, 0x808080);
        }
    }

    @Override
    protected int d() {
        return super.d() + 15;
    }
}

