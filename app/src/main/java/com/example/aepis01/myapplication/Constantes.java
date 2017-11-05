package com.example.aepis01.myapplication;

/**
 * Created by AEPIS01 on 31/10/2017.
 */

public class Constantes {

    public static final int CODIGO_DETALLE = 100;

    /**
     * Transicion Detalle -> Actualizacion
     */
    public static final int CODIGO_ACTUALIZACION = 101;


    /**
     * URLs del Web Service
     */
    public static final String GET = "http://10.0.2.2:8080/py_webservices/obtener_metas.php";
    public static final String GET_BY_ID = "http://10.0.2.2:8080/py_webservices/obtener_meta_por_id.php";
    public static final String UPDATE = "http://10.0.2.2:8080/py_webservices/actualizar_meta.php";
    public static final String DELETE = "http://10.0.2.2:8080/py_webservices/borrar_meta.php";
    public static final String INSERT = "http://10.0.2.2:8080/py_webservices/insertar_meta.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";
}
