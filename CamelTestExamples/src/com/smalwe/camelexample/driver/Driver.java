package com.smalwe.camelexample.driver;

import javax.jms.JMSException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smalwe.camelexample.processors.JmsMessageProducer;

public class Driver {
 public static void main (String args[]) throws JMSException {
	 
	 ApplicationContext context = 
	    	   new ClassPathXmlApplicationContext(new String[] {"com/smalwe/camelexample/config/camelcontext.xml"});
	 
	 
	 JmsMessageProducer jms = (JmsMessageProducer)context.getBean("jmsMessageProducer");
	 jms.generateMessages();
 }
}
