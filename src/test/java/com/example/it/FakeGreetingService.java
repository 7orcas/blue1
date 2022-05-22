package com.example.it;

import javax.enterprise.context.ApplicationScoped;

import com.sevenorcas.GreetingMessage;
import com.sevenorcas.GreetingService;

@ApplicationScoped
public class FakeGreetingService implements GreetingService {
    @Override
    public GreetingMessage buildGreetingMessage(String name) {
        return GreetingMessage.of("fake message");
    }
}
