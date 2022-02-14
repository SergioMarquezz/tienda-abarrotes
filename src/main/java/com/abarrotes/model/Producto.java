package com.abarrotes.model;


import java.util.List;


public class Producto {

  /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 4)
    private Integer id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private ProductoPrecio productoPrecio;

    @ManyToOne
    private ProductoCategoria productoCategoria;

    @OneToOne(mappedBy = "producto")
    private ProductoVencimiento productoVencimiento;

    @OneToOne(mappedBy = "producto")
    private ProductoStock productoStock;

    @OneToMany(mappedBy = "producto")
    private List<VentaDetalle> ventaDetalle;


    @Column(unique = true, nullable = false, name = "producto", length = 50)
    private String nombreProducto;

    @Column(length = 100, nullable = false)
    private String descripcion;

    @Column(unique = true, length = 15)
    private String imagen;

    @Column(unique = true, length = 50, nullable = false)
    private String codigo;

    public Producto() {
    }

    public Producto(Integer id, Usuario usuario, ProductoPrecio productoPrecio, ProductoCategoria productoCategoria, ProductoVencimiento productoVencimiento, ProductoStock productoStock, String nombreProducto, String descripcion, String imagen, String codigo) {
        super();
        this.id = id;
        this.usuario = usuario;
        this.productoPrecio = productoPrecio;
        this.productoCategoria = productoCategoria;
        this.productoVencimiento = productoVencimiento;
        this.productoStock = productoStock;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.codigo = codigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ProductoPrecio getProductoPrecio() {
        return productoPrecio;
    }

    public void setProductoPrecio(ProductoPrecio productoPrecio) {
        this.productoPrecio = productoPrecio;
    }

    public ProductoCategoria getProductoCategoria() {
        return productoCategoria;
    }

    public void setProductoCategoria(ProductoCategoria productoCategoria) {
        this.productoCategoria = productoCategoria;
    }

    public ProductoVencimiento getProductoVencimiento() {
        return productoVencimiento;
    }

    public void setProductoVencimiento(ProductoVencimiento productoVencimiento) {
        this.productoVencimiento = productoVencimiento;
    }

    public ProductoStock getProductoStock() {
        return productoStock;
    }

    public void setProductoStock(ProductoStock productoStock) {
        this.productoStock = productoStock;
    }

    public List<VentaDetalle> getVentaDetalle() {
        return ventaDetalle;
    }

    public void setVentaDetalle(List<VentaDetalle> ventaDetalle) {
        this.ventaDetalle = ventaDetalle;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", productoPrecio=" + productoPrecio +
                ", productoCategoria=" + productoCategoria +
                ", productoVencimiento=" + productoVencimiento +
                ", productoStock=" + productoStock +
                ", ventaDetalle=" + ventaDetalle +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }*/
}
