import java.util.Arrays;

import Jama.*;
public class Test {
	
	
	
	
	public static void main(String[] args){
		double[][]  T=new double[5][5];
		double[][]  H={{13.6013},{13.6013},{13.6013},{13.6015},{13.6018}};
		double[][]  A=new double[5][1];
		double[][]  l=new double[6][1];
		double[][]  w=new double[5][1];
		double[][]  T2=new double[6][5];
		double[][]  H2=new double[6][1];
		double[][]  Bt=new double[5][6];
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++){
				T[i][j]=Math.pow(i+1, j);
			}
		T=new Matrix(T).inverse().getArray();
		System.out.println("T逆");
		for (double[] ds : T) {
			System.out.println(Arrays.toString(ds));
		}
		System.out.println("H");
		for (double[] ds : H) {
			System.out.println(Arrays.toString(ds));
		}
		A=new Matrix(T).times(new Matrix(H)).getArray();
		System.out.println("A");
		for (double[] ds : A) {
			System.out.println(Arrays.toString(ds));
		}
		for(int i=0;i<6;i++)
			for(int j=0;j<5;j++){
				T2[i][j]=Math.pow(i+1, j);
			}
		for(int i=0;i<5;i++)
			{
			
			H2[i][0]=H[i][0];
				
			}
			H2[5][0]=13.6022;
		l=new Matrix(T2).times(new Matrix(A)).minus(new Matrix(H2)).getArray();
		System.out.println("l");
		for (double[] ds : l) {
			System.out.println(Arrays.toString(ds) );
		}
		for(int i=0;i<5;i++)
			for(int j=0;j<6;j++)
			{
				Bt[i][j]=Math.pow(j+1, i);
			}
		w=new Matrix(Bt).times(new Matrix(l)).getArray();
		System.out.println("Bt");
		for (double[] ds : Bt) {
			System.out.println(Arrays.toString(ds));
		}
		System.out.println("w");
		for (double[] ds : w) {
			System.out.println(Arrays.toString(ds));
		}
		
		
		
		
		
	}

}
