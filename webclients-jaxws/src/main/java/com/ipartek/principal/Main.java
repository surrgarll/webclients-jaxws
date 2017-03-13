package com.ipartek.principal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.formacion.Pelicula;
import com.ipartek.formacion.PeliculaColeccion;
import com.ipartek.formacion.PeliculaMensaje;
import com.ipartek.formacion.PeliculasServiceWSImp;
import com.ipartek.formacion.Peliculasservice;

public class Main {

	public static void main(String[] args) {
		
		Peliculasservice cliente=new Peliculasservice();
		PeliculasServiceWSImp clientesoap=cliente.getPeliculasServiceWSImpPort();
		
		//engancharemos los datos de validación:
		
		//1º capturo el contexto de la peticion
		Map<String,Object> requestContext=((BindingProvider)clientesoap).getRequestContext();
		
		//me genero la estructura necesaria para enviar los datos
		Map<String,List<String>> requestHeaders=new HashMap<String,List<String>>();
		requestHeaders.put("sessionId", Collections.singletonList("ipsession"));
		requestHeaders.put("usuario", Collections.singletonList("uprueba"));
		requestHeaders.put("password", Collections.singletonList("pssprueba"));
	
		
		//introduzco los datos en el encabezado de la petición
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
		
		PeliculaMensaje respuesta=clientesoap.obtenerporidPeli(1);
		if(respuesta.getPelicula()==null){
			System.out.println(respuesta.getMensaje());
		} else {
			Pelicula pelicula=respuesta.getPelicula();
			System.out.println(pelicula.getTitulo());
		}
		
		PeliculaColeccion respuesta2=clientesoap.obtenerTodosPeli();
		if(respuesta2.getPeliculas()==null)
		{
			System.out.println(respuesta2.getMensaje());
		}else{
			int len=respuesta2.getPeliculas().size();
			List<Pelicula> pelis=respuesta2.getPeliculas();

			for(int i=0;i<len;i++){
				System.out.println(String.valueOf(pelis.get(i).getCodigo())+" "+pelis.get(i).getTitulo()+" "+pelis.get(i).getFestreno()+" "+pelis.get(i).getGenero().getNombre());
			
		}
		}

		
	}

}
