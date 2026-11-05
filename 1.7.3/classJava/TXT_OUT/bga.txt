/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.Display
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

public class bga {
    private static final Logger a = LogManager.getLogger();
    private final ScheduledExecutorService b = Executors.newScheduledThreadPool(3);
    private volatile boolean c;
    private bge d = new bge(this, null);
    private bgd e = new bgd(this, null);
    private bgg f = new bgg(this, null);
    private Set g = Sets.newHashSet();
    private List h = Lists.newArrayList();
    private int i;
    private int j;
    private ScheduledFuture k;
    private ScheduledFuture l;
    private ScheduledFuture m;
    private Map n = new ConcurrentHashMap(bgf.values().length);

    public bga() {
        this.h();
        for (bgf bgf2 : bgf.values()) {
            this.n.put(bgf2.toString(), false);
        }
    }

    public synchronized void a() {
        if (this.c) {
            this.c = false;
            this.i();
            this.h();
        }
    }

    public synchronized boolean a(bgf bgf2) {
        Boolean bl2 = (Boolean)this.n.get(bgf2.toString());
        return bl2 == null ? false : bl2;
    }

    public synchronized void b() {
        for (String string : this.n.keySet()) {
            this.n.put(string, false);
        }
    }

    public synchronized List c() {
        return Lists.newArrayList((Iterable)this.h);
    }

    public int d() {
        return this.i;
    }

    public int e() {
        return this.j;
    }

    public synchronized void f() {
        this.c = true;
        this.i();
    }

    private void h() {
        this.k = this.b.scheduleAtFixedRate(this.d, 0L, 60L, TimeUnit.SECONDS);
        this.l = this.b.scheduleAtFixedRate(this.e, 0L, 10L, TimeUnit.SECONDS);
        this.m = this.b.scheduleAtFixedRate(this.f, 0L, 10L, TimeUnit.SECONDS);
    }

    private void i() {
        try {
            this.k.cancel(false);
            this.l.cancel(false);
            this.m.cancel(false);
        }
        catch (Exception exception) {
            a.error("Failed to cancel Realms tasks");
        }
    }

    private synchronized void a(List list) {
        int n2 = 0;
        for (bvo bvo2 : this.g) {
            if (!list.remove(bvo2)) continue;
            ++n2;
        }
        if (n2 == 0) {
            this.g.clear();
        }
        this.h = list;
    }

    public synchronized void a(bvo bvo2) {
        this.h.remove(bvo2);
        this.g.add(bvo2);
    }

    private void b(List list) {
        Collections.sort(list, new bgc(this, azi.B().M().c(), null));
    }

    private boolean j() {
        return !this.c && Display.isActive();
    }

    static /* synthetic */ boolean a(bga bga2) {
        return bga2.j();
    }

    static /* synthetic */ void a(bga bga2, List list) {
        bga2.b(list);
    }

    static /* synthetic */ void b(bga bga2, List list) {
        bga2.a(list);
    }

    static /* synthetic */ Map b(bga bga2) {
        return bga2.n;
    }

    static /* synthetic */ Logger g() {
        return a;
    }

    static /* synthetic */ int a(bga bga2, int n2) {
        bga2.j = n2;
        return bga2.j;
    }

    static /* synthetic */ int b(bga bga2, int n2) {
        bga2.i = n2;
        return bga2.i;
    }
}

