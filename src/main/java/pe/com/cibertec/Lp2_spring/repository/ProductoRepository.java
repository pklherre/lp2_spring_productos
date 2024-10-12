package pe.com.cibertec.Lp2_spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.Lp2_spring.model.entity.ProductoEntity;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Integer>{

}
