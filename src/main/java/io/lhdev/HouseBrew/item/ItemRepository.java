package io.lhdev.HouseBrew.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository
        extends JpaRepository<Item, Long>{

    @Query("SELECT n FROM Item n WHERE n.name = ?1")
    Optional<Item> findItemByName(String name);
}
