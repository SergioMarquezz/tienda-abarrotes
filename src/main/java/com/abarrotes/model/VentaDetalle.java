package com.abarrotes.model;


public class VentaDetalle {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 4)
    private Integer id;
    @Column(name = "cantidad", length = 4, nullable = false)
    private Integer vDetalleCantidadProducto;

    @Column(name = "nombre", length = 50, nullable = false)
    private String vDetalleNombreProducto;

    @Column(name = "precio", length = 10, nullable = false)
    private double vDetallePrecioProducto;

    @Column(name = "total", length = 8, nullable = false)
    private double vDetallePrecioTotal;

    @OneToOne
    private Venta venta;

    @ManyToOne
    private Producto producto;

    public VentaDetalle(){}

    public VentaDetalle(Integer id, Integer vDetalleCantidadProducto, String vDetalleNombreProducto, double vDetallePrecioProducto, double vDetallePrecioTotal, Venta venta, Producto producto) {
        super();
        this.id = id;
        this.vDetalleCantidadProducto = vDetalleCantidadProducto;
        this.vDetalleNombreProducto = vDetalleNombreProducto;
        this.vDetallePrecioProducto = vDetallePrecioProducto;
        this.vDetallePrecioTotal = vDetallePrecioTotal;
        this.venta = venta;
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getvDetalleCantidadProducto() {
        return vDetalleCantidadProducto;
    }

    public void setvDetalleCantidadProducto(Integer vDetalleCantidadProducto) {
        this.vDetalleCantidadProducto = vDetalleCantidadProducto;
    }

    public String getvDetalleNombreProducto() {
        return vDetalleNombreProducto;
    }

    public void setvDetalleNombreProducto(String vDetalleNombreProducto) {
        this.vDetalleNombreProducto = vDetalleNombreProducto;
    }

    public double getvDetallePrecioProducto() {
        return vDetallePrecioProducto;
    }

    public void setvDetallePrecioProducto(double vDetallePrecioProducto) {
        this.vDetallePrecioProducto = vDetallePrecioProducto;
    }

    public double getvDetallePrecioTotal() {
        return vDetallePrecioTotal;
    }

    public void setvDetallePrecioTotal(double vDetallePrecioTotal) {
        this.vDetallePrecioTotal = vDetallePrecioTotal;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "VentaDetalle{" +
                "id=" + id +
                ", vDetalleCantidadProducto=" + vDetalleCantidadProducto +
                ", vDetalleNombreProducto='" + vDetalleNombreProducto + '\'' +
                ", vDetallePrecioProducto=" + vDetallePrecioProducto +
                ", vDetallePrecioTotal=" + vDetallePrecioTotal +
                ", venta=" + venta +
                ", producto=" + producto +
                '}';
    }*/
}
