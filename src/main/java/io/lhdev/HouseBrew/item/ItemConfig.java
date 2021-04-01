package io.lhdev.HouseBrew.item;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ItemConfig {

    @Bean
    CommandLineRunner commandLineRunner(ItemRepository repository) {

        return args -> {
            Item giant = new Item(
                    1L,
                    "Giant Steps",
                    "Our darkest blend, comprising organic coffees " +
                            "from Uganda, Papua New Guinea, and Sumatra, is downright viscous in the cup.",
                    "https://images.unsplash.com/photo-1550681560-af9bc1cb339e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80",
                    12,
                    10.00
            );

            Item hayes = new Item(
                    2L,
                    "Hayes Valley Espresso",
                    "Lower-toned and minimally bright, Hayes Valley Espresso pulls a straight " +
                            "shot with a voluptuous tawny crema and a somewhat dangerous-looking viscosity.",
                    "https://images.unsplash.com/photo-1520516472218-ed48f8ff3271?ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80",
                    12,
                    17.50
            );

            repository.saveAll(
                    List.of(giant, hayes)
            );
        };
    }
}
