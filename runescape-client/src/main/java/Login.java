import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("Login")
public class Login {
	@ObfuscatedName("q")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 276898147
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static IndexedSprite field882;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static IndexedSprite field888;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2055950189
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 135788845
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("i")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -799291101
	)
	static int field887;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 148812415
	)
	static int field907;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1290370117
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("at")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("br")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ba")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bk")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bi")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bc")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1915795539
	)
	static int field896;
	@ObfuscatedName("bs")
	static String[] field876;
	@ObfuscatedName("bh")
	static boolean field879;
	@ObfuscatedName("bb")
	static boolean field881;
	@ObfuscatedName("bn")
	static boolean field900;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1833124077
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("ck")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 286320775
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -246673921
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 70762845
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		longValue = -2630741259631538253L
	)
	static long field883;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		longValue = -7505772833145072753L
	)
	static long field909;
	@ObfuscatedName("cf")
	static String[] field910;
	@ObfuscatedName("cq")
	static String[] field911;
	@ObfuscatedName("dv")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class428 HitSplatDefinition_cachedSprites;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field887 = -1;
		field907 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field896 = 0;
		field876 = new String[8];
		field879 = false;
		field881 = false;
		field900 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class120();
		field883 = -1L;
		field909 = -1L;
		field910 = new String[]{"title.jpg"};
		field911 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
	}
}
