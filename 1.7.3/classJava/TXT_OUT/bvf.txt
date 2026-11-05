/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;
import java.net.URLEncoder;

public class bvf {
    private final String a;
    private final String b;
    private final String c;
    private final Proxy d;
    private static String e = "https://mcoapi.minecraft.net/";

    public bvf(String string, String string2, String string3, Proxy proxy) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = proxy;
    }

    public bvr a() {
        String string = this.a(bvh.a(e + "worlds"));
        return bvr.a(string);
    }

    public bvo a(long l2) {
        String string = this.a(bvh.a(e + "worlds" + "/$ID".replace("$ID", String.valueOf(l2))));
        return bvo.c(string);
    }

    public bvq b(long l2) {
        String string = e + "worlds" + "/$ID/join".replace("$ID", "" + l2);
        String string2 = this.a(bvh.a(string, 5000, 30000));
        return bvq.a(string2);
    }

    public void a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e).append("worlds");
        stringBuilder.append("?name=").append(this.c(string));
        stringBuilder.append("&template=").append(string2);
        this.a(bvh.a(stringBuilder.toString(), "", 5000, 30000));
    }

    public Boolean b() {
        String string = e + "mco" + "/available";
        String string2 = this.a(bvh.a(string));
        return Boolean.valueOf(string2);
    }

    public Boolean c() {
        String string = e + "mco" + "/client/outdated";
        String string2 = this.a(bvh.a(string));
        return Boolean.valueOf(string2);
    }

    public int d() {
        String string = e + "payments" + "/unused";
        String string2 = this.a(bvh.a(string));
        return Integer.valueOf(string2);
    }

    public void a(long l2, String string) {
        String string2 = e + "invites" + "/$WORLD_ID/invite/$USER_NAME".replace("$WORLD_ID", String.valueOf(l2)).replace("$USER_NAME", string);
        this.a(bvh.b(string2));
    }

    public void c(long l2) {
        String string = e + "invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2));
        this.a(bvh.b(string));
    }

    public bvo b(long l2, String string) {
        String string2 = e + "invites" + "/$WORLD_ID/invite/$USER_NAME".replace("$WORLD_ID", String.valueOf(l2)).replace("$USER_NAME", string);
        String string3 = this.a(bvh.c(string2, ""));
        return bvo.c(string3);
    }

    public bvn d(long l2) {
        String string = e + "worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(l2));
        String string2 = this.a(bvh.a(string));
        return bvn.a(string2);
    }

    public void a(long l2, String string, String string2, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e).append("worlds").append("/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2)));
        stringBuilder.append("?name=").append(this.c(string));
        if (string2 != null && !string2.trim().equals("")) {
            stringBuilder.append("&motd=").append(this.c(string2));
        } else {
            stringBuilder.append("&motd=");
        }
        stringBuilder.append("&difficulty=").append(n2).append("&gameMode=").append(n3);
        this.a(bvh.d(stringBuilder.toString(), ""));
    }

    public void c(long l2, String string) {
        String string2 = e + "worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(l2)) + "?backupId=" + string;
        this.a(bvh.b(string2, "", 40000, 40000));
    }

    public bvy e() {
        String string = e + "worlds" + "/templates";
        String string2 = this.a(bvh.a(string));
        return bvy.a(string2);
    }

    public Boolean e(long l2) {
        String string = e + "worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(l2));
        String string2 = this.a(bvh.d(string, ""));
        return Boolean.valueOf(string2);
    }

    public Boolean f(long l2) {
        String string = e + "worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(l2));
        String string2 = this.a(bvh.d(string, ""));
        return Boolean.valueOf(string2);
    }

    public Boolean d(long l2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e).append("worlds").append("/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(l2)));
        if (string != null && string.length() > 0) {
            stringBuilder.append("?seed=").append(this.c(string));
        }
        String string2 = this.a(bvh.b(stringBuilder.toString(), "", 30000, 80000));
        return Boolean.valueOf(string2);
    }

    public Boolean e(long l2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e).append("worlds").append("/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(l2)));
        if (string != null) {
            stringBuilder.append("?template=").append(string);
        }
        String string2 = this.a(bvh.b(stringBuilder.toString(), "", 30000, 80000));
        return Boolean.valueOf(string2);
    }

    public bvv g(long l2) {
        String string = this.a(bvh.a(e + "subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2))));
        return bvv.a(string);
    }

    public int f() {
        String string = this.a(bvh.a(e + "invites" + "/count/pending"));
        return Integer.parseInt(string);
    }

    public bvt g() {
        String string = this.a(bvh.a(e + "invites" + "/pending"));
        return bvt.a(string);
    }

    public void a(String string) {
        this.a(bvh.d(e + "invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", string), ""));
    }

    public bvu h() {
        String string = this.a(bvh.a(e + "mco" + "/buy"));
        return bvu.a(string);
    }

    public String h(long l2) {
        return this.a(bvh.a(e + "worlds" + "/$WORLD_ID/backups/download".replace("$WORLD_ID", String.valueOf(l2))));
    }

    public void b(String string) {
        this.a(bvh.d(e + "invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", string), ""));
    }

    public void i() {
        this.a(bvh.c(e + "mco" + "/tos/agreed", ""));
    }

    private String c(String string) {
        return URLEncoder.encode(string, "UTF-8");
    }

    private String a(bvh bvh2) {
        bvg.a(this.d);
        bvh2.a("sid", this.a);
        bvh2.a("user", this.b);
        bvh2.a("version", this.c);
        try {
            int n2 = bvh2.a();
            if (n2 == 503) {
                int n3 = bvh2.b();
                throw new bwb(n3);
            }
            if (n2 < 200 || n2 >= 300) {
                throw new bwa(bvh2.a(), bvh2.d(), bvh2.g(), bvh2.h());
            }
            return bvh2.d();
        }
        catch (bvz bvz2) {
            throw new bwa(500, "Server not available!", -1, "");
        }
    }
}

