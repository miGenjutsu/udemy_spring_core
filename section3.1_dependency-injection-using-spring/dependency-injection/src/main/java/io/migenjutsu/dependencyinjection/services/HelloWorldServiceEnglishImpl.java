package io.migenjutsu.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("english")
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}

// @Component
// @Profile("english")
// @Override
// public String getGreeting() {
//     return "Hello World";
// }