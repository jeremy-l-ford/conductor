package com.netflix.conductor.server;

import com.netflix.conductor.cassandra.config.CassandraConfiguration;
import com.netflix.conductor.common.config.ObjectMapperConfiguration;
import com.netflix.conductor.core.config.ConductorCoreConfiguration;
import com.netflix.conductor.es6.config.ElasticSearchV6Configuration;
import com.netflix.conductor.grpc.server.GrpcConfiguration;
import com.netflix.conductor.mysql.config.MySQLConfiguration;
import com.netflix.conductor.postgres.config.PostgresConfiguration;
import com.netflix.conductor.redis.config.InMemoryRedisConfiguration;
import com.netflix.conductor.redis.config.RedisClusterConfiguration;
import com.netflix.conductor.redis.config.RedisCommonConfiguration;
import com.netflix.conductor.redis.config.RedisSentinelConfiguration;
import com.netflix.conductor.redis.config.RedisStandaloneConfiguration;
import com.netflix.conductor.rest.config.RestConfiguration;
import com.netflix.conductor.zookeeper.config.ZookeeperLockConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(proxyBeanMethods = false)
@ComponentScan(
        value = {
                "com.netflix.conductor"
        }
)
@Import(
        {
                ConductorCoreConfiguration.class,
                ObjectMapperConfiguration.class,
                RestConfiguration.class,
                PostgresConfiguration.class,
                ElasticSearchV6Configuration.class,
                MySQLConfiguration.class,
                CassandraConfiguration.class,
                RedisStandaloneConfiguration.class,
                InMemoryRedisConfiguration.class,
                RedisSentinelConfiguration.class,
                RedisClusterConfiguration.class,
                RedisCommonConfiguration.class,
                GrpcConfiguration.class,
                ZookeeperLockConfiguration.class
        }
)
public class ConductorServerAutoConfiguration {

        public ConductorServerAutoConfiguration() {
                System.out.println("CSAC");
        }
}
