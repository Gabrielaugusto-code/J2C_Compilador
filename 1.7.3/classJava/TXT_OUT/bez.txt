/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.UnsupportedEncodingException;

class bez
extends bfi {
    private final String c;
    private final bvx d;
    final /* synthetic */ bey a;

    public bez(bey bey2, String string, bvx bvx2) {
        this.a = bey2;
        this.c = string;
        this.d = bvx2;
    }

    @Override
    public void run() {
        String string = bsc.a("mco.create.world.wait", new Object[0]);
        this.b(string);
        bal bal2 = bey.a(this.a).M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            if (this.d != null) {
                bvf2.a(this.c, this.d.a);
            } else {
                bvf2.a(this.c, "-1");
            }
            bey.c(this.a).a(bey.b(this.a));
        }
        catch (bwa bwa2) {
            bey.g().error("Couldn't create world");
            this.a(bwa2.toString());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bey.g().error("Couldn't create world");
            this.a(unsupportedEncodingException.getLocalizedMessage());
        }
        catch (IOException iOException) {
            bey.g().error("Could not parse response creating world");
            this.a(iOException.getLocalizedMessage());
        }
        catch (Exception exception) {
            bey.g().error("Could not create world");
            this.a(exception.getLocalizedMessage());
        }
    }
}

