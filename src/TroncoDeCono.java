package figuras_geometricas;

public class TroncoDeCono {
	
		public static void main(String args[]) {
	
	double Arealateral,generatriz, generatrizal2 ,AreaBasemenor,AreaBasemayor, h ,Radiomayor, Radiomenor;
	double Volumen, AreaTotal;
	AreaBasemayor=5;
	h=5;
	Radiomenor=6;
	Radiomayor=7;
	
	generatrizal2= Math.pow(h, h)+ Math.pow(Radiomenor, Radiomenor);
	generatriz=Math.sqrt(generatrizal2);
	Arealateral=(Math.PI*generatriz)*(Radiomayor+Radiomenor);
	AreaBasemenor=Math.PI *(Math.pow(Radiomenor, Radiomenor));
	AreaTotal=Arealateral+AreaBasemenor+AreaBasemayor;
	Volumen=1*(Math.PI*h)*((Math.pow(Radiomayor, Radiomayor)+(Math.pow(Radiomenor, Radiomenor)+(Radiomayor*Radiomenor))))/3;
	
	System.out.println("El Area lateral del Tronco de Cono es: "+String.format("%.2f",Arealateral));
	System.out.println("El Area Total del Tronco de Cono es: "+String.format("%.2f",AreaTotal));
	System.out.println("El Volumen del Tronco de cono es: "  + String.format("%.2f",Volumen));


	
	}
}
