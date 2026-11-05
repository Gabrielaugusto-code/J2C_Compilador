/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

public class cv
extends cz
implements cr {
    protected final cs a = new cs();
    protected final Map b = ((BiMap)this.c).inverse();

    public void a(int n2, String string, Object object) {
        this.a.a(object, n2);
        this.a(cv.c(string), object);
    }

    @Override
    protected Map a() {
        return HashBiMap.create();
    }

    public Object a(String string) {
        return super.a(cv.c(string));
    }

    public String c(Object object) {
        return (String)this.b.get(object);
    }

    public boolean b(String string) {
        return super.d(cv.c(string));
    }

    public int b(Object object) {
        return this.a.b(object);
    }

    public Object a(int n2) {
        return this.a.a(n2);
    }

    public Iterator iterator() {
        return this.a.iterator();
    }

    public boolean b(int n2) {
        return this.a.b(n2);
    }

    private static String c(String string) {
        return string.indexOf(58) == -1 ? "minecraft:" + string : string;
    }

    @Override
    public /* synthetic */ boolean d(Object object) {
        return this.b((String)object);
    }
}

