package com.abarrotes.repository;

import com.abarrotes.model.direccion.DireccionColonia;
import com.abarrotes.model.direccion.DireccionEstado;
import com.abarrotes.model.direccion.DireccionMunicipio;
import com.abarrotes.model.direccion.DireccionPais;
import com.abarrotes.model.ProductoCategoria;
import com.abarrotes.utils.Constantes;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DaoJdbcCall extends OracleDataSource{

    private SimpleJdbcCall spCategoriasGuardar,spListaCategorias,spListaPaises,spGuardarPais,spEstadosGuardar,spListarEstadosPais;
    private SimpleJdbcCall spGuardarMunicipio, spListaMunicipiosEstados, spColoniaGuardar, spListaColoniaMunicipio;

    @Override
    protected void initSimpleJdbcCall(DataSource dataSource) {

        spCategoriasGuardar = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_CATEGORIAS)
                .withProcedureName(Constantes.SP_GUARDAR_CATEGORIA)
                .declareParameters(
                        new SqlOutParameter(Constantes.PA_OUT_CODIGO_SAVE, Types.INTEGER),
                        new SqlOutParameter(Constantes.PA_OUT_MENSAJE_SAVE, Types.VARCHAR));

        spListaCategorias = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_CATEGORIAS)
                .withProcedureName(Constantes.SP_LISTA_CATEGORIAS)
                .returningResultSet(Constantes.CATEGORIAS_CURSOR, BeanPropertyRowMapper.newInstance(ProductoCategoria.class));

        spListaPaises = new SimpleJdbcCall(dataSource)
                .withCatalogName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_PAISES)
                .withProcedureName(Constantes.SP_LISTA_PAISES)
                .returningResultSet(Constantes.PAISES_CURSOR, BeanPropertyRowMapper.newInstance(DireccionPais.class));

        spGuardarPais = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_PAISES)
                .withProcedureName(Constantes.SP_GUARDAR_PAISES)
                .declareParameters(
                        new SqlOutParameter(Constantes.PA_OUT_CODIGO_SAVE, Types.INTEGER),
                        new SqlOutParameter(Constantes.PA_OUT_MENSAJE_SAVE, Types.VARCHAR));

        spEstadosGuardar = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_ESTADOS)
                .withProcedureName(Constantes.SP_GUARDAR_ESTADOS)
                .declareParameters(
                        new SqlOutParameter(Constantes.PA_OUT_CODIGO_SAVE, Types.INTEGER),
                        new SqlOutParameter(Constantes.PA_OUT_MENSAJE_SAVE, Types.VARCHAR));

        spListarEstadosPais = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_ESTADOS)
                .withProcedureName(Constantes.SP_LISTA_ESTADOS_PAIS)
                .returningResultSet(Constantes.ESTADOS_PAIS_CURSOR, BeanPropertyRowMapper.newInstance(DireccionEstado.class));

        spGuardarMunicipio = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_MUNICIPIOS)
                .withProcedureName(Constantes.SP_GUARDAR_MUNICIPIOS)
                .declareParameters(
                        new SqlOutParameter(Constantes.PA_OUT_CODIGO_SAVE, Types.INTEGER),
                        new SqlOutParameter(Constantes.PA_OUT_MENSAJE_SAVE, Types.VARCHAR));

        spListaMunicipiosEstados = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_MUNICIPIOS)
                .withProcedureName(Constantes.SP_LISTA_MUNICIPIOS_ESTADO)
                .returningResultSet(Constantes.MUNICIPIOS_ESTADO_CURSOR, BeanPropertyRowMapper.newInstance(DireccionMunicipio.class));

        spColoniaGuardar = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_COLONIAS)
                .withProcedureName(Constantes.SP_GUARDAR_COLONIA)
                .declareParameters(
                        new SqlOutParameter(Constantes.PA_OUT_CODIGO_SAVE, Types.INTEGER),
                        new SqlOutParameter(Constantes.PA_OUT_MENSAJE_SAVE, Types.VARCHAR));

        spListaColoniaMunicipio = new SimpleJdbcCall(dataSource)
                .withSchemaName(Constantes.SCHEMA_BD)
                .withCatalogName(Constantes.PAQUETE_COLONIAS)
                .withProcedureName(Constantes.SP_LISTA_COLONIA_MUNICIPIO)
                .returningResultSet(Constantes.COLONIAS_MUNICIPIO_CURSOR, BeanPropertyRowMapper.newInstance(DireccionColonia.class));

    }

    public void guardarMunicipio(DireccionMunicipio municipio){
        Map<String,Object> params = new HashMap<>();
        params.put("NAME_MUNICIPIO", municipio.getMunicipio());
        params.put("ESTADO_ID", municipio.getEstado().getIdEstado());
        paramsEntrada(params, spGuardarMunicipio);
    }

    public void categoriaGuardar(ProductoCategoria categoria){

        Map<String, Object> inParam = new HashMap<>();
        inParam.put("nameCategoria",categoria.getCategoria());
        paramsEntrada(inParam, spCategoriasGuardar);
    }

    public List<ProductoCategoria> listarCategorias(){
        return (List<ProductoCategoria>) listarInfo(spListaCategorias,Constantes.CATEGORIAS_CURSOR);
    }

    public List<DireccionPais> listarPaises(){
        return (List<DireccionPais>) listarInfo(spListaPaises,Constantes.PAISES_CURSOR);
    }

    public void paisesGuardar(DireccionPais pais){
        Map<String, Object> inParam = new HashMap<>();
        inParam.put("NAME_PAIS",pais.getPais());
        inParam.put("ABREVIADO",pais.getAbreviatura());
        paramsEntrada(inParam, spGuardarPais);

    }

    public void guardarColonia(DireccionColonia colonia){
        Map<String, Object> inParam = new HashMap<>();
        inParam.put("NAME_COLONIA",colonia.getColonia());
        inParam.put("MUNICIPIO_ID",colonia.getMunicipio().getIdMunicipio());
        paramsEntrada(inParam, spColoniaGuardar);
    }

    public void guardarEstado(DireccionEstado estado){
        Map<String, Object> inParam = new HashMap<>();
        inParam.put("NAME_ESTADO",estado.getEstado());
        inParam.put("ID_PAIS",estado.getPais().getIdPais());
        paramsEntrada(inParam, spEstadosGuardar);
    }

    public List<DireccionColonia> listaColoniasByMunicipio(Integer idMunicipio){
        Map<String, Object> params = new HashMap<>();
        params.put("ID_MUNICIPIO",idMunicipio);

        return (List<DireccionColonia>) listarWithParamInfo(params, spListaColoniaMunicipio,Constantes.COLONIAS_MUNICIPIO_CURSOR);
    }

    public List<DireccionMunicipio> municipiosByEstadoLista(Integer estadoId){
        Map<String, Object> params = new HashMap<>();
        params.put("ID_ESTADO",estadoId);

        return (List<DireccionMunicipio>) listarWithParamInfo(params, spListaMunicipiosEstados, Constantes.MUNICIPIOS_ESTADO_CURSOR);
    }

    public List<DireccionEstado> estadosByPaisLista(Integer idPais){
        Map<String, Object> inParam = new HashMap<>();
        inParam.put("PAIS_ID",idPais);

        return (List<DireccionEstado>) listarWithParamInfo(inParam, spListarEstadosPais,Constantes.ESTADOS_PAIS_CURSOR);
    }

    private List<?> listarInfo(SimpleJdbcCall sp, String cursor){

        Map<String,Object> salida = sp.execute(new HashMap<>(0));
        System.out.println("CODIGO BD2 "+salida.get(Constantes.PA_OUT_CODIGO_CONSULTA));
        System.out.println("MSJ BD2 "+salida.get(Constantes.PA_OUT_MENSAJE_CONSULTA));

        return (List<?>) salida.get(cursor);
    }

    private List<?> listarWithParamInfo(Map<String, Object> params, SimpleJdbcCall sp, String cursor){
        MapSqlParameterSource entrada = new MapSqlParameterSource();
        entrada.addValues(params);
        simpleJdbcCall(entrada.getValues(), sp.getCallString());
        Map<String,Object> salida = sp.execute(entrada);
        simpleJdbcCall(salida, sp.getCallString());

        System.out.println("CODIGO BD2 "+salida.get(Constantes.PA_OUT_CODIGO_CONSULTA));
        System.out.println("MSJ BD2 "+salida.get(Constantes.PA_OUT_MENSAJE_CONSULTA));

        return (List<?>) salida.get(cursor);

    }

    private void paramsEntrada(Map<String, Object> params, SimpleJdbcCall sp) {
        MapSqlParameterSource entrada = new MapSqlParameterSource();
        entrada.addValues(params);
        simpleJdbcCall(entrada.getValues(), sp.getCallString());
        Map<String,Object> salida = sp.execute(entrada);

        simpleJdbcCall(salida, sp.getCallString());
        System.out.println("Codigo"+salida.get(Constantes.PA_OUT_CODIGO_SAVE));
        System.out.println("mensaje"+salida.get(Constantes.PA_OUT_MENSAJE_SAVE));
    }


}
