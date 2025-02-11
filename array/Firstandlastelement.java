public class Firstandlastelement {
    public static void main(String[] args) {
        
         int[] a={12,67,46,435,67,385,33,335,34,23};

         for(int i=0;i<a.length;i++)
         {
           
                if(i==0 || i==9)
                {
                    System.out.println(a[i]);
                }
           
         }

    }
}
