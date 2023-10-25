package repositories;

import model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addProduct(Product product){
        String query = "insert into product values(null, ?, ?)";
        jdbcTemplate.update(query, product.getName(), product.getPrice());
    }
}
