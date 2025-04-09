package oops_concept;

public class OverLoading {
	public static void quadrilatral( int a) {
		System.out.println(a);
	}
	public static void quadrilatral(int a, float b) {
		System.out.println(a + "," +b);
	}
	public static void main(String[] args) {
		quadrilatral(10, '#');
		quadrilatral(13);
	}
}
