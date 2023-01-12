package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("OAuthApi")
public interface OAuthApi {
	void setOtlTokenRequester(OtlTokenRequester var1);

	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

	long getAccountHash();

	boolean isOnLoginScreen();
}
