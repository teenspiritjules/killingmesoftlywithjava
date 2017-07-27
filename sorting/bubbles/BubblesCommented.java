//starting with bubble sort! sorted like this in school once, again got reminded yesterday this thing existed by dennis. so i sorted some of the heights of my friends
//commented everything especially for some real nice guy. think i might include his height here too

package bubbles; //<- simply just ignore.....

public class Bubbles {

	public static void main(String[] args) {

		int height[] = new int[7];
			height[0]= 160; //pal
			height[1]= 175; //dennis
			height[2]= 166; //me
			height[3]= 163; //salman
			height[4]= 180; //louis
			height[5]= 161; //madame
			height[6]= 174; //guy

		int slot = 1; //some variable for temporarily dumping (or saving) numbers in there
		int length = height.length; //length of height array in one variable!

		//jus displaying unsorted heights
		System.out.println("Unsorted:");
		for(int i = 0; i < length; i++) {
			System.out.println(height[i]);
		}

		//first for: preventing just [i] and [i+1] being compared all the time
		//second for:	repeating if construct according to length of array (-1, height[6] doesn't exist)
		//if: height[i] is bigger than height[i+1], please remain calm and save height[i] in slot.
		//height[i] is then filled with height[i+1], and height[i+1] with our temporary boy next door: slot.
		//see that?! they actually switched! ha, computer says yes!
		for (int j = 0; j < length; j++) {
			for (int i = 0; i < length-1; i++) {
				if (height[i] > height[i+1]) {
					slot = height[i];
					height[i] = height[i+1];
					height[i+1] = slot;
				}
			}

		}

		//displaying all sorted heights, again using a for statement similar to the one we already used in the
		//beginning for displaying all unsorted heights.
		System.out.println("");
		System.out.println("Sorted:");
		for (int i = 0 ; i < length; i++) {
			System.out.println(""+ height[i] +"");
			}

	}

}
