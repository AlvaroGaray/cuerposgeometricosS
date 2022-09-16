package figuras_geometricas;

public class Ortoedro {

	public static void main(String[] args) {
		
		double Area, Diagonal, Volumen, aristas , vertices, caras ,basemenor;
		
		caras=6;
		vertices=8; 
		basemenor=7;
		
		aristas=caras+vertices;
		Area=2*((aristas*basemenor)+(aristas*caras)+basemenor*caras);
		Diagonal=Math.sqrt(Math.pow(Area, 2)+Math.pow(basemenor, 2)+Math.pow(caras, 2));
		Volumen=aristas*basemenor*caras;
		
		System.out.println("El Ortoedro tiene "+ caras +" caras");
		System.out.println("El Ortoedro tiene "+ vertices+ " Vertices");
		System.out.println("El Ortoedro tiene "+ (aristas-2)+ " Aristas");
		System.out.println("El Area del Ortoedro es de: "+String.format("%.2f",Area));
		System.out.println("El Volumen del Ortoedro es de: "+String.format("%.2f",Volumen));
		System.out.println("La Diagonal del Ortoedro es de: "+String.format("%.2f",Diagonal));


	}

}
