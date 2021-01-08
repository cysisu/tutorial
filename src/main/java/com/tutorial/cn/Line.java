package com.tutorial.cn;

public class Line implements Comparable{
    int x;
    int y;
    int c;
    public Line(){}

    public Line(int x1,int y1,int x2,int y2){
        this.y=y2-y1;
        this.x=x2-x1;
        if(this.x==0){
            c=0;
        }
        else{
            c=-x1*this.y+y1;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        Line line=(Line)o;
        if(x*line.y==y*line.x&&x*line.c==c*line.x){
            return 0;
        }
        if(x>line.x){
            return 1;
        }
        else if(x==line.x&&y>line.y){
            return 1;
        }
        else if(x==line.x&&y==line.y&&c>line.c){
            return 1;
        }
        return -1;
    }
}