package figuras_geometricas;

public class Icosaedro {

	public static void main(String []args){
		
		double Area,aristas,caras , vertices, Volumen;
		
		caras=20;
		vertices=12;

		aristas=caras+vertices;
		Area=5*Math.pow(aristas, 2)*Math.sqrt(3);
		Volumen=5*(3+Math.sqrt(5))*Math.pow(aristas, 3)/12;
		
		System.out.println("El Icosaedro tiene "+ caras +" caras");
		System.out.println("El Icosaedro tiene "+ vertices+ " Vertices");
		System.out.println("El Icosaedro tiene "+ (aristas-2)+ " Aristas");
		System.out.println("El Area del Icosaedro es de: "+String.format("%.2f",Area));
		System.out.println("El Volumen del Icosaedro es de: "+String.format("%.2f",Volumen));
	}
}
