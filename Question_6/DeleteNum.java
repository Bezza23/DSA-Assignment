package Question_6;

public class DeleteNum {
    public static void deleteElement(int[] array,int index){
        int[] newArray=new int[(array.length)-1];
        for(int i=0;i<array.length;i++){
            if(i<index){
                newArray[i]=array[i];
            }
            else{
                if(i==index){
                    continue;
                }
                else{
                    newArray[index]=array[i-1];
                }
            }

        }

    }
    public static void main(String[] args){
        int[] array={3,7,1,9,4};
        deleteElement(array,0);
        for(int n:array){
            System.out.print(n+" ");
        }
    }

}
