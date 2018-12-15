package com.cdream.testpaper.common;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * 用来储存定时口令的类
 *
 * @author cdream
 * @date 2018/9/15
 */
public class TokenCache {
    public static final String TOKEN_PREFIX = "token_";
    /**
     * 链式编程，逐条设置值
     */
    public static LoadingCache<String, String> loadingCache = CacheBuilder.newBuilder()
            .initialCapacity(1000)
            .expireAfterWrite(12, TimeUnit.HOURS)
            .maximumSize(10000).build(new CacheLoader<String, String>() {
                //当不能找到内容时返回null
                @Override
                public String load(String s) throws Exception {
                    return "null";
                }
            });
    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);

    public static void setKey(String key, String value) {
        loadingCache.put(key, value);
    }

    public static String getValue(String key) {
        String value = null;
        try {
            value = loadingCache.get(key);
            if ("null".equals(value)) {
                return null;
            }
            return value;
        } catch (ExecutionException e) {
            logger.error("localCache get error", e);
        }
        return null;
    }
}
