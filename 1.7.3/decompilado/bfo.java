/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bfo
extends bfi {
    private static final Logger a = LogManager.getLogger();
    private ef c;
    private final bvo d;
    private final bcl e;

    public bfo(bcl bcl2, bvo bvo2) {
        this.e = bcl2;
        this.d = bvo2;
    }

    @Override
    public void run() {
        this.b(bsc.a("mco.connect.connecting", new Object[0]));
        bal bal2 = this.b().M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 5;
        bvq bvq2 = null;
        boolean bl4 = false;
        for (int i2 = 0; i2 < 10 && !this.c(); ++i2) {
            try {
                bvq2 = bvf2.b(this.d.a);
                bl2 = true;
            }
            catch (bwb bwb2) {
                n2 = bwb2.e;
            }
            catch (bwa bwa2) {
                if (bwa2.c == 6002) {
                    bl4 = true;
                    break;
                }
                bl3 = true;
                this.a(bwa2.toString());
                a.error("Couldn't connect to world", (Throwable)bwa2);
                break;
            }
            catch (IOException iOException) {
                a.error("Couldn't parse response connecting to world", (Throwable)iOException);
            }
            catch (Exception exception) {
                bl3 = true;
                a.error("Couldn't connect to world", (Throwable)exception);
                this.a(exception.getLocalizedMessage());
            }
            if (bl2) break;
            this.a(n2);
        }
        if (bl4) {
            this.b().a(new bgk(this.e, this.d));
        } else if (!this.c() && !bl3) {
            if (bl2) {
                bkh bkh2 = bkh.a(bvq2.a);
                this.a(bkh2.a(), bkh2.b());
            } else {
                this.b().a(this.e);
            }
        }
    }

    private void a(int n2) {
        try {
            Thread.sleep(n2 * 1000);
        }
        catch (InterruptedException interruptedException) {
            a.warn(interruptedException.getLocalizedMessage());
        }
    }

    private void a(String string, int n2) {
        bgl.a.submit(new bfp(this, string, n2));
    }

    @Override
    public void a() {
        if (this.c != null) {
            this.c.a();
        }
    }

    static /* synthetic */ ef a(bfo bfo2, ef ef2) {
        bfo2.c = ef2;
        return bfo2.c;
    }

    static /* synthetic */ ef a(bfo bfo2) {
        return bfo2.c;
    }

    static /* synthetic */ bcl b(bfo bfo2) {
        return bfo2.e;
    }

    static /* synthetic */ Logger e() {
        return a;
    }
}

