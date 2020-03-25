package com.example.datamigo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Factura {

    private int imagen;
    private String proveedor;
    private String fecha;
    private String valorTotal;
}
