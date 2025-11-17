public class gitPrac{
	public static void main(String[] args){

	}

	public void part1(int size){
		int[][] sqArr = new int[size][size];

		for(int i = 0; i < size; i++){
			for(int c = 0; c<size; c++)
				sqArr[i][c] = (int)(Math.random()*10);
		}
	}

}