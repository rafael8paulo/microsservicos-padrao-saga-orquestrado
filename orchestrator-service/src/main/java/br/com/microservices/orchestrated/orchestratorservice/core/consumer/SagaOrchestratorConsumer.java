package br.com.microservices.orchestrated.orchestratorservice.core.consumer;

import br.com.microservices.orchestrated.orchestratorservice.core.service.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class SagaOrchestratorConsumer {

    private final JsonUtil jsonUtil;

    @KafkaListener(
            groupId = "${spring.kafka.consumer.group-id}",
            topics = "${spring.kafka.topic.start-saga}"
    )
    public void consumeStartSagaEvent(String payload) {
        log.info("Receiving ending notification event {} from start-saga topic", payload);
        var event = jsonUtil.toEvent(payload);
        log.info(event.toString());
    }

    @KafkaListener(
            groupId = "${spring.kafka.consumer.group-id}",
            topics = "${spring.kafka.topic.orchestrator}"
    )
    public void consumeOrchestratorEvent(String payload) {
        log.info("Receiving ending notification event {} from orchestrator topic", payload);
        var event = jsonUtil.toEvent(payload);
        log.info(event.toString());
    }

    @KafkaListener(
            groupId = "${spring.kafka.consumer.group-id}",
            topics = "${spring.kafka.topic.finish-success}"
    )
    public void consumeFinishSuccessEvent(String payload) {
        log.info("Receiving ending notification event {} from finish-success topic", payload);
        var event = jsonUtil.toEvent(payload);
        log.info(event.toString());
    }

    @KafkaListener(
            groupId = "${spring.kafka.consumer.group-id}",
            topics = "${spring.kafka.topic.finish-fail}"
    )
    public void consumeFinishFailEvent(String payload) {
        log.info("Receiving ending notification event {} from finish-fail topic", payload);
        var event = jsonUtil.toEvent(payload);
        log.info(event.toString());
    }

}
