package lap2;

public class lap202 {

	public static void main(String[] args) {
		final int SIZE = 5;
		int [][]grid = new int [SIZE][SIZE];
		for(int i=0; i<SIZE;i++) {
			for(int j=0; j<SIZE; j++) {
				grid[i][j] = i*SIZE+j+1;
				System.out.print(grid[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int j=0; j<SIZE; j++) {
			for(int i=0; i<SIZE; i++) {
				System.out.print(grid[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<SIZE;i++) {
			if(i%2==0) {
			for(int j=0; j<SIZE; j++) {
				System.out.print(grid[i][j]+"\t");
			}
			}
			else {
				for(int j=SIZE-1; j>=0; j--) {
					System.out.print(grid[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
}