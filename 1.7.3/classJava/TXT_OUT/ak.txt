/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ak
extends y {
    private static final Logger a = LogManager.getLogger();
    private long b;
    private int c;

    @Override
    public String c() {
        return "debug";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String c(ac ac2) {
        return "commands.debug.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            if (stringArray[0].equals("start")) {
                ak.a(ac2, "commands.debug.start", new Object[0]);
                MinecraftServer.G().ak();
                this.b = MinecraftServer.ap();
                this.c = MinecraftServer.G().aj();
                return;
            }
            if (stringArray[0].equals("stop")) {
                if (!MinecraftServer.G().a.a) {
                    throw new cc("commands.debug.notStarted", new Object[0]);
                }
                long l2 = MinecraftServer.ap();
                int n2 = MinecraftServer.G().aj();
                long l3 = l2 - this.b;
                int n3 = n2 - this.c;
                this.a(l3, n3);
                MinecraftServer.G().a.a = false;
                ak.a(ac2, "commands.debug.stop", Float.valueOf((float)l3 / 1000.0f), n3);
                return;
            }
        }
        throw new ch("commands.debug.usage", new Object[0]);
    }

    private void a(long l2, int n2) {
        File file = new File(MinecraftServer.G().d("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.b(l2, n2));
            fileWriter.close();
        }
        catch (Throwable throwable) {
            a.error("Could not save profiler results to " + file, throwable);
        }
    }

    private String b(long l2, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Profiler Results ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(ak.d());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time span: ").append(l2).append(" ms\n");
        stringBuilder.append("Tick span: ").append(n2).append(" ticks\n");
        stringBuilder.append("// This is approximately ").append(String.format("%.2f", Float.valueOf((float)n2 / ((float)l2 / 1000.0f)))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.a(0, "root", stringBuilder);
        stringBuilder.append("--- END PROFILE DUMP ---\n\n");
        return stringBuilder.toString();
    }

    private void a(int n2, String string, StringBuilder stringBuilder) {
        List list = MinecraftServer.G().a.b(string);
        if (list == null || list.size() < 3) {
            return;
        }
        for (int i2 = 1; i2 < list.size(); ++i2) {
            pa pa2 = (pa)list.get(i2);
            stringBuilder.append(String.format("[%02d] ", n2));
            for (int i3 = 0; i3 < n2; ++i3) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(pa2.c);
            stringBuilder.append(" - ");
            stringBuilder.append(String.format("%.2f", pa2.a));
            stringBuilder.append("%/");
            stringBuilder.append(String.format("%.2f", pa2.b));
            stringBuilder.append("%\n");
            if (pa2.c.equals("unspecified")) continue;
            try {
                this.a(n2 + 1, string + "." + pa2.c, stringBuilder);
                continue;
            }
            catch (Exception exception) {
                stringBuilder.append("[[ EXCEPTION " + exception + " ]]");
            }
        }
    }

    private static String d() {
        String[] stringArray = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."};
        try {
            return stringArray[(int)(System.nanoTime() % (long)stringArray.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return ak.a(stringArray, "start", "stop");
        }
        return null;
    }
}

