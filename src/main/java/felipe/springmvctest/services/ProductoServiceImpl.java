package felipe.springmvctest.services;

import felipe.springmvctest.dominio.Producto;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    private Map<Integer,Producto> products;

    public ProductoServiceImpl() {
        loadProducts();
    }
    @Override
    public List<Producto> listaProductos() {
        return new ArrayList<>(products.values());
    }
    private void loadProducts(){
        products = new HashMap<>();

        Producto product1 = new Producto();
        product1.setId(1);
        product1.setDescripcion("Product 1");
        product1.setPrecio(new BigDecimal("12.99"));
        product1.setImageUrl("http://example.com/product1");

        products.put(1, product1);

        Producto product2 = new Producto();
        product2.setId(2);
        product2.setDescripcion("Product 2");
        product2.setPrecio(new BigDecimal("14.99"));
        product2.setImageUrl("http://example.com/product2");

        products.put(2, product2);

        Producto product3 = new Producto();
        product3.setId(3);
        product3.setDescripcion("Product 3");
        product3.setPrecio(new BigDecimal("34.99"));
        product3.setImageUrl("http://example.com/product3");

        products.put(3, product3);

        Producto product4 = new Producto();
        product4.setId(4);
        product4.setDescripcion("Product 4");
        product4.setPrecio(new BigDecimal("44.99"));
        product4.setImageUrl("http://example.com/product4");

        products.put(4, product4);

        Producto product5 = new Producto();
        product5.setId(5);
        product5.setDescripcion("Product 2");
        product5.setPrecio(new BigDecimal("25.99"));
        product5.setImageUrl("http://example.com/product5");

        products.put(5, product5);
    }
}
