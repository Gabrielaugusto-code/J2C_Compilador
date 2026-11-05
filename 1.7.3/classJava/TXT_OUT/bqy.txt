/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bqy
implements brc,
brs {
    private static final Logger a = LogManager.getLogger();
    private final Map b = Maps.newHashMap();
    private final Map c = Maps.newHashMap();
    private final List d = Lists.newArrayList();
    private final Map e = Maps.newHashMap();
    private brr f;

    public bqy(brr brr2) {
        this.f = brr2;
    }

    public void a(brq brq2) {
        bra bra2 = (bra)this.b.get(brq2);
        if (bra2 == null) {
            bra2 = new bqn(brq2);
            this.a(brq2, bra2);
        }
        brb.b(bra2.b());
    }

    public brq a(int n2) {
        return (brq)this.c.get(n2);
    }

    public boolean a(brq brq2, bqs bqs2) {
        if (this.a(brq2, (brd)bqs2)) {
            this.c.put(bqs2.a(), brq2);
            return true;
        }
        return false;
    }

    public boolean a(brq brq2, brd brd2) {
        if (this.a(brq2, (bra)brd2)) {
            this.d.add(brd2);
            return true;
        }
        return false;
    }

    public boolean a(brq brq2, bra bra2) {
        boolean bl2 = true;
        try {
            bra2.a(this.f);
        }
        catch (IOException iOException) {
            a.warn("Failed to load texture: " + brq2, (Throwable)iOException);
            bra2 = brb.a;
            this.b.put(brq2, bra2);
            bl2 = false;
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Registering texture");
            k k2 = b2.a("Resource location being registered");
            bra bra3 = bra2;
            k2.a("Resource location", brq2);
            k2.a("Texture object class", new bqz(this, bra3));
            throw new s(b2);
        }
        this.b.put(brq2, bra2);
        return bl2;
    }

    public bra b(brq brq2) {
        return (bra)this.b.get(brq2);
    }

    public brq a(String string, bqj bqj2) {
        Object object;
        Integer n2 = (Integer)this.e.get(string);
        if (n2 == null) {
            n2 = 1;
        } else {
            object = n2;
            Integer n3 = n2 = Integer.valueOf(n2 + 1);
        }
        this.e.put(string, n2);
        object = new brq(String.format("dynamic/%s_%d", string, n2));
        this.a((brq)object, (bra)bqj2);
        return object;
    }

    @Override
    public void e() {
        for (brc brc2 : this.d) {
            brc2.e();
        }
    }

    public void c(brq brq2) {
        bra bra2 = this.b(brq2);
        if (bra2 != null) {
            brb.a(bra2.b());
        }
    }

    @Override
    public void a(brr brr2) {
        for (Map.Entry entry : this.b.entrySet()) {
            this.a((brq)entry.getKey(), (bra)entry.getValue());
        }
    }
}

