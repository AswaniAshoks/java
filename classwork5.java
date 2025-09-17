public class classwork5 {
     public static void main(String[] args)
     {
        int a[]=new int[5]; 
a[0]=97;  
a[1]=85;  
a[2]=64;  
a[3]=79;  
a[4]=49;  

for(int i=0;i<a.length;i++)
{
  if( a[i]>=90){
    System.out.println(a[i]+"Excellent");
  } 
  else if(  a[i] >= 75 && a[i] <= 85){
    System.out.println(a[i]+"good");
  } 
  else if( a[i] >= 50 && a[i] <= 74){
    System.out.println(a[i]+"Average");
  } 

 else {
        System.out.println(a[i] + " Fail");
    }
 
}


     }
}