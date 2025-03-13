package com.tienda.service;

import com.tienda.domain.Categoria;
import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getProducto(boolean activos);
    
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

    public Object getProducto(Producto producto);
 
}
