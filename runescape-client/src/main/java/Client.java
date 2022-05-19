import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "[Lek;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = 127608033
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 332427901
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 734962691
	)
	public static int field767;
	@ObfuscatedName("si")
	static boolean field734;
	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	static final ApproximateRouteStrategy field771;
	@ObfuscatedName("vk")
	static int[] field772;
	@ObfuscatedName("vl")
	static int[] field773;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -1537020861
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -512520213
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 2034802331
	)
	static int field602;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 438457609
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -125837253
	)
	static int field763;
	@ObfuscatedName("so")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -1463523237
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("th")
	static boolean[] field743;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = 1443023427
	)
	static int field515;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "[Let;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ti")
	static boolean field742;
	@ObfuscatedName("ri")
	static long[] field717;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = 1619055061
	)
	static int field718;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		longValue = -2855623584539877235L
	)
	static long field722;
	@ObfuscatedName("uh")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = 430177943
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -2066946189
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("sa")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("td")
	static short field748;
	@ObfuscatedName("ty")
	static short field749;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "[Lau;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ug")
	static short field656;
	@ObfuscatedName("sn")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("uk")
	static short field755;
	@ObfuscatedName("tt")
	static short field753;
	@ObfuscatedName("sy")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 1318674061
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("st")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 1333373151
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tz")
	static short field752;
	@ObfuscatedName("rf")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 731924017
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -1035456419
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("rl")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tf")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("tw")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -509945839
	)
	static int field719;
	@ObfuscatedName("tx")
	static int[] field745;
	@ObfuscatedName("rp")
	static int[] field721;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 1709573475
	)
	static int field770;
	@ObfuscatedName("rn")
	static int[] field720;
	@ObfuscatedName("tg")
	static int[] field744;
	@ObfuscatedName("tp")
	static int[] field714;
	@ObfuscatedName("tv")
	static int[] field677;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("rz")
	static int[] field769;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -1427601113
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -1897700155
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rd")
	static String field549;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgh;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("at")
	static boolean field659;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1278418291
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1944187969
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -792348705
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bl")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bs")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bj")
	static String field662;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -217293771
	)
	static int field484;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 499498919
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -965368167
	)
	static int field486;
	@ObfuscatedName("bt")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1544003447
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cp")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 469489167
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		longValue = 7486676481103711511L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1940299159
	)
	static int field492;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1700797465
	)
	static int field681;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		longValue = 4238643244622265373L
	)
	static long field494;
	@ObfuscatedName("dx")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 2094140741
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1533095709
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 327943909
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1320763851
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -48902629
	)
	static int field500;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 618879367
	)
	static int field501;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -2093475868
	)
	static int field563;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1096715840
	)
	static int field503;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -191506368
	)
	static int field554;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1074005895
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -1048838289
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -732279823
	)
	static int field625;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 186266927
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1220447691
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 2023084757
	)
	static int field626;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -70601535
	)
	static int field514;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -30088535
	)
	static int field654;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	static class124 field615;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static class443 field517;
	@ObfuscatedName("fk")
	static final String field526;
	@ObfuscatedName("gp")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gy")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("gd")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "[Lcd;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1947856981
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gu")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1608740447
	)
	static int field565;
	@ObfuscatedName("gr")
	static int[] field601;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 1726076607
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gt")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hy")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("ht")
	static boolean field493;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hc")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = -1668545791
	)
	static int field545;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = 689366699
	)
	static int field546;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -262177223
	)
	static int field570;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1267729281
	)
	static int field548;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1293908739
	)
	static int field597;
	@ObfuscatedName("ig")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("iy")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("ip")
	static final int[] field553;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -1672744051
	)
	static int field727;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 1810344519
	)
	static int field555;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -780915989
	)
	static int field556;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -1243173565
	)
	static int field640;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1989374159
	)
	static int field483;
	@ObfuscatedName("io")
	static boolean field559;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -684171709
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 1197895497
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 1252457677
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -1755070001
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = -1679026773
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -906562689
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -1720159471
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 335114329
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -314035411
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1232038605
	)
	static int field569;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1950209385
	)
	static int field567;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1023354667
	)
	static int field571;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 208832309
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -175885413
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1673751255
	)
	static int field482;
	@ObfuscatedName("kf")
	static boolean field575;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -270296809
	)
	static int field576;
	@ObfuscatedName("kn")
	static boolean field557;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -2076113975
	)
	static int field578;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 483768037
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 1581123849
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("kp")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kl")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ki")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kv")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ks")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kw")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kb")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kc")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1351448589
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 1803325213
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 807038053
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 47728385
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 2041470719
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1687090233
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 379603381
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kq")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -759271611
	)
	static int field598;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 1437033155
	)
	static int field599;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -294428911
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1303003277
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -813690107
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 637964015
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("ld")
	static boolean field604;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1631862171
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1891907085
	)
	static int field606;
	@ObfuscatedName("lj")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "[Lca;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1171887655
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 770928633
	)
	static int field610;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		longValue = 3707872763962830187L
	)
	static long field611;
	@ObfuscatedName("lq")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -154688775
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1065459261
	)
	static int field621;
	@ObfuscatedName("lm")
	static int[] field616;
	@ObfuscatedName("ma")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mi")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ms")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ml")
	static int[] field620;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -599570105
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "[[[Llv;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mr")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mx")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mo")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 2040476069
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("mp")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 942781313
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("my")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mc")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mz")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mh")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mw")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nd")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("nj")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("na")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nn")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("nr")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nm")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -967949353
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 1936177467
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1234203737
	)
	static int field645;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -690580105
	)
	static int field702;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -1712799689
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("no")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = 1489754623
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1640085877
	)
	static int field651;
	@ObfuscatedName("nk")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nv")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -628280401
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -381412093
	)
	static int field487;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -1385659211
	)
	static int field657;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 1129390483
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1268599939
	)
	static int field480;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 942376391
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 93181997
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1679259971
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 840097293
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("or")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	static Widget field668;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -251848545
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 701573001
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ok")
	static boolean field574;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 1943275901
	)
	static int field747;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 2047583569
	)
	static int field674;
	@ObfuscatedName("om")
	static boolean field675;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 352021831
	)
	static int field653;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1143795035
	)
	static int field612;
	@ObfuscatedName("op")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 1746638637
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pj")
	static int[] field680;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1300368255
	)
	static int field552;
	@ObfuscatedName("pu")
	static int[] field682;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -386041557
	)
	static int field683;
	@ObfuscatedName("pg")
	static int[] field684;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 1687044341
	)
	static int field676;
	@ObfuscatedName("pb")
	static int[] field686;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -31940881
	)
	static int field687;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 743328381
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1498936325
	)
	static int field689;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -1311780869
	)
	static int field690;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1047813865
	)
	static int field691;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = -316236861
	)
	static int field692;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 330047093
	)
	static int field762;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 907254029
	)
	static int field512;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1728010509
	)
	static int field695;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 189830111
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static NodeDeque field698;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static NodeDeque field701;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 863306169
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 300350499
	)
	static int field694;
	@ObfuscatedName("qr")
	static boolean[] field652;
	@ObfuscatedName("qk")
	static boolean[] field704;
	@ObfuscatedName("qa")
	static boolean[] field524;
	@ObfuscatedName("qh")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qj")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qz")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -1165338739
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		longValue = 5765024780864769377L
	)
	static long field711;
	@ObfuscatedName("qq")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("fx")
	String field518;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	class14 field519;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	class19 field520;
	@ObfuscatedName("fr")
	OtlTokenRequester field478;
	@ObfuscatedName("fu")
	Future field550;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	class19 field523;
	@ObfuscatedName("fj")
	RefreshAccessTokenRequester field577;
	@ObfuscatedName("fm")
	Future field581;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	Buffer field529;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	class7 field592;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		longValue = 5000728514975258643L
	)
	long field531;

	static {
		field659 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field484 = -1;
		clientType = -1;
		field486 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field492 = -1;
		field681 = -1;
		field494 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		field500 = 0;
		field501 = 0;
		field563 = 0;
		field503 = 0;
		field554 = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field625 = 0;
		js5Errors = 0;
		loginState = 0;
		field626 = 0;
		field514 = 0;
		field654 = 0;
		field615 = class124.field1553;
		field517 = class443.field4734;
		field526 = class119.method2745(SecureRandomCallable.method2035("com_jagex_auth_desktop_osrs:public"));
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field565 = 0;
		field601 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		useBufferedSocket = true;
		field493 = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field545 = 0;
		field546 = 1;
		field570 = 0;
		field548 = 1;
		field597 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field553 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field727 = 0;
		field555 = 2301979;
		field556 = 5063219;
		field640 = 3353893;
		field483 = 7759444;
		field559 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field569 = 0;
		field567 = 0;
		field571 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field482 = 0;
		field575 = false;
		field576 = 0;
		field557 = false;
		field578 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field598 = 0;
		field599 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field604 = false;
		itemDragDuration = 0;
		field606 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field610 = 0;
		field611 = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field621 = 0;
		field616 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		field620 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = 0;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field645 = 0;
		field702 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field651 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field487 = 0;
		field657 = -1;
		chatEffects = 0;
		field480 = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		field668 = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field574 = false;
		field747 = -1;
		field674 = -1;
		field675 = false;
		field653 = -1;
		field612 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		field680 = new int[32];
		field552 = 0;
		field682 = new int[32];
		field683 = 0;
		field684 = new int[32];
		field676 = 0;
		field686 = new int[32];
		field687 = 0;
		chatCycle = 0;
		field689 = 0;
		field690 = 0;
		field691 = 0;
		field692 = 0;
		field762 = 0;
		field512 = 0;
		field695 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field698 = new NodeDeque();
		field701 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field694 = -2;
		field652 = new boolean[100];
		field704 = new boolean[100];
		field524 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field711 = 0L;
		isResizable = true;
		field769 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field549 = "";
		field717 = new long[100];
		field718 = 0;
		field719 = 0;
		field720 = new int[128];
		field721 = new int[128];
		field722 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field515 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field734 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field742 = false;
		field743 = new boolean[5];
		field744 = new int[5];
		field745 = new int[5];
		field714 = new int[5];
		field677 = new int[5];
		field748 = 256;
		field749 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field752 = 1;
		field753 = 32767;
		field656 = 1;
		field755 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field602 = -1;
		field763 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field767 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field770 = 0;
		field771 = new ApproximateRouteStrategy();
		field772 = new int[50];
		field773 = new int[50];
	}

	public Client() {
		this.field531 = -1L;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1437501286"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field711 = class113.method2624() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1311"
	)
	@Export("setUp")
	protected final void setUp() {
		Interpreter.method1866(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		Tiles.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		GrandExchangeEvent.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		WorldMapRegion.currentPort = Tiles.worldPort;
		Coord.field3352 = class293.field3375;
		DesktopPlatformInfoProvider.field4469 = class293.field3371;
		class340.field4156 = class293.field3376;
		PlayerComposition.field3366 = class293.field3374;
		UserComparator7.urlRequester = new class101();
		this.setUpKeyboard();
		this.method415();
		Clock.mouseWheel = this.mouseWheel();
		class135.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = UserComparator3.getPreferencesFile("", ApproximateRouteStrategy.field473.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		class12.clientPreferences = var3;
		this.setUpClipboard();
		Tiles.method1996(this, GameEngine.field206);
		Widget.setWindowedMode(class12.clientPreferences.method2274());
		BufferedSource.friendSystem = new FriendSystem(class391.loginType);
		this.field519 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-772264838"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				int var5;
				try {
					if (class273.musicPlayerStatus == 1) {
						var5 = class273.midiPcmStream.method5080();
						if (var5 > 0 && class273.midiPcmStream.isReady()) {
							var5 -= GrandExchangeEvent.pcmSampleLength;
							if (var5 < 0) {
								var5 = 0;
							}

							class273.midiPcmStream.setPcmStreamVolume(var5);
						} else {
							class273.midiPcmStream.clear();
							class273.midiPcmStream.removeAll();
							if (ClanChannelMember.musicTrackArchive != null) {
								class273.musicPlayerStatus = 2;
							} else {
								class273.musicPlayerStatus = 0;
							}

							class273.musicTrack = null;
							class152.soundCache = null;
						}
					}
				} catch (Exception var9) {
					var9.printStackTrace();
					class273.midiPcmStream.clear();
					class273.musicPlayerStatus = 0;
					class273.musicTrack = null;
					class152.soundCache = null;
					ClanChannelMember.musicTrackArchive = null;
				}

				ArchiveLoader.playPcmPlayers();
				synchronized(KeyHandler.KeyHandler_instance) {
					++KeyHandler.KeyHandler_idleCycles;
					KeyHandler.field142 = KeyHandler.field144;
					KeyHandler.field139 = 0;
					KeyHandler.field134 = 0;
					Arrays.fill(KeyHandler.field120, false);
					Arrays.fill(KeyHandler.field132, false);
					if (KeyHandler.field135 < 0) {
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
						KeyHandler.field135 = KeyHandler.field150;
					} else {
						while (KeyHandler.field135 != KeyHandler.field150) {
							int var6 = KeyHandler.field133[KeyHandler.field150];
							KeyHandler.field150 = KeyHandler.field150 + 1 & 127;
							if (var6 < 0) {
								var6 = ~var6;
								if (KeyHandler.KeyHandler_pressedKeys[var6]) {
									KeyHandler.KeyHandler_pressedKeys[var6] = false;
									KeyHandler.field132[var6] = true;
									KeyHandler.field140[KeyHandler.field134] = var6;
									++KeyHandler.field134;
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var6] && KeyHandler.field139 < KeyHandler.field138.length - 1) {
									KeyHandler.field120[var6] = true;
									KeyHandler.field138[++KeyHandler.field139 - 1] = var6;
								}

								KeyHandler.KeyHandler_pressedKeys[var6] = true;
							}
						}
					}

					if (KeyHandler.field139 > 0) {
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field144 = KeyHandler.field143;
				}

				WorldMapLabelSize.method4414();
				if (Clock.mouseWheel != null) {
					var5 = Clock.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					ClanSettings.load();
					WorldMap.method7222();
				} else if (gameState == 5) {
					class136.method2858(this, class149.fontPlain12);
					ClanSettings.load();
					WorldMap.method7222();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class136.method2858(this, class149.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class136.method2858(this, class149.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						class301.method5580();
					}
				} else {
					class136.method2858(this, class149.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-375798495"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = Players.method2427();
		if (var2 && field734 && SecureRandomCallable.pcmPlayer0 != null) {
			SecureRandomCallable.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field711 != 0L && class113.method2624() > field711) {
			Widget.setWindowedMode(ClanChannelMember.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field652[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			SoundCache.drawTitle(ChatChannel.fontBold12, Varcs.fontPlain11, class149.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				SoundCache.drawTitle(ChatChannel.fontBold12, Varcs.fontPlain11, class149.fontPlain12);
			} else if (gameState == 50) {
				SoundCache.drawTitle(ChatChannel.fontBold12, Varcs.fontPlain11, class149.fontPlain12);
			} else if (gameState == 25) {
				if (field597 == 1) {
					if (field545 > field546) {
						field546 = field545;
					}

					var3 = (field546 * 50 - field545 * 50) / field546;
					class259.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field597 == 2) {
					if (field570 > field548) {
						field548 = field570;
					}

					var3 = (field548 * 50 - field570 * 50) / field548 + 50;
					class259.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					class259.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class259.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class259.drawLoadingMessage("Please wait...", false);
			}
		} else {
			SoundCache.drawTitle(ChatChannel.fontBold12, Varcs.fontPlain11, class149.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field704[var3]) {
					DevicePcmPlayerProvider.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field704[var3] = false;
				}
			}
		} else if (gameState > 0) {
			DevicePcmPlayerProvider.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field704[var3] = false;
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class125.varcs.hasUnwrittenChanges()) {
			class125.varcs.write();
		}

		if (Varcs.mouseRecorder != null) {
			Varcs.mouseRecorder.isRunning = false;
		}

		Varcs.mouseRecorder = null;
		packetWriter.close();
		class162.method3209();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		Clock.mouseWheel = null;
		if (SecureRandomCallable.pcmPlayer0 != null) {
			SecureRandomCallable.pcmPlayer0.shutdown();
		}

		if (Fonts.pcmPlayer1 != null) {
			Fonts.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		Occluder.method4221();
		if (UserComparator7.urlRequester != null) {
			UserComparator7.urlRequester.close();
			UserComparator7.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var3 = 0; var3 < UserComparator6.idxCount; ++var3) {
				JagexCache.JagexCache_idxFiles[var3].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var5) {
		}

		this.field519.method161();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	protected final void vmethod1448() {
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1606202603"
	)
	boolean method1128() {
		return Decimator.field406 != null && !Decimator.field406.trim().isEmpty();
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-69"
	)
	boolean method1520() {
		return this.field478 != null;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "64"
	)
	void method1130(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(ApproximateRouteStrategy.field471 + "shield/oauth/token" + (new class401(var2)).method6961());
		HashMap var4 = new HashMap();
		var4.put("Authorization", "Basic " + field526);
		var4.put("Host", (new URL(ApproximateRouteStrategy.field471)).getHost());
		var4.put("Accept", class398.field4432.method6940());
		class9 var5 = class9.field32;
		RefreshAccessTokenRequester var6 = this.field577;
		if (var6 != null) {
			this.field581 = var6.request(var5.method67(), var3, var4, "");
		} else {
			class10 var7 = new class10(var3, var5);
			Iterator var8 = var4.entrySet().iterator();

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next();
				var7.method78((String)var9.getKey(), (String)var9.getValue());
			}

			this.field523 = this.field519.method160(var7);
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1218305449"
	)
	void method1229(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(ApproximateRouteStrategy.field471 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HashMap var3 = new HashMap();
		var3.put("Authorization", "Bearer " + var1);
		class9 var4 = class9.field40;
		OtlTokenRequester var5 = this.field478;
		if (var5 != null) {
			this.field550 = var5.request(var4.method67(), var2, var3, "");
		} else {
			class10 var6 = new class10(var2, var4);
			Iterator var7 = var3.entrySet().iterator();

			while (var7.hasNext()) {
				Entry var8 = (Entry)var7.next();
				var6.method78((String)var8.getKey(), (String)var8.getValue());
			}

			this.field520 = this.field519.method160(var6);
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-568109507"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = class113.method2624();
			int var4 = (int)(var2 - NetCache.field4041);
			NetCache.field4041 = var2;
			if (var4 > 200) {
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
				var1 = true;
			} else if (NetCache.NetCache_socket == null) {
				var1 = false;
			} else {
				try {
					label243: {
						if (NetCache.NetCache_loadTime > 30000) {
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
							var6 = new Buffer(4);
							var6.writeByte(1);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingPriorityWritesCount;
							++NetCache.NetCache_pendingPriorityResponsesCount;
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
							var6 = new Buffer(4);
							var6.writeByte(0);
							var6.writeMedium((int)var5.key);
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							var5.removeDual();
							NetCache.NetCache_pendingResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingWritesCount;
							++NetCache.NetCache_pendingResponsesCount;
						}

						for (int var17 = 0; var17 < 100; ++var17) {
							int var18 = NetCache.NetCache_socket.available();
							if (var18 < 0) {
								throw new IOException();
							}

							if (var18 == 0) {
								break;
							}

							NetCache.NetCache_loadTime = 0;
							byte var7 = 0;
							if (WorldMapIcon_0.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field4052 == 0) {
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field4043 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field4043;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (WorldMapIcon_0.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = (long)(var10 + (var9 << 16));
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
									class270.field3218 = true;
									if (var15 == null) {
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
										class270.field3218 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = var11 == 0 ? 5 : 9;
									WorldMapIcon_0.NetCache_currentResponse = var15;
									class357.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + WorldMapIcon_0.NetCache_currentResponse.padding);
									class357.NetCache_responseArchiveBuffer.writeByte(var11);
									class357.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field4052 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field4052 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field4052 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										WorldMapIcon_0.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = class357.NetCache_responseArchiveBuffer.array.length - WorldMapIcon_0.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field4052;
								if (var9 > var8 - class357.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - class357.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class357.NetCache_responseArchiveBuffer.array, class357.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field4043 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = class357.NetCache_responseArchiveBuffer.array;
										var10001 = class357.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4043;
									}
								}

								var25 = class357.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field4052 += var9;
								if (var8 == class357.NetCache_responseArchiveBuffer.offset) {
									if (WorldMapIcon_0.NetCache_currentResponse.key == 16711935L) {
										class300.NetCache_reference = class357.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												class300.NetCache_reference.offset = var10 * 8 + 5;
												var12 = class300.NetCache_reference.readInt();
												int var20 = class300.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(class357.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = (int)NetCache.NetCache_crc.getValue();
										if (var10 != WorldMapIcon_0.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field4043 = (byte)((int)(Math.random() * 255.0D + 1.0D));
											var1 = false;
											break label243;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										WorldMapIcon_0.NetCache_currentResponse.archive.write((int)(WorldMapIcon_0.NetCache_currentResponse.key & 65535L), class357.NetCache_responseArchiveBuffer.array, (WorldMapIcon_0.NetCache_currentResponse.key & 16711680L) == 16711680L, class270.field3218);
									}

									WorldMapIcon_0.NetCache_currentResponse.remove();
									if (class270.field3218) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field4052 = 0;
									WorldMapIcon_0.NetCache_currentResponse = null;
									class357.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field4052 != 512) {
										break;
									}

									NetCache.field4052 = 0;
								}
							}
						}

						var1 = true;
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var22) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
					var1 = false;
				}
			}

			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "17214"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			PendingSpawn.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					PendingSpawn.updateGameState(1000);
					return;
				}

				field625 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field625 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class259.js5SocketTask = GameEngine.taskHandler.newSocketTask(Timer.worldHost, WorldMapRegion.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class259.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class259.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							Socket var2 = (Socket)class259.js5SocketTask.result;
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
							Varcs.js5Socket = var1;
						} else {
							Varcs.js5Socket = new NetSocket((Socket)class259.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var5 = new Buffer(5);
						var5.writeByte(15);
						var5.writeInt(205);
						Varcs.js5Socket.write(var5.array, 0, 5);
						++js5ConnectState;
						class147.field1704 = class113.method2624();
					}

					if (js5ConnectState == 3) {
						if (Varcs.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var3 = Varcs.js5Socket.readUnsignedByte();
							if (var3 != 0) {
								this.js5Error(var3);
								return;
							}

							++js5ConnectState;
						} else if (class113.method2624() - class147.field1704 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						Skeleton.method4024(Varcs.js5Socket, gameState > 20);
						class259.js5SocketTask = null;
						Varcs.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var4) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1106896178"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class259.js5SocketTask = null;
		Varcs.js5Socket = null;
		js5ConnectState = 0;
		if (Tiles.worldPort == WorldMapRegion.currentPort) {
			WorldMapRegion.currentPort = GrandExchangeEvent.js5Port;
		} else {
			WorldMapRegion.currentPort = Tiles.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				PendingSpawn.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					PendingSpawn.updateGameState(1000);
				} else {
					field625 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			PendingSpawn.updateGameState(1000);
		} else {
			field625 = 3000;
		}

	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (secureRandom == null && (secureRandomFuture.isDone() || field626 > 250)) {
					secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					WorldMapCacheName.socketTask = null;
					hadNetworkError = false;
					field626 = 0;
					if (field517.method7790()) {
						try {
							this.method1130(ModelData0.field2661);
							Canvas.method347(21);
						} catch (Throwable var21) {
							ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var21);
							PcmPlayer.getLoginError(65);
							return;
						}
					} else {
						Canvas.method347(1);
					}
				}
			}

			class21 var23;
			if (loginState == 21) {
				if (this.field581 != null) {
					if (!this.field581.isDone()) {
						return;
					}

					if (this.field581.isCancelled()) {
						PcmPlayer.getLoginError(65);
						this.field581 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field581.get();
						if (!var3.isSuccess()) {
							PcmPlayer.getLoginError(65);
							this.field581 = null;
							return;
						}

						Decimator.field406 = var3.getAccessToken();
						ModelData0.field2661 = var3.getRefreshToken();
						this.field581 = null;
					} catch (Exception var20) {
						ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var20);
						PcmPlayer.getLoginError(65);
						this.field581 = null;
						return;
					}
				} else {
					if (this.field523 == null) {
						PcmPlayer.getLoginError(65);
						return;
					}

					if (!this.field523.method253()) {
						return;
					}

					if (this.field523.method250()) {
						ArchiveDiskActionHandler.RunException_sendStackTrace(this.field523.method251(), (Throwable)null);
						PcmPlayer.getLoginError(65);
						this.field523 = null;
						return;
					}

					var23 = this.field523.method254();
					if (var23.method271() != 200) {
						PcmPlayer.getLoginError(65);
						this.field523 = null;
						return;
					}

					field626 = 0;
					class400 var4 = new class400(var23.method276());

					try {
						Decimator.field406 = var4.method6947().getString("access_token");
						ModelData0.field2661 = var4.method6947().getString("refresh_token");
					} catch (Exception var19) {
						ArchiveDiskActionHandler.RunException_sendStackTrace("Error parsing tokens", var19);
						PcmPlayer.getLoginError(65);
						this.field523 = null;
						return;
					}
				}

				this.method1229(Decimator.field406);
				Canvas.method347(20);
			}

			if (loginState == 20) {
				if (this.field550 != null) {
					if (!this.field550.isDone()) {
						return;
					}

					if (this.field550.isCancelled()) {
						PcmPlayer.getLoginError(65);
						this.field550 = null;
						return;
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.field550.get();
						if (!var24.isSuccess()) {
							PcmPlayer.getLoginError(65);
							this.field550 = null;
							return;
						}

						this.field518 = var24.getToken();
						this.field550 = null;
					} catch (Exception var18) {
						ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var18);
						PcmPlayer.getLoginError(65);
						this.field550 = null;
						return;
					}
				} else {
					if (this.field520 == null) {
						PcmPlayer.getLoginError(65);
						return;
					}

					if (!this.field520.method253()) {
						return;
					}

					if (this.field520.method250()) {
						ArchiveDiskActionHandler.RunException_sendStackTrace(this.field520.method251(), (Throwable)null);
						PcmPlayer.getLoginError(65);
						this.field520 = null;
						return;
					}

					var23 = this.field520.method254();
					if (var23.method271() != 200) {
						ArchiveDiskActionHandler.RunException_sendStackTrace("Response code: " + var23.method271() + "Response body: " + var23.method276(), (Throwable)null);
						PcmPlayer.getLoginError(65);
						this.field520 = null;
						return;
					}

					this.field518 = var23.method276();
					this.field520 = null;
				}

				field626 = 0;
				Canvas.method347(1);
			}

			if (loginState == 1) {
				if (WorldMapCacheName.socketTask == null) {
					WorldMapCacheName.socketTask = GameEngine.taskHandler.newSocketTask(Timer.worldHost, WorldMapRegion.currentPort);
				}

				if (WorldMapCacheName.socketTask.status == 2) {
					throw new IOException();
				}

				if (WorldMapCacheName.socketTask.status == 1) {
					if (useBufferedSocket) {
						Socket var25 = (Socket)WorldMapCacheName.socketTask.result;
						BufferedNetSocket var26 = new BufferedNetSocket(var25, 40000, 5000);
						var1 = var26;
					} else {
						var1 = new NetSocket((Socket)WorldMapCacheName.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					WorldMapCacheName.socketTask = null;
					Canvas.method347(2);
				}
			}

			PacketBufferNode var27;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var27 = class162.method3208();
				var27.packetBuffer.writeByte(LoginPacket.field3192.id);
				packetWriter.addNode(var27);
				packetWriter.flush();
				var2.offset = 0;
				Canvas.method347(3);
			}

			boolean var11;
			int var12;
			if (loginState == 3) {
				if (SecureRandomCallable.pcmPlayer0 != null) {
					SecureRandomCallable.pcmPlayer0.method739();
				}

				if (Fonts.pcmPlayer1 != null) {
					Fonts.pcmPlayer1.method739();
				}

				var11 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var11 = false;
				}

				if (var11) {
					var12 = ((AbstractSocket)var1).readUnsignedByte();
					if (SecureRandomCallable.pcmPlayer0 != null) {
						SecureRandomCallable.pcmPlayer0.method739();
					}

					if (Fonts.pcmPlayer1 != null) {
						Fonts.pcmPlayer1.method739();
					}

					if (var12 != 0) {
						PcmPlayer.getLoginError(var12);
						return;
					}

					var2.offset = 0;
					Canvas.method347(4);
				}
			}

			int var40;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var40 = ((AbstractSocket)var1).available();
					if (var40 > 8 - var2.offset) {
						var40 = 8 - var2.offset;
					}

					if (var40 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var40);
						var2.offset += var40;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					ModelData0.field2658 = var2.readLong();
					Canvas.method347(5);
				}
			}

			int var6;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var29 = new PacketBuffer(500);
				int[] var28 = new int[]{secureRandom.nextInt(), secureRandom.nextInt(), secureRandom.nextInt(), secureRandom.nextInt()};
				var29.offset = 0;
				var29.writeByte(1);
				var29.writeInt(var28[0]);
				var29.writeInt(var28[1]);
				var29.writeInt(var28[2]);
				var29.writeInt(var28[3]);
				var29.writeLong(ModelData0.field2658);
				if (gameState == 40) {
					var29.writeInt(LoginType.field4619[0]);
					var29.writeInt(LoginType.field4619[1]);
					var29.writeInt(LoginType.field4619[2]);
					var29.writeInt(LoginType.field4619[3]);
				} else {
					if (gameState == 50) {
						var29.writeByte(class124.field1555.rsOrdinal());
						var29.writeInt(class7.field26);
					} else {
						var29.writeByte(field615.rsOrdinal());
						switch(field615.field1552) {
						case 0:
						case 1:
							var29.writeMedium(WorldMapCacheName.field2912);
							++var29.offset;
							break;
						case 2:
							var29.offset += 4;
							break;
						case 3:
							var29.writeInt((Integer)class12.clientPreferences.parameters.get(class239.method4810(Login.Login_username)));
						}
					}

					if (field517.method7790()) {
						var29.writeByte(class443.field4730.rsOrdinal());
						var29.writeStringCp1252NullTerminated(this.field518);
					} else {
						var29.writeByte(class443.field4734.rsOrdinal());
						var29.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var29.encryptRsa(class67.field875, class67.field871);
				LoginType.field4619 = var28;
				PacketBufferNode var5 = class162.method3208();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field3194.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3193.id);
				}

				var5.packetBuffer.writeShort(0);
				var6 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(205);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field486);
				var5.packetBuffer.writeBytes(var29.array, 0, var29.offset);
				int var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(GraphicsObject.canvasWidth);
				var5.packetBuffer.writeShort(class433.canvasHeight);
				IntHashTable.method8124(var5.packetBuffer);
				if (!field662.endsWith(";A")) {
					field662 = field662 + ";A";
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(field662);
				var5.packetBuffer.writeInt(class230.field2807);
				Buffer var8 = new Buffer(class135.platformInfo.size());
				class135.platformInfo.write(var8);
				var5.packetBuffer.writeBytes(var8.array, 0, var8.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.method7563(AbstractUserComparator.archive6.hash);
				var5.packetBuffer.writeInt(ItemContainer.archive20.hash);
				var5.packetBuffer.method7565(class305.archive8.hash);
				var5.packetBuffer.method7565(0);
				var5.packetBuffer.writeInt(class356.archive2.hash);
				var5.packetBuffer.method7563(VarpDefinition.archive19.hash);
				var5.packetBuffer.method7565(InterfaceParent.archive7.hash);
				var5.packetBuffer.method7565(class101.archive14.hash);
				var5.packetBuffer.method7564(UrlRequest.archive11.hash);
				var5.packetBuffer.writeInt(Clock.archive1.hash);
				var5.packetBuffer.method7563(Message.archive5.hash);
				var5.packetBuffer.writeInt(class16.archive13.hash);
				var5.packetBuffer.method7565(class114.archive17.hash);
				var5.packetBuffer.method7565(class92.archive18.hash);
				var5.packetBuffer.writeInt(ObjectSound.archive10.hash);
				var5.packetBuffer.writeInt(class194.archive3.hash);
				var5.packetBuffer.method7564(archive15.hash);
				var5.packetBuffer.writeInt(MouseHandler.archive4.hash);
				var5.packetBuffer.method7565(class115.archive12.hash);
				var5.packetBuffer.method7563(TileItem.archive9.hash);
				var5.packetBuffer.method7563(NetSocket.archive0.hash);
				var5.packetBuffer.xteaEncrypt(var28, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var28);
				int[] var9 = new int[4];

				for (int var10 = 0; var10 < 4; ++var10) {
					var9[var10] = var28[var10] + 50;
				}

				var2.newIsaacCipher(var9);
				Canvas.method347(6);
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var40 = ((AbstractSocket)var1).readUnsignedByte();
				if (var40 == 61) {
					var12 = ((AbstractSocket)var1).available();
					class92.field1273 = var12 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
					Canvas.method347(5);
				}

				if (var40 == 21 && gameState == 20) {
					Canvas.method347(12);
				} else if (var40 == 2) {
					Canvas.method347(14);
				} else if (var40 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					Canvas.method347(19);
				} else if (var40 == 64) {
					Canvas.method347(10);
				} else if (var40 == 23 && field514 < 1) {
					++field514;
					Canvas.method347(0);
				} else if (var40 == 29) {
					Canvas.method347(17);
				} else {
					if (var40 != 69) {
						PcmPlayer.getLoginError(var40);
						return;
					}

					Canvas.method347(7);
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				AttackOption.field1290 = var2.readUnsignedShort();
				Canvas.method347(8);
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= AttackOption.field1290) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, AttackOption.field1290);
				class6[] var31 = new class6[]{class6.field16};
				class6 var30 = var31[var2.readUnsignedByte()];

				try {
					switch(var30.field11) {
					case 0:
						class0 var32 = new class0();
						this.field592 = new class7(var2, var32);
						Canvas.method347(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var17) {
					PcmPlayer.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field592.method49()) {
				this.field529 = this.field592.method51();
				this.field592.method50();
				this.field592 = null;
				if (this.field529 == null) {
					PcmPlayer.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var27 = class162.method3208();
				var27.packetBuffer.writeByte(LoginPacket.field3195.id);
				var27.packetBuffer.writeShort(this.field529.offset);
				var27.packetBuffer.method7530(this.field529);
				packetWriter.addNode(var27);
				packetWriter.flush();
				this.field529 = null;
				Canvas.method347(6);
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				class263.field3070 = ((AbstractSocket)var1).readUnsignedByte();
				Canvas.method347(11);
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class263.field3070) {
				((AbstractSocket)var1).read(var2.array, 0, class263.field3070);
				var2.offset = 0;
				Canvas.method347(6);
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field654 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				Canvas.method347(13);
			}

			if (loginState == 13) {
				field626 = 0;
				class345.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field654 / 60 + " seconds.");
				if (--field654 <= 0) {
					Canvas.method347(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					Varcs.field1329 = ((AbstractSocket)var1).readUnsignedByte();
					Canvas.method347(15);
				}

				int var14;
				boolean var41;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= Varcs.field1329) {
					var11 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					var41 = false;
					if (var11) {
						var12 = var2.readByteIsaac() << 24;
						var12 |= var2.readByteIsaac() << 16;
						var12 |= var2.readByteIsaac() << 8;
						var12 |= var2.readByteIsaac();
						var14 = class239.method4810(Login.Login_username);
						if (class12.clientPreferences.parameters.size() >= 10 && !class12.clientPreferences.parameters.containsKey(var14)) {
							Iterator var13 = class12.clientPreferences.parameters.entrySet().iterator();
							var13.next();
							var13.remove();
						}

						class12.clientPreferences.parameters.put(var14, var12);
					}

					if (Login_isUsernameRemembered) {
						class12.clientPreferences.method2297(Login.Login_username);
					} else {
						class12.clientPreferences.method2297((String)null);
					}

					class270.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field610 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					this.field531 = var2.readLong();
					if (Varcs.field1329 >= 29) {
						((AbstractSocket)var1).read(var2.array, 0, 8);
						var2.offset = 0;
						field611 = var2.readLong();
					}

					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var34 = BuddyRankComparator.ServerPacket_values();
					var6 = var2.readSmartByteShortIsaac();
					if (var6 < 0 || var6 >= var34.length) {
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var34[var6];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class27.method370(class82.client, "zap");
					} catch (Throwable var16) {
					}

					Canvas.method347(16);
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method6370();
						mouseLastLastPressedTimeMillis = 1L;
						Varcs.mouseRecorder.index = 0;
						WorldMapArea.hasFocus = true;
						hadFocus = true;
						field722 = -1L;
						class33.reflectionChecks = new IterableNodeDeque();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1351 = null;
						packetWriter.field1340 = null;
						packetWriter.field1345 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1349 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						menuOptionsCount = 0;
						isMenuOpen = false;
						MouseHandler.MouseHandler_idleCycles = 0;
						class152.method3044();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						class127.field1570 = null;
						minimapState = 0;
						field515 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						Players.Players_count = 0;

						for (var40 = 0; var40 < 2048; ++var40) {
							Players.field1307[var40] = null;
							Players.field1302[var40] = class193.field2251;
						}

						for (var40 = 0; var40 < 2048; ++var40) {
							players[var40] = null;
						}

						for (var40 = 0; var40 < 32768; ++var40) {
							npcs[var40] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var40 = 0; var40 < 4; ++var40) {
							for (var12 = 0; var12 < 104; ++var12) {
								for (var14 = 0; var14 < 104; ++var14) {
									groundItems[var40][var12][var14] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						BufferedSource.friendSystem.clear();

						for (var40 = 0; var40 < VarpDefinition.VarpDefinition_fileCount; ++var40) {
							VarpDefinition var35 = class21.VarpDefinition_get(var40);
							if (var35 != null) {
								Varps.Varps_temp[var40] = 0;
								Varps.Varps_main[var40] = 0;
							}
						}

						class125.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							var40 = rootInterface;
							if (var40 != -1 && class120.Widget_loadedInterfaces[var40]) {
								class134.Widget_archive.clearFilesGroup(var40);
								if (NetSocket.Widget_interfaceComponents[var40] != null) {
									var41 = true;

									for (var14 = 0; var14 < NetSocket.Widget_interfaceComponents[var40].length; ++var14) {
										if (NetSocket.Widget_interfaceComponents[var40][var14] != null) {
											if (NetSocket.Widget_interfaceComponents[var40][var14].type != 2) {
												NetSocket.Widget_interfaceComponents[var40][var14] = null;
											} else {
												var41 = false;
											}
										}
									}

									if (var41) {
										NetSocket.Widget_interfaceComponents[var40] = null;
									}

									class120.Widget_loadedInterfaces[var40] = false;
								}
							}
						}

						for (InterfaceParent var39 = (InterfaceParent)interfaceParents.first(); var39 != null; var39 = (InterfaceParent)interfaceParents.next()) {
							NetSocket.closeInterface(var39, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						menuOptionsCount = 0;
						isMenuOpen = false;
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var40 = 0; var40 < 8; ++var40) {
							playerMenuActions[var40] = null;
							playerOptionsPriorities[var40] = false;
						}

						ItemContainer.itemContainers = new NodeHashTable(32);
						isLoading = true;

						for (var40 = 0; var40 < 100; ++var40) {
							field652[var40] = true;
						}

						var27 = DecorativeObject.getPacketBufferNode(ClientPacket.field3054, packetWriter.isaacCipher);
						var27.packetBuffer.writeByte(ClanChannelMember.getWindowedMode());
						var27.packetBuffer.writeShort(GraphicsObject.canvasWidth);
						var27.packetBuffer.writeShort(class433.canvasHeight);
						packetWriter.addNode(var27);
						PcmPlayer.friendsChatManager = null;
						class358.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object)null);
						UserComparator10.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object)null);

						for (var40 = 0; var40 < 8; ++var40) {
							grandExchangeOffers[var40] = new GrandExchangeOffer();
						}

						class120.grandExchangeEvents = null;
						Player.updatePlayer(var2);
						WorldMapSectionType.field2828 = -1;
						class144.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						Nameable.field4323 = var2.readUnsignedShort();
						Canvas.method347(18);
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= Nameable.field4323) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, Nameable.field4323);
						var2.offset = 0;
						String var36 = var2.readStringCp1252NullTerminated();
						String var33 = var2.readStringCp1252NullTerminated();
						String var37 = var2.readStringCp1252NullTerminated();
						class345.setLoginResponseString(var36, var33, var37);
						PendingSpawn.updateGameState(10);
						if (field517.method7790()) {
							class126.method2799(9);
						}
					}

					if (loginState != 19) {
						++field626;
						if (field626 > 2000) {
							if (field514 < 1) {
								if (Tiles.worldPort == WorldMapRegion.currentPort) {
									WorldMapRegion.currentPort = GrandExchangeEvent.js5Port;
								} else {
									WorldMapRegion.currentPort = Tiles.worldPort;
								}

								++field514;
								Canvas.method347(0);
							} else {
								PcmPlayer.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var40 = packetWriter.serverPacketLength;
							timer.method6372();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1351 = null;
							packetWriter.field1340 = null;
							packetWriter.field1345 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1349 = 0;
							rebootTimer = 0;
							HealthBar.method2336();
							minimapState = 0;
							destinationX = 0;

							for (var12 = 0; var12 < 2048; ++var12) {
								players[var12] = null;
							}

							ModelData0.localPlayer = null;

							for (var12 = 0; var12 < npcs.length; ++var12) {
								NPC var38 = npcs[var12];
								if (var38 != null) {
									var38.targetIndex = -1;
									var38.false0 = false;
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32);
							PendingSpawn.updateGameState(30);

							for (var12 = 0; var12 < 100; ++var12) {
								field652[var12] = true;
							}

							class140.method2951();
							Player.updatePlayer(var2);
							if (var40 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var22) {
			if (field514 < 1) {
				if (Tiles.worldPort == WorldMapRegion.currentPort) {
					WorldMapRegion.currentPort = GrandExchangeEvent.js5Port;
				} else {
					WorldMapRegion.currentPort = Tiles.worldPort;
				}

				++field514;
				Canvas.method347(0);
			} else {
				PcmPlayer.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			class129.method2812();
		} else {
			if (!isMenuOpen) {
				class20.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1254(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class33.reflectionChecks.last();
					boolean var30;
					if (var2 == null) {
						var30 = false;
					} else {
						var30 = true;
					}

					int var3;
					PacketBufferNode var31;
					if (!var30) {
						PacketBufferNode var14;
						int var15;
						if (timer.field4235) {
							var14 = DecorativeObject.getPacketBufferNode(ClientPacket.field3009, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.method7740(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method6371();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						PacketBuffer var10000;
						synchronized(Varcs.mouseRecorder.lock) {
							if (!field659) {
								Varcs.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Varcs.mouseRecorder.index >= 40) {
								var31 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < Varcs.mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = Varcs.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = Varcs.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field492 || var8 != field681) {
										if (var31 == null) {
											var31 = DecorativeObject.getPacketBufferNode(ClientPacket.field2952, packetWriter.isaacCipher);
											var31.packetBuffer.writeByte(0);
											var3 = var31.packetBuffer.offset;
											var10000 = var31.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (-1L != field494) {
											var10 = var9 - field492;
											var11 = var8 - field681;
											var12 = (int)((Varcs.mouseRecorder.millis[var7] - field494) / 20L);
											var5 = (int)((long)var5 + (Varcs.mouseRecorder.millis[var7] - field494) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field492 = var9;
										field681 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var31.packetBuffer.writeByte(var12 + 128);
											var31.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var31.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var31.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var31.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var31.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field494 = Varcs.mouseRecorder.millis[var7];
									}
								}

								if (var31 != null) {
									var31.packetBuffer.method7740(var31.packetBuffer.offset - var3);
									var7 = var31.packetBuffer.offset;
									var31.packetBuffer.offset = var3;
									var31.packetBuffer.writeByte(var5 / var6);
									var31.packetBuffer.writeByte(var5 % var6);
									var31.packetBuffer.offset = var7;
									packetWriter.addNode(var31);
								}

								if (var4 >= Varcs.mouseRecorder.index) {
									Varcs.mouseRecorder.index = 0;
								} else {
									MouseRecorder var54 = Varcs.mouseRecorder;
									var54.index -= var4;
									System.arraycopy(Varcs.mouseRecorder.xs, var4, Varcs.mouseRecorder.xs, 0, Varcs.mouseRecorder.index);
									System.arraycopy(Varcs.mouseRecorder.ys, var4, Varcs.mouseRecorder.ys, 0, Varcs.mouseRecorder.index);
									System.arraycopy(Varcs.mouseRecorder.millis, var4, Varcs.mouseRecorder.millis, 0, Varcs.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > class433.canvasHeight) {
								var3 = class433.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > GraphicsObject.canvasWidth) {
								var4 = GraphicsObject.canvasWidth;
							}

							var5 = (int)var16;
							var18 = DecorativeObject.getPacketBufferNode(ClientPacket.field3051, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field139 > 0) {
							var14 = DecorativeObject.getPacketBufferNode(ClientPacket.field2949, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = class113.method2624();

							for (var5 = 0; var5 < KeyHandler.field139; ++var5) {
								long var21 = var19 - field722;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field722 = var19;
								var14.packetBuffer.method7559((int)var21);
								var14.packetBuffer.writeByte(KeyHandler.field138[var5]);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field576 > 0) {
							--field576;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field557 = true;
						}

						if (field557 && field576 <= 0) {
							field576 = 20;
							field557 = false;
							var14 = DecorativeObject.getPacketBufferNode(ClientPacket.field3035, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(camAngleY);
							var14.packetBuffer.writeShort(camAngleX);
							packetWriter.addNode(var14);
						}

						if (WorldMapArea.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = DecorativeObject.getPacketBufferNode(ClientPacket.field3038, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!WorldMapArea.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = DecorativeObject.getPacketBufferNode(ClientPacket.field3038, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (ServerPacket.worldMap != null) {
							ServerPacket.worldMap.method7023();
						}

						WorldMapSection1.method4839();
						HealthBar.method2334();
						if (field515 != class128.Client_plane) {
							field515 = class128.Client_plane;
							GraphicsDefaults.method6732(class128.Client_plane);
						}

						if (gameState != 30) {
							return;
						}

						Tiles.method2031();

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= -10) {
								SoundEffect var32 = soundEffects[var1];
								if (var32 == null) {
									var10000 = null;
									var32 = SoundEffect.readSoundEffect(MouseHandler.archive4, soundEffectIds[var1], 0);
									if (var32 == null) {
										continue;
									}

									int[] var55 = queuedSoundEffectDelays;
									var55[var1] += var32.calculateDelay();
									soundEffects[var1] = var32;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = soundLocations[var1] >> 16 & 255;
										var6 = var5 * 128 + 64 - ModelData0.localPlayer.x;
										if (var6 < 0) {
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255;
										var8 = var7 * 128 + 64 - ModelData0.localPlayer.y;
										if (var8 < 0) {
											var8 = -var8;
										}

										var9 = var6 + var8 - 128;
										if (var9 > var4) {
											queuedSoundEffectDelays[var1] = -100;
											continue;
										}

										if (var9 < 0) {
											var9 = 0;
										}

										var3 = (var4 - var9) * class12.clientPreferences.method2239() / var4;
									} else {
										var3 = class12.clientPreferences.method2244();
									}

									if (var3 > 0) {
										RawSound var23 = var32.toRawSound().resample(class403.field4455);
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
										var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										class122.pcmStreamMixer.addSubStream(var24);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var15 = var1; var15 < soundEffectCount; ++var15) {
									soundEffectIds[var15] = soundEffectIds[var15 + 1];
									soundEffects[var15] = soundEffects[var15 + 1];
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
									soundLocations[var15] = soundLocations[var15 + 1];
								}

								--var1;
							}
						}

						if (field734 && !Coord.method5370()) {
							if (class12.clientPreferences.method2248() != 0 && currentTrackGroupId != -1) {
								UserComparator8.method2574(AbstractUserComparator.archive6, currentTrackGroupId, 0, class12.clientPreferences.method2248(), false);
							}

							field734 = false;
						}

						++packetWriter.field1349;
						if (packetWriter.field1349 > 750) {
							class129.method2812();
							return;
						}

						var1 = Players.Players_count;
						int[] var33 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var45 = players[var33[var3]];
							if (var45 != null) {
								class301.updateActorSequence(var45, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var25 = npcs[var15];
							if (var25 != null) {
								class301.updateActorSequence(var25, var25.definition.size);
							}
						}

						int[] var40 = Players.Players_indices;

						for (var15 = 0; var15 < Players.Players_count; ++var15) {
							Player var51 = players[var40[var15]];
							if (var51 != null && var51.overheadTextCyclesRemaining > 0) {
								--var51.overheadTextCyclesRemaining;
								if (var51.overheadTextCyclesRemaining == 0) {
									var51.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) {
							var3 = npcIndices[var15];
							NPC var46 = npcs[var3];
							if (var46 != null && var46.overheadTextCyclesRemaining > 0) {
								--var46.overheadTextCyclesRemaining;
								if (var46.overheadTextCyclesRemaining == 0) {
									var46.overheadText = null;
								}
							}
						}

						++field727;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (NPCComposition.field1991 != null) {
							++field598;
							if (field598 >= 15) {
								GrandExchangeOfferTotalQuantityComparator.method5781(NPCComposition.field1991);
								NPCComposition.field1991 = null;
							}
						}

						Widget var41 = class144.mousedOverWidgetIf1;
						Widget var34 = class113.field1422;
						class144.mousedOverWidgetIf1 = null;
						class113.field1422 = null;
						draggedOnWidget = null;
						field675 = false;
						field574 = false;
						field719 = 0;

						while (TaskHandler.isKeyDown() && field719 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class12.field61 == 66) {
								StringBuilder var47 = new StringBuilder();

								Message var42;
								for (Iterator var48 = Messages.Messages_hashTable.iterator(); var48.hasNext(); var47.append(var42.text).append('\n')) {
									var42 = (Message)var48.next();
									if (var42.sender != null && !var42.sender.isEmpty()) {
										var47.append(var42.sender).append(':');
									}
								}

								String var53 = var47.toString();
								class82.client.method429(var53);
							} else if (oculusOrbState != 1 || InvDefinition.field1850 <= 0) {
								field721[field719] = class12.field61;
								field720[field719] = InvDefinition.field1850;
								++field719;
							}
						}

						boolean var35 = staffModLevel >= 2;
						if (var35 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = ModelData0.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != ModelData0.localPlayer.plane) {
								class123.method2781(ModelData0.localPlayer.pathX[0] + SecureRandomCallable.baseX * 64, ModelData0.localPlayer.pathY[0] + GrandExchangeOfferOwnWorldComparator.baseY * 64, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class4.updateRootInterface(rootInterface, 0, 0, GraphicsObject.canvasWidth, class433.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var43;
							ScriptEvent var49;
							Widget var50;
							do {
								var49 = (ScriptEvent)field698.removeLast();
								if (var49 == null) {
									while (true) {
										do {
											var49 = (ScriptEvent)field701.removeLast();
											if (var49 == null) {
												while (true) {
													do {
														var49 = (ScriptEvent)scriptEvents.removeLast();
														if (var49 == null) {
															this.menu();
															if (ServerPacket.worldMap != null) {
																ServerPacket.worldMap.method7033(class128.Client_plane, SecureRandomCallable.baseX * 64 + (ModelData0.localPlayer.x >> 7), GrandExchangeOfferOwnWorldComparator.baseY * 64 + (ModelData0.localPlayer.y >> 7), false);
																ServerPacket.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1150();
															}

															if (Canvas.dragInventoryWidget != null) {
																GrandExchangeOfferTotalQuantityComparator.method5781(Canvas.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field604) {
																		if (Canvas.dragInventoryWidget == class155.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var52 = Canvas.dragInventoryWidget;
																			byte var36 = 0;
																			if (field480 == 1 && var52.contentType == 206) {
																				var36 = 1;
																			}

																			if (var52.itemIds[dragItemSlotDestination] <= 0) {
																				var36 = 0;
																			}

																			var7 = UrlRequester.getWidgetFlags(var52);
																			boolean var37 = (var7 >> 29 & 1) != 0;
																			if (var37) {
																				var8 = dragItemSlotSource;
																				var9 = dragItemSlotDestination;
																				var52.itemIds[var9] = var52.itemIds[var8];
																				var52.itemQuantities[var9] = var52.itemQuantities[var8];
																				var52.itemIds[var8] = -1;
																				var52.itemQuantities[var8] = 0;
																			} else if (var36 == 1) {
																				var8 = dragItemSlotSource;
																				var9 = dragItemSlotDestination;

																				while (var8 != var9) {
																					if (var8 > var9) {
																						var52.swapItems(var8 - 1, var8);
																						--var8;
																					} else if (var8 < var9) {
																						var52.swapItems(var8 + 1, var8);
																						++var8;
																					}
																				}
																			} else {
																				var52.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			PacketBufferNode var26 = DecorativeObject.getPacketBufferNode(ClientPacket.field3042, packetWriter.isaacCipher);
																			var26.packetBuffer.writeShort(dragItemSlotSource);
																			var26.packetBuffer.writeShort(dragItemSlotDestination);
																			var26.packetBuffer.writeByte(var36);
																			var26.packetBuffer.writeInt(Canvas.dragInventoryWidget.id);
																			packetWriter.addNode(var26);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var4 = draggedWidgetX;
																		var5 = draggedWidgetY;
																		MenuAction var44 = class116.tempMenuAction;
																		if (var44 != null) {
																			ModeWhere.menuAction(var44.param0, var44.param1, var44.opcode, var44.identifier, var44.action, var44.action, var4, var5);
																		}

																		class116.tempMenuAction = null;
																	}

																	field598 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	Canvas.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field604 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var18 = DecorativeObject.getPacketBufferNode(ClientPacket.field2957, packetWriter.isaacCipher);
																var18.packetBuffer.writeByte(5);
																var18.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var18.packetBuffer.method7641(GrandExchangeOfferOwnWorldComparator.baseY * 64 + var5);
																var18.packetBuffer.writeShort(SecureRandomCallable.baseX * 64 + var4);
																packetWriter.addNode(var18);
																Scene.method4066();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var41 != class144.mousedOverWidgetIf1) {
																if (var41 != null) {
																	GrandExchangeOfferTotalQuantityComparator.method5781(var41);
																}

																if (class144.mousedOverWidgetIf1 != null) {
																	GrandExchangeOfferTotalQuantityComparator.method5781(class144.mousedOverWidgetIf1);
																}
															}

															if (var34 != class113.field1422 && field645 == field702) {
																if (var34 != null) {
																	GrandExchangeOfferTotalQuantityComparator.method5781(var34);
																}

																if (class113.field1422 != null) {
																	GrandExchangeOfferTotalQuantityComparator.method5781(class113.field1422);
																}
															}

															if (class113.field1422 != null) {
																if (field645 < field702) {
																	++field645;
																	if (field645 == field702) {
																		GrandExchangeOfferTotalQuantityComparator.method5781(class113.field1422);
																	}
																}
															} else if (field645 > 0) {
																--field645;
															}

															if (oculusOrbState == 0) {
																var4 = ModelData0.localPlayer.x;
																var5 = ModelData0.localPlayer.y;
																if (HorizontalAlignment.oculusOrbFocalPointX - var4 < -500 || HorizontalAlignment.oculusOrbFocalPointX - var4 > 500 || class28.oculusOrbFocalPointY - var5 < -500 || class28.oculusOrbFocalPointY - var5 > 500) {
																	HorizontalAlignment.oculusOrbFocalPointX = var4;
																	class28.oculusOrbFocalPointY = var5;
																}

																if (var4 != HorizontalAlignment.oculusOrbFocalPointX) {
																	HorizontalAlignment.oculusOrbFocalPointX += (var4 - HorizontalAlignment.oculusOrbFocalPointX) / 16;
																}

																if (var5 != class28.oculusOrbFocalPointY) {
																	class28.oculusOrbFocalPointY += (var5 - class28.oculusOrbFocalPointY) / 16;
																}

																var6 = HorizontalAlignment.oculusOrbFocalPointX >> 7;
																var7 = class28.oculusOrbFocalPointY >> 7;
																var8 = class202.getTileHeight(HorizontalAlignment.oculusOrbFocalPointX, class28.oculusOrbFocalPointY, class128.Client_plane);
																var9 = 0;
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																			var12 = class128.Client_plane;
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																				++var12;
																			}

																			int var27 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																			if (var27 > var9) {
																				var9 = var27;
																			}
																		}
																	}
																}

																var10 = var9 * 192;
																if (var10 > 98048) {
																	var10 = 98048;
																}

																if (var10 < 32768) {
																	var10 = 32768;
																}

																if (var10 > field578) {
																	field578 += (var10 - field578) / 24;
																} else if (var10 < field578) {
																	field578 += (var10 - field578) / 80;
																}

																class140.field1666 = class202.getTileHeight(ModelData0.localPlayer.x, ModelData0.localPlayer.y, class128.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																if (field575 && ModelData0.localPlayer != null) {
																	var4 = ModelData0.localPlayer.pathX[0];
																	var5 = ModelData0.localPlayer.pathY[0];
																	if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
																		HorizontalAlignment.oculusOrbFocalPointX = ModelData0.localPlayer.x;
																		var6 = class202.getTileHeight(ModelData0.localPlayer.x, ModelData0.localPlayer.y, class128.Client_plane) - camFollowHeight;
																		if (var6 < class140.field1666) {
																			class140.field1666 = var6;
																		}

																		class28.oculusOrbFocalPointY = ModelData0.localPlayer.y;
																		field575 = false;
																	}
																}

																short var38 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var38 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var38 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var38 == 0) {
																		var38 = 1792;
																	} else if (var38 == 1024) {
																		var38 = 1280;
																	} else {
																		var38 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var38 == 0) {
																		var38 = 256;
																	} else if (var38 == 1024) {
																		var38 = 768;
																	} else {
																		var38 = 512;
																	}
																}

																byte var39 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var39 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var39 = 1;
																}

																var6 = 0;
																if (var38 >= 0 || var39 != 0) {
																	var6 = KeyHandler.KeyHandler_pressedKeys[81] ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																	var6 *= 16;
																	field567 = var38;
																	field571 = var39;
																}

																if (field569 < var6) {
																	field569 += var6 / 8;
																	if (field569 > var6) {
																		field569 = var6;
																	}
																} else if (field569 > var6) {
																	field569 = field569 * 9 / 10;
																}

																if (field569 > 0) {
																	var7 = field569 / 16;
																	if (field567 >= 0) {
																		var4 = field567 - StudioGame.cameraYaw & 2047;
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																		HorizontalAlignment.oculusOrbFocalPointX += var8 * var7 / 65536;
																		class28.oculusOrbFocalPointY += var9 * var7 / 65536;
																	}

																	if (field571 != 0) {
																		class140.field1666 += var7 * field571;
																		if (class140.field1666 > 0) {
																			class140.field1666 = 0;
																		}
																	}
																} else {
																	field567 = -1;
																	field571 = -1;
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	class4.method22();
																}
															}

															if (MouseHandler.MouseHandler_currentButton == 4 && Login.mouseCam) {
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var4 * 2;
																mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var5 * 2;
																mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) {
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2;
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) {
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2;
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y;
																mouseCamClickedX = MouseHandler.MouseHandler_x;
															}

															camAngleY = camAngleDY / 2 + camAngleY & 2047;
															camAngleX += camAngleDX / 2;
															if (camAngleX < 128) {
																camAngleX = 128;
															}

															if (camAngleX > 383) {
																camAngleX = 383;
															}

															if (field742) {
																class422.method7303(class271.field3221, Message.field469, NPC.field1262);
																class241.method4813(Interpreter.field838, Timer.field4239);
																if (class271.field3221 == class343.cameraX && class295.cameraY == Message.field469 && FaceNormal.cameraZ == NPC.field1262 && Interpreter.field838 == GameEngine.cameraPitch && StudioGame.cameraYaw == Timer.field4239) {
																	field742 = false;
																	isCameraLocked = false;
																	class267.field3206 = 0;
																	AbstractWorldMapData.field2851 = 0;
																	ScriptFrame.field457 = 0;
																	class17.field88 = 0;
																	PacketBufferNode.field3083 = 0;
																	HitSplatDefinition.field2077 = 0;
																	class229.field2805 = 0;
																	Players.field1317 = 0;
																	TileItem.field1292 = 0;
																	WorldMapSection1.field2898 = 0;
																}
															} else if (isCameraLocked) {
																class1.method11();
															}

															for (var4 = 0; var4 < 5; ++var4) {
																var10002 = field677[var4]++;
															}

															class125.varcs.tryWrite();
															var4 = class293.method5429();
															var5 = ObjectSound.method1734();
															if (var4 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var18 = DecorativeObject.getPacketBufferNode(ClientPacket.field3027, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															BufferedSource.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var18 = DecorativeObject.getPacketBufferNode(ClientPacket.field2982, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															try {
																packetWriter.flush();
															} catch (IOException var28) {
																class129.method2812();
															}

															return;
														}

														var50 = var49.widget;
														if (var50.childIndex < 0) {
															break;
														}

														var43 = class92.getWidget(var50.parentId);
													} while(var43 == null || var43.children == null || var50.childIndex >= var43.children.length || var50 != var43.children[var50.childIndex]);

													class144.runScriptEvent(var49);
												}
											}

											var50 = var49.widget;
											if (var50.childIndex < 0) {
												break;
											}

											var43 = class92.getWidget(var50.parentId);
										} while(var43 == null || var43.children == null || var50.childIndex >= var43.children.length || var50 != var43.children[var50.childIndex]);

										class144.runScriptEvent(var49);
									}
								}

								var50 = var49.widget;
								if (var50.childIndex < 0) {
									break;
								}

								var43 = class92.getWidget(var50.parentId);
							} while(var43 == null || var43.children == null || var50.childIndex >= var43.children.length || var50 != var43.children[var50.childIndex]);

							class144.runScriptEvent(var49);
						}
					}

					var31 = DecorativeObject.getPacketBufferNode(ClientPacket.field3047, packetWriter.isaacCipher);
					var31.packetBuffer.writeByte(0);
					var3 = var31.packetBuffer.offset;
					UserComparator3.performReflectionCheck(var31.packetBuffer);
					var31.packetBuffer.method7740(var31.packetBuffer.offset - var3);
					packetWriter.addNode(var31);
				}
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1836577440"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GraphicsObject.canvasWidth;
		int var2 = class433.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class12.clientPreferences != null) {
			try {
				Client var3 = class82.client;
				Object[] var4 = new Object[]{ClanChannelMember.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "296030878"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (WorldMapDecoration.loadInterface(var1)) {
				class342.drawModelComponents(NetSocket.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field652[var1]) {
				field704[var1] = true;
			}

			field524[var1] = field652[var1];
			field652[var1] = false;
		}

		field694 = cycle;
		viewportX = -1;
		viewportY = -1;
		class155.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class175.drawWidgets(rootInterface, 0, 0, GraphicsObject.canvasWidth, class433.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				Projectile.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				Projectile.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = menuOptionsCount - 1;
					String var13;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var13 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var13 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var14;
						if (var3 < 0) {
							var14 = "";
						} else if (menuTargets[var3].length() > 0) {
							var14 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var14 = menuActions[var3];
						}

						var13 = var14;
					}

					if (menuOptionsCount > 2) {
						var13 = var13 + class166.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					ChatChannel.fontBold12.drawRandomAlphaAndSpacing(var13, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			var1 = BuddyRankComparator.menuX;
			var2 = FontName.menuY;
			var3 = KeyHandler.menuWidth;
			var4 = class7.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			ChatChannel.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			var6 = MouseHandler.MouseHandler_x;
			var7 = MouseHandler.MouseHandler_y;

			for (var8 = 0; var8 < menuOptionsCount; ++var8) {
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31;
				int var10 = 16777215;
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				Font var11 = ChatChannel.fontBold12;
				String var12;
				if (var8 < 0) {
					var12 = "";
				} else if (menuTargets[var8].length() > 0) {
					var12 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var12 = menuActions[var8];
				}

				var11.draw(var12, var1 + 3, var9, var10, 0);
			}

			ItemContainer.method2061(BuddyRankComparator.menuX, FontName.menuY, KeyHandler.menuWidth, class7.menuHeight);
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field524[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field704[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class128.Client_plane;
		var2 = ModelData0.localPlayer.x;
		var3 = ModelData0.localPlayer.y;
		var4 = field727;

		for (ObjectSound var19 = (ObjectSound)ObjectSound.objectSounds.last(); var19 != null; var19 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var19.soundEffectId != -1 || var19.soundEffectIds != null) {
				var6 = 0;
				if (var2 > var19.maxX * 128) {
					var6 += var2 - var19.maxX * 128;
				} else if (var2 < var19.x * 16384) {
					var6 += var19.x * 16384 - var2;
				}

				if (var3 > var19.maxY * 16384) {
					var6 += var3 - var19.maxY * 16384;
				} else if (var3 < var19.y * 16384) {
					var6 += var19.y * 16384 - var3;
				}

				if (var6 - 64 <= var19.field817 && class12.clientPreferences.method2239() != 0 && var1 == var19.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = (var19.field817 - var6) * class12.clientPreferences.method2239() / var19.field817;
					Object var10000;
					if (var19.stream1 == null) {
						if (var19.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(MouseHandler.archive4, var19.soundEffectId, 0);
							if (var15 != null) {
								RawSound var16 = var15.toRawSound().resample(class403.field4455);
								RawPcmStream var17 = RawPcmStream.createRawPcmStream(var16, 100, var7);
								var17.setNumLoops(-1);
								class122.pcmStreamMixer.addSubStream(var17);
								var19.stream1 = var17;
							}
						}
					} else {
						var19.stream1.method802(var7);
					}

					if (var19.stream2 == null) {
						if (var19.soundEffectIds != null && (var19.field810 -= var4) <= 0) {
							var8 = (int)(Math.random() * (double)var19.soundEffectIds.length);
							var10000 = null;
							SoundEffect var20 = SoundEffect.readSoundEffect(MouseHandler.archive4, var19.soundEffectIds[var8], 0);
							if (var20 != null) {
								RawSound var21 = var20.toRawSound().resample(class403.field4455);
								RawPcmStream var18 = RawPcmStream.createRawPcmStream(var21, 100, var7);
								var18.setNumLoops(0);
								class122.pcmStreamMixer.addSubStream(var18);
								var19.stream2 = var18;
								var19.field810 = var19.field813 + (int)(Math.random() * (double)(var19.field808 - var19.field813));
							}
						}
					} else {
						var19.stream2.method802(var7);
						if (!var19.stream2.hasNext()) {
							var19.stream2 = null;
						}
					}
				} else {
					if (var19.stream1 != null) {
						class122.pcmStreamMixer.removeSubStream(var19.stream1);
						var19.stream1 = null;
					}

					if (var19.stream2 != null) {
						class122.pcmStreamMixer.removeSubStream(var19.stream2);
						var19.stream2 = null;
					}
				}
			}
		}

		field727 = 0;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lcz;I)Z",
		garbageValue = "1953749853"
	)
	final boolean method1254(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1348) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1349 = 0;
						var1.field1348 = false;
					}

					var3.offset = 0;
					if (var3.method7495()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1349 = 0;
					}

					var1.field1348 = true;
					ServerPacket[] var4 = BuddyRankComparator.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1349 = 0;
				timer.method6374();
				var1.field1345 = var1.field1340;
				var1.field1340 = var1.field1351;
				var1.field1351 = var1.serverPacket;
				if (ServerPacket.field3141 == var1.serverPacket) {
					UserComparator8.field1378 = new class392(class221.Ignored_cached);
					var1.serverPacket = null;
					return true;
				}

				int var67;
				if (ServerPacket.field3131 == var1.serverPacket) {
					var67 = var3.readInt();
					if (var67 != field482) {
						field482 = var67;
						class134.method2850();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3099 == var1.serverPacket) {
					class119.method2737();
					runEnergy = var3.readUnsignedByte();
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3113 == var1.serverPacket) {
					var67 = var3.readUnsignedByte();
					var21 = var3.readStringCp1252NullTerminated();
					var6 = var3.method7593();
					if (var6 >= 1 && var6 <= 8) {
						if (var21.equalsIgnoreCase("null")) {
							var21 = null;
						}

						playerMenuActions[var6 - 1] = var21;
						playerOptionsPriorities[var6 - 1] = var67 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var22;
				if (ServerPacket.field3148 == var1.serverPacket) {
					var67 = var3.method7568();
					var5 = var3.method7576();
					var22 = class92.getWidget(var67);
					if (var22.modelType != 1 || var5 != var22.modelId) {
						var22.modelType = 1;
						var22.modelId = var5;
						GrandExchangeOfferTotalQuantityComparator.method5781(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3092 == var1.serverPacket) {
					BufferedSource.friendSystem.method1667();
					field689 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				GameObject var14;
				int var15;
				int var16;
				byte var20;
				String var25;
				if (ServerPacket.field3103 == var1.serverPacket) {
					var20 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var23 = (long)var3.readUnsignedShort();
					long var8 = (long)var3.readMedium();
					PlayerType var59 = (PlayerType)class291.findEnumerated(class118.PlayerType_values(), var3.readUnsignedByte());
					long var11 = var8 + (var23 << 32);
					boolean var64 = false;
					var14 = null;
					ClanChannel var66 = var20 >= 0 ? currentClanChannels[var20] : UserComparator10.guestClanChannel;
					if (var66 == null) {
						var64 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var59.isUser && BufferedSource.friendSystem.isIgnored(new Username(var21, class391.loginType))) {
									var64 = true;
								}
								break;
							}

							if (field717[var15] == var11) {
								var64 = true;
								break;
							}

							++var15;
						}
					}

					if (!var64) {
						field717[field718] = var11;
						field718 = (field718 + 1) % 100;
						var25 = AbstractFont.escapeBrackets(LoginPacket.method5025(var3));
						var16 = var20 >= 0 ? 41 : 44;
						if (var59.modIcon != -1) {
							UserComparator7.addChatMessage(var16, StudioGame.method5590(var59.modIcon) + var21, var25, var66.name);
						} else {
							UserComparator7.addChatMessage(var16, var21, var25, var66.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3155 == var1.serverPacket) {
					var67 = var3.readUnsignedByte();
					class193.method3800(var67);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3122 == var1.serverPacket) {
					UserComparator8.field1378 = null;
					var1.serverPacket = null;
					return true;
				}

				Widget var55;
				if (ServerPacket.field3174 == var1.serverPacket) {
					var67 = var3.method7576();
					if (var67 == 65535) {
						var67 = -1;
					}

					var5 = var3.method7701();
					var6 = var3.method7701();
					var55 = class92.getWidget(var6);
					ItemComposition var81;
					if (!var55.isIf3) {
						if (var67 == -1) {
							var55.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var81 = FileSystem.ItemDefinition_get(var67);
						var55.modelType = 4;
						var55.modelId = var67;
						var55.modelAngleX = var81.xan2d;
						var55.modelAngleY = var81.yan2d;
						var55.modelZoom = var81.zoom2d * 100 / var5;
						GrandExchangeOfferTotalQuantityComparator.method5781(var55);
					} else {
						var55.itemId = var67;
						var55.itemQuantity = var5;
						var81 = FileSystem.ItemDefinition_get(var67);
						var55.modelAngleX = var81.xan2d;
						var55.modelAngleY = var81.yan2d;
						var55.modelAngleZ = var81.zan2d;
						var55.modelOffsetX = var81.offsetX2d;
						var55.modelOffsetY = var81.offsetY2d;
						var55.modelZoom = var81.zoom2d;
						if (var81.isStackable == 1) {
							var55.itemQuantityMode = 1;
						} else {
							var55.itemQuantityMode = 2;
						}

						if (var55.field3406 > 0) {
							var55.modelZoom = var55.modelZoom * 32 / var55.field3406;
						} else if (var55.rawWidth > 0) {
							var55.modelZoom = var55.modelZoom * 32 / var55.rawWidth;
						}

						GrandExchangeOfferTotalQuantityComparator.method5781(var55);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3091 == var1.serverPacket) {
					class145.field1690 = var3.method7546();
					class321.field4076 = var3.readUnsignedByte();

					while (var3.offset < var1.serverPacketLength) {
						var67 = var3.readUnsignedByte();
						class263 var78 = class194.method3807()[var67];
						Occluder.method4222(var78);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3095 == var1.serverPacket) {
					PendingSpawn.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				int var9;
				int var27;
				int var28;
				int var29;
				int var86;
				if (ServerPacket.field3158 == var1.serverPacket) {
					var6 = var3.readMedium();
					var67 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var27 = var67 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var9 = var3.readUnsignedShort();
					var29 = var3.method7593();
					var86 = var3.method7716();
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
						var27 = var27 * 128 + 64;
						var28 = var28 * 128 + 64;
						GraphicsObject var60 = new GraphicsObject(var9, class128.Client_plane, var27, var28, class202.getTileHeight(var27, var28, class128.Client_plane) - var29, var86, cycle);
						graphicsObjects.addFirst(var60);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3182 == var1.serverPacket) {
					var67 = var3.readInt();
					InterfaceParent var77 = (InterfaceParent)interfaceParents.get((long)var67);
					if (var77 != null) {
						NetSocket.closeInterface(var77, true);
					}

					if (meslayerContinueWidget != null) {
						GrandExchangeOfferTotalQuantityComparator.method5781(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3098 == var1.serverPacket) {
					var20 = var3.readByte();
					var5 = var3.method7576();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					class321.changeGameOptions(var5);
					field680[++field552 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3165 == var1.serverPacket) {
					var67 = var3.method7554();
					if (var67 == 65535) {
						var67 = -1;
					}

					WorldMapIcon_0.playSong(var67);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3096 == var1.serverPacket) {
					var67 = var3.readUnsignedShort();
					if (var67 == 65535) {
						var67 = -1;
					}

					var5 = var3.method7503();
					class306.method5593(var67, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3112 == var1.serverPacket) {
					class119.method2737();
					var67 = var3.method7701();
					var5 = var3.method7545();
					var6 = var3.method7545();
					experience[var5] = var67;
					currentLevels[var5] = var6;
					levels[var5] = 1;

					for (var27 = 0; var27 < 98; ++var27) {
						if (var67 >= Skills.Skills_experienceTable[var27]) {
							levels[var5] = var27 + 2;
						}
					}

					field684[++field676 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				boolean var84;
				if (ServerPacket.field3140 == var1.serverPacket) {
					var84 = var3.readBoolean();
					if (var84) {
						if (class127.field1570 == null) {
							class127.field1570 = new class326();
						}
					} else {
						class127.field1570 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				String var48;
				if (ServerPacket.field3163 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(WorldMapManager.method4679(LoginPacket.method5025(var3)));
					WorldMapEvent.addGameMessage(6, var48, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3166 == var1.serverPacket) {
					class144.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3162 == var1.serverPacket) {
					Occluder.method4222(class263.field3058);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3147 == var1.serverPacket) {
					isCameraLocked = false;

					for (var67 = 0; var67 < 5; ++var67) {
						field743[var67] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3186 == var1.serverPacket) {
					var67 = var3.readInt();
					var5 = var3.readInt();
					var6 = class17.getGcDuration();
					PacketBufferNode var58 = DecorativeObject.getPacketBufferNode(ClientPacket.field3053, packetWriter.isaacCipher);
					var58.packetBuffer.method7565(var67);
					var58.packetBuffer.method7565(var5);
					var58.packetBuffer.method7596(GameEngine.fps);
					var58.packetBuffer.method7596(var6);
					packetWriter.addNode(var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3169 == var1.serverPacket) {
					Occluder.method4222(class263.field3059);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3177 == var1.serverPacket) {
					Occluder.method4222(class263.field3067);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3134 == var1.serverPacket) {
					var84 = var3.method7593() == 1;
					var5 = var3.method7567();
					var22 = class92.getWidget(var5);
					if (var84 != var22.isHidden) {
						var22.isHidden = var84;
						GrandExchangeOfferTotalQuantityComparator.method5781(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3132 == var1.serverPacket && isCameraLocked) {
					field742 = true;
					class229.field2805 = var3.readUnsignedByte();
					HitSplatDefinition.field2077 = var3.readUnsignedByte();
					class17.field88 = var3.readUnsignedByte();
					PacketBufferNode.field3083 = var3.readUnsignedByte();

					for (var67 = 0; var67 < 5; ++var67) {
						field743[var67] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				String var76;
				if (ServerPacket.field3184 == var1.serverPacket) {
					byte[] var52 = new byte[var1.serverPacketLength];
					var3.method7460(var52, 0, var52.length);
					Buffer var75 = new Buffer(var52);
					var76 = var75.readStringCp1252NullTerminated();
					ScriptEvent.openURL(var76, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3084 == var1.serverPacket) {
					if (PcmPlayer.friendsChatManager != null) {
						PcmPlayer.friendsChatManager.method6463(var3);
					}

					class194.method3804();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3187 == var1.serverPacket) {
					class393.field4428 = true;
					HorizontalAlignment.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3152 == var1.serverPacket) {
					for (var67 = 0; var67 < players.length; ++var67) {
						if (players[var67] != null) {
							players[var67].sequence = -1;
						}
					}

					for (var67 = 0; var67 < npcs.length; ++var67) {
						if (npcs[var67] != null) {
							npcs[var67].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3157 == var1.serverPacket) {
					var67 = var3.method7554();
					var5 = var3.readInt();
					var6 = var3.method7716();
					var55 = class92.getWidget(var5);
					var55.field3451 = var6 + (var67 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3097 == var1.serverPacket) {
					var67 = var3.method7568();
					var5 = var3.method7716();
					var22 = class92.getWidget(var67);
					if (var22 != null && var22.type == 0) {
						if (var5 > var22.scrollHeight - var22.height) {
							var5 = var22.scrollHeight - var22.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var22.scrollY) {
							var22.scrollY = var5;
							GrandExchangeOfferTotalQuantityComparator.method5781(var22);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3116 == var1.serverPacket) {
					if (UserComparator8.field1378 == null) {
						UserComparator8.field1378 = new class392(class221.Ignored_cached);
					}

					class447 var51 = class221.Ignored_cached.method6920(var3);
					UserComparator8.field1378.field4427.vmethod7295(var51.field4741, var51.field4742);
					field686[++field687 - 1 & 31] = var51.field4741;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3089 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					Object[] var74 = new Object[var48.length() + 1];

					for (var6 = var48.length() - 1; var6 >= 0; --var6) {
						if (var48.charAt(var6) == 's') {
							var74[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var74[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var74[0] = new Integer(var3.readInt());
					ScriptEvent var83 = new ScriptEvent();
					var83.args = var74;
					class144.runScriptEvent(var83);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3090 == var1.serverPacket) {
					class119.method2737();
					weight = var3.readShort();
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3175 == var1.serverPacket) {
					Occluder.method4222(class263.field3066);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3150 == var1.serverPacket) {
					Occluder.method4222(class263.field3071);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3115 == var1.serverPacket) {
					field692 = cycleCntr;
					var20 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var20 >= 0) {
							currentClanChannels[var20] = null;
						} else {
							UserComparator10.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var20 >= 0) {
						currentClanChannels[var20] = new ClanChannel(var3);
					} else {
						UserComparator10.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3126 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						ViewportMouse.method4374(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3183 == var1.serverPacket) {
					HorizontalAlignment.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3142 == var1.serverPacket) {
					var67 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var22 = class92.getWidget(var67);
					if (var22.modelType != 2 || var5 != var22.modelId) {
						var22.modelType = 2;
						var22.modelId = var5;
						GrandExchangeOfferTotalQuantityComparator.method5781(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				int var13;
				long var31;
				long var33;
				String var39;
				if (ServerPacket.field3086 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var31 = (long)var3.readUnsignedShort();
					var33 = (long)var3.readMedium();
					PlayerType var35 = (PlayerType)class291.findEnumerated(class118.PlayerType_values(), var3.readUnsignedByte());
					long var36 = var33 + (var31 << 32);
					boolean var87 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var36 == field717[var13]) {
							var87 = true;
							break;
						}
					}

					if (BufferedSource.friendSystem.isIgnored(new Username(var48, class391.loginType))) {
						var87 = true;
					}

					if (!var87 && field606 == 0) {
						field717[field718] = var36;
						field718 = (field718 + 1) % 100;
						var39 = AbstractFont.escapeBrackets(WorldMapManager.method4679(LoginPacket.method5025(var3)));
						byte var89;
						if (var35.isPrivileged) {
							var89 = 7;
						} else {
							var89 = 3;
						}

						if (var35.modIcon != -1) {
							WorldMapEvent.addGameMessage(var89, StudioGame.method5590(var35.modIcon) + var48, var39);
						} else {
							WorldMapEvent.addGameMessage(var89, var48, var39);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3087 == var1.serverPacket) {
					var67 = var3.readShort();
					var5 = var3.readInt();
					var22 = class92.getWidget(var5);
					if (var67 != var22.sequenceId || var67 == -1) {
						var22.sequenceId = var67;
						var22.modelFrame = 0;
						var22.modelFrameCycle = 0;
						GrandExchangeOfferTotalQuantityComparator.method5781(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3119 == var1.serverPacket) {
					isCameraLocked = true;
					field742 = false;
					class267.field3206 = var3.readUnsignedByte() * 16384;
					AbstractWorldMapData.field2851 = var3.readUnsignedByte() * 128;
					ScriptFrame.field457 = var3.readUnsignedShort();
					class17.field88 = var3.readUnsignedByte();
					PacketBufferNode.field3083 = var3.readUnsignedByte();
					if (PacketBufferNode.field3083 >= 100) {
						var67 = class267.field3206 * 128 + 64;
						var5 = AbstractWorldMapData.field2851 * 16384 + 64;
						var6 = class202.getTileHeight(var67, var5, class128.Client_plane) - ScriptFrame.field457;
						var27 = var67 - class343.cameraX;
						var28 = var6 - class295.cameraY;
						var9 = var5 - FaceNormal.cameraZ;
						var29 = (int)Math.sqrt((double)(var9 * var9 + var27 * var27));
						GameEngine.cameraPitch = (int)(Math.atan2((double)var28, (double)var29) * 325.9490051269531D) & 2047;
						StudioGame.cameraYaw = (int)(Math.atan2((double)var27, (double)var9) * -325.9490051269531D) & 2047;
						if (GameEngine.cameraPitch < 128) {
							GameEngine.cameraPitch = 128;
						}

						if (GameEngine.cameraPitch > 383) {
							GameEngine.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3139 == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					PendingSpawn.updateGameState(45);
					var2.close();
					var2 = null;
					InvDefinition.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3161 == var1.serverPacket) {
					var67 = var3.method7716();
					ScriptFrame.method1066(var67);
					field682[++field683 - 1 & 31] = var67 & 32767;
					var1.serverPacket = null;
					return true;
				}

				NPC var54;
				if (ServerPacket.field3123 == var1.serverPacket) {
					var6 = var3.method7716();
					var67 = var3.readUnsignedShort();
					var54 = npcs[var67];
					var5 = var3.method7567();
					if (var54 != null) {
						var54.spotAnimation = var6;
						var54.field1151 = var5 >> 16;
						var54.field1185 = (var5 & 65535) + cycle;
						var54.spotAnimationFrame = 0;
						var54.spotAnimationFrameCycle = 0;
						if (var54.field1185 > cycle) {
							var54.spotAnimationFrame = -1;
						}

						if (var54.spotAnimation == 65535) {
							var54.spotAnimation = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var26;
				if (ServerPacket.field3153 == var1.serverPacket) {
					var67 = var3.method7716();
					var5 = var3.method7716();
					var6 = var3.method7568();
					var27 = var3.method7554();
					var26 = class92.getWidget(var6);
					if (var27 != var26.modelAngleX || var67 != var26.modelAngleY || var5 != var26.modelZoom) {
						var26.modelAngleX = var27;
						var26.modelAngleY = var67;
						var26.modelZoom = var5;
						GrandExchangeOfferTotalQuantityComparator.method5781(var26);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3106 == var1.serverPacket) {
					BufferedSource.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field689 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3172 == var1.serverPacket) {
					var67 = var3.method7576();
					Player var56;
					if (var67 == localPlayerIndex) {
						var56 = ModelData0.localPlayer;
					} else {
						var56 = players[var67];
					}

					var6 = var3.readInt();
					var5 = var3.method7716();
					if (var56 != null) {
						var56.spotAnimation = var5;
						var56.field1151 = var6 >> 16;
						var56.field1185 = (var6 & 65535) + cycle;
						var56.spotAnimationFrame = 0;
						var56.spotAnimationFrameCycle = 0;
						if (var56.field1185 > cycle) {
							var56.spotAnimationFrame = -1;
						}

						if (var56.spotAnimation == 65535) {
							var56.spotAnimation = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3118 == var1.serverPacket) {
					var67 = var3.method7576();
					var5 = var3.method7701();
					Varps.Varps_temp[var67] = var5;
					if (Varps.Varps_main[var67] != var5) {
						Varps.Varps_main[var67] = var5;
					}

					class321.changeGameOptions(var67);
					field680[++field552 - 1 & 31] = var67;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3146 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3154 == var1.serverPacket) {
					Occluder.method4222(class263.field3062);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3121 == var1.serverPacket) {
					var67 = var3.readShort();
					var5 = var3.method7567();
					var6 = var3.method7522();
					var55 = class92.getWidget(var5);
					if (var67 != var55.rawX || var6 != var55.rawY || var55.xAlignment != 0 || var55.yAlignment != 0) {
						var55.rawX = var67;
						var55.rawY = var6;
						var55.xAlignment = 0;
						var55.yAlignment = 0;
						GrandExchangeOfferTotalQuantityComparator.method5781(var55);
						this.alignWidget(var55);
						if (var55.type == 0) {
							UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var5 >> 16], var55, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3180 == var1.serverPacket) {
					HorizontalAlignment.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				int var38;
				int var40;
				if (ServerPacket.field3085 == var1.serverPacket) {
					byte var61 = var3.readByte();
					var38 = var3.method7716();
					var6 = var3.method7561();
					var67 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var27 = var67 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var86 = var3.method7558();
					int var18 = var3.readUnsignedByte();
					byte var85 = var3.method7547();
					var40 = var3.method7546() * 4;
					var16 = var3.method7716();
					int var17 = var3.method7545();
					var15 = var3.method7716();
					var13 = var3.readUnsignedByte() * 4;
					var9 = var61 + var27;
					var29 = var85 + var28;
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var9 >= 0 && var29 >= 0 && var9 < 104 && var29 < 104 && var38 != 65535) {
						var27 = var27 * 128 + 64;
						var28 = var28 * 128 + 64;
						var9 = var9 * 128 + 64;
						var29 = var29 * 128 + 64;
						Projectile var19 = new Projectile(var38, class128.Client_plane, var27, var28, class202.getTileHeight(var27, var28, class128.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var86, var40);
						var19.setDestination(var9, var29, class202.getTileHeight(var9, var29, class128.Client_plane) - var40, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3111 == var1.serverPacket) {
					var67 = var3.readUnsignedByte();
					Varcs.forceDisconnect(var67);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3179 == var1.serverPacket) {
					var84 = var3.readUnsignedByte() == 1;
					if (var84) {
						UserComparator8.field1380 = class113.method2624() - var3.readLong();
						class120.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class120.grandExchangeEvents = null;
					}

					field512 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var41;
				if (ServerPacket.field3171 == var1.serverPacket) {
					var67 = var3.method7701();
					var5 = var3.method7716();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.method7701();
					var27 = var3.method7576();
					if (var27 == 65535) {
						var27 = -1;
					}

					for (var28 = var27; var28 <= var5; ++var28) {
						var41 = ((long)var67 << 32) + (long)var28;
						Node var90 = widgetFlags.get(var41);
						if (var90 != null) {
							var90.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var41);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3130 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var6 = var3.method7546();
					var67 = var3.method7554();
					if (var5 == 65535) {
						var5 = -1;
					}

					var54 = npcs[var67];
					if (var54 != null) {
						if (var5 == var54.sequence && var5 != -1) {
							var28 = class114.SequenceDefinition_get(var5).field2208;
							if (var28 == 1) {
								var54.sequenceFrame = 0;
								var54.sequenceFrameCycle = 0;
								var54.sequenceDelay = var6;
								var54.field1186 = 0;
							} else if (var28 == 2) {
								var54.field1186 = 0;
							}
						} else if (var5 == -1 || var54.sequence == -1 || class114.SequenceDefinition_get(var5).field2220 >= class114.SequenceDefinition_get(var54.sequence).field2220) {
							var54.sequence = var5;
							var54.sequenceFrame = 0;
							var54.sequenceFrameCycle = 0;
							var54.sequenceDelay = var6;
							var54.field1186 = 0;
							var54.field1200 = var54.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3144 == var1.serverPacket) {
					class145.field1690 = var3.method7593();
					class321.field4076 = var3.readUnsignedByte();

					for (var67 = class145.field1690; var67 < class145.field1690 + 8; ++var67) {
						for (var5 = class321.field4076; var5 < class321.field4076 + 8; ++var5) {
							if (groundItems[class128.Client_plane][var67][var5] != null) {
								groundItems[class128.Client_plane][var67][var5] = null;
								Frames.updateItemPile(var67, var5);
							}
						}
					}

					for (PendingSpawn var49 = (PendingSpawn)pendingSpawns.last(); var49 != null; var49 = (PendingSpawn)pendingSpawns.previous()) {
						if (var49.x >= class145.field1690 && var49.x < class145.field1690 + 8 && var49.y >= class321.field4076 && var49.y < class321.field4076 + 8 && var49.plane == class128.Client_plane) {
							var49.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3127 == var1.serverPacket) {
					rebootTimer = var3.method7554() * 30;
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var7;
				long var44;
				if (ServerPacket.field3125 == var1.serverPacket) {
					var67 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						GraphicsDefaults.Widget_resetModelFrames(rootInterface);
						AbstractWorldMapData.runWidgetOnLoadListener(rootInterface);

						for (var27 = 0; var27 < 100; ++var27) {
							field652[var27] = true;
						}
					}

					InterfaceParent var57;
					for (; var6-- > 0; var57.field1034 = true) {
						var27 = var3.readInt();
						var28 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var57 = (InterfaceParent)interfaceParents.get((long)var27);
						if (var57 != null && var28 != var57.group) {
							NetSocket.closeInterface(var57, true);
							var57 = null;
						}

						if (var57 == null) {
							var57 = class241.method4812(var27, var28, var9);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) {
						if (var7.field1034) {
							var7.field1034 = false;
						} else {
							NetSocket.closeInterface(var7, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var67) {
						var27 = var3.readInt();
						var28 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var29 = var3.readInt();

						for (var86 = var28; var86 <= var9; ++var86) {
							var44 = ((long)var27 << 32) + (long)var86;
							widgetFlags.put(new IntegerNode(var29), var44);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3167 == var1.serverPacket) {
					Occluder.method4222(class263.field3068);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3159 == var1.serverPacket) {
					for (var67 = 0; var67 < VarpDefinition.VarpDefinition_fileCount; ++var67) {
						VarpDefinition var73 = class21.VarpDefinition_get(var67);
						if (var73 != null) {
							Varps.Varps_temp[var67] = 0;
							Varps.Varps_main[var67] = 0;
						}
					}

					class119.method2737();
					field552 += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3135 == var1.serverPacket) {
					Occluder.method4222(class263.field3064);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3102 == var1.serverPacket) {
					if (rootInterface != -1) {
						WorldMapLabelSize.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3136 == var1.serverPacket) {
					class144.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3088 == var1.serverPacket) {
					var67 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var67] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var67] = new GrandExchangeOffer(var3, false);
					}

					field762 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3110 == var1.serverPacket) {
					for (var67 = 0; var67 < Varps.Varps_main.length; ++var67) {
						if (Varps.Varps_main[var67] != Varps.Varps_temp[var67]) {
							Varps.Varps_main[var67] = Varps.Varps_temp[var67];
							class321.changeGameOptions(var67);
							field680[++field552 - 1 & 31] = var67;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3178 == var1.serverPacket) {
					Occluder.method4222(class263.field3060);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3117 == var1.serverPacket) {
					var67 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					WorldMapLabelSize.method4412(var67, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3114 == var1.serverPacket) {
					var67 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var67 < -70000) {
						var5 += 32768;
					}

					if (var67 >= 0) {
						var22 = class92.getWidget(var67);
					} else {
						var22 = null;
					}

					if (var22 != null) {
						for (var27 = 0; var27 < var22.itemIds.length; ++var27) {
							var22.itemIds[var27] = 0;
							var22.itemQuantities[var27] = 0;
						}
					}

					class29.clearItemContainer(var5);
					var27 = var3.readUnsignedShort();

					for (var28 = 0; var28 < var27; ++var28) {
						var9 = var3.readUnsignedByte();
						if (var9 == 255) {
							var9 = var3.method7568();
						}

						var29 = var3.method7716();
						if (var22 != null && var28 < var22.itemIds.length) {
							var22.itemIds[var28] = var29;
							var22.itemQuantities[var28] = var9;
						}

						InvDefinition.itemContainerSetItem(var5, var28, var29 - 1, var9);
					}

					if (var22 != null) {
						GrandExchangeOfferTotalQuantityComparator.method5781(var22);
					}

					class119.method2737();
					field682[++field683 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3173 == var1.serverPacket) {
					class175.method3373();
					var20 = var3.readByte();
					class131 var71 = new class131(var3);
					ClanSettings var79;
					if (var20 >= 0) {
						var79 = currentClanSettings[var20];
					} else {
						var79 = class358.guestClanSettings;
					}

					var71.method2822(var79);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3094 == var1.serverPacket) {
					class21.privateChatMode = class116.method2686(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3145 == var1.serverPacket) {
					var67 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var67 < -70000) {
						var5 += 32768;
					}

					if (var67 >= 0) {
						var22 = class92.getWidget(var67);
					} else {
						var22 = null;
					}

					for (; var3.offset < var1.serverPacketLength; InvDefinition.itemContainerSetItem(var5, var27, var28 - 1, var9)) {
						var27 = var3.readUShortSmart();
						var28 = var3.readUnsignedShort();
						var9 = 0;
						if (var28 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var22 != null && var27 >= 0 && var27 < var22.itemIds.length) {
							var22.itemIds[var27] = var28;
							var22.itemQuantities[var27] = var9;
						}
					}

					if (var22 != null) {
						GrandExchangeOfferTotalQuantityComparator.method5781(var22);
					}

					class119.method2737();
					field682[++field683 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3120 == var1.serverPacket) {
					var67 = var3.readUShortSmart();
					boolean var53 = var3.readUnsignedByte() == 1;
					var76 = "";
					boolean var82 = false;
					if (var53) {
						var76 = var3.readStringCp1252NullTerminated();
						if (BufferedSource.friendSystem.isIgnored(new Username(var76, class391.loginType))) {
							var82 = true;
						}
					}

					String var80 = var3.readStringCp1252NullTerminated();
					if (!var82) {
						WorldMapEvent.addGameMessage(var67, var76, var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3133 == var1.serverPacket) {
					var67 = var3.method7716();
					rootInterface = var67;
					this.resizeRoot(false);
					GraphicsDefaults.Widget_resetModelFrames(var67);
					AbstractWorldMapData.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field652[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3124 == var1.serverPacket) {
					var13 = var3.method7554();
					var9 = var3.method7545();
					var29 = var9 >> 2;
					var86 = var9 & 3;
					var38 = field553[var29];
					var6 = var3.method7544();
					var67 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var27 = var67 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					if (var27 >= 0 && var28 >= 0 && var27 < 103 && var28 < 103) {
						if (var38 == 0) {
							WallObject var65 = class175.scene.method4147(class128.Client_plane, var27, var28);
							if (var65 != null) {
								var15 = NetSocket.Entity_unpackID(var65.tag);
								if (var29 == 2) {
									var65.renderable1 = new DynamicObject(var15, 2, var86 + 4, class128.Client_plane, var27, var28, var13, false, var65.renderable1);
									var65.renderable2 = new DynamicObject(var15, 2, var86 + 1 & 3, class128.Client_plane, var27, var28, var13, false, var65.renderable2);
								} else {
									var65.renderable1 = new DynamicObject(var15, var29, var86, class128.Client_plane, var27, var28, var13, false, var65.renderable1);
								}
							}
						} else if (var38 == 1) {
							DecorativeObject var63 = class175.scene.method4049(class128.Client_plane, var27, var28);
							if (var63 != null) {
								var15 = NetSocket.Entity_unpackID(var63.tag);
								if (var29 != 4 && var29 != 5) {
									if (var29 == 6) {
										var63.renderable1 = new DynamicObject(var15, 4, var86 + 4, class128.Client_plane, var27, var28, var13, false, var63.renderable1);
									} else if (var29 == 7) {
										var63.renderable1 = new DynamicObject(var15, 4, (var86 + 2 & 3) + 4, class128.Client_plane, var27, var28, var13, false, var63.renderable1);
									} else if (var29 == 8) {
										var63.renderable1 = new DynamicObject(var15, 4, var86 + 4, class128.Client_plane, var27, var28, var13, false, var63.renderable1);
										var63.renderable2 = new DynamicObject(var15, 4, (var86 + 2 & 3) + 4, class128.Client_plane, var27, var28, var13, false, var63.renderable2);
									}
								} else {
									var63.renderable1 = new DynamicObject(var15, 4, var86, class128.Client_plane, var27, var28, var13, false, var63.renderable1);
								}
							}
						} else if (var38 == 2) {
							var14 = class175.scene.getGameObject(class128.Client_plane, var27, var28);
							if (var29 == 11) {
								var29 = 10;
							}

							if (var14 != null) {
								var14.renderable = new DynamicObject(NetSocket.Entity_unpackID(var14.tag), var29, var86, class128.Client_plane, var27, var28, var13, false, var14.renderable);
							}
						} else if (var38 == 3) {
							GroundObject var62 = class175.scene.getGroundObject(class128.Client_plane, var27, var28);
							if (var62 != null) {
								var62.renderable = new DynamicObject(NetSocket.Entity_unpackID(var62.tag), 22, var86, class128.Client_plane, var27, var28, var13, false, var62.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3105 == var1.serverPacket) {
					class321.field4076 = var3.readUnsignedByte();
					class145.field1690 = var3.method7545();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3164 == var1.serverPacket) {
					class1.updatePlayers(var3, var1.serverPacketLength);
					class101.method2552();
					var1.serverPacket = null;
					return true;
				}

				Widget var68;
				if (ServerPacket.field3156 == var1.serverPacket) {
					var67 = var3.method7701();
					var68 = class92.getWidget(var67);
					var68.modelType = 3;
					var68.modelId = ModelData0.localPlayer.appearance.getChatHeadId();
					GrandExchangeOfferTotalQuantityComparator.method5781(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3176 == var1.serverPacket) {
					SecureRandomCallable.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3181 == var1.serverPacket) {
					field692 = cycleCntr;
					var20 = var3.readByte();
					class145 var69 = new class145(var3);
					ClanChannel var72;
					if (var20 >= 0) {
						var72 = currentClanChannels[var20];
					} else {
						var72 = UserComparator10.guestClanChannel;
					}

					var69.method2987(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3143 == var1.serverPacket) {
					Occluder.method4222(class263.field3063);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3188 == var1.serverPacket) {
					var67 = var3.method7554();
					var5 = var3.method7593();
					var6 = var3.method7567();
					var7 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var7 != null) {
						NetSocket.closeInterface(var7, var67 != var7.group);
					}

					class241.method4812(var6, var67, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3170 == var1.serverPacket) {
					var67 = var3.method7701();
					var5 = var3.method7701();
					InterfaceParent var70 = (InterfaceParent)interfaceParents.get((long)var67);
					var7 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var7 != null) {
						NetSocket.closeInterface(var7, var70 == null || var70.group != var7.group);
					}

					if (var70 != null) {
						var70.remove();
						interfaceParents.put(var70, (long)var5);
					}

					var26 = class92.getWidget(var67);
					if (var26 != null) {
						GrandExchangeOfferTotalQuantityComparator.method5781(var26);
					}

					var26 = class92.getWidget(var5);
					if (var26 != null) {
						GrandExchangeOfferTotalQuantityComparator.method5781(var26);
						UserComparator8.revalidateWidgetScroll(NetSocket.Widget_interfaceComponents[var26.id >>> 16], var26, true);
					}

					if (rootInterface != -1) {
						WorldMapLabelSize.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3108 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var31 = var3.readLong();
					var33 = (long)var3.readUnsignedShort();
					var41 = (long)var3.readMedium();
					PlayerType var43 = (PlayerType)class291.findEnumerated(class118.PlayerType_values(), var3.readUnsignedByte());
					var44 = (var33 << 32) + var41;
					boolean var88 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (field717[var15] == var44) {
							var88 = true;
							break;
						}
					}

					if (var43.isUser && BufferedSource.friendSystem.isIgnored(new Username(var48, class391.loginType))) {
						var88 = true;
					}

					if (!var88 && field606 == 0) {
						field717[field718] = var44;
						field718 = (field718 + 1) % 100;
						var25 = AbstractFont.escapeBrackets(WorldMapManager.method4679(LoginPacket.method5025(var3)));
						if (var43.modIcon != -1) {
							UserComparator7.addChatMessage(9, StudioGame.method5590(var43.modIcon) + var48, var25, class263.base37DecodeLong(var31));
						} else {
							UserComparator7.addChatMessage(9, var48, var25, class263.base37DecodeLong(var31));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3093 == var1.serverPacket) {
					class92.method2377(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3190 == var1.serverPacket) {
					var67 = var3.method7701();
					var68 = class92.getWidget(var67);

					for (var6 = 0; var6 < var68.itemIds.length; ++var6) {
						var68.itemIds[var6] = -1;
						var68.itemIds[var6] = 0;
					}

					GrandExchangeOfferTotalQuantityComparator.method5781(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3185 == var1.serverPacket) {
					var20 = var3.readByte();
					var31 = (long)var3.readUnsignedShort();
					var33 = (long)var3.readMedium();
					var41 = var33 + (var31 << 32);
					boolean var30 = false;
					ClanChannel var12 = var20 >= 0 ? currentClanChannels[var20] : UserComparator10.guestClanChannel;
					if (var12 == null) {
						var30 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (field717[var13] == var41) {
								var30 = true;
								break;
							}
						}
					}

					if (!var30) {
						field717[field718] = var41;
						field718 = (field718 + 1) % 100;
						var39 = LoginPacket.method5025(var3);
						var40 = var20 >= 0 ? 43 : 46;
						UserComparator7.addChatMessage(var40, "", var39, var12.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3101 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						PcmPlayer.friendsChatManager = null;
					} else {
						if (PcmPlayer.friendsChatManager == null) {
							PcmPlayer.friendsChatManager = new FriendsChatManager(class391.loginType, class82.client);
						}

						PcmPlayer.friendsChatManager.readUpdate(var3);
					}

					class194.method3804();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3104 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByte();
					tradeChatMode = var3.method7546();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3168 == var1.serverPacket) {
					var67 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var27 = var3.readUnsignedByte();
					field743[var67] = true;
					field744[var67] = var5;
					field745[var67] = var6;
					field714[var67] = var27;
					field677[var67] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3109 == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3100 == var1.serverPacket) {
					class393.field4428 = true;
					HorizontalAlignment.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3137 == var1.serverPacket) {
					var67 = var3.method7567();
					var5 = var3.method7716();
					var6 = var5 >> 10 & 31;
					var27 = var5 >> 5 & 31;
					var28 = var5 & 31;
					var9 = (var27 << 11) + (var6 << 19) + (var28 << 3);
					Widget var10 = class92.getWidget(var67);
					if (var9 != var10.color) {
						var10.color = var9;
						GrandExchangeOfferTotalQuantityComparator.method5781(var10);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3129 == var1.serverPacket) {
					isCameraLocked = true;
					field742 = false;
					Players.field1317 = var3.readUnsignedByte() * 128;
					TileItem.field1292 = var3.readUnsignedByte() * 16384;
					WorldMapSection1.field2898 = var3.readUnsignedShort();
					class229.field2805 = var3.readUnsignedByte();
					HitSplatDefinition.field2077 = var3.readUnsignedByte();
					if (HitSplatDefinition.field2077 >= 100) {
						class343.cameraX = Players.field1317 * 16384 + 64;
						FaceNormal.cameraZ = TileItem.field1292 * 128 + 64;
						class295.cameraY = class202.getTileHeight(class343.cameraX, FaceNormal.cameraZ, class128.Client_plane) - WorldMapSection1.field2898;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3160 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							field503 = 4096;
							field554 = 4096;
						}

						if (hintArrowType == 3) {
							field503 = 0;
							field554 = 4096;
						}

						if (hintArrowType == 4) {
							field503 = 8192;
							field554 = 4096;
						}

						if (hintArrowType == 5) {
							field503 = 4096;
							field554 = 0;
						}

						if (hintArrowType == 6) {
							field503 = 4096;
							field554 = 8192;
						}

						hintArrowType = 2;
						field500 = var3.readUnsignedShort();
						field501 = var3.readUnsignedShort();
						field563 = var3.readUnsignedByte() * 4;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3107 == var1.serverPacket) {
					var48 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var22 = class92.getWidget(var5);
					if (!var48.equals(var22.text)) {
						var22.text = var48;
						GrandExchangeOfferTotalQuantityComparator.method5781(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3151 == var1.serverPacket) {
					class175.method3373();
					var20 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var20 >= 0) {
							currentClanSettings[var20] = null;
						} else {
							class358.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var20 >= 0) {
						currentClanSettings[var20] = new ClanSettings(var3);
					} else {
						class358.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3149 == var1.serverPacket) {
					BufferedSource.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class121.FriendSystem_invalidateIgnoreds();
					field689 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				ArchiveDiskActionHandler.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1340 != null ? var1.field1340.id : -1) + "," + (var1.field1345 != null ? var1.field1345.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				SecureRandomCallable.logOut();
			} catch (IOException var46) {
				class129.method2812();
			} catch (Exception var47) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1340 != null ? var1.field1340.id : -1) + "," + (var1.field1345 != null ? var1.field1345.id : -1) + "," + var1.serverPacketLength + "," + (ModelData0.localPlayer.pathX[0] + SecureRandomCallable.baseX * 64) + "," + (ModelData0.localPlayer.pathY[0] + GrandExchangeOfferOwnWorldComparator.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var21 = var21 + var3.array[var6] + ",";
				}

				ArchiveDiskActionHandler.RunException_sendStackTrace(var21, var47);
				SecureRandomCallable.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1950620416"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var14 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var14;
					String var15 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var15;
					var5 = menuOpcodes[var2];
					menuOpcodes[var2] = menuOpcodes[var2 + 1];
					menuOpcodes[var2 + 1] = var5;
					var5 = menuArguments1[var2];
					menuArguments1[var2] = menuArguments1[var2 + 1];
					menuArguments1[var2 + 1] = var5;
					var5 = menuArguments2[var2];
					menuArguments2[var2] = menuArguments2[var2 + 1];
					menuArguments2[var2 + 1] = var5;
					var5 = menuIdentifiers[var2];
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
					menuIdentifiers[var2 + 1] = var5;
					boolean var6 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

		if (Canvas.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var11;
				int var17;
				label262: {
					int var16 = MouseHandler.MouseHandler_lastButton;
					int var4;
					int var9;
					if (isMenuOpen) {
						int var3;
						if (var16 != 1 && (Login.mouseCam || var16 != 4)) {
							var2 = MouseHandler.MouseHandler_x;
							var3 = MouseHandler.MouseHandler_y;
							if (var2 < BuddyRankComparator.menuX - 10 || var2 > KeyHandler.menuWidth + BuddyRankComparator.menuX + 10 || var3 < FontName.menuY - 10 || var3 > FontName.menuY + class7.menuHeight + 10) {
								isMenuOpen = false;
								class132.method2836(BuddyRankComparator.menuX, FontName.menuY, KeyHandler.menuWidth, class7.menuHeight);
							}
						}

						if (var16 == 1 || !Login.mouseCam && var16 == 4) {
							var2 = BuddyRankComparator.menuX;
							var3 = FontName.menuY;
							var4 = KeyHandler.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var17 = MouseHandler.MouseHandler_lastPressedY;
							int var13 = -1;

							for (int var18 = 0; var18 < menuOptionsCount; ++var18) {
								var9 = (menuOptionsCount - 1 - var18) * 15 + var3 + 31;
								if (var5 > var2 && var5 < var2 + var4 && var17 > var9 - 13 && var17 < var9 + 3) {
									var13 = var18;
								}
							}

							if (var13 != -1) {
								Renderable.method4211(var13);
							}

							isMenuOpen = false;
							class132.method2836(BuddyRankComparator.menuX, FontName.menuY, KeyHandler.menuWidth, class7.menuHeight);
						}
					} else {
						var2 = menuOptionsCount - 1;
						if ((var16 == 1 || !Login.mouseCam && var16 == 4) && var2 >= 0) {
							var4 = menuOpcodes[var2];
							if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
								var5 = menuArguments1[var2];
								var17 = menuArguments2[var2];
								Widget var7 = class92.getWidget(var17);
								var9 = UrlRequester.getWidgetFlags(var7);
								boolean var8 = (var9 >> 28 & 1) != 0;
								if (var8) {
									break label262;
								}

								var11 = UrlRequester.getWidgetFlags(var7);
								boolean var10 = (var11 >> 29 & 1) != 0;
								if (var10) {
									break label262;
								}
							}
						}

						if ((var16 == 1 || !Login.mouseCam && var16 == 4) && this.shouldLeftClickOpenMenu()) {
							var16 = 2;
						}

						if ((var16 == 1 || !Login.mouseCam && var16 == 4) && menuOptionsCount > 0) {
							Renderable.method4211(var2);
						}

						if (var16 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return;
				}

				if (Canvas.dragInventoryWidget != null && !field604 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
					int var19 = draggedWidgetX;
					var11 = draggedWidgetY;
					MenuAction var12 = class116.tempMenuAction;
					if (var12 != null) {
						ModeWhere.menuAction(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.action, var12.action, var19, var11);
					}

					class116.tempMenuAction = null;
				}

				field604 = false;
				itemDragDuration = 0;
				if (Canvas.dragInventoryWidget != null) {
					GrandExchangeOfferTotalQuantityComparator.method5781(Canvas.dragInventoryWidget);
				}

				Canvas.dragInventoryWidget = class92.getWidget(var17);
				dragItemSlotSource = var5;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					Players.method2426(var2);
				}

				GrandExchangeOfferTotalQuantityComparator.method5781(Canvas.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1;
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || UrlRequester.method2539(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-25"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class119.method2739(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class175.scene.menuOpen(class128.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "16"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = GraphicsObject.canvasWidth;
		int var4 = class433.canvasHeight;
		if (WorldMapDecoration.loadInterface(var2)) {
			Language.resizeInterface(NetSocket.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)V",
		garbageValue = "7"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class92.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = GraphicsObject.canvasWidth;
			var4 = class433.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		FloorOverlayDefinition.alignWidgetSize(var1, var3, var4, false);
		ChatChannel.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1857303053"
	)
	final void method1150() {
		GrandExchangeOfferTotalQuantityComparator.method5781(clickedWidget);
		++SoundSystem.field315;
		int var1;
		int var2;
		if (field675 && field574) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field747) {
				var1 = field747;
			}

			if (var1 + clickedWidget.width > field747 + field668.width) {
				var1 = field747 + field668.width - clickedWidget.width;
			}

			if (var2 < field674) {
				var2 = field674;
			}

			if (var2 + clickedWidget.height > field674 + field668.height) {
				var2 = field674 + field668.height - clickedWidget.height;
			}

			int var3 = var1 - field653;
			int var4 = var2 - field612;
			int var5 = clickedWidget.dragZoneSize;
			if (SoundSystem.field315 > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field747 + field668.scrollX;
			int var7 = var2 - field674 + field668.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class144.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						class144.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var15 = clickedWidget;
						int var11 = UrlRequester.getWidgetFlags(var15);
						int var16 = var11 >> 17 & 7;
						int var12 = var16;
						Widget var18;
						if (var16 == 0) {
							var18 = null;
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var18 = var15;
									break;
								}

								var15 = class92.getWidget(var15.parentId);
								if (var15 == null) {
									var18 = null;
									break;
								}

								++var13;
							}
						}

						if (var18 != null) {
							PacketBufferNode var19 = DecorativeObject.getPacketBufferNode(ClientPacket.field3029, packetWriter.isaacCipher);
							var19.packetBuffer.writeShort(clickedWidget.childIndex);
							var19.packetBuffer.method7563(draggedOnWidget.id);
							var19.packetBuffer.writeShort(draggedOnWidget.childIndex);
							var19.packetBuffer.writeShort(draggedOnWidget.itemId);
							var19.packetBuffer.method7564(clickedWidget.id);
							var19.packetBuffer.writeShort(clickedWidget.itemId);
							packetWriter.addNode(var19);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field653, widgetClickY + field612);
				} else if (menuOptionsCount > 0) {
					int var14 = field653 + widgetClickX;
					int var9 = widgetClickY + field612;
					MenuAction var10 = class116.tempMenuAction;
					if (var10 != null) {
						ModeWhere.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.action, var10.action, var14, var9);
					}

					class116.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (SoundSystem.field315 > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					var1 = widgetClickX + field653;
					var2 = field612 + widgetClickY;
					MenuAction var17 = class116.tempMenuAction;
					if (var17 != null) {
						ModeWhere.menuAction(var17.param0, var17.param1, var17.opcode, var17.identifier, var17.action, var17.action, var1, var2);
					}

					class116.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(B)Lqv;",
		garbageValue = "-38"
	)
	@Export("username")
	public Username username() {
		return ModelData0.localPlayer != null ? ModelData0.localPlayer.username : null;
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field478 = var1;
			class126.method2799(10);
		}
	}

	public long getAccountHash() {
		return this.field531;
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field577 = var1;
		}
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0;
						case 2:
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							int var4 = Integer.parseInt(var2);
							Language var9;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var9 = Language.Language_valuesOrdered[var4];
							} else {
								var9 = null;
							}

							class263.clientLanguage = var9;
							break;
						case 7:
							AbstractArchive.field4038 = AbstractWorldMapData.method4799(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							field662 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.game4, StudioGame.oldscape};
							ApproximateRouteStrategy.field473 = (StudioGame)class291.findEnumerated(var3, Integer.parseInt(var2));
							if (ApproximateRouteStrategy.field473 == StudioGame.oldscape) {
								class391.loginType = LoginType.oldscape;
							} else {
								class391.loginType = LoginType.field4616;
							}
							break;
						case 11:
							ApproximateRouteStrategy.field471 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							class230.field2807 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class93.field1280 = var2;
							break;
						case 21:
							field484 = Integer.parseInt(var2);
							break;
						case 22:
							field493 = Integer.parseInt(var2) != 0;
						}
					}
				}

				JagexCache.method3155();
				Timer.worldHost = this.getCodeBase().getHost();
				String var5 = AbstractArchive.field4038.name;
				byte var6 = 0;

				try {
					PendingSpawn.method2160("oldschool", var5, var6, 21);
				} catch (Exception var7) {
					ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var7);
				}

				class82.client = this;
				class430.clientType = clientType;
				if (field486 == -1) {
					field486 = 0;
				}

				Decimator.field406 = System.getenv("JX_ACCESS_TOKEN");
				ModelData0.field2661 = System.getenv("JX_REFRESH_TOKEN");
				this.startThread(765, 503, 205);
			}
		} catch (RuntimeException var8) {
			throw HealthBarUpdate.newRunException(var8, "client.init(" + ')');
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "2074222337"
	)
	static int method1240(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class12.Interpreter_intStackSize -= 2;
			field748 = (short)InterfaceParent.method2066(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]);
			if (field748 <= 0) {
				field748 = 256;
			}

			field749 = (short)InterfaceParent.method2066(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]);
			if (field749 <= 0) {
				field749 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class12.Interpreter_intStackSize -= 2;
			zoomHeight = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			if (zoomHeight <= 0) {
				zoomHeight = 256;
			}

			zoomWidth = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			if (zoomWidth <= 0) {
				zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class12.Interpreter_intStackSize -= 4;
			field752 = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize];
			if (field752 <= 0) {
				field752 = 1;
			}

			field753 = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1];
			if (field753 <= 0) {
				field753 = 32767;
			} else if (field753 < field752) {
				field753 = field752;
			}

			field656 = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2];
			if (field656 <= 0) {
				field656 = 1;
			}

			field755 = (short)Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3];
			if (field755 <= 0) {
				field755 = 32767;
			} else if (field755 < field656) {
				field755 = field656;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (viewportWidget != null) {
				GrandExchangeOfferOwnWorldComparator.setViewportShape(0, 0, viewportWidget.width, viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = viewportWidth;
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = zoomHeight;
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class21.method278(field748);
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class21.method278(field749);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = GraphicsObject.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class433.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIIIII)V",
		garbageValue = "-1622528173"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			byte var8 = 0;
			if (var1 < var75 && var0.playerCycle == cycle && class118.method2720((Player)var0)) {
				Player var9 = (Player)var0;
				if (var1 < var75) {
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15);
					AbstractFont var10 = (AbstractFont)fontsMap.get(FontName.FontName_plain12);
					byte var11 = 9;
					var10.drawCentered(var9.username.getName(), var2 + viewportTempX, var3 + viewportTempY - var11, 16777215, 0);
					var8 = 18;
				}
			}

			int var76 = -2;
			int var22;
			int var23;
			int var24;
			int var77;
			if (!var0.healthBars.method5986()) {
				var77 = var0.defaultHeight + 15;
				AbstractWorldMapIcon.worldToScreen(var0.x, var0.y, var77);

				for (HealthBar var78 = (HealthBar)var0.healthBars.last(); var78 != null; var78 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var80 = var78.get(cycle);
					if (var80 == null) {
						if (var78.isEmpty()) {
							var78.remove();
						}
					} else {
						HealthBarDefinition var13 = var78.definition;
						SpritePixels var81 = var13.method3360();
						SpritePixels var82 = var13.method3359();
						int var17 = 0;
						int var83;
						if (var81 != null && var82 != null) {
							if (var13.widthPadding * 2 < var82.subWidth) {
								var17 = var13.widthPadding;
							}

							var83 = var82.subWidth - var17 * 2;
						} else {
							var83 = var13.width;
						}

						int var84 = 255;
						boolean var85 = true;
						int var86 = cycle - var80.cycle;
						int var87 = var83 * var80.health2 / var13.width;
						int var94;
						if (var80.cycleOffset > var86) {
							var22 = var13.field1915 == 0 ? 0 : var13.field1915 * (var86 / var13.field1915);
							var23 = var83 * var80.health / var13.width;
							var94 = var22 * (var87 - var23) / var80.cycleOffset + var23;
						} else {
							var94 = var87;
							var22 = var13.int5 + var80.cycleOffset - var86;
							if (var13.int3 >= 0) {
								var84 = (var22 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var80.health2 > 0 && var94 < 1) {
							var94 = 1;
						}

						if (var81 != null && var82 != null) {
							if (var83 == var94) {
								var94 += var17 * 2;
							} else {
								var94 += var17;
							}

							var22 = var81.subHeight;
							var76 += var22;
							var23 = var2 + viewportTempX - (var83 >> 1);
							var24 = var3 + viewportTempY - var76;
							var23 -= var17;
							if (var84 >= 0 && var84 < 255) {
								var81.drawTransAt(var23, var24, var84);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var22 + var24);
								var82.drawTransAt(var23, var24, var84);
							} else {
								var81.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var94, var22 + var24);
								var82.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var76 += 2;
						} else {
							var76 += 5;
							if (viewportTempX > -1) {
								var22 = var2 + viewportTempX - (var83 >> 1);
								var23 = var3 + viewportTempY - var76;
								Rasterizer2D.Rasterizer2D_fillRectangle(var22, var23, var94, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var22, var23, var83 - var94, 5, 16711680);
							}

							var76 += 2;
						}
					}
				}
			}

			if (var76 == -2) {
				var76 += 7;
			}

			var76 += var8;
			if (var1 < var75) {
				Player var88 = (Player)var0;
				if (var88.isHidden) {
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) {
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15);
					if (viewportTempX > -1) {
						if (var88.headIconPk != -1) {
							var76 += 25;
							UserComparator4.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - var76);
						}

						if (var88.headIconPrayer != -1) {
							var76 += 25;
							ChatChannel.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - var76);
						}
					}
				}

				if (var1 >= 0 && hintArrowType == 10 && var7[var1] == hintArrowPlayerIndex) {
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15);
					if (viewportTempX > -1) {
						var76 += class21.headIconHintSprites[1].subHeight;
						class21.headIconHintSprites[1].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - var76);
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition;
				if (var89.transforms != null) {
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < ChatChannel.headIconPrayerSprites.length) {
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15);
					if (viewportTempX > -1) {
						ChatChannel.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - 30);
					}
				}

				if (hintArrowType == 1 && npcIndices[var1 - var75] == hintArrowNpcIndex && cycle % 20 < 10) {
					ByteArrayPool.method6357(var0, var0.defaultHeight + 15);
					if (viewportTempX > -1) {
						class21.headIconHintSprites[0].drawTransBgAt(var2 + viewportTempX - 12, var3 + viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1198 && (publicChatMode == 4 || !var0.isAutoChatting && (publicChatMode == 0 || publicChatMode == 3 || publicChatMode == 1 && ((Player)var0).isFriend())))) {
				ByteArrayPool.method6357(var0, var0.defaultHeight);
				if (viewportTempX > -1 && overheadTextCount < overheadTextLimit) {
					overheadTextXOffsets[overheadTextCount] = ChatChannel.fontBold12.stringWidth(var0.overheadText) / 2;
					overheadTextAscents[overheadTextCount] = ChatChannel.fontBold12.ascent;
					overheadTextXs[overheadTextCount] = viewportTempX;
					overheadTextYs[overheadTextCount] = viewportTempY;
					overheadTextColors[overheadTextCount] = var0.overheadTextColor;
					overheadTextEffects[overheadTextCount] = var0.overheadTextEffect;
					overheadTextCyclesRemaining[overheadTextCount] = var0.overheadTextCyclesRemaining;
					overheadText[overheadTextCount] = var0.overheadText;
					++overheadTextCount;
				}
			}

			for (var77 = 0; var77 < 4; ++var77) {
				int var90 = var0.hitSplatCycles[var77];
				int var12 = var0.hitSplatTypes[var77];
				HitSplatDefinition var91 = null;
				int var14 = 0;
				if (var12 >= 0) {
					if (var90 <= cycle) {
						continue;
					}

					var91 = UserComparator4.method2567(var0.hitSplatTypes[var77]);
					var14 = var91.field2071;
					if (var91 != null && var91.transforms != null) {
						var91 = var91.transform();
						if (var91 == null) {
							var0.hitSplatCycles[var77] = -1;
							continue;
						}
					}
				} else if (var90 < 0) {
					continue;
				}

				int var15 = var0.hitSplatTypes2[var77];
				HitSplatDefinition var16 = null;
				if (var15 >= 0) {
					var16 = UserComparator4.method2567(var15);
					if (var16 != null && var16.transforms != null) {
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= cycle) {
					if (var91 == null) {
						var0.hitSplatCycles[var77] = -1;
					} else {
						ByteArrayPool.method6357(var0, var0.defaultHeight / 2);
						if (viewportTempX > -1) {
							boolean var92 = true;
							if (var77 == 1) {
								viewportTempY -= 20;
							}

							if (var77 == 2) {
								viewportTempX -= 15;
								viewportTempY -= 10;
							}

							if (var77 == 3) {
								viewportTempX += 15;
								viewportTempY -= 10;
							}

							SpritePixels var18 = null;
							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							var22 = 0;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var18 = var91.method3531();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var91.method3534();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var91.method3533();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var91.method3559();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var16 != null) {
								var30 = var16.method3531();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var16.method3534();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var16.method3533();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var16.method3559();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var79 = var91.getFont();
							if (var79 == null) {
								var79 = Varcs.fontPlain11;
							}

							Font var44;
							if (var16 != null) {
								var44 = var16.getFont();
								if (var44 == null) {
									var44 = Varcs.fontPlain11;
								}
							} else {
								var44 = Varcs.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var91.getString(var0.hitSplatValues[var77]);
							int var93 = var79.stringWidth(var45);
							if (var16 != null) {
								var46 = var16.getString(var0.hitSplatValues2[var77]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var49 * var23;
								var51 += var56;
								var55 += (var56 - var93) / 2;
							} else {
								var51 += var93;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var16 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var50 * var35;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - cycle;
							int var63 = var91.field2055 - var62 * var91.field2055 / var91.field2071;
							int var64 = var62 * var91.field2074 / var91.field2071 + -var91.field2074;
							int var65 = var63 + (var2 + viewportTempX - (var51 >> 1));
							int var66 = var3 + viewportTempY - 12 + var64;
							int var67 = var66;
							int var68 = var66 + var42;
							int var69 = var66 + var91.field2068 + 15;
							int var70 = var69 - var79.maxAscent;
							int var71 = var69 + var79.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var16 != null) {
								var72 = var66 + var16.field2068 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var91.field2072 >= 0) {
								var73 = (var62 << 8) / (var91.field2071 - var91.field2072);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var18 != null) {
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var79.drawAlpha(var45, var55 + var65, var69, var91.textColor, 0, var73);
								if (var16 != null) {
									if (var30 != null) {
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var16.textColor, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var79.draw(var45, var65 + var55, var69, var91.textColor | -16777216, 0);
								if (var16 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var61 + var65, var72, var16.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
