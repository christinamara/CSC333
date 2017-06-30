package pass;

import java.lang.System;

public class Loops {
	
		
  public static int retSameInt(int i) {

    i --;
  
	int count = 0;
	
	do {
		count += 1;
	} while (count <= i);
	
    return count;
  }  
	
  public static void main(String[] args) {
  
	int i = 0;
	int k = 0;
	
    do {
		i = 5;
	} while (i <= 5);
	
	for (i = 0; 10 > i; i = i + 1) {

	}

  }
}