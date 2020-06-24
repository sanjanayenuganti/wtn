package com.wipro.flowcontrols;

public class Ex3 {

	public static void main(String[] args) {
		int l=args.length;
		if(l==0) {
			System.out.print("No Values");
		}
		else {
			for(int i=0;i<l;i++) {
				System.out.print(args[i]);
				if(i==l-1)
					break;
				else
					System.out.print(",");
			}
		}

	}

}
