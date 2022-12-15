package com.testing;

public class SystemConfigMain {

    public static void main(String[] args) {

        for (Object propertyKeyName:System.getProperties().keySet()){
            System.out.println(propertyKeyName+" - "+System.getProperty(propertyKeyName.toString()));
        }

    }
}
