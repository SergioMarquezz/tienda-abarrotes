package com.abarrotes.model;


import java.util.Date;

public class Venta {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 4)
    private Integer id;

    @Column(name = "fechaventa", nullable = false)
    private Date fechaVenta;

    @Column(name = "formapago", length = 11)
    private String formaPago;

    @Column(name = "importetotal", length = 8, nullable = false)
    private double total;

    @Column(name = "numero", length = 10, nullable = false)
    private String numeroVenta;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "venta")
    private VentaDetalle ventaDetalle;

    public Venta(){}

    public Venta(Integer id, Date fechaVenta, String formaPago, double total, String numeroVenta, Usuario usuario, VentaDetalle ventaDetalle) {
        super();
        this.id = id;
        this.fechaVenta = fechaVenta;
        this.formaPago = formaPago;
        this.total = total;
        this.numeroVenta = numeroVenta;
        this.usuario = usuario;
        this.ventaDetalle = ventaDetalle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public VentaDetalle getVentaDetalle() {
        return ventaDetalle;
    }

    public void setVentaDetalle(VentaDetalle ventaDetalle) {
        this.ventaDetalle = ventaDetalle;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", fechaVenta=" + fechaVenta +
                ", formaPago='" + formaPago + '\'' +
                ", total=" + total +
                ", numeroVenta='" + numeroVenta + '\'' +
                ", usuario=" + usuario +
                ", ventaDetalle=" + ventaDetalle +
                '}';
    }*/
}
