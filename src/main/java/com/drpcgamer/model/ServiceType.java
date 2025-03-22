package com.drpcgamer.model;

public enum ServiceType {
    NOTEBOOK_HOME("Mantención Notebook Gamer a Domicilio", 20000),
    NOTEBOOK_WORKSHOP("Mantención Notebook Gamer en Taller", 15000),
    DESKTOP_HOME("Mantención Desktop Gamer a Domicilio", 30000),
    DESKTOP_WORKSHOP("Mantención Desktop Gamer en Taller", 25000),
    BUILD_HOME("Armado Completo PC Gamer a Domicilio", 35000),
    BUILD_WORKSHOP("Armado Completo PC Gamer en Taller", 30000),
    FORMAT_HOME("Formateo e Instalación Windows a Domicilio", 20000),
    FORMAT_WORKSHOP("Formateo e Instalación Windows en Taller", 15000);

    private final String description;
    private final int price;

    ServiceType(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
