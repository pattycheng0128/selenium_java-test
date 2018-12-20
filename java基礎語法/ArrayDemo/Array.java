package ArrayDemo;

import java.util.Arrays;

public class Array {

		public static void main(String[] args) {
			int[] array;// 宣告名稱為array陣列為int型別
			array = new int[10];// 指派10個值給array陣列
			array[0] = 100;//指定第1個數值
			array[1] = 102;//指定第2個數值
			System.out.println("第0個索引:" + array[0]);
			System.out.println("第1個索引:" + array[1]);
			System.out.println("第2個索引:" + array[2]);//未指定會顯示數值0
			
			int[] array2= {1,2,8,44,3,66};
			System.out.println("第0個索引:" + array2[5]);
			
			String[] stringArray= {"A","B","C"};
			System.out.println("第0個索引:" + stringArray[0]);
			System.out.println("第0個索引:" + stringArray[1]);
			System.out.println("第0個索引:" + stringArray[2]);
			
			//陣列的長度
			int len1=array.length;
			int len2=stringArray.length;
			System.out.println("整數型別的陣列長度:"+len1);
			System.out.println("字符串的陣列長度:"+len2);
			
			//用for迴圈來印出陣列裡面的內容
			int[] array3= {44,33,6,1,9,99};
			String str=" ";
			for(int i=0;i<array3.length;i++) {
				System.out.print(array3[i]+str);
			}
			System.out.println();
			Arrays.sort(array3);
			for(int i=0;i<array3.length;i++) {
				System.out.print(array3[i]+str);
			}
		}

	}

