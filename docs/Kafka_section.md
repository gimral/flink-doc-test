| Key | Default | Type | Description |
|---|---|---|---|
| kafka  | (none) | Map | A map of custom properties to pass to the Kafka consumer and producer. These properties will be used to configure the Kafka clients. For example, you can use this option to set the security protocol, SASL mechanism, or any other Kafka client property. Refer to the Kafka documentation for a list of supported properties. |
| kafka.publish.topic  | "publish-topic" | String | The Kafka topic to write to. |
| kafka.subscribe.topic  | (none) | String | The Kafka topic to read from. |
