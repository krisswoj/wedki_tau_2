package pl.krzysiek.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.krzysiek.domain.Rods;

import java.util.ArrayList;

@Repository
public interface IListRepository extends CrudRepository<Rods, Integer> {

    Rods findById(int rod_id);
    void deleteById(int rod_id);
}
