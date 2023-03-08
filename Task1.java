//Задать одномерный массив и найти в нем минимальный и максимальный элементы
 /**
  * Task1
  */
 public class Task1 {
 
    public static void main(String[] args) {
        int [] arr= {1,5,7,9,3,6};
        
       int max=0;
       
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
            System.out.println(max);
            int min=max;
        for (int j = 0; j < arr.length; j++){
            if (arr[j]< min)
            {
                min=arr[j];
            }
            }
        
        System.out.println(min);
        
    }
 }