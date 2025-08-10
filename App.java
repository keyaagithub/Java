import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    // for(int i=0;i<n;i++){
    //     System.out.print(arr[i]+" ");
    // }
    

    // int hash[]=new int[12];
    // for(int i=0;i<n;i++){
    //     hash[arr[i]]++;
    // }

    // int q=sc.nextInt();
    // while(q-- !=0){
    //     int num=sc.nextInt();
    //     System.out.println(hash[num]);
    // }

    // HashMap: 
    // HashMap<Integer,Integer> mp=new HashMap<>();
    // for(int i=0;i<n;i++){
    //     int key=arr[i];
    //     int freq=0;
    //     if(mp.containsKey(key)) freq=mp.get(key);
    //     freq++;
    //     mp.put(key, freq);
    // }

    // int q=sc.nextInt();
    // while (q-- !=0) {
    //     int num=sc.nextInt();
    //     if(mp.containsKey(num)) System.out.println(mp.get(num));
    //     else System.out.println(0);
    // }


    //Character Hashing:
    // String s=sc.next();

    // int hash[]=new int[256];
    // for(int i=0;i<s.length();i++){
    //     hash[s.charAt(i)]++;
    // }

    // int q=sc.nextInt();
    // while(q-- !=0){
    //     char c=sc.next().charAt(0);
    //     System.out.println(hash[c]);
    // }

    // int hash[]=new int[26];
    // for(int i=0;i<s.length();i++){
    //     hash[s.charAt(i)-'A']++;
    // }

    // int q=sc.nextInt();
    // while(q-- !=0){
    //     char c=sc.next().charAt(0);
    //     System.out.println(hash[c-'A']);
    // }


    //Freq of all elements: method1
    // boolean visited[]=new boolean[n];
    // for(int i=0;i<n;i++){
    //     if(visited[i]==true) continue;
    //     int count=1;
    //     for(int j=i+1;j<n;j++){
    //         if(arr[i]==arr[j]){ 
    //         visited[j]=true;
    //         count++;
    //         }
    //     }
    // System.out.println(arr[i] + " -> " + count);        
    // }

    //Freq of all elements: method2
    // HashMap <Integer,Integer> mp=new HashMap<>();
    // for(int i=0;i<n;i++){
    //     if(mp.containsKey(arr[i])) 
    //         mp.put(arr[i], mp.get(arr[i])+1);
    //     else
    //         mp.put(arr[i], 1);
    // }

    // for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
    //     System.out.println(entry.getKey() + " -> " + entry.getValue());
    // }

    //Most Frequent:
//  public int mostFrequentElement(int[] nums) {
//         int n=nums.length;

//         HashMap<Integer,Integer> mp=new HashMap<>();
//         for(int i=0;i<n;i++){
//             if(mp.containsKey(nums[i])) 
//                 mp.put(nums[i],mp.get(nums[i])+1);
//             else
//                 mp.put(nums[i],1);
//         }

//         int maxKey=-1;
//         int maxValue=Integer.MIN_VALUE;

//         for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
//             if(entry.getValue()>maxValue){
//                 maxValue=entry.getValue();
//                 maxKey=entry.getKey();
//             }
//         }
//         return maxKey;
    // }

    



    }
}
