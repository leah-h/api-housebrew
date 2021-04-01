package io.lhdev.HouseBrew.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getItems(){
        return itemRepository.findAll();
    }

    public void addNewItem(Item item) {
        Optional<Item> itemOptional = itemRepository.findItemByName(item.getName());
        if (itemOptional.isPresent()){
            throw new IllegalStateException("name already exists");
        }
        itemRepository.save(item);
    }

    public void deleteItem(Long itemId) {
        boolean exists = itemRepository.existsById(itemId);
        if (!exists) {
            throw new IllegalStateException(
                    "item with id " + itemId + " does not exists"
            );
        }
        itemRepository.deleteById(itemId);
    }

    @Transactional
    public void updateItem(Long itemId,
                           String name,
                           String description,
                           String imageUrl) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new IllegalStateException(
                        "item with id " + itemId + " does not exist"
                ));

        if (name != null &&
                name.length() > 0 &&
                !Objects.equals(item.getName(), name)
        )       {
            item.setName(name);
        }

        if (description != null &&
                description.length() > 0 &&
                !Objects.equals(item.getDescription(), description)
        )      {
            item.setDescription(description);
        }

        if (imageUrl != null &&
                imageUrl.length() > 0 &&
                !Objects.equals(item.getImageUrl(), imageUrl)
        )      {
            item.setImageUrl(imageUrl);
        }


    }
}
