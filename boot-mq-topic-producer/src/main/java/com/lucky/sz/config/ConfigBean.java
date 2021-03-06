package com.lucky.sz.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @FileName: ConfigBean.java
 * @description:
 * @author: 欧阳小广
 * @Date: 2021-03-04
 **/
@Component
@EnableJms //开启Springboot的Jms
public class ConfigBean implements Serializable {

    @Value("${myTopicName}")
    private String topicName;

    @Bean
    public ActiveMQTopic activeMQTopic() {
        return new ActiveMQTopic(topicName);
    }

}
