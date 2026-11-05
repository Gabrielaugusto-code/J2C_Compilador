/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.TimerTask;

class qa
extends TimerTask {
    final /* synthetic */ pz a;

    qa(pz pz2) {
        this.a = pz2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        HashMap<String, Object> hashMap;
        if (!pz.a(this.a).U()) {
            return;
        }
        Object object = pz.b(this.a);
        synchronized (object) {
            hashMap = new HashMap<String, Object>(pz.c(this.a));
            if (pz.d(this.a) == 0) {
                hashMap.putAll(pz.e(this.a));
            }
            hashMap.put("snooper_count", pz.f(this.a));
            hashMap.put("snooper_token", pz.g(this.a));
        }
        om.a(pz.h(this.a), hashMap, true);
    }
}

