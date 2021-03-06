package com.sevenorcas;

import org.junit.Test;

import com.sevenorcas.GreetingMessage;

import static org.junit.Assert.assertTrue;

public class GreetingMessageTest {

    @Test
    public void testGreetingMessage() {
        GreetingMessage message = GreetingMessage.of("Say Hello to JatartaEE");
        assertTrue("message should contains `Say Hello to JatartaEE`",
                "Say Hello to JatartaEE".equals(message.getMessage()
                ));
    }
}
