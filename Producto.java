/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

public class Producto {
private int codigo;
private String [][]producto;
private double [][] precio;
private int cantidad;
private int genero;
private int talla;
}
 
public Producto(int cantidad,String [][]producto,double [][] precio,int talla,int codigo,int genero ){

this.cantidad = cantidad;
this.producto= producto;
this.precio = precio;   
this.talla = talla;
this.codigo = codigo;
this.genero = genero;
}


public double calcularPrecio(){
return precio [0][0];
}

public double totalProducto(){
 return precio [0][0]*cantidad;
}

