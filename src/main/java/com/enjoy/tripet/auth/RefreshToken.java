package com.enjoy.tripet.auth;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "refreshToken", timeToLive = 30 * 24 * 60 * 60)
@Getter
@RequiredArgsConstructor
public class RefreshToken {
    @Id
    private final String email;
    private final String refreshToken;
}
