This project provides a set of configurable options for Kafka producers and consumers, designed to integrate with Apache Flink.

## Features

- Define custom Kafka client properties.
- Configure Kafka topics for publishing and subscribing.
- Set delivery semantics for Kafka producers.

## Configuration Options
<!-- CONFIG_OPTIONS:KAFKA -->
| Key | Default | Type | Description |
|---|---|---|---|
| kafka  | (none) | Map | A map of custom properties to pass to the Kafka consumer and producer. These properties will be used to configure the Kafka clients. For example, you can use this option to set the security protocol, SASL mechanism, or any other Kafka client property. Refer to the Kafka documentation for a list of supported properties. |
| kafka.producer.semantics  | "at-least-once" | String | The delivery semantics for the Kafka producer. Options are 'at-least-once', 'exactly-once', and 'none'. Note that 'exactly-once' requires a Kafka cluster that supports transactions (Kafka 0.11+). |
| kafka.publish.topic  | "publish-topic" | String | The Kafka topic to write to. |
| kafka.subscribe.topic  | (none) | String | The Kafka topic to read from. |

<!-- CONFIG_OPTIONS:KAFKA END -->

## Prerequisites

- Java 17
- Gradle
- Apache Flink 2.0.0

## Build and Test

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-name>
   ```
   
2. Build the project using Gradle:
   ```bash
    ./gradlew build
    ```
   
3. Run tests:
   ```bash
   ./gradlew test
   ```