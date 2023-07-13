package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Transport Car() {
        return new Car("bmw");
    }

    @Bean
    public Transport Bus() {
        return new Bus("scania");
    }

    @Bean
    public Transport Pickup() {
        return new Pickup("toyota");
    }

    @Bean (name = "driver1")
    public Driver Driver1() {
        return new Driver("Вася" , Car());
    }

    @Bean (name = "driver2")
    public Driver Driver2() {
        return new Driver("Петя" , Bus());
    }

    @Bean (name = "driver3")
    public Driver Driver3() {
        return new Driver("Сеня" , Pickup());
    }

}