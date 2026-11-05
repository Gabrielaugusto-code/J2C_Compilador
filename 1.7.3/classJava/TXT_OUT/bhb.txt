/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.gson.JsonParseException;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bhb
extends bha {
    private static final Logger c = LogManager.getLogger();
    private final brt d;
    private final brq e;

    public bhb(bgz bgz2) {
        super(bgz2);
        bqj bqj2;
        this.d = this.a.R().b;
        try {
            bqj2 = new bqj(this.d.a());
        }
        catch (IOException iOException) {
            bqj2 = brb.a;
        }
        this.e = this.a.P().a("texturepackicon", bqj2);
    }

    @Override
    protected String a() {
        try {
            bst bst2 = (bst)this.d.a(this.a.R().c, "pack");
            if (bst2 != null) {
                return bst2.a().d();
            }
        }
        catch (JsonParseException jsonParseException) {
            c.error("Couldn't load metadata info", (Throwable)jsonParseException);
        }
        catch (IOException iOException) {
            c.error("Couldn't load metadata info", (Throwable)iOException);
        }
        return (Object)((Object)a.m) + "Missing " + "pack.mcmeta" + " :(";
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected boolean f() {
        return false;
    }

    @Override
    protected boolean g() {
        return false;
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    protected String b() {
        return "Default";
    }

    @Override
    protected void c() {
        this.a.P().a(this.e);
    }

    @Override
    protected boolean d() {
        return false;
    }
}

