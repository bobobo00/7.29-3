/**
 * @ClassName Order
 * @Description TODO
 * @Auther danni
 * @Date 2019/7/29 18:47]
 * @Version 1.0
 **/

public class Order {
    //第一版
    public void reOrderArray(int [] array) {
        /*int first=1;
        int last=0;
        int temp=0;
        while(first<array.length){
            if(array[first]%2==0&&array[last]%2!=0){
                first++;
                last++;
            }else if(array[first]%2!=0&&array[last]%2==0){
                temp=array[first];
                array[first]=array[last];
                array[last]=temp;
            }else if(array[first]%2==0&&array[last]%2==0){
                while(first<array.length&&array[first]%2==0){
                    first++;
                }
                if(first>=array.length){
                    return;
                }else if(array[first]%2!=0){
                    int num=array[first];
                    int loca=first;
                    while(first!=last){
                        array[first]=array[first-1];
                        first--;}
                    array[last]=num;
                    first=loca+1;
                    last=last+1;
                }
            }

        }*/
        //方法2：申请数组；
  /*  int [] tempr=new int[array.length];
    int [] templ=new int[array.length];
    int m=0;
    int n=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==0){
                tempr[m++]=array[i];
            }else{
                templ[n++]=array[i];
            }
        }
        for (int i = 0; i <n ; i++) {
            array[i]=templ[i];
        }
        for (int i=n,j=0;i<array.length;i++,j++){
            array[i]=tempr[j];
        }*/
  //方法三：归并排序的思想；
        int k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                int j=i;
                while(j>k){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    j--;
                }
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Order o=new Order();
        int[] array={1,2,3,4,5,6,7};
        o.reOrderArray(array);
        for (int num:array
             ) {
            System.out.print(num+" ");
        }
    }
}
