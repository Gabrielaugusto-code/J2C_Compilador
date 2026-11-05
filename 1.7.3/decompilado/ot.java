/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ot {
    private final Object[] a;
    private final Class b;
    private final ReadWriteLock c = new ReentrantReadWriteLock();
    private int d;
    private int e;

    public ot(Class clazz, int n2) {
        this.b = clazz;
        this.a = (Object[])Array.newInstance(clazz, n2);
    }

    public Object a(Object object) {
        this.c.writeLock().lock();
        this.a[this.e] = object;
        this.e = (this.e + 1) % this.b();
        if (this.d < this.b()) {
            ++this.d;
        }
        this.c.writeLock().unlock();
        return object;
    }

    public int b() {
        this.c.readLock().lock();
        int n2 = this.a.length;
        this.c.readLock().unlock();
        return n2;
    }

    public Object[] c() {
        Object[] objectArray = (Object[])Array.newInstance(this.b, this.d);
        this.c.readLock().lock();
        for (int i2 = 0; i2 < this.d; ++i2) {
            int n2 = (this.e - this.d + i2) % this.b();
            if (n2 < 0) {
                n2 += this.b();
            }
            objectArray[i2] = this.a[n2];
        }
        this.c.readLock().unlock();
        return objectArray;
    }
}

