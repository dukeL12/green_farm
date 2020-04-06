package com.ruanku.farm.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.net.UnknownHostException;

@Configuration
public class MyRedisConfig {
    //1.x版本的redis配置类
//    @Bean
//    public RedisTemplate<Object, Account> empRedisTemplate(
//            RedisConnectionFactory redisConnectionFactory)
//            throws UnknownHostException {
//        RedisTemplate<Object, Account> template = new RedisTemplate<Object, Account>();
//        template.setConnectionFactory(redisConnectionFactory);
//        Jackson2JsonRedisSerializer<Account> jsonRedisSerializer = new Jackson2JsonRedisSerializer<Account>(Account.class);
//        template.setDefaultSerializer(jsonRedisSerializer);
//        return template;
//    }
    //CacheManagerCustomizers可以来定制缓存的一些规则
//    @Primary  //将某个缓存管理器作为默认的
//    @Bean
//    public RedisCacheManager employeeCacheManager(RedisConnectionFactory factory){
//        RedisCacheManager cacheManager = RedisCacheManager.create(factory);
//        //key多了一个前缀
//
//        //使用前缀，默认会将CacheName作为key的前缀
////        cacheManager.setUsePrefix(true);
//
//        return cacheManager;
//    }

    //2.x版本的redis配置类
    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
        Jackson2JsonRedisSerializer<Object> redisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        redisSerializer.setObjectMapper(objectMapper);
        RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(redisSerializer));
        RedisCacheManager redisCacheManager = RedisCacheManager.builder(connectionFactory).cacheDefaults(cacheConfiguration).build();
        return redisCacheManager;
    }

}

