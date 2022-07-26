package com.springframework.pets;

import org.springframework.context.annotation.Bean;

public class PetServiceFactory {

    @Bean
    public PetService getPetService(String type) {
        switch (type) {
            case "dog": return new DogPetService();
            case "cat": return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
