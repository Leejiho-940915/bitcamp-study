package com.eomcs.lang.ex03;
public class Exam0410{
    public static void main(String[]args){

        System.out.println('A');
        System.out.println('가');

        System.out.println('\u0041'); // A
        System.out.println('\uac00'); // 가
        System.out.println('\uAC00'); // 가 (16진수는 대소문자를 구분하지 않는다.)

        System.out.println('\101'); // A
        System.out.println('\122'); // R
        System.out.println('\377'); // y

        System.out.println('\u4eba'); // 사람을 뜻하는 '인(人)'이라는 한자의 문자 코드
        System.out.println('\u00a9'); // copyright를 뜻하는 '©' 문자 코드
        System.out.println('\u03c0'); // 수학의 파이 기호 'π'
        System.out.println('\u03a3'); // 수학의 시그마 기호 'Σ'
    }
}