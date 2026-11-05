/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class axh
implements axt,
ayg {
    private static final Logger a = LogManager.getLogger();
    private final File b;
    private final File c;
    private final File d;
    private final long e = MinecraftServer.ap();
    private final String f;

    public axh(File file, String string, boolean bl2) {
        this.b = new File(file, string);
        this.b.mkdirs();
        this.c = new File(this.b, "players");
        this.d = new File(this.b, "data");
        this.d.mkdirs();
        this.f = string;
        if (bl2) {
            this.c.mkdirs();
        }
        this.h();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void h() {
        try {
            File file = new File(this.b, "session.lock");
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeLong(this.e);
            }
            finally {
                dataOutputStream.close();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }

    @Override
    public File b() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c() {
        try {
            File file = new File(this.b, "session.lock");
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                if (dataInputStream.readLong() != this.e) {
                    throw new afx("The save is being accessed from another location, aborting");
                }
            }
            finally {
                dataInputStream.close();
            }
        }
        catch (IOException iOException) {
            throw new afx("Failed to check session lock, aborting");
        }
    }

    @Override
    public aot a(apf apf2) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }

    @Override
    public axj d() {
        File file = new File(this.b, "level.dat");
        if (file.exists()) {
            try {
                dg dg2 = dr.a(new FileInputStream(file));
                dg dg3 = dg2.m("Data");
                return new axj(dg3);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if ((file = new File(this.b, "level.dat_old")).exists()) {
            try {
                dg dg4 = dr.a(new FileInputStream(file));
                dg dg5 = dg4.m("Data");
                return new axj(dg5);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void a(axj axj2, dg dg2) {
        dg dg3 = axj2.a(dg2);
        dg dg4 = new dg();
        dg4.a("Data", dg3);
        try {
            File file = new File(this.b, "level.dat_new");
            File file2 = new File(this.b, "level.dat_old");
            File file3 = new File(this.b, "level.dat");
            dr.a(dg4, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void a(axj axj2) {
        dg dg2 = axj2.a();
        dg dg3 = new dg();
        dg3.a("Data", dg2);
        try {
            File file = new File(this.b, "level.dat_new");
            File file2 = new File(this.b, "level.dat_old");
            File file3 = new File(this.b, "level.dat");
            dr.a(dg3, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void a(xq xq2) {
        try {
            dg dg2 = new dg();
            xq2.e(dg2);
            File file = new File(this.c, xq2.b_() + ".dat.tmp");
            File file2 = new File(this.c, xq2.b_() + ".dat");
            dr.a(dg2, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception exception) {
            a.warn("Failed to save player data for " + xq2.b_());
        }
    }

    @Override
    public dg b(xq xq2) {
        dg dg2 = this.a(xq2.b_());
        if (dg2 != null) {
            xq2.f(dg2);
        }
        return dg2;
    }

    public dg a(String string) {
        try {
            File file = new File(this.c, string + ".dat");
            if (file.exists()) {
                return dr.a(new FileInputStream(file));
            }
        }
        catch (Exception exception) {
            a.warn("Failed to load player data for " + string);
        }
        return null;
    }

    @Override
    public ayg e() {
        return this;
    }

    @Override
    public String[] f() {
        String[] stringArray = this.c.list();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (!stringArray[i2].endsWith(".dat")) continue;
            stringArray[i2] = stringArray[i2].substring(0, stringArray[i2].length() - 4);
        }
        return stringArray;
    }

    @Override
    public void a() {
    }

    @Override
    public File b(String string) {
        return new File(this.d, string + ".dat");
    }

    @Override
    public String g() {
        return this.f;
    }
}

