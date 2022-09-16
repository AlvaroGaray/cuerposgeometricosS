package figuras_geometricas;

public class Octaedro {

	public static void main(String[] args) {
		
		double Area,aristas,caras , vertices, Volumen;
		
		caras=8;
		vertices=6;
		
		aristas=caras+vertices;
		Area=2*Math.pow(aristas, 2)*Math.sqrt(3);
		Volumen=Math.sqrt(2)*Math.pow(aristas, 2)/3;
		
		System.out.println("El Octaedro tiene "+ caras +" caras");
		System.out.println("El Octaedro tiene "+ vertices+ " Vertices");
		System.out.println("El Octaedro tiene "+ (aristas-2)+ " Aristas");
		System.out.println("El Area del Octaedro es de: "+String.format("%.2f",Area));
		System.out.println("El Volumen del Octaedro es de: "+String.format("%.2f",Volumen));
	}

}
