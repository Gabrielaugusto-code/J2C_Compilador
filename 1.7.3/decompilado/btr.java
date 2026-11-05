/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class btr
extends Thread {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final Logger b = LogManager.getLogger();
    private final String c;
    private final DatagramSocket d;
    private boolean e = true;
    private final String f;

    public btr(String string, String string2) {
        super("LanServerPinger #" + a.incrementAndGet());
        this.c = string;
        this.f = string2;
        this.setDaemon(true);
        this.d = new DatagramSocket();
    }

    @Override
    public void run() {
        String string = btr.a(this.c, this.f);
        byte[] byArray = string.getBytes();
        while (!this.isInterrupted() && this.e) {
            try {
                InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
                DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length, inetAddress, 4445);
                this.d.send(datagramPacket);
            }
            catch (IOException iOException) {
                b.warn("LanServerPinger: " + iOException.getMessage());
                break;
            }
            try {
                btr.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
        this.e = false;
    }

    public static String a(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }

    public static String a(String string) {
        int n2 = string.indexOf("[MOTD]");
        if (n2 < 0) {
            return "missing no";
        }
        int n3 = string.indexOf("[/MOTD]", n2 + "[MOTD]".length());
        if (n3 < n2) {
            return "missing no";
        }
        return string.substring(n2 + "[MOTD]".length(), n3);
    }

    public static String b(String string) {
        int n2 = string.indexOf("[/MOTD]");
        if (n2 < 0) {
            return null;
        }
        int n3 = string.indexOf("[/MOTD]", n2 + "[/MOTD]".length());
        if (n3 >= 0) {
            return null;
        }
        int n4 = string.indexOf("[AD]", n2 + "[/MOTD]".length());
        if (n4 < 0) {
            return null;
        }
        int n5 = string.indexOf("[/AD]", n4 + "[AD]".length());
        if (n5 < n4) {
            return null;
        }
        return string.substring(n4 + "[AD]".length(), n5);
    }
}

