package pe.com.cibertec.Lp2_spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import pe.com.cibertec.Lp2_spring.model.entity.ProductoEntity;
import pe.com.cibertec.Lp2_spring.service.CategoriaService;
import pe.com.cibertec.Lp2_spring.service.ProductoService;

@Controller
@RequiredArgsConstructor
public class ProductoController {

	private final ProductoService productoService;
	private final CategoriaService categoriaService;
	
	@GetMapping("/")
	public String listarProductos(Model model) {
		List<ProductoEntity> listaProducto = productoService.listarProducto();
		model.addAttribute("listaprod", listaProducto);
		return "lista_producto";
	}
}
