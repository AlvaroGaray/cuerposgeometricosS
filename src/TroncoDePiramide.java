package figuras_geometricas;

public class TroncoDePiramide{

	public static void main(String[] args) {
		
		//Nombre de variables
		float r,R,h;
		double areaLateral,Volumen,areaTotal,g,Areabasemayor,Areabasemenor;
		
		//Datos de entrada
		r=2;
		R=2;
		h=4;
		
		//Procesamiento
		Areabasemayor=Math.PI*Math.pow(R,2);
		Areabasemenor=Math.PI*Math.pow(r,2);
		g=Math.sqrt((Math.pow(h,2)+(Math.pow(r,2))));
		areaLateral= Math.PI*g*(R+r);
		areaTotal=areaLateral+Areabasemayor+Areabasemenor;
		Volumen=(Math.PI*h*(Math.pow(R,2)+Math.pow(r,2)+R*r)/3);
		
		
		
		System.out.println("Datos del tronco de cono");
		System.out.println("1.Area lateral: "+String.format("%.2f",areaLateral));
		System.out.println("2.Area Total: "+String.format("%.2f",areaTotal));
		System.out.println("3.Volumen: "+String.format("%.2f",Volumen));
		System.out.println("4.Generatriz: "+String.format("%.2f",g));
	}

}