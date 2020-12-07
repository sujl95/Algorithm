import java.util.*;
import java.text.DecimalFormat; 
import java.text.NumberFormat; 
import java.util.Locale;


public class J4344 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
     
     

      
      for (int k=0 ; k< T; ++k) {
         int N = sc.nextInt();
         int arr[] = new int[N];
         int sum =0;
         double avg =0;
         for (int i =0; i< arr.length; ++i) {
            arr[i] = sc.nextInt();
            sum += arr[i]; 
         }
         avg = (double)sum/N;
         int cnt =0;
         for (int j =0; j<arr.length; ++j ) {
            if (arr[j] > avg) {
               cnt++;
            }
            
         }
         double result = 0;
         DecimalFormat df = new DecimalFormat("#.000%"); 
         result = (double)cnt/ (double)arr.length;
//         System.out.println(Math.round(result *1000)/1000.0 +"%");
         System.out.println(df.format(result));
//         System.out.printf("%.3f",100.0* cnt / arr.length);
//         System.out.println("%");
         
         
      }
      sc.close();

   }
}
//        Scanner sc = new Scanner(System.in);
//           int c = sc.nextInt();
//           int n, total, count;
//           double avg;
//           int scores[] = new int[1000];
//            
//           for (int i = 0; i < c; ++i) {
//               n = sc.nextInt();
//               total = 0;
//               count = 0;
//               for (int j = 0; j < n; ++j) {
//                   scores[j] = sc.nextInt();
//                   total += scores[j];
//               }
//               avg = (double)total / n;
//                
//               for (int j = 0; j < n; ++j) {
//                   if (scores[j] > avg) {
//                       count++;
//                   }
//               }
//               System.out.printf("%.3f", 100.0 * count / n);
//               System.out.println("%");
//           }
//           sc.close();
//   }