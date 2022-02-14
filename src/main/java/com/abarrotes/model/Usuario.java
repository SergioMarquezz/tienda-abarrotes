package com.abarrotes.model;

import java.util.List;


public class Usuario {

  /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 4)
    private Integer id;

    @Column(length = 2, nullable = false)
    private Integer edad;

    @Column(length = 1, nullable = false)
    private Integer usuarioActivo;

    @Column(name = "nombre", length = 50, nullable = false)
    private String usuarioNombre;

    @Column(name = "apellidopaterno", length = 50, nullable = false)
    private String usuarioPaterno;

    @Column(name = "apellidomaterno", length = 50, nullable = false)
    private String usuarioMaterno;

    @Column(length = 10, unique = true, nullable = false)
    private String login;

    @Column(length = 50, nullable = false)
    private String calle;

    @Column(name = "cp", length = 4)
    private String codigoPostal;

    @Column(length = 10, unique = true, nullable = false)
    private String telefono;

    @Column(name = "contrasenia", length = 100, nullable = false)
    private String password;

    @Column(length = 3, nullable = false)
    private String numero;

    @Column(length = 1, nullable = false)
    private char genero;

    @OneToMany(mappedBy = "usuario")
    private List<Producto> productos;

    @ManyToOne
    private DireccionColonia direccionColonia;

    @ManyToOne
    private DireccionEstado direccionEstado;

    @ManyToOne
    private DireccionPais direccionPais;

    @ManyToOne
    private DireccionMunicipio direccionMunicipio;

    @ManyToOne
    private UsuarioTipo usuarioTipo;

    @OneToMany(mappedBy = "usuario")
    private List<Venta> venta;

    @OneToMany(mappedBy = "usuario")
    private List<Compra> compra;

    public Usuario(){}

    public Usuario(Integer id, Integer edad, Integer usuarioActivo, String usuarioNombre, String usuarioPaterno, String usuarioMaterno, String login, String calle, String codigoPostal, String telefono, String password, String numero, char genero, DireccionColonia direccionColonia, DireccionEstado direccionEstado, DireccionPais direccionPais, DireccionMunicipio direccionMunicipio, UsuarioTipo usuarioTipo) {
        super();
        this.id = id;
        this.edad = edad;
        this.usuarioActivo = usuarioActivo;
        this.usuarioNombre = usuarioNombre;
        this.usuarioPaterno = usuarioPaterno;
        this.usuarioMaterno = usuarioMaterno;
        this.login = login;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.password = password;
        this.numero = numero;
        this.genero = genero;
        this.direccionColonia = direccionColonia;
        this.direccionEstado = direccionEstado;
        this.direccionPais = direccionPais;
        this.direccionMunicipio = direccionMunicipio;
        this.usuarioTipo = usuarioTipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(Integer usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioPaterno() {
        return usuarioPaterno;
    }

    public void setUsuarioPaterno(String usuarioPaterno) {
        this.usuarioPaterno = usuarioPaterno;
    }

    public String getUsuarioMaterno() {
        return usuarioMaterno;
    }

    public void setUsuarioMaterno(String usuarioMaterno) {
        this.usuarioMaterno = usuarioMaterno;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public DireccionColonia getDireccionColonia() {
        return direccionColonia;
    }

    public void setDireccionColonia(DireccionColonia direccionColonia) {
        this.direccionColonia = direccionColonia;
    }

    public DireccionEstado getDireccionEstado() {
        return direccionEstado;
    }

    public void setDireccionEstado(DireccionEstado direccionEstado) {
        this.direccionEstado = direccionEstado;
    }

    public DireccionPais getDireccionPais() {
        return direccionPais;
    }

    public void setDireccionPais(DireccionPais direccionPais) {
        this.direccionPais = direccionPais;
    }

    public DireccionMunicipio getDireccionMunicipio() {
        return direccionMunicipio;
    }

    public void setDireccionMunicipio(DireccionMunicipio direccionMunicipio) {
        this.direccionMunicipio = direccionMunicipio;
    }

    public UsuarioTipo getUsuarioTipo() {
        return usuarioTipo;
    }

    public void setUsuarioTipo(UsuarioTipo usuarioTipo) {
        this.usuarioTipo = usuarioTipo;
    }

    public List<Venta> getVenta() {
        return venta;
    }

    public void setVenta(List<Venta> venta) {
        this.venta = venta;
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", edad=" + edad +
                ", usuarioActivo=" + usuarioActivo +
                ", usuarioNombre='" + usuarioNombre + '\'' +
                ", usuarioPaterno='" + usuarioPaterno + '\'' +
                ", usuarioMaterno='" + usuarioMaterno + '\'' +
                ", login='" + login + '\'' +
                ", calle='" + calle + '\'' +
                ", telefono='" + telefono + '\'' +
                ", password='" + password + '\'' +
                ", numero='" + numero + '\'' +
                ", genero=" + genero +
                ", productos=" + productos +
                ", direccionColonia=" + direccionColonia +
                ", direccionEstado=" + direccionEstado +
                ", direccionPais=" + direccionPais +
                ", direccionMunicipio=" + direccionMunicipio +
                ", usuarioTipo=" + usuarioTipo +
                ", venta=" + venta +
                ", compra=" + compra +
                '}';
    }*/
}
