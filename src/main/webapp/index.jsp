<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="cl.ulagos.electivojee.industriaautomotriz.boundary.*" %>
<%@ page import="cl.ulagos.electivojee.industriaautomotriz.entity.*" %>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manufactura de Automovil</title>
</head>
<body>
	<%  try{
		
		ManufacturaAutomovil manufacturaAutomovil;
		javax.naming.InitialContext ctx = new javax.naming.InitialContext(); 
		manufacturaAutomovil = (ManufacturaAutomovil) ctx.lookup("java:app/electivojee/ManufacturaAutomovil");
		Especificacion especificacion = new Especificacion(Color.BLANCO, TipoMotor.DIESEL);
		manufacturaAutomovil.manufacturaAutomovil(especificacion);
		manufacturaAutomovil.obtenerAutomoviles();
		
		//manufacturaAutomovil.inicializar();
	}catch (Exception e) {
		System.out.println("Problema:"+ e);
	} %>
</body>
</html>