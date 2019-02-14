/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author Fox
 */
public class CountryImpl implements Country {

    private final String code;
    private final String name;
    
    public CountryImpl(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
