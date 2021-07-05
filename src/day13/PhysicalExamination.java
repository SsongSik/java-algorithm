package day13;

public class PhysicalExamination {

	static final int VMAX = 21;
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum+=dat[i].height;
		}
		return sum/dat.length;
	}
	
	public static void main(String[] args) {
		PhyscData[] x = {
				new PhyscData("������", 162, 0.3),
				new PhyscData("������", 173, 0.3),
				new PhyscData("������", 175, 0.3),
				new PhyscData("ȫ����", 171, 0.3),
				new PhyscData("�̼���", 168, 0.3),
				new PhyscData("�迵��", 174, 0.3),
				new PhyscData("�ڿ��", 169, 0.3)
		};
		
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i].name+"  "+x[i].height+"  "+x[i].vision);
		}
		
		System.out.println("��� Ű : "+aveHeight(x));
	}
	
}
