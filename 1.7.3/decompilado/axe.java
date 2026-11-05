/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class axe
extends axi {
    private static final Logger b = LogManager.getLogger();

    public axe(File file) {
        super(file);
    }

    @Override
    public List b() {
        File[] fileArray;
        if (this.a == null || !this.a.exists() || !this.a.isDirectory()) {
            throw new axu("Unable to read or access folder where game worlds are saved!");
        }
        ArrayList<axw> arrayList = new ArrayList<axw>();
        for (File file : fileArray = this.a.listFiles()) {
            String string;
            axj axj2;
            if (!file.isDirectory() || (axj2 = this.c(string = file.getName())) == null || axj2.l() != 19132 && axj2.l() != 19133) continue;
            boolean bl2 = axj2.l() != this.c();
            String string2 = axj2.k();
            if (string2 == null || oy.a(string2)) {
                string2 = string;
            }
            long l2 = 0L;
            arrayList.add(new axw(string, string2, axj2.m(), l2, axj2.r(), bl2, axj2.t(), axj2.v()));
        }
        return arrayList;
    }

    protected int c() {
        return 19133;
    }

    @Override
    public void d() {
        apa.a();
    }

    @Override
    public axt a(String string, boolean bl2) {
        return new axd(this.a, string, bl2);
    }

    @Override
    public boolean b(String string) {
        axj axj2 = this.c(string);
        return axj2 != null && axj2.l() != this.c();
    }

    @Override
    public boolean a(String string, pb pb2) {
        pb2.a(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        File file = new File(this.a, string);
        File file2 = new File(file, "DIM-1");
        File file3 = new File(file, "DIM1");
        b.info("Scanning folders...");
        this.a(file, arrayList);
        if (file2.exists()) {
            this.a(file2, arrayList2);
        }
        if (file3.exists()) {
            this.a(file3, arrayList3);
        }
        int n2 = arrayList.size() + arrayList2.size() + arrayList3.size();
        b.info("Total conversion count is " + n2);
        axj axj2 = this.c(string);
        ags ags2 = null;
        ags2 = axj2.u() == agd.c ? new agv(agl.p, 0.5f) : new ags(axj2.b(), axj2.u());
        this.a(new File(file, "region"), arrayList, ags2, 0, n2, pb2);
        this.a(new File(file2, "region"), arrayList2, (ags)new agv(agl.w, 0.0f), arrayList.size(), n2, pb2);
        this.a(new File(file3, "region"), arrayList3, (ags)new agv(agl.x, 0.0f), arrayList.size() + arrayList2.size(), n2, pb2);
        axj2.e(19133);
        if (axj2.u() == agd.f) {
            axj2.a(agd.b);
        }
        this.g(string);
        axt axt2 = this.a(string, false);
        axt2.a(axj2);
        return true;
    }

    private void g(String string) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            b.warn("Unable to create level.dat_mcr backup");
            return;
        }
        File file2 = new File(file, "level.dat");
        if (!file2.exists()) {
            b.warn("Unable to create level.dat_mcr backup");
            return;
        }
        File file3 = new File(file, "level.dat_mcr");
        if (!file2.renameTo(file3)) {
            b.warn("Unable to create level.dat_mcr backup");
        }
    }

    private void a(File file, Iterable iterable, ags ags2, int n2, int n3, pb pb2) {
        for (File file2 : iterable) {
            this.a(file, file2, ags2, n2, n3, pb2);
            int n4 = (int)Math.round(100.0 * (double)(++n2) / (double)n3);
            pb2.a(n4);
        }
    }

    private void a(File file, File file2, ags ags2, int n2, int n3, pb pb2) {
        try {
            String string = file2.getName();
            aoy aoy2 = new aoy(file2);
            aoy aoy3 = new aoy(new File(file, string.substring(0, string.length() - ".mcr".length()) + ".mca"));
            for (int i2 = 0; i2 < 32; ++i2) {
                int n4;
                for (n4 = 0; n4 < 32; ++n4) {
                    if (!aoy2.c(i2, n4) || aoy3.c(i2, n4)) continue;
                    DataInputStream dataInputStream = aoy2.a(i2, n4);
                    if (dataInputStream == null) {
                        b.warn("Failed to fetch input stream");
                        continue;
                    }
                    dg dg2 = dr.a(dataInputStream);
                    dataInputStream.close();
                    dg dg3 = dg2.m("Level");
                    aox aox2 = aow.a(dg3);
                    dg dg4 = new dg();
                    dg dg5 = new dg();
                    dg4.a("Level", dg5);
                    aow.a(aox2, dg5, ags2);
                    DataOutputStream dataOutputStream = aoy3.b(i2, n4);
                    dr.a(dg4, (DataOutput)dataOutputStream);
                    dataOutputStream.close();
                }
                n4 = (int)Math.round(100.0 * (double)(n2 * 1024) / (double)(n3 * 1024));
                int n5 = (int)Math.round(100.0 * (double)((i2 + 1) * 32 + n2 * 1024) / (double)(n3 * 1024));
                if (n5 <= n4) continue;
                pb2.a(n5);
            }
            aoy2.c();
            aoy3.c();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void a(File file, Collection collection) {
        File file2 = new File(file, "region");
        File[] fileArray = file2.listFiles(new axf(this));
        if (fileArray != null) {
            Collections.addAll(collection, fileArray);
        }
    }
}

