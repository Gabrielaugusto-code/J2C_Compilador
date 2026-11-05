/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bse
implements brs {
    private static final Logger b = LogManager.getLogger();
    private final bsj c;
    private String d;
    protected static final bsf a = new bsf();
    private Map e = Maps.newHashMap();

    public bse(bsj bsj2, String string) {
        this.c = bsj2;
        this.d = string;
        bsc.a(a);
    }

    public void a(List list) {
        this.e.clear();
        for (brt brt2 : list) {
            try {
                bsr bsr2 = (bsr)brt2.a(this.c, "language");
                if (bsr2 == null) continue;
                for (bsd bsd2 : bsr2.a()) {
                    if (this.e.containsKey(bsd2.a())) continue;
                    this.e.put(bsd2.a(), bsd2);
                }
            }
            catch (RuntimeException runtimeException) {
                b.warn("Unable to parse metadata section of resourcepack: " + brt2.b(), (Throwable)runtimeException);
            }
            catch (IOException iOException) {
                b.warn("Unable to parse metadata section of resourcepack: " + brt2.b(), (Throwable)iOException);
            }
        }
    }

    @Override
    public void a(brr brr2) {
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{"en_US"});
        if (!"en_US".equals(this.d)) {
            arrayList.add(this.d);
        }
        a.a(brr2, arrayList);
        dd.a(bse.a.a);
    }

    public boolean a() {
        return a.a();
    }

    public boolean b() {
        return this.c() != null && this.c().b();
    }

    public void a(bsd bsd2) {
        this.d = bsd2.a();
    }

    public bsd c() {
        return this.e.containsKey(this.d) ? (bsd)this.e.get(this.d) : (bsd)this.e.get("en_US");
    }

    public SortedSet d() {
        return Sets.newTreeSet(this.e.values());
    }
}

