import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("oh")
public class class400 implements class399 {
	@ObfuscatedName("l")
	JSONObject field4439;

	public class400(byte[] var1) throws UnsupportedEncodingException {
		this.method6946(var1);
	}

	public class400(String var1) throws UnsupportedEncodingException {
		this.method6954(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2132228640"
	)
	public byte[] vmethod6962() throws UnsupportedEncodingException {
		return this.field4439 == null ? new byte[0] : this.field4439.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1886855287"
	)
	void method6946(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method6954(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "3"
	)
	void method6954(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4439 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.field4439 = new JSONObject();
				this.field4439.put("arrayValues", var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "579331976"
	)
	public JSONObject method6947() {
		return this.field4439;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	static void method6957(int var0) {
		class126.method2799(14);
		Login.field887 = var0;
	}
}
