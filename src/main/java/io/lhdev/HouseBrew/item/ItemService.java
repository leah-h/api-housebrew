package io.lhdev.HouseBrew.item;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public List<Item> getItems(){
        return List.of(
                new Item(
                        1L,
                        "Giant Steps",
                        "Coltrane’s Giant Steps, this dense and substantial coffee is not unlike the jazz visionary's " +
                                "signature sheets of sound. Our darkest blend, comprising organic coffees from Uganda," +
                                "Papua New Guinea, and Sumatra, is downright viscous in the cup. Just like Coltrane’s " +
                                "ability to cascade into high-pitched octaves with maximum control, this coffee’s " +
                                "inflections of stone fruit lighten without losing focus. Improvisations of milk or " +
                                "cream—in any proportion—shine.",
                        "https://images.unsplash.com/photo-1550681560-af9bc1cb339e?ixlib=rb-1.2.1" +
                                "&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80",
                        12,
                        10L)

        );
    }
}
