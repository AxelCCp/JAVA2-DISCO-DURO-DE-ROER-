package A2_Respuestas;

public class a0 {
	//public static void main(String[]args) {
		
		int func2(int w) {
			  return w * 3;
			}

			int func1 (int a, int b) {
			  int n = a + b;
			  return 2 + func2(n);
			}

			int start() {
			  int z = 4;
			  return func1(z, 1) - 3;
			}
}
