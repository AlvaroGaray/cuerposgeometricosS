package figuras_geometricas;

public class Cono {

	public static void main(String[] args) {
		
		double AreaLateral, Perimetrobase,h ,r,generatriz, AreaTotal, Volumen, Areabase;
		
		r=2;
		h=8;
		
		generatriz=(Math.pow(h, 2)+(Math.pow(r, 2)));
		Perimetrobase=Math.PI *2* r;
		AreaLateral=(Perimetrobase* generatriz)/2;
		Areabase=Math.PI*(Math.pow(r, 2));
		AreaTotal=AreaLateral+Areabase;
		Volumen=(Areabase*h) /3;
		
		//Datos de Salida
		System.out.println("El radio del Cono es. "+r);
		System.out.println("La altura del cono es: "+h);
		System.out.println("El Perimetro base del cono es: "+String.format("%.2f",Perimetrobase));
		System.out.println("El Area lateral del cono es. "+String.format("%.2f",AreaLateral));
		System.out.println("El Area Base del cono es: "+ String.format("%.2f",Areabase));
		System.out.println("El AreaTotal del cono es: "+String.format("%.2f",AreaTotal));
		System.out.println("El Volumen del cono es :"+String.format("%.2f",Volumen));
	}

}
