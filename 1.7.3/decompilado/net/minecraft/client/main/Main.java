/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.google.gson.Gson
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 */
package net.minecraft.client.main;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import java.io.File;
import java.lang.reflect.Type;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

public class Main {
    private static final Type a = new bho();

    public static void main(String[] stringArray) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        OptionParser optionParser = new OptionParser();
        optionParser.allowsUnrecognizedOptions();
        optionParser.accepts("demo");
        optionParser.accepts("fullscreen");
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec = optionParser.accepts("server").withRequiredArg();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec2 = optionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo((Object)25565, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec3 = optionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo((Object)new File("."), (Object[])new File[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec4 = optionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec5 = optionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec6 = optionParser.accepts("proxyHost").withRequiredArg();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec7 = optionParser.accepts("proxyPort").withRequiredArg().defaultsTo((Object)"8080", (Object[])new String[0]).ofType(Integer.class);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec8 = optionParser.accepts("proxyUser").withRequiredArg();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec9 = optionParser.accepts("proxyPass").withRequiredArg();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec10 = optionParser.accepts("username").withRequiredArg().defaultsTo((Object)("Player" + azi.K() % 1000L), (Object[])new String[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec11 = optionParser.accepts("uuid").withRequiredArg();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec12 = optionParser.accepts("accessToken").withRequiredArg().required();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec13 = optionParser.accepts("version").withRequiredArg().required();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec14 = optionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo((Object)854, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec15 = optionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo((Object)480, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec16 = optionParser.accepts("userProperties").withRequiredArg().required();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec17 = optionParser.accepts("assetIndex").withRequiredArg();
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec18 = optionParser.accepts("userType").withRequiredArg().defaultsTo((Object)"legacy", (Object[])new String[0]);
        NonOptionArgumentSpec nonOptionArgumentSpec = optionParser.nonOptions();
        OptionSet optionSet = optionParser.parse(stringArray);
        List list = optionSet.valuesOf((OptionSpec)nonOptionArgumentSpec);
        String string = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec6);
        Proxy proxy = Proxy.NO_PROXY;
        if (string != null) {
            try {
                proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(string, (int)((Integer)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec7))));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        String string2 = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec8);
        String string3 = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec9);
        if (!proxy.equals(Proxy.NO_PROXY) && Main.a(string2) && Main.a(string3)) {
            Authenticator.setDefault(new bhq(string2, string3));
        }
        int n2 = (Integer)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec14);
        int n3 = (Integer)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec15);
        boolean bl2 = optionSet.has("fullscreen");
        boolean bl3 = optionSet.has("demo");
        String string4 = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec13);
        HashMultimap hashMultimap = HashMultimap.create();
        for (Map.Entry object2 : ((Map)new Gson().fromJson((String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec16), a)).entrySet()) {
            hashMultimap.putAll(object2.getKey(), (Iterable)object2.getValue());
        }
        File file = (File)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec3);
        File file2 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec4) ? (File)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec4) : new File(file, "assets/");
        File file3 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec5) ? (File)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec5) : new File(file, "resourcepacks/");
        String string5 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec11) ? (String)argumentAcceptingOptionSpec11.value(optionSet) : (String)argumentAcceptingOptionSpec10.value(optionSet);
        String string6 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec17) ? (String)argumentAcceptingOptionSpec17.value(optionSet) : null;
        bal bal2 = new bal((String)argumentAcceptingOptionSpec10.value(optionSet), string5, (String)argumentAcceptingOptionSpec12.value(optionSet), (String)argumentAcceptingOptionSpec18.value(optionSet));
        azi azi2 = new azi(bal2, n2, n3, bl2, bl3, file, file2, file3, proxy, string4, (Multimap)hashMultimap, string6);
        String string7 = (String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec);
        if (string7 != null) {
            azi2.a(string7, (int)((Integer)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec2)));
        }
        Runtime.getRuntime().addShutdownHook(new bhr("Client Shutdown Thread"));
        if (!list.isEmpty()) {
            System.out.println("Completely ignored arguments: " + list);
        }
        Thread.currentThread().setName("Client thread");
        azi2.f();
    }

    private static boolean a(String string) {
        return string != null && !string.isEmpty();
    }
}

