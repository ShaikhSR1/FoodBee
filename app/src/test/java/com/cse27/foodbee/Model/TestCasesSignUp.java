package com.cse27.foodbee.Model;

public class TestCasesSignUp {
    public String[][] testCases= {
            {"","","","",""},
            {"Jubair Al Faisal","","","",""},
            {"Jubair Al Faisal","jubaircom","","",""},
            {"Jubair Al Faisal","jubair.com","","",""},
            {"Jubair Al Faisal","jubair@gmailcom","","",""},
            {"Jubair Al Faisal","jubair@gmail.com","","",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795","",""},
            {"Jubair Al Faisal","jubair@gmail.com","0179523440","",""},
            {"Jubair Al Faisal","jubair@gmail.com","017952344041","",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","12345",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","1234567",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","123456",""},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","123456","12345"},
            {"Jubair Al Faisal","jubair@gmail.com","01795234404","123456","123456"},
    };
    public int[][] output={
            {1},
            {2},
            {2},
    };

    public String[] getTestCases(int a) {
        String testCase[]=testCases[a];
        return testCase;
    }
}
