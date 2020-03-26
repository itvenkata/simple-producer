package com.tvc.kafka.producer.config;

public class AppConfigs {
    public final static String applicationID = "SimpleProducer";
    public final static String bootstrapServers = "localhost:9092,localhost:9093";
    public final static String topicName = "simple-producer-topic";
    public final static int numEvents = 1000000;
}
