package figuras_geometricas;

public class Esfera {

	public static void main(String[] args) {
		
		double Area, Volumen,r;
		
		r=6;
		
		Area=(4*Math.PI)*(r*r);
		Volumen=4*(Math.PI*(r*r*r))/3;
		
		System.out.println("Datos de la Esfera");
		System.out.println("El Radio de la esfera es: "+r);
		System.out.println("El Area de la Esfera es: "+String.format("%.2f", Area));
		System.out.println("El Volumen de la Esfera es: "+String.format("%.2f",Volumen));
	}

}
