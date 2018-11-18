package felipe.springmvctest.controllers;

import felipe.springmvctest.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductoController {
    private ProductoService productoService;

    @Autowired
    public void setProductoService(ProductoService productoService) {
        this.productoService = productoService;
    }

    @RequestMapping("/products")
    public String listaProducts(Model model){
        model.addAttribute("products", productoService.listaProductos());
        return "products";
    }
}
