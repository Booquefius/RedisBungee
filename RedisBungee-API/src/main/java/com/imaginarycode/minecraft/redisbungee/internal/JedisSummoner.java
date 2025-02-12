package com.imaginarycode.minecraft.redisbungee.internal;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 * This class intended for future release to support redis sentinel or redis clusters
 *
 * @author Ham1255
 * @since 0.7.0
 *
 */
public interface JedisSummoner {

    Jedis requestJedis();

    boolean isJedisAvailable();

    @Deprecated
    JedisPool getJedisPool();

}
