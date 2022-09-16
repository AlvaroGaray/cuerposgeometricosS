package figuras_geometricas;

public class Piramide {

	public static void main(String[] args) {
		
		double AreaLateral, Perimetrobase,h ,l,apotema, AreaTotal, Volumen, Areabase;
		//Datos de entrada	
		h=13;
		l=5;
		
		
		apotema=l/2;
		Perimetrobase=4*l;
		AreaLateral=(Perimetrobase*apotema)/2;
		Areabase=l*l;
		AreaTotal=AreaLateral+Areabase;
		Volumen=(Areabase*h)/3;
		
		//Datos de salida
		
		System.out.println("La Altura de la Piramide es: "+h);
		System.out.println("La Longitud de los lados de la base es: "+l);
		System.out.println("El Apotema de la Piramide es: "+apotema);
		System.out.println("El Perimetro base de la Piramide es: "+String.format("%.2f",Perimetrobase));
		System.out.println("El Area lateral de la Piramide es. "+String.format("%.2f",AreaLateral));
		System.out.println("El Area Base de la Piramide es: "+ String.format("%.2f",Areabase));
		System.out.println("El AreaTotal de la Piramide es: "+String.format("%.2f",AreaTotal));
		System.out.println("El Volumen de la Piramide es :"+String.format("%.2f",Volumen));
	}

}
