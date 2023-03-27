package Es;

public class Array {

	public static void main(String[] args) {
		int arrayNum [] = new int [5];
		arrayNum [0]= 1;
		arrayNum [1]= 2;
		arrayNum [2]= 3;
		arrayNum [3]= 4;
		arrayNum [4]= 5;
		
//		for ( int i = 0; i <arrayNum.length; i ++) {
//			System.out.print("ARRAY INIZIALE " + arrayNum[i]);
//	    }
		
		int[] arrayNumeroDefinitivo = aggiungiNum(arrayNum, 43);
		
			for (int j =0; j<arrayNumeroDefinitivo.length; j++) {
				System.out.print(arrayNumeroDefinitivo[j] + ", ");
			}
		}
		
	
	
	public static int[] aggiungiNum (int newArrayNum[], int newNumero) {
		
	int  newArr[] = new int[newArrayNum.length+1];
	//for (int i = 0; i <newArr.length-1; i++) {
	for (int i = 0; i <newArr.length; i++) {
	if (i<5) {
		newArr[i]= newArrayNum[i];
	}else {
		newArr[i]= newArrayNum[i-1];
	}
		
	}
	return newArr;
	}

}
