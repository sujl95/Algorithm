import java.util.*;
public class P42577 {

	public static void main(String[] args) {
		
		String[] str = {"119", "97674223", "1195524421"};
		System.out.println(solution(str));
	}
	
	public static boolean solution(String[] str) {
		boolean bool = true;
		
		loop:
		for (int i = 0; i < str.length; i++) {
			int cnt = 0;
			for (int j =0; j < str.length;j++) {
				
				if(i != j) {
						if(str[i].indexOf(str[j]) == 0) {
							cnt++;
							bool = false;
							break loop;
						}
						 if(cnt > 1) {
					            break;
					     }
					}
					
				}
			if(cnt > 1) {
		        bool = false;
		        
		        break;
		    }
		}
		return bool;
	}
	public static boolean checkPrefix(String[] arr) {
		for(int i =0; i < arr.length; i++) {
			for(int j = i+1 ; j < arr.length; j++) {
				if(arr[i].indexOf(arr[j]) == 0) {
					return false;
				}
				if(arr[j].indexOf(arr[i])==0) {
					return false;
				}
			}
		}
		return true;
	}
}




/*
for(int i = 0; i < str.length; i++) {
    
    int cnt = 0;
    for(int j = 0; j < str.length; j++) {
        if(str[j].indexOf(str[i]) == 0) {
            cnt++;
        }
        
        if(cnt > 1) {
            break;
        }
    }
    
    if(cnt > 1) {
        bool = false;
        
        break;
    }
}
return bool; 
*/