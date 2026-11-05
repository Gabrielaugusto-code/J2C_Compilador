/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 */
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

class bua
extends SoundSystem {
    final /* synthetic */ btw a;

    private bua(btw btw2) {
        this.a = btw2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean playing(String string) {
        Object object = SoundSystemConfig.THREAD_SYNC;
        synchronized (object) {
            if (this.soundLibrary == null) {
                return false;
            }
            Source source = (Source)this.soundLibrary.getSources().get(string);
            if (source == null) {
                return false;
            }
            return source.playing() || source.paused() || source.preLoad;
        }
    }

    /* synthetic */ bua(btw btw2, btx btx2) {
        this(btw2);
    }
}

