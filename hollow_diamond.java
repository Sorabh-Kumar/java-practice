import java.io.*;
import java.util.*;
class hollow_diamond
{
public static void main(String[] args)
{
	int n=10;
	int i,j,mid;
	mid = n/2;
	
	// upper half pattern
	for(i = 1; i<= mid; i++) {
		for(j = 1; j<=mid-i; j++) {
		System.out.print("*");
		}

	if(i == 1) {
		System.out.print("*");
	}
	else{
		System.out.print("*"); //in each line star at start and end position
		for(j = 1; j<=2*i-3; j++) { //print space to make hollow
			System.out.print(" ");
		}
		System.out.print("*");
	}
	for(j = 1; j<=mid-i; j++) {
	    System.out.print("*");
	}
	System.out.print("\n");
}
	
// lower half pattern
for(i = mid+1; i<n; i++) {
		
	for(j = 1; j<=i-mid; j++) {
		System.out.print("*");
	}
	if(i == n-1) {
		System.out.print("*");
	}else{
		System.out.print("*"); //in each line star at start and end position
		for(j = 1; j<=2*(n - i)-3; j++) { //print space to make hollow
			System.out.print(" ");
		}
		System.out.print("*");
	}
	for(j = 1; j<=i-mid; j++) {
	    System.out.print("*");
	}
	System.out.print("\n");
}
}
}
