package com.jcpv.cremeria.service.jms;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.UUID;


/**
 * Created by jancarlo on 22/01/18.
 */

@Service
public class JmsSender {
    private static Logger log = LoggerFactory.getLogger(JmsConsumer.class);

    /*@Autowired
    private JmsTemplate jmsTemplate;

    public void send(Exam exam) {
        log.info("sending with convertAndSend() to queue <" + exam + ">");
        jmsTemplate.convertAndSend(NAME_QUEUE, exam, m -> {

            log.info("setting standard JMS headers before sending");
            m.setJMSCorrelationID(UUID.randomUUID().toString());
            m.setJMSExpiration(1000);
            m.setJMSMessageID("message-id");
            m.setJMSDestination(new ActiveMQQueue(NAME_QUEUE));
            m.setJMSReplyTo(new ActiveMQQueue(NAME_QUEUE));
            m.setJMSDeliveryMode(DeliveryMode.NON_PERSISTENT);
            m.setJMSPriority(Message.DEFAULT_PRIORITY);
            m.setJMSTimestamp(System.nanoTime());
            m.setJMSType("type");

            log.info("setting custom JMS headers before sending");
            m.setStringProperty("jms-custom-header", "this is a custom jms property");
            m.setBooleanProperty("jms-custom-property", true);
            m.setDoubleProperty("jms-custom-property-price", 0.0);

            return m;
        });
    }

    public void send(String destination, Object message) {
        log.info("sending2 with convertAndSend() to queue <" + message + ">");
        jmsTemplate.convertAndSend(destination, message, m -> {
            log.info("setting standard JMS headers before sending");
            m.setJMSCorrelationID(UUID.randomUUID().toString());
            m.setJMSExpiration(100);
            m.setJMSMessageID("message-id");
            m.setJMSDestination(new ActiveMQQueue(NAME_QUEUE));
            m.setJMSReplyTo(new ActiveMQQueue(NAME_QUEUE));
            m.setJMSDeliveryMode(DeliveryMode.NON_PERSISTENT);
            m.setJMSPriority(Message.DEFAULT_PRIORITY);
            m.setJMSTimestamp(System.nanoTime());
            m.setJMSType("type");


            m.setStringProperty("jms-custom-header", "this is a custom jms property");
            m.setBooleanProperty("jms-custom-property", true);
            m.setDoubleProperty("jms-custom-property-price", 0.0);

            return m;
        });



    }*/
}
