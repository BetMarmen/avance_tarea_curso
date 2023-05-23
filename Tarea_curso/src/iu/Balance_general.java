package iu;
import java.util.ArrayList;

import dol.cuenta;
import misc.controlador;

public class Balance_general {
ArrayList <cuenta> a=new ArrayList <cuenta> ();
private cuenta datos() {
	cuenta c = new cuenta();
	System.out.println("Ingrese el tipo de cuenta que desee ingresar");
	c.setTipo(controlador.texto().toLowerCase());
	System.out.println("Ingrese el nombre de la cuenta");
	c.setNombre(controlador.texto().toLowerCase());
	System.out.println("Ingrese el valor de dicha cuenta");
	c.setValor(controlador.decimales());
	if(c.getTipo()!="pasivo" | c.getTipo()!="activo")c.setTipo("activo");
	return c;
}
public void menu() {
	int opc=1;
	while(opc!=5) 
	{
		
		opciones();
		opc=controlador.entero();
		switch(opc) {
		case 1:
			a.add(datos());
			break;
		case 2:
			editar();
			break;
		case 3:
			eliminar();
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
		}
		
	}
}
public void editar() {
	System.out.println("¿Que numero de  cuenta desea editar?");
	int n1=controlador.entero();
	if(n1<a.size()) 
		a.set(n1, datos());
}
public void eliminar() {
	System.out.println("¿Que numero de  cuenta desea eliminar?");
	int n1=controlador.entero();
	if(n1<a.size()) a.remove(n1);
	}
public void opciones() {
	System.out.println("1-Agregar cuenta /n 2- Editar cuenta /n 3- Eliminar cuenta /n 4- Realizar /n 5- Salir");
	System.out.println("Ingrese la opcion a realizar:");
	
}
public void realizar() {
	System.out.println("");
}
}
