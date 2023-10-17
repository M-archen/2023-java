package com.green.day14.ch6;

public class Document {
    String name="제목없음";
    static int num=1;




     Document(){
        Print(name,num);
        num++;
     }

    Document(String str){
        System.out.printf("문서 %s가 생성되었습니다.\n",str);
    }
    void Print(String name,int num){
        System.out.printf("문서 %s%d가 생성되었습니다.\n",name,num);
    }

}
class DocumentTest{
    public static void main(String[] args) {
        Document d1=new Document();//문서 제목없음1가 생성되었습니다.
        Document d2=new Document("자바.txt");//문서 자바.txt가 생성되었습니다.
        Document d3=new Document();//문서 제목없음2가 생성되었습니다.
        Document d4=new Document();//문서 제목없음3가 생성되었습니다.
    }
}
