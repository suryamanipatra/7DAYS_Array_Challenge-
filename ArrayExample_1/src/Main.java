class ArrayExample_1{

    void demoArray() {
        int[] ages = new int[3]; // 3 elements and  take 12 bytes of memory.
        float[] weight = new float[3];
//        String[] names = new String[3];
        String[] names ={"Surya","Tejaswini","Mamata","Chitrasen"};
        ages[0] = 34;
        ages[1] = 20;
        ages[2] = 24;
//      ages[5] = 12;  // Index 5 out of bounds for length 3 at ArrayExample_1.demoArray.
//        ages[-1] = 19; // Index -1 out of bounds for length 3 at ArrayExample_1.demoArray.
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
//      System.out.println(ages[5]);
//      System.out.println(ages[-1]);

//        similarly for string Array :

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
//     HOW TO FIND THE LENGTH OF AN ARRAY :
    void lengthArray(){
        int[] lgth = new int [3];
        System.out.println(lgth.length);
    }
//    HOW TO TRAVERSE AN ARRAY :
    void traverseArray(){
        int[] ages = new int[3];
        ages[0] = 34;
        ages[1] = 20;
        ages[2] = 24;

        // BY For loop

        for(int i=0; i<ages.length ; i++){
            System.out.println(ages[i]);
        }

        // BY For each loop

        for(int age : ages){
            System.out.println(age);
        }

        // BY While loop

        int i=0;
        while(i<ages.length){
            System.out.println(ages[i]);
            i++;
        }

    }
//    HOW TO FIND SUM OF AN ARRAY

    void sumOfArray(){
        int[] arr = new int[3]; //8
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;

        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

//    HOW TO FIND MAXIMUM VALUE AMONG ALL VALUES OF AN ARRAY
    void maxOfArray(){
        int[] arr = {45,34,24}; // 45
        int ans = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println("Max value is " + ans);
    }
//    HOW TO SEARCH AN ELEMENT IN ARRAY
    void searchInArray(){
        int[] arr = {45,34,24,34};
        int x = 34;
        int ans = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x){
               ans = i;
               break;
            }
        }
        System.out.println("number " + x + " is found at index  " + ans);
    }

//    HOW TO CREATE AND INITIALIZE A MULTI-DIMENSIONAL ARRAY
    void demoMultiArray(){
//        int[][] multiArray = new int[3][3]; //3*3 = 9 elements and 36 bytes
        int[][] multiArray = {{45,34,24},{39,40,47},{29,63,17}};

        System.out.println(multiArray[0][0]); //45
        System.out.println(multiArray[0][1]);//34
        System.out.println(multiArray[0][2]);//24

        System.out.println(multiArray[1][0]);//39
        System.out.println(multiArray[1][1]);//40
        System.out.println(multiArray[1][2]);//47

        System.out.println(multiArray[2][0]);//29
        System.out.println(multiArray[2][1]);//63
        System.out.println(multiArray[2][2]);//17
    }
//    HOW TO TRAVERSE MULTI-DIMENSIONAL ARRAY
    void traverseMultiArray(){
        int[][] multiArray = {{45,34,24},{39,40,47}};
        for(int i = 0;i<multiArray.length;i++){
            for(int j=0;j<multiArray[i].length;j++){
                System.out.println(multiArray[i][j]);
            }
        }
    }
}




public class Main{
    public static void main(String[] args){
        ArrayExample_1 obj = new ArrayExample_1();
//        obj.demoArray();
//       obj.demoMultiArray();
//        obj.lengthArray();
//        obj.traverseArray();
//        obj.demoMultiArray();
//        obj.sumOfArray();
//        obj.maxOfArray();
        obj.searchInArray();
    }

}