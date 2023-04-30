package com.jagex.oldscape.pub;

public interface RefreshAccessTokenResponse {
   boolean isSuccess();

   String getAccessToken();

   String getRefreshToken();
}
