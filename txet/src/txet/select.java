package txet;

import javax.imageio.ImageTypeSpecifier;

public class select {
	public static void main(String[] args) {
		int[] list = {1,3,4,7,9,10,13,15};
		int start =0,end=list.length-1,model=(start+end)/2;
		
		while (true) {
			if (10>list[model]) {
				start = model;
				model=(start+end)/2;
				System.out.println(1);
				
			}
			if (10<list[model]) {
				end = model;
				model=(start+end)/2;
				System.out.println(2);
			}
			if (10==list[model]) {
				System.out.println(model);
				break;
			}
		}
		
		
	}
	
}
