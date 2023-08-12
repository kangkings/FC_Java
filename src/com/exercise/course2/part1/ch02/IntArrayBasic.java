package com.exercise.course2.part1.ch02;

public class IntArrayBasic {
    public static void main(String[] args) {
        int[] nums = new int[5]; //고정길이(단점) -> 가변길이를 사용할 순 없나?
        nums[0] = 1; //저장동작(입력,추가)
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        for (int i = 0; i < nums.length; i++) {//길이를 구하는 동작
            int data = nums[i];//데이터를 얻는동작(가져오는 동작)
        }

        //향상된 for문(foreach문)
        for(int data : nums){
            System.out.println(data);
        }
    }

}
