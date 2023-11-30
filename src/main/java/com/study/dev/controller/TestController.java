package com.study.dev.controller;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {
    private final RedisTemplate<String, String> redisTemplate;

    @GetMapping
    public String test() {
        System.out.println("test success!");
        return "20231130 success!";

    }

    @PostMapping("/redis")
    public String putRedis(@RequestBody Map<String, String> map) {
        System.out.println(map);
        redisTemplate.opsForValue().set(map.get("key"), map.get("value"));
        return "redis put success";
    }

    @GetMapping("/redis")
    public String getRedis(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
