/**
167. 两数之和 II - 输入有序数组
给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

说明:

返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
示例:

输入: numbers = [2, 7, 11, 15], target = 9
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。



结题思路：一开始的思路就是就是双层循环找到最终的唯一答案；后来在进一步分析，由于题中的数组是有序，所以就采用了二分法来缩小范围

**/



class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int midLength = 0;
        if(target - numbers[0] >= numbers[numbers.length - 1]) {
            midLength = numbers.length - 1;
        } else {
            int find = target - numbers[0];
            midLength = findMidIndex(numbers, find);
            if(midLength == -1) {
                midLength = numbers.length - 1;
            }
        }
        
        
        
        int a[] = {-1,-1};
        int i = midLength;
        int j = 0;
        
        while(i>=0 && j <= (midLength)) {
            if(i == j) {
                i = midLength - 1;
                j++;
                continue;
            } else if(numbers[j] + numbers[i] == target) {
                if(i > j) {
                    a[0] = j+1;
                    a[1] = i+1;
                } else {
                    a[0] = i+1;
                    a[1] = j+1;
                }
               
                return a;
            } else {
                i--;
            }
        }
        return a;
        
    }


    public int findMidIndex(int[] numbers, int find){
        if(numbers == null) {
            return -1;
        }

        int start = 0;
        int end = numbers.length - 1;
        int middle = 0;

        while(start <= end) {
            middle = (start + end) / 2;

            if(numbers[middle] == find) {
                return middle;
            } else if(numbers[middle] < find) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}