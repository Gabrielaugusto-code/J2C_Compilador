/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ahz {
    public static final cv c = new cm("air");
    private aak a;
    protected String d;
    public static final aid e = new aid("stone", 1.0f, 1.0f);
    public static final aid f = new aid("wood", 1.0f, 1.0f);
    public static final aid g = new aid("gravel", 1.0f, 1.0f);
    public static final aid h = new aid("grass", 1.0f, 1.0f);
    public static final aid i = new aid("stone", 1.0f, 1.0f);
    public static final aid j = new aid("stone", 1.0f, 1.5f);
    public static final aid k = new aia("stone", 1.0f, 1.0f);
    public static final aid l = new aid("cloth", 1.0f, 1.0f);
    public static final aid m = new aid("sand", 1.0f, 1.0f);
    public static final aid n = new aid("snow", 1.0f, 1.0f);
    public static final aid o = new aib("ladder", 1.0f, 1.0f);
    public static final aid p = new aic("anvil", 0.3f, 1.0f);
    protected boolean q;
    protected int r;
    protected boolean s;
    protected int t;
    protected boolean u;
    protected float v;
    protected float w;
    protected boolean x = true;
    protected boolean y = true;
    protected boolean z;
    protected boolean A;
    protected double B;
    protected double C;
    protected double D;
    protected double E;
    protected double F;
    protected double G;
    public aid H = e;
    public float I = 1.0f;
    protected final avk J;
    public float K = 0.6f;
    private String b;
    protected pw L;

    public static int b(ahz ahz2) {
        return c.b(ahz2);
    }

    public static ahz e(int n2) {
        return (ahz)c.a(n2);
    }

    public static ahz a(abs abs2) {
        return ahz.e(abs.b(abs2));
    }

    public static ahz b(String string) {
        if (c.b(string)) {
            return (ahz)c.a(string);
        }
        try {
            return (ahz)c.a(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public boolean j() {
        return this.q;
    }

    public int k() {
        return this.r;
    }

    public boolean l() {
        return this.s;
    }

    public int m() {
        return this.t;
    }

    public boolean n() {
        return this.u;
    }

    public avk o() {
        return this.J;
    }

    public avm f(int n2) {
        return this.o().r();
    }

    public static void p() {
        c.a(0, "air", new ahr().c("air"));
        c.a(1, "stone", new amm().c(1.5f).b(10.0f).a(i).c("stone").d("stone"));
        c.a(2, "grass", new ajy().c(0.6f).a(h).c("grass").d("grass"));
        c.a(3, "dirt", new ajc().c(0.5f).a(g).c("dirt").d("dirt"));
        ahz ahz2 = new ahz(avk.e).c(2.0f).b(10.0f).a(i).c("stonebrick").a(aak.b).d("cobblestone");
        c.a(4, "cobblestone", ahz2);
        ahz ahz3 = new and().c(2.0f).b(5.0f).a(f).c("wood").d("planks");
        c.a(5, "planks", ahz3);
        c.a(6, "sapling", new ama().c(0.0f).a(h).c("sapling").d("sapling"));
        c.a(7, "bedrock", new ahz(avk.e).s().b(6000000.0f).a(i).c("bedrock").H().a(aak.b).d("bedrock"));
        c.a(8, "flowing_water", new aji(avk.h).c(100.0f).g(3).c("water").H().d("water_flow"));
        c.a(9, "water", new amk(avk.h).c(100.0f).g(3).c("water").H().d("water_still"));
        c.a(10, "flowing_lava", new aji(avk.i).c(100.0f).a(1.0f).c("lava").H().d("lava_flow"));
        c.a(11, "lava", new amk(avk.i).c(100.0f).a(1.0f).c("lava").H().d("lava_still"));
        c.a(12, "sand", new aly().c(0.5f).a(m).c("sand").d("sand"));
        c.a(13, "gravel", new ajz().c(0.6f).a(g).c("gravel").d("gravel"));
        c.a(14, "gold_ore", new ale().c(3.0f).b(5.0f).a(i).c("oreGold").d("gold_ore"));
        c.a(15, "iron_ore", new ale().c(3.0f).b(5.0f).a(i).c("oreIron").d("iron_ore"));
        c.a(16, "coal_ore", new ale().c(3.0f).b(5.0f).a(i).c("oreCoal").d("coal_ore"));
        c.a(17, "log", new ald().c("log").d("log"));
        c.a(18, "leaves", new alc().c("leaves").d("leaves"));
        c.a(19, "sponge", new amg().c(0.6f).a(h).c("sponge").d("sponge"));
        c.a(20, "glass", new ajw(avk.s, false).c(0.3f).a(k).c("glass").d("glass"));
        c.a(21, "lapis_ore", new ale().c(3.0f).b(5.0f).a(i).c("oreLapis").d("lapis_ore"));
        c.a(22, "lapis_block", new akq(avm.H).c(3.0f).b(5.0f).a(i).c("blockLapis").a(aak.b).d("lapis_block"));
        c.a(23, "dispenser", new ajd().c(3.5f).a(i).c("dispenser").d("dispenser"));
        ahz ahz4 = new alz().a(i).c(0.8f).c("sandStone").d("sandstone");
        c.a(24, "sandstone", ahz4);
        c.a(25, "noteblock", new ala().c(0.8f).c("musicBlock").d("noteblock"));
        c.a(26, "bed", new ahy().c(0.2f).c("bed").H().d("bed"));
        c.a(27, "golden_rail", new alk().c(0.7f).a(j).c("goldenRail").d("rail_golden"));
        c.a(28, "detector_rail", new aiz().c(0.7f).a(j).c("detectorRail").d("rail_detector"));
        c.a(29, "sticky_piston", new aog(true).c("pistonStickyBase"));
        c.a(30, "web", new anb().g(1).c(4.0f).c("web").d("web"));
        c.a(31, "tallgrass", new amq().c(0.0f).a(h).c("tallgrass"));
        c.a(32, "deadbush", new aiy().c(0.0f).a(h).c("deadbush").d("deadbush"));
        c.a(33, "piston", new aog(false).c("pistonBase"));
        c.a(34, "piston_head", new aoh());
        c.a(35, "wool", new air(avk.n).c(0.8f).a(l).c("cloth").d("wool_colored"));
        c.a(36, "piston_extension", new aoi());
        c.a(37, "yellow_flower", new ajt(0).c(0.0f).a(h).c("flower1").d("flower_dandelion"));
        c.a(38, "red_flower", new ajt(1).c(0.0f).a(h).c("flower2").d("flower_rose"));
        c.a(39, "brown_mushroom", new akt().c(0.0f).a(h).a(0.125f).c("mushroom").d("mushroom_brown"));
        c.a(40, "red_mushroom", new akt().c(0.0f).a(h).c("mushroom").d("mushroom_red"));
        c.a(41, "gold_block", new akq(avm.F).c(3.0f).b(10.0f).a(j).c("blockGold").d("gold_block"));
        c.a(42, "iron_block", new akq(avm.h).c(5.0f).b(10.0f).a(j).c("blockIron").d("iron_block"));
        c.a(43, "double_stone_slab", new amp(true).c(2.0f).b(10.0f).a(i).c("stoneSlab"));
        c.a(44, "stone_slab", new amp(false).c(2.0f).b(10.0f).a(i).c("stoneSlab"));
        ahz ahz5 = new ahz(avk.e).c(2.0f).b(10.0f).a(i).c("brick").a(aak.b).d("brick");
        c.a(45, "brick_block", ahz5);
        c.a(46, "tnt", new ams().c(0.0f).a(h).c("tnt").d("tnt"));
        c.a(47, "bookshelf", new aig().c(1.5f).a(f).c("bookshelf").d("bookshelf"));
        c.a(48, "mossy_cobblestone", new ahz(avk.e).c(2.0f).b(10.0f).a(i).c("stoneMoss").a(aak.b).d("cobblestone_mossy"));
        c.a(49, "obsidian", new alb().c(50.0f).b(2000.0f).a(i).c("obsidian").d("obsidian"));
        c.a(50, "torch", new amt().c(0.0f).a(0.9375f).a(f).c("torch").d("torch_on"));
        c.a(51, "fire", new ajs().c(0.0f).a(1.0f).a(f).c("fire").H().d("fire"));
        c.a(52, "mob_spawner", new akr().c(5.0f).a(j).c("mobSpawner").H().d("mob_spawner"));
        c.a(53, "oak_stairs", new amj(ahz3, 0).c("stairsWood"));
        c.a(54, "chest", new aio(0).c(2.5f).a(f).c("chest"));
        c.a(55, "redstone_wire", new alr().c(0.0f).a(e).c("redstoneDust").H().d("redstone_dust"));
        c.a(56, "diamond_ore", new ale().c(3.0f).b(5.0f).a(i).c("oreDiamond").d("diamond_ore"));
        c.a(57, "diamond_block", new akq(avm.G).c(5.0f).b(10.0f).a(j).c("blockDiamond").d("diamond_block"));
        c.a(58, "crafting_table", new aiv().c(2.5f).a(f).c("workbench").d("crafting_table"));
        c.a(59, "wheat", new aiw().c("crops").d("wheat"));
        ahz ahz6 = new ajp().c(0.6f).a(g).c("farmland").d("farmland");
        c.a(60, "farmland", ahz6);
        c.a(61, "furnace", new ajv(false).c(3.5f).a(i).c("furnace").a(aak.c));
        c.a(62, "lit_furnace", new ajv(true).c(3.5f).a(i).a(0.875f).c("furnace"));
        c.a(63, "standing_sign", new amb(aod.class, true).c(1.0f).a(f).c("sign").H());
        c.a(64, "wooden_door", new aje(avk.d).c(3.0f).a(f).c("doorWood").H().d("door_wood"));
        c.a(65, "ladder", new akj().c(0.4f).a(o).c("ladder").d("ladder"));
        c.a(66, "rail", new alp().c(0.7f).a(j).c("rail").d("rail_normal"));
        c.a(67, "stone_stairs", new amj(ahz2, 0).c("stairsStone"));
        c.a(68, "wall_sign", new amb(aod.class, false).c(1.0f).a(f).c("sign").H());
        c.a(69, "lever", new akm().c(0.5f).a(f).c("lever").d("lever"));
        c.a(70, "stone_pressure_plate", new all("stone", avk.e, alm.b).c(0.5f).a(i).c("pressurePlate"));
        c.a(71, "iron_door", new aje(avk.f).c(5.0f).a(j).c("doorIron").H().d("door_iron"));
        c.a(72, "wooden_pressure_plate", new all("planks_oak", avk.d, alm.a).c(0.5f).a(f).c("pressurePlate"));
        c.a(73, "redstone_ore", new alq(false).c(3.0f).b(5.0f).a(i).c("oreRedstone").a(aak.b).d("redstone_ore"));
        c.a(74, "lit_redstone_ore", new alq(true).a(0.625f).c(3.0f).b(5.0f).a(i).c("oreRedstone").d("redstone_ore"));
        c.a(75, "unlit_redstone_torch", new alt(false).c(0.0f).a(f).c("notGate").d("redstone_torch_off"));
        c.a(76, "redstone_torch", new alt(true).c(0.0f).a(0.5f).a(f).c("notGate").a(aak.d).d("redstone_torch_on"));
        c.a(77, "stone_button", new amo().c(0.5f).a(i).c("button"));
        c.a(78, "snow_layer", new ame().c(0.1f).a(n).c("snow").g(0).d("snow"));
        c.a(79, "ice", new akg().c(0.5f).g(3).a(k).c("ice").d("ice"));
        c.a(80, "snow", new amd().c(0.2f).a(n).c("snow").d("snow"));
        c.a(81, "cactus", new aik().c(0.4f).a(l).c("cactus").d("cactus"));
        c.a(82, "clay", new aip().c(0.6f).a(g).c("clay").d("clay"));
        c.a(83, "reeds", new alv().c(0.0f).a(h).c("reeds").H().d("reeds"));
        c.a(84, "jukebox", new akh().c(2.0f).b(10.0f).a(i).c("jukebox").d("jukebox"));
        c.a(85, "fence", new ajq("planks_oak", avk.d).c(2.0f).b(5.0f).a(f).c("fence"));
        ahz ahz7 = new aln(false).c(1.0f).a(f).c("pumpkin").d("pumpkin");
        c.a(86, "pumpkin", ahz7);
        c.a(87, "netherrack", new akx().c(0.4f).a(i).c("hellrock").d("netherrack"));
        c.a(88, "soul_sand", new amf().c(0.5f).a(m).c("hellsand").d("soul_sand"));
        c.a(89, "glowstone", new ajx(avk.s).c(0.3f).a(k).a(1.0f).c("lightgem").d("glowstone"));
        c.a(90, "portal", new alg().c(-1.0f).a(k).a(0.75f).c("portal").d("portal"));
        c.a(91, "lit_pumpkin", new aln(true).c(1.0f).a(f).a(1.0f).c("litpumpkin").d("pumpkin"));
        c.a(92, "cake", new ail().c(0.5f).a(l).c("cake").H().d("cake"));
        c.a(93, "unpowered_repeater", new alw(false).c(0.0f).a(f).c("diode").H().d("repeater_off"));
        c.a(94, "powered_repeater", new alw(true).c(0.0f).a(0.625f).a(f).c("diode").H().d("repeater_on"));
        c.a(95, "stained_glass", new amh(avk.s).c(0.3f).a(k).c("stainedGlass").d("glass"));
        c.a(96, "trapdoor", new amv(avk.d).c(3.0f).a(f).c("trapdoor").H().d("trapdoor"));
        c.a(97, "monster_egg", new aks().c(0.75f).c("monsterStoneEgg"));
        ahz ahz8 = new amn().c(1.5f).b(10.0f).a(i).c("stonebricksmooth").d("stonebrick");
        c.a(98, "stonebrick", ahz8);
        c.a(99, "brown_mushroom_block", new akf(avk.d, 0).c(0.2f).a(f).c("mushroom").d("mushroom_block"));
        c.a(100, "red_mushroom_block", new akf(avk.d, 1).c(0.2f).a(f).c("mushroom").d("mushroom_block"));
        c.a(101, "iron_bars", new amr("iron_bars", "iron_bars", avk.f, true).c(5.0f).b(10.0f).a(j).c("fenceIron"));
        c.a(102, "glass_pane", new amr("glass", "glass_pane_top", avk.s, false).c(0.3f).a(k).c("thinGlass"));
        ahz ahz9 = new akp().c(1.0f).a(f).c("melon").d("melon");
        c.a(103, "melon_block", ahz9);
        c.a(104, "pumpkin_stem", new aml(ahz7).c(0.0f).a(f).c("pumpkinStem").d("pumpkin_stem"));
        c.a(105, "melon_stem", new aml(ahz9).c(0.0f).a(f).c("pumpkinStem").d("melon_stem"));
        c.a(106, "vine", new amy().c(0.2f).a(h).c("vine").d("vine"));
        c.a(107, "fence_gate", new ajr().c(2.0f).b(5.0f).a(f).c("fenceGate"));
        c.a(108, "brick_stairs", new amj(ahz5, 0).c("stairsBrick"));
        c.a(109, "stone_brick_stairs", new amj(ahz8, 0).c("stairsStoneBrickSmooth"));
        c.a(110, "mycelium", new aku().c(0.6f).a(h).c("mycel").d("mycelium"));
        c.a(111, "waterlily", new ana().c(0.0f).a(h).c("waterlily").d("waterlily"));
        ahz ahz10 = new ahz(avk.e).c(2.0f).b(10.0f).a(i).c("netherBrick").a(aak.b).d("nether_brick");
        c.a(112, "nether_brick", ahz10);
        c.a(113, "nether_brick_fence", new ajq("nether_brick", avk.e).c(2.0f).b(10.0f).a(i).c("netherFence"));
        c.a(114, "nether_brick_stairs", new amj(ahz10, 0).c("stairsNetherBrick"));
        c.a(115, "nether_wart", new akw().c("netherStalk").d("nether_wart"));
        c.a(116, "enchanting_table", new ajj().c(5.0f).b(2000.0f).c("enchantmentTable").d("enchanting_table"));
        c.a(117, "brewing_stand", new aih().c(0.5f).a(0.125f).c("brewingStand").d("brewing_stand"));
        c.a(118, "cauldron", new ain().c(2.0f).c("cauldron").d("cauldron"));
        c.a(119, "end_portal", new ajk(avk.E).c(-1.0f).b(6000000.0f));
        c.a(120, "end_portal_frame", new ajl().a(k).a(0.125f).c(-1.0f).c("endPortalFrame").b(6000000.0f).a(aak.c).d("endframe"));
        c.a(121, "end_stone", new ahz(avk.e).c(3.0f).b(15.0f).a(i).c("whiteStone").a(aak.b).d("end_stone"));
        c.a(122, "dragon_egg", new ajg().c(3.0f).b(15.0f).a(i).a(0.125f).c("dragonEgg").d("dragon_egg"));
        c.a(123, "redstone_lamp", new als(false).c(0.3f).a(k).c("redstoneLight").a(aak.d).d("redstone_lamp_off"));
        c.a(124, "lit_redstone_lamp", new als(true).c(0.3f).a(k).c("redstoneLight").d("redstone_lamp_on"));
        c.a(125, "double_wooden_slab", new anf(true).c(2.0f).b(5.0f).a(f).c("woodSlab"));
        c.a(126, "wooden_slab", new anf(false).c(2.0f).b(5.0f).a(f).c("woodSlab"));
        c.a(127, "cocoa", new aiq().c(0.2f).b(5.0f).a(f).c("cocoa").d("cocoa"));
        c.a(128, "sandstone_stairs", new amj(ahz4, 0).c("stairsSandStone"));
        c.a(129, "emerald_ore", new ale().c(3.0f).b(5.0f).a(i).c("oreEmerald").d("emerald_ore"));
        c.a(130, "ender_chest", new ajm().c(22.5f).b(1000.0f).a(i).c("enderChest").a(0.5f));
        c.a(131, "tripwire_hook", new amx().c("tripWireSource").d("trip_wire_source"));
        c.a(132, "tripwire", new amw().c("tripWire").d("trip_wire"));
        c.a(133, "emerald_block", new akq(avm.I).c(5.0f).b(10.0f).a(j).c("blockEmerald").d("emerald_block"));
        c.a(134, "spruce_stairs", new amj(ahz3, 1).c("stairsWoodSpruce"));
        c.a(135, "birch_stairs", new amj(ahz3, 2).c("stairsWoodBirch"));
        c.a(136, "jungle_stairs", new amj(ahz3, 3).c("stairsWoodJungle"));
        c.a(137, "command_block", new ais().s().b(6000000.0f).c("commandBlock").d("command_block"));
        c.a(138, "beacon", new ahx().c("beacon").a(1.0f).d("beacon"));
        c.a(139, "cobblestone_wall", new amz(ahz2).c("cobbleWall"));
        c.a(140, "flower_pot", new aju().c(0.0f).a(e).c("flowerPot").d("flower_pot"));
        c.a(141, "carrots", new aim().c("carrots").d("carrots"));
        c.a(142, "potatoes", new ali().c("potatoes").d("potatoes"));
        c.a(143, "wooden_button", new ane().c(0.5f).a(f).c("button"));
        c.a(144, "skull", new amc().c(1.0f).a(i).c("skull").d("skull"));
        c.a(145, "anvil", new ahs().c(5.0f).a(p).b(2000.0f).c("anvil"));
        c.a(146, "trapped_chest", new aio(1).c(2.5f).a(f).c("chestTrap"));
        c.a(147, "light_weighted_pressure_plate", new anc("gold_block", avk.f, 15).c(0.5f).a(f).c("weightedPlate_light"));
        c.a(148, "heavy_weighted_pressure_plate", new anc("iron_block", avk.f, 150).c(0.5f).a(f).c("weightedPlate_heavy"));
        c.a(149, "unpowered_comparator", new ait(false).c(0.0f).a(f).c("comparator").H().d("comparator_off"));
        c.a(150, "powered_comparator", new ait(true).c(0.0f).a(0.625f).a(f).c("comparator").H().d("comparator_on"));
        c.a(151, "daylight_detector", new aix().c(0.2f).a(f).c("daylightDetector").d("daylight_detector"));
        c.a(152, "redstone_block", new alj(avm.f).c(5.0f).b(10.0f).a(j).c("blockRedstone").d("redstone_block"));
        c.a(153, "quartz_ore", new ale().c(3.0f).b(5.0f).a(i).c("netherquartz").d("quartz_ore"));
        c.a(154, "hopper", new ake().c(3.0f).b(8.0f).a(f).c("hopper").d("hopper"));
        ahz ahz11 = new alo().a(i).c(0.8f).c("quartzBlock").d("quartz_block");
        c.a(155, "quartz_block", ahz11);
        c.a(156, "quartz_stairs", new amj(ahz11, 0).c("stairsQuartz"));
        c.a(157, "activator_rail", new alk().c(0.7f).a(j).c("activatorRail").d("rail_activator"));
        c.a(158, "dropper", new ajh().c(3.5f).a(i).c("dropper").d("dropper"));
        c.a(159, "stained_hardened_clay", new air(avk.e).c(1.25f).b(7.0f).a(i).c("clayHardenedStained").d("hardened_clay_stained"));
        c.a(160, "stained_glass_pane", new ami().c(0.3f).a(k).c("thinStainedGlass").d("glass"));
        c.a(161, "leaves2", new aky().c("leaves").d("leaves"));
        c.a(162, "log2", new akz().c("log").d("log"));
        c.a(163, "acacia_stairs", new amj(ahz3, 4).c("stairsWoodAcacia"));
        c.a(164, "dark_oak_stairs", new amj(ahz3, 5).c("stairsWoodDarkOak"));
        c.a(170, "hay_block", new akd().c(0.5f).a(h).c("hayBlock").a(aak.b).d("hay_block"));
        c.a(171, "carpet", new ang().c(0.1f).a(l).c("woolCarpet").g(0));
        c.a(172, "hardened_clay", new akc().c(1.25f).b(7.0f).a(i).c("clayHardened").d("hardened_clay"));
        c.a(173, "coal_block", new ahz(avk.e).c(5.0f).b(10.0f).a(i).c("blockCoal").a(aak.b).d("coal_block"));
        c.a(174, "packed_ice", new alf().c(0.5f).a(k).c("icePacked").d("ice_packed"));
        c.a(175, "double_plant", new ajf());
        for (ahz ahz12 : c) {
            boolean bl2;
            if (ahz12.J == avk.a) {
                ahz12.u = false;
                continue;
            }
            boolean bl3 = false;
            boolean bl4 = ahz12.b() == 10;
            boolean bl5 = ahz12 instanceof aka;
            boolean bl6 = ahz12 == ahz6;
            boolean bl7 = ahz12.s;
            boolean bl8 = bl2 = ahz12.r == 0;
            if (bl4 || bl5 || bl6 || bl7 || bl2) {
                bl3 = true;
            }
            ahz12.u = bl3;
        }
    }

    protected ahz(avk avk2) {
        this.J = avk2;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.q = this.c();
        this.r = this.c() ? 255 : 0;
        this.s = !avk2.b();
    }

    protected ahz a(aid aid2) {
        this.H = aid2;
        return this;
    }

    protected ahz g(int n2) {
        this.r = n2;
        return this;
    }

    protected ahz a(float f2) {
        this.t = (int)(15.0f * f2);
        return this;
    }

    protected ahz b(float f2) {
        this.w = f2 * 3.0f;
        return this;
    }

    public boolean q() {
        return this.J.c() && this.d();
    }

    public boolean r() {
        return this.J.k() && this.d() && !this.f();
    }

    public boolean d() {
        return true;
    }

    public boolean b(agc agc2, int n2, int n3, int n4) {
        return !this.J.c();
    }

    public int b() {
        return 0;
    }

    protected ahz c(float f2) {
        this.v = f2;
        if (this.w < f2 * 5.0f) {
            this.w = f2 * 5.0f;
        }
        return this;
    }

    protected ahz s() {
        this.c(-1.0f);
        return this;
    }

    public float f(afs afs2, int n2, int n3, int n4) {
        return this.v;
    }

    protected ahz a(boolean bl2) {
        this.z = bl2;
        return this;
    }

    public boolean t() {
        return this.z;
    }

    public boolean u() {
        return this.A;
    }

    protected final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.B = f2;
        this.C = f3;
        this.D = f4;
        this.E = f5;
        this.F = f6;
        this.G = f7;
    }

    public int c(agc agc2, int n2, int n3, int n4) {
        ahz ahz2 = agc2.a(n2, n3, n4);
        int n5 = agc2.c(n2, n3, n4, ahz2.m());
        if (n5 == 0 && ahz2 instanceof aka) {
            ahz2 = agc2.a(n2, --n3, n4);
            return agc2.c(n2, n3, n4, ahz2.m());
        }
        return n5;
    }

    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 0 && this.C > 0.0) {
            return true;
        }
        if (n5 == 1 && this.F < 1.0) {
            return true;
        }
        if (n5 == 2 && this.D > 0.0) {
            return true;
        }
        if (n5 == 3 && this.G < 1.0) {
            return true;
        }
        if (n5 == 4 && this.B > 0.0) {
            return true;
        }
        if (n5 == 5 && this.E < 1.0) {
            return true;
        }
        return !agc2.a(n2, n3, n4).c();
    }

    public boolean d(agc agc2, int n2, int n3, int n4, int n5) {
        return agc2.a(n2, n3, n4).o().a();
    }

    public pw e(agc agc2, int n2, int n3, int n4, int n5) {
        return this.a(n5, agc2.e(n2, n3, n4));
    }

    public pw a(int n2, int n3) {
        return this.L;
    }

    public final pw h(int n2) {
        return this.a(n2, 0);
    }

    public ayk g(afs afs2, int n2, int n3, int n4) {
        return ayk.a().a((double)n2 + this.B, (double)n3 + this.C, (double)n4 + this.D, (double)n2 + this.E, (double)n3 + this.F, (double)n4 + this.G);
    }

    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        ayk ayk3 = this.a(afs2, n2, n3, n4);
        if (ayk3 != null && ayk2.b(ayk3)) {
            list.add(ayk3);
        }
    }

    public ayk a(afs afs2, int n2, int n3, int n4) {
        return ayk.a().a((double)n2 + this.B, (double)n3 + this.C, (double)n4 + this.D, (double)n2 + this.E, (double)n3 + this.F, (double)n4 + this.G);
    }

    public boolean c() {
        return true;
    }

    public boolean a(int n2, boolean bl2) {
        return this.v();
    }

    public boolean v() {
        return true;
    }

    public void a(afs afs2, int n2, int n3, int n4, Random random) {
    }

    public void b(afs afs2, int n2, int n3, int n4, Random random) {
    }

    public void b(afs afs2, int n2, int n3, int n4, int n5) {
    }

    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
    }

    public int a(afs afs2) {
        return 10;
    }

    public void b(afs afs2, int n2, int n3, int n4) {
    }

    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
    }

    public int a(Random random) {
        return 1;
    }

    public abs a(int n2, Random random, int n3) {
        return abs.a(this);
    }

    public float a(xq xq2, afs afs2, int n2, int n3, int n4) {
        float f2 = this.f(afs2, n2, n3, n4);
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (!xq2.a(this)) {
            return xq2.a(this, false) / f2 / 100.0f;
        }
        return xq2.a(this, true) / f2 / 30.0f;
    }

    public final void b(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        this.a(afs2, n2, n3, n4, n5, 1.0f, n6);
    }

    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        if (afs2.E) {
            return;
        }
        int n7 = this.a(n6, afs2.s);
        for (int i2 = 0; i2 < n7; ++i2) {
            abs abs2;
            if (afs2.s.nextFloat() > f2 || (abs2 = this.a(n5, afs2.s, n6)) == null) continue;
            this.a(afs2, n2, n3, n4, new abu(abs2, 1, this.a(n5)));
        }
    }

    protected void a(afs afs2, int n2, int n3, int n4, abu abu2) {
        if (afs2.E || !afs2.O().b("doTileDrops")) {
            return;
        }
        float f2 = 0.7f;
        double d2 = (double)(afs2.s.nextFloat() * f2) + (double)(1.0f - f2) * 0.5;
        double d3 = (double)(afs2.s.nextFloat() * f2) + (double)(1.0f - f2) * 0.5;
        double d4 = (double)(afs2.s.nextFloat() * f2) + (double)(1.0f - f2) * 0.5;
        wb wb2 = new wb(afs2, (double)n2 + d2, (double)n3 + d3, (double)n4 + d4, abu2);
        wb2.b = 10;
        afs2.d(wb2);
    }

    protected void c(afs afs2, int n2, int n3, int n4, int n5) {
        if (!afs2.E) {
            while (n5 > 0) {
                int n6 = rh.a(n5);
                n5 -= n6;
                afs2.d(new rh(afs2, (double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, n6));
            }
        }
    }

    public int a(int n2) {
        return 0;
    }

    public float a(qr qr2) {
        return this.w / 5.0f;
    }

    public ayn a(afs afs2, int n2, int n3, int n4, ayp ayp2, ayp ayp3) {
        this.a((agc)afs2, n2, n3, n4);
        ayp2 = ayp2.c(-n2, -n3, -n4);
        ayp3 = ayp3.c(-n2, -n3, -n4);
        ayp ayp4 = ayp2.b(ayp3, this.B);
        ayp ayp5 = ayp2.b(ayp3, this.E);
        ayp ayp6 = ayp2.c(ayp3, this.C);
        ayp ayp7 = ayp2.c(ayp3, this.F);
        ayp ayp8 = ayp2.d(ayp3, this.D);
        ayp ayp9 = ayp2.d(ayp3, this.G);
        if (!this.a(ayp4)) {
            ayp4 = null;
        }
        if (!this.a(ayp5)) {
            ayp5 = null;
        }
        if (!this.b(ayp6)) {
            ayp6 = null;
        }
        if (!this.b(ayp7)) {
            ayp7 = null;
        }
        if (!this.c(ayp8)) {
            ayp8 = null;
        }
        if (!this.c(ayp9)) {
            ayp9 = null;
        }
        ayp ayp10 = null;
        if (ayp4 != null && (ayp10 == null || ayp2.e(ayp4) < ayp2.e(ayp10))) {
            ayp10 = ayp4;
        }
        if (ayp5 != null && (ayp10 == null || ayp2.e(ayp5) < ayp2.e(ayp10))) {
            ayp10 = ayp5;
        }
        if (ayp6 != null && (ayp10 == null || ayp2.e(ayp6) < ayp2.e(ayp10))) {
            ayp10 = ayp6;
        }
        if (ayp7 != null && (ayp10 == null || ayp2.e(ayp7) < ayp2.e(ayp10))) {
            ayp10 = ayp7;
        }
        if (ayp8 != null && (ayp10 == null || ayp2.e(ayp8) < ayp2.e(ayp10))) {
            ayp10 = ayp8;
        }
        if (ayp9 != null && (ayp10 == null || ayp2.e(ayp9) < ayp2.e(ayp10))) {
            ayp10 = ayp9;
        }
        if (ayp10 == null) {
            return null;
        }
        int n5 = -1;
        if (ayp10 == ayp4) {
            n5 = 4;
        }
        if (ayp10 == ayp5) {
            n5 = 5;
        }
        if (ayp10 == ayp6) {
            n5 = 0;
        }
        if (ayp10 == ayp7) {
            n5 = 1;
        }
        if (ayp10 == ayp8) {
            n5 = 2;
        }
        if (ayp10 == ayp9) {
            n5 = 3;
        }
        return new ayn(n2, n3, n4, n5, ayp10.c(n2, n3, n4));
    }

    private boolean a(ayp ayp2) {
        if (ayp2 == null) {
            return false;
        }
        return ayp2.d >= this.C && ayp2.d <= this.F && ayp2.e >= this.D && ayp2.e <= this.G;
    }

    private boolean b(ayp ayp2) {
        if (ayp2 == null) {
            return false;
        }
        return ayp2.c >= this.B && ayp2.c <= this.E && ayp2.e >= this.D && ayp2.e <= this.G;
    }

    private boolean c(ayp ayp2) {
        if (ayp2 == null) {
            return false;
        }
        return ayp2.c >= this.B && ayp2.c <= this.E && ayp2.d >= this.C && ayp2.d <= this.F;
    }

    public void a(afs afs2, int n2, int n3, int n4, afn afn2) {
    }

    public int w() {
        return 0;
    }

    public boolean a(afs afs2, int n2, int n3, int n4, int n5, abu abu2) {
        return this.d(afs2, n2, n3, n4, n5);
    }

    public boolean d(afs afs2, int n2, int n3, int n4, int n5) {
        return this.c(afs2, n2, n3, n4);
    }

    public boolean c(afs afs2, int n2, int n3, int n4) {
        return afs2.a((int)n2, (int)n3, (int)n4).J.j();
    }

    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        return false;
    }

    public void b(afs afs2, int n2, int n3, int n4, qr qr2) {
    }

    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        return n6;
    }

    public void a(afs afs2, int n2, int n3, int n4, xq xq2) {
    }

    public void a(afs afs2, int n2, int n3, int n4, qr qr2, ayp ayp2) {
    }

    public void a(agc agc2, int n2, int n3, int n4) {
    }

    public final double x() {
        return this.B;
    }

    public final double y() {
        return this.E;
    }

    public final double z() {
        return this.C;
    }

    public final double A() {
        return this.F;
    }

    public final double B() {
        return this.D;
    }

    public final double C() {
        return this.G;
    }

    public int D() {
        return 0xFFFFFF;
    }

    public int i(int n2) {
        return 0xFFFFFF;
    }

    public int d(agc agc2, int n2, int n3, int n4) {
        return 0xFFFFFF;
    }

    public int b(agc agc2, int n2, int n3, int n4, int n5) {
        return 0;
    }

    public boolean f() {
        return false;
    }

    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
    }

    public int c(agc agc2, int n2, int n3, int n4, int n5) {
        return 0;
    }

    public void g() {
    }

    public void a(afs afs2, xq xq2, int n2, int n3, int n4, int n5) {
        xq2.a(og.C[ahz.b(this)], 1);
        xq2.a(0.025f);
        if (this.E() && aem.e(xq2)) {
            abu abu2 = this.j(n5);
            if (abu2 != null) {
                this.a(afs2, n2, n3, n4, abu2);
            }
        } else {
            int n6 = aem.f(xq2);
            this.b(afs2, n2, n3, n4, n5, n6);
        }
    }

    protected boolean E() {
        return this.d() && !this.A;
    }

    protected abu j(int n2) {
        int n3 = 0;
        abs abs2 = abs.a(this);
        if (abs2 != null && abs2.n()) {
            n3 = n2;
        }
        return new abu(abs2, 1, n3);
    }

    public int a(int n2, Random random) {
        return this.a(random);
    }

    public boolean j(afs afs2, int n2, int n3, int n4) {
        return true;
    }

    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
    }

    public void e(afs afs2, int n2, int n3, int n4, int n5) {
    }

    public ahz c(String string) {
        this.b = string;
        return this;
    }

    public String F() {
        return dc.a(this.a() + ".name");
    }

    public String a() {
        return "tile." + this.b;
    }

    public boolean a(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        return false;
    }

    public boolean G() {
        return this.y;
    }

    protected ahz H() {
        this.y = false;
        return this;
    }

    public int h() {
        return this.J.m();
    }

    public float I() {
        return this.q() ? 0.2f : 1.0f;
    }

    public void a(afs afs2, int n2, int n3, int n4, qr qr2, float f2) {
    }

    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.a(this);
    }

    public int k(afs afs2, int n2, int n3, int n4) {
        return this.a(afs2.e(n2, n3, n4));
    }

    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
    }

    public aak J() {
        return this.a;
    }

    public ahz a(aak aak2) {
        this.a = aak2;
        return this;
    }

    public void a(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
    }

    public void f(afs afs2, int n2, int n3, int n4, int n5) {
    }

    public void l(afs afs2, int n2, int n3, int n4) {
    }

    public boolean K() {
        return false;
    }

    public boolean L() {
        return true;
    }

    public boolean a(afn afn2) {
        return true;
    }

    public boolean c(ahz ahz2) {
        return this == ahz2;
    }

    public static boolean a(ahz ahz2, ahz ahz3) {
        if (ahz2 == null || ahz3 == null) {
            return false;
        }
        if (ahz2 == ahz3) {
            return true;
        }
        return ahz2.c(ahz3);
    }

    public boolean M() {
        return false;
    }

    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        return 0;
    }

    protected ahz d(String string) {
        this.d = string;
        return this;
    }

    protected String N() {
        return this.d == null ? "MISSING_ICON_BLOCK_" + ahz.b(this) + "_" + this.b : this.d;
    }

    public pw b(int n2, int n3) {
        return this.a(n2, n3);
    }

    public void a(px px2) {
        this.L = px2.a(this.N());
    }

    public String O() {
        return null;
    }
}

