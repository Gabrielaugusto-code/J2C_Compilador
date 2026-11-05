/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class brv {
    protected static final FileFilter a = new brw();
    private final File d;
    public final brt b;
    private final File e;
    public final bsj c;
    private brt f;
    private boolean g;
    private List h = Lists.newArrayList();
    private List i = Lists.newArrayList();

    public brv(File file, File file2, brt brt2, bsj bsj2, bac bac2) {
        this.d = file;
        this.e = file2;
        this.b = brt2;
        this.c = bsj2;
        this.g();
        this.a();
        block0: for (String string : bac2.l) {
            for (bry bry2 : this.h) {
                if (!bry2.d().equals(string)) continue;
                this.i.add(bry2);
                continue block0;
            }
        }
    }

    private void g() {
        if (!this.d.isDirectory()) {
            this.d.delete();
            this.d.mkdirs();
        }
    }

    private List h() {
        if (this.d.isDirectory()) {
            return Arrays.asList(this.d.listFiles(a));
        }
        return Collections.emptyList();
    }

    public void a() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.h()) {
            bry bry2 = new bry(this, (File)object, null);
            if (!this.h.contains(bry2)) {
                try {
                    bry2.a();
                    arrayList.add(bry2);
                }
                catch (Exception exception) {
                    arrayList.remove(bry2);
                }
                continue;
            }
            int n2 = this.h.indexOf(bry2);
            if (n2 <= -1 || n2 >= this.h.size()) continue;
            arrayList.add(this.h.get(n2));
        }
        this.h.removeAll(arrayList);
        for (Object object : this.h) {
            ((bry)object).b();
        }
        this.h = arrayList;
    }

    public List b() {
        return ImmutableList.copyOf((Collection)this.h);
    }

    public List c() {
        return ImmutableList.copyOf((Collection)this.i);
    }

    public void a(List list) {
        this.i.clear();
        this.i.addAll(list);
    }

    public File d() {
        return this.d;
    }

    public void a(String string) {
        String string2 = string.substring(string.lastIndexOf("/") + 1);
        if (string2.contains("?")) {
            string2 = string2.substring(0, string2.indexOf("?"));
        }
        if (!string2.endsWith(".zip")) {
            return;
        }
        File file = new File(this.e, string2.replaceAll("\\W", ""));
        this.f();
        this.a(string, file);
    }

    private void a(String string, File file) {
        HashMap hashMap = Maps.newHashMap();
        bci bci2 = new bci();
        hashMap.put("X-Minecraft-Username", azi.B().M().c());
        hashMap.put("X-Minecraft-UUID", azi.B().M().b());
        hashMap.put("X-Minecraft-Version", "1.7.3");
        this.g = true;
        azi.B().a(bci2);
        om.a(file, string, new brx(this), hashMap, 0x3200000, bci2, azi.B().O());
    }

    public brt e() {
        return this.f;
    }

    public void f() {
        this.f = null;
        this.g = false;
    }

    static /* synthetic */ boolean a(brv brv2) {
        return brv2.g;
    }

    static /* synthetic */ boolean a(brv brv2, boolean bl2) {
        brv2.g = bl2;
        return brv2.g;
    }

    static /* synthetic */ brt a(brv brv2, brt brt2) {
        brv2.f = brt2;
        return brv2.f;
    }
}

