package com.jcpv.cremeria.config.jms;

import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jancarlo on 14/02/18.
 */
//@EnableJms
//@Configuration
public class JmsConfig {

    public static final String NAME_QUEUE = "name-queue";
    public static final String NAME_QUEUE2 = "name-queue2";


    //@Value("${activemq.broker-url}")
    private String brokerUrl="localhost:61616";

/*   //bean indicar url active mq
    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setUserName(userName);
	    activeMQConnectionFactory.setPassword(password);
        return activeMQConnectionFactory;*/


/*
    @Bean
    public JmsListenerContainerFactory<?> queueListenerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        //factory.setConnectionFactory(activeMQConnectionFactory());
        factory.setConcurrency("3-10");
        factory.setMessageConverter(messageConverter());
        return factory;
    }


     @Bean
    public JmsListenerContainerFactory<?> myFactory(@Qualifier("activeMQConnectionFactory") ConnectionFactory connectionFactory,
    DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        // This provides all boot's default to this factory, including the message converter
        configurer.configure(factory, connectionFactory);
        // You could still override some of Boot's default if necessary.
        return factory;
    }

    @Bean // Serialize message content to json using TextMessage
    public MessageConverter messageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }*/
}