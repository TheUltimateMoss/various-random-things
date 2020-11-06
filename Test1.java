public class Test1{
	public static void main(String args[]) {
		for (float x=0;x<x+0.1;x=(float)(x+0.01)) {
				int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				for (int y=0;y<a.length;y++) {
				for (int w=y;w<10;w++) {
					System.out.println(a[y]);
				}
			}
		}
	}
}