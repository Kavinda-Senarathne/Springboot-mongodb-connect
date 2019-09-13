package hu.learnerbot.springboot.repository;

import hu.learnerbot.springboot.domain.Size;
import hu.learnerbot.springboot.domain.Stuff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface StuffRepository extends MongoRepository<Stuff, String>
{
    @Query(value = "{'name' : ?0}")
    Stuff findByName(String name);

    @Query(value = "{'size' : ?0}")
    List<Stuff> findBySize(Size size);
}
