/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ObjectUtils
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ObjectUtils;

public class rv {
    private final qr a;
    private boolean b = true;
    private static final HashMap c = new HashMap();
    private final Map d = new HashMap();
    private boolean e;
    private ReadWriteLock f = new ReentrantReadWriteLock();

    public rv(qr qr2) {
        this.a = qr2;
    }

    public void a(int n2, Object object) {
        Integer n3 = (Integer)c.get(object.getClass());
        if (n3 == null) {
            throw new IllegalArgumentException("Unknown data type: " + object.getClass());
        }
        if (n2 > 31) {
            throw new IllegalArgumentException("Data value id is too big with " + n2 + "! (Max is " + 31 + ")");
        }
        if (this.d.containsKey(n2)) {
            throw new IllegalArgumentException("Duplicate id value for " + n2 + "!");
        }
        rw rw2 = new rw(n3, n2, object);
        this.f.writeLock().lock();
        this.d.put(n2, rw2);
        this.f.writeLock().unlock();
        this.b = false;
    }

    public void a(int n2, int n3) {
        rw rw2 = new rw(n3, n2, null);
        this.f.writeLock().lock();
        this.d.put(n2, rw2);
        this.f.writeLock().unlock();
        this.b = false;
    }

    public byte a(int n2) {
        return (Byte)this.i(n2).b();
    }

    public short b(int n2) {
        return (Short)this.i(n2).b();
    }

    public int c(int n2) {
        return (Integer)this.i(n2).b();
    }

    public float d(int n2) {
        return ((Float)this.i(n2).b()).floatValue();
    }

    public String e(int n2) {
        return (String)this.i(n2).b();
    }

    public abu f(int n2) {
        return (abu)this.i(n2).b();
    }

    private rw i(int n2) {
        rw rw2;
        this.f.readLock().lock();
        try {
            rw2 = (rw)this.d.get(n2);
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Getting synched entity data");
            k k2 = b2.a("Synched entity data");
            k2.a("Data ID", n2);
            throw new s(b2);
        }
        this.f.readLock().unlock();
        return rw2;
    }

    public void b(int n2, Object object) {
        rw rw2 = this.i(n2);
        if (ObjectUtils.notEqual((Object)object, (Object)rw2.b())) {
            rw2.a(object);
            this.a.i(n2);
            rw2.a(true);
            this.e = true;
        }
    }

    public void h(int n2) {
        rw.a(this.i(n2), true);
        this.e = true;
    }

    public boolean a() {
        return this.e;
    }

    public static void a(List list, ep ep2) {
        if (list != null) {
            for (rw rw2 : list) {
                rv.a(ep2, rw2);
            }
        }
        ep2.writeByte(127);
    }

    public List b() {
        ArrayList<rw> arrayList = null;
        if (this.e) {
            this.f.readLock().lock();
            for (rw rw2 : this.d.values()) {
                if (!rw2.d()) continue;
                rw2.a(false);
                if (arrayList == null) {
                    arrayList = new ArrayList<rw>();
                }
                arrayList.add(rw2);
            }
            this.f.readLock().unlock();
        }
        this.e = false;
        return arrayList;
    }

    public void a(ep ep2) {
        this.f.readLock().lock();
        for (rw rw2 : this.d.values()) {
            rv.a(ep2, rw2);
        }
        this.f.readLock().unlock();
        ep2.writeByte(127);
    }

    public List c() {
        ArrayList<rw> arrayList = null;
        this.f.readLock().lock();
        for (rw rw2 : this.d.values()) {
            if (arrayList == null) {
                arrayList = new ArrayList<rw>();
            }
            arrayList.add(rw2);
        }
        this.f.readLock().unlock();
        return arrayList;
    }

    private static void a(ep ep2, rw rw2) {
        int n2 = (rw2.c() << 5 | rw2.a() & 0x1F) & 0xFF;
        ep2.writeByte(n2);
        switch (rw2.c()) {
            case 0: {
                ep2.writeByte(((Byte)rw2.b()).byteValue());
                break;
            }
            case 1: {
                ep2.writeShort(((Short)rw2.b()).shortValue());
                break;
            }
            case 2: {
                ep2.writeInt((Integer)rw2.b());
                break;
            }
            case 3: {
                ep2.writeFloat(((Float)rw2.b()).floatValue());
                break;
            }
            case 4: {
                ep2.a((String)rw2.b());
                break;
            }
            case 5: {
                abu abu2 = (abu)rw2.b();
                ep2.a(abu2);
                break;
            }
            case 6: {
                r r2 = (r)rw2.b();
                ep2.writeInt(r2.a);
                ep2.writeInt(r2.b);
                ep2.writeInt(r2.c);
            }
        }
    }

    public static List b(ep ep2) {
        ArrayList<rw> arrayList = null;
        byte by2 = ep2.readByte();
        while (by2 != 127) {
            if (arrayList == null) {
                arrayList = new ArrayList<rw>();
            }
            int n2 = (by2 & 0xE0) >> 5;
            int n3 = by2 & 0x1F;
            rw rw2 = null;
            switch (n2) {
                case 0: {
                    rw2 = new rw(n2, n3, ep2.readByte());
                    break;
                }
                case 1: {
                    rw2 = new rw(n2, n3, ep2.readShort());
                    break;
                }
                case 2: {
                    rw2 = new rw(n2, n3, ep2.readInt());
                    break;
                }
                case 3: {
                    rw2 = new rw(n2, n3, Float.valueOf(ep2.readFloat()));
                    break;
                }
                case 4: {
                    rw2 = new rw(n2, n3, ep2.c(Short.MAX_VALUE));
                    break;
                }
                case 5: {
                    rw2 = new rw(n2, n3, ep2.c());
                    break;
                }
                case 6: {
                    int n4 = ep2.readInt();
                    int n5 = ep2.readInt();
                    int n6 = ep2.readInt();
                    rw2 = new rw(n2, n3, new r(n4, n5, n6));
                }
            }
            arrayList.add(rw2);
            by2 = ep2.readByte();
        }
        return arrayList;
    }

    public void a(List list) {
        this.f.writeLock().lock();
        for (rw rw2 : list) {
            rw rw3 = (rw)this.d.get(rw2.a());
            if (rw3 == null) continue;
            rw3.a(rw2.b());
            this.a.i(rw2.a());
        }
        this.f.writeLock().unlock();
        this.e = true;
    }

    public boolean d() {
        return this.b;
    }

    public void e() {
        this.e = false;
    }

    static {
        c.put(Byte.class, 0);
        c.put(Short.class, 1);
        c.put(Integer.class, 2);
        c.put(Float.class, 3);
        c.put(String.class, 4);
        c.put(abu.class, 5);
        c.put(r.class, 6);
    }
}

