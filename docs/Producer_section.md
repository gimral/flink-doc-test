| Key | Default | Type | Description |
|---|---|---|---|
| kafka.producer.semantics  | "at-least-once" | String | The delivery semantics for the Kafka producer. Options are 'at-least-once', 'exactly-once', and 'none'. Note that 'exactly-once' requires a Kafka cluster that supports transactions (Kafka 0.11+). |
