package com.abarrotes.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.util.Iterator;
import java.util.Map;

public abstract class OracleDataSource {

    private DataSource dataSource;

    @Autowired
    private void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.initSimpleJdbcCall(this.dataSource);
    }

    protected abstract void initSimpleJdbcCall(DataSource dataSource);

    public void simpleJdbcCall(Map<String, Object> params, String callSp){

        Iterator<String> keyIterator = params.keySet().iterator();
        System.out.println("SP primero"+callSp);

        while (keyIterator.hasNext()){
           String key = keyIterator.next();
            System.out.println("Clave "+ key);
        }
    }
}
