package figuras_geometricas;

public class Esferazonas {

	public static void main(String[] args) {
		
		float h,r,R;
		double Areazonaesferica,AreaCesferico,Volumenzonaesferica,Volumencesferico;
		
		r=2;
		h=6;
		R=8;
		
		Areazonaesferica=2*Math.PI*(R*h);
		Volumenzonaesferica=(Math.PI*h)*(Math.pow(h, 2)+(3*Math.pow(R, 2)+(3*Math.pow(r, 2))));
		AreaCesferico=(2*Math.PI)*(R*h);
		Volumencesferico=((Math.PI*Math.pow(h, 2))*(3*r-h))/3;
		
		System.out.println("Datos de la Zona Esferica");
		System.out.println("EL Radio menor de  la Esfera es: "+r);
		System.out.println("El Radio mayor de la Esfera es: "+R);
		System.out.println("La altura de la Esfera es: "+h);
		System.out.println("El Area de la Zona Esferica es:"+ String.format("%.2f",Areazonaesferica ));
		System.out.println("El Volumen de la Zona Esferica es: "+String.format("%.2f",Volumenzonaesferica ));
		System.out.println("El Area del Casquere Esferico es: "+String.format("%.2f",AreaCesferico ));
		System.out.println("El Volumen del Casquete esferico es: "+String.format("%.2f",Volumencesferico ));
		
		}

}
