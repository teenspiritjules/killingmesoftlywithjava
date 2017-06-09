package bubbles;

public class Bubbles {

	public static void main(String[] args) {

		int height[] = new int[7];
			height[0]= 160;
			height[1]= 175;
			height[2]= 166;
			height[3]= 163;
			height[4]= 180;
			height[5]= 161;
			height[6]= 174;

		int slot = 1;
		int length = height.length;

		System.out.println("Unsorted:");
		for(int i = 0; i < length; i++) {
			System.out.println(height[i]);
		}

		for (int j = 0; j < length; j++) {
			for (int i = 0; i < length-1; i++) {
				if (height[i] > height[i+1]) {
					slot = height[i];
					height[i] = height[i+1];
					height[i+1] = slot;
				}
			}

		}
		System.out.println("");
		System.out.println("Sorted:");
		for (int i = 0 ; i < length; i++) {
			System.out.println(""+ height[i] +"");
			}

	}

}
