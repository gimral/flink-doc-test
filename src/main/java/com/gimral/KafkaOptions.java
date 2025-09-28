package com.gimral;

import org.apache.flink.annotation.docs.Documentation;
import org.apache.flink.configuration.ConfigOption;
import org.apache.flink.configuration.ConfigOptions;

import java.util.Map;


public class KafkaOptions {
    @Documentation.Section("Kafka")
    public static ConfigOption<Map<String,String>> KAFKA_CUSTOM_PROPERTIES =
            ConfigOptions
                    .key("kafka")
                    .mapType()
                    .noDefaultValue()
                    .withDescription(
                            "A map of custom properties to pass to the Kafka consumer and producer. "
                                    + "These properties will be used to configure the Kafka clients. "
                                    + "For example, you can use this option to set the security protocol, "
                                    + "SASL mechanism, or any other Kafka client property. "
                                    + "Refer to the Kafka documentation for a list of supported properties.");

    @Documentation.Section("Kafka")
    public static ConfigOption<String> KAFKA_PUBLISH_TOPIC =
            ConfigOptions
                    .key("kafka.publish.topic")
                    .stringType()
                    .defaultValue("publish-topic")
                    .withDescription("The Kafka topic to write to.");

    @Documentation.Section("Kafka")
    public static ConfigOption<String> KAFKA_SUBSCRIBE_TOPIC =
            ConfigOptions
                    .key("kafka.subscribe.topic")
                    .stringType()
                    .noDefaultValue()
                    .withDescription("The Kafka topic to read from.");

    @Documentation.Section("Producer")
    public static ConfigOption<String> KAFKA_PRODUCER_SEMANTICS =
            ConfigOptions
                    .key("kafka.producer.semantics")
                    .stringType()
                    .defaultValue("at-least-once")
                    .withDescription(
                            "The delivery semantics for the Kafka producer. "
                                    + "Options are 'at-least-once', 'exactly-once', and 'none'. "
                                    + "Note that 'exactly-once' requires a Kafka cluster that supports transactions (Kafka 0.11+).");
}
