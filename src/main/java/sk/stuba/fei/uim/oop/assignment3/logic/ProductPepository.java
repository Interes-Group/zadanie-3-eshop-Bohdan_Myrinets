package sk.stuba.fei.uim.oop.assignment3.logic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductPepository extends CrudRepository<Product,Long> {
    List<Product> findAll();
}