package com.ldu.bevishe.isolaitonforest;
//处理test.txt的文件，删除不需要的属性

public class DataInit {
    //

    //

    //删除oldStr不需要的列，并把其他的列依次复制给newStr
    public void myCopyStr(String[][] oldStr,String[][] newStr,int x,int y,int k){
        int i=0,j=0,pos=0;//y 是列
        for(;j<y;j++){
            if(k==j)
                break;
            for(;i<x;i++){
                newStr[i][j] = oldStr[i][j];
            }
        }


    }
}
