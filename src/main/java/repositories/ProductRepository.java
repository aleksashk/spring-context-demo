package repositories;

import model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addProduct(Product product) {
        String query = "insert into product values(null, ?, ?)";
        jdbcTemplate.update(query, product.getName(), product.getPrice());
    }

    public List<Product> getProducts() {
        String sql = "select * from product";
        return jdbcTemplate.query(sql, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet resultSet, int i) throws SQLException {
                Product p = new Product();
                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setPrice(resultSet.getDouble("price"));

                return p;
            }
        });
    }
}
