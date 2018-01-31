import sun.awt.image.ImageWatched;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.LinkedList;
import java.util.PriorityQueue;


class Snake{

    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    char[][] space;
    
    int size;
    
    int direction;
    LinkedList<Point> body;
    Point[] offset;
    
    Snake(int size){
        this.size = size;
        direction = 0; //0  right 1 down  2 left 3 up
    
        offset = new Point[4];
        offset[0] = new Point(0,1);
        offset[1] = new Point(1,0);
        offset[2] = new Point(0,-1);
        offset[3] = new Point(-1,0);
    
        space = new char[size+2][size+2];
    
        for(int i=0; i<size+2;++i){
            space[0][i] ='W';
            space[size][i]='W';
            space[i][0] = 'W';
            space[i][size] = 'W';
        }
    
        for(int i=1;i<=size;++i){
            for(int j=1;j<=size;++j)
                space[i][j]='.';
        }
    
        space[1][1]='S';
    
        body = new LinkedList<Point>();
        body.add(new Point(1,1));
    
    }
    
    boolean move(char order){
    
        switch (order) {
            case 'L':
                direction = (direction+3)%4;
                break;
            case 'R':
                direction = (direction+1)%4;
                break;
        }
    
        Point head = body.getFirst();
    
        int newX = head.x + offset[direction].x;
        int newY = head.y + offset[direction].y;
    
        Point temp = null;
    
        switch (space[newX][newY]){
            case 'W':
                return false;
            case 'o':
                space[newX][newY] = 'S';
                body.addFirst(new Point(newX,newY));
                break;
            case '.':
                space[newX][newY] = 'S';
                body.addFirst(new Point(newX,newY));
                temp = body.removeLast();
                space[temp.x][temp.y] = '.'; //clean board
                break;
            case 'S':
                temp = body.getLast();
                if(temp.x == newX && temp.y == newY){
                    body.addFirst( body.removeLast() );
                }else {
                    return false;
                }
        }
    
        return true;
    }
    
    void display(){
        for(int i=1;i<size+1;++i){
            for(int j=1;j<size+1;++j){
                System.out.print(space[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    
    }
}

public class Solution {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("input.txt"));
    
        int n = in.nextInt();
        while(n!=-1){
            Snake snake = new Snake(n);
            snake.display();
    
            int m = in.nextInt();
    
            while(m--!=0){
                snake.space[ in.nextInt()+1 ][ in.nextInt()+1 ] = 'o';
            }
    
            in.nextLine();
            String movement = in.nextLine();
    
            for(int i=0;i<movement.length();++i){
                boolean state = snake.move( movement.charAt(i));
                snake.display();
                if(state==false) break;
            }
    
            System.out.println(snake.body.size());
            n = in.nextInt();
        }
    
        in.close();
    }
}









//	

import sun.awt.image.ImageWatched;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.LinkedList;
import java.util.PriorityQueue;


class Snake{

    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    char[][] space;
    
    int size;
    
    int direction;
    LinkedList<Point> body;
    Point[] offset;
    
    Snake(int size){
        this.size = size;
        direction = 0; //0  right 1 down  2 left 3 up
    
        offset = new Point[4];
        offset[0] = new Point(0,1);
        offset[1] = new Point(1,0);
        offset[2] = new Point(0,-1);
        offset[3] = new Point(-1,0);
    
        space = new char[size+2][size+2];
    
        for(int i=0; i<size+2;++i){
            space[0][i] ='W';
            space[size][i]='W';
            space[i][0] = 'W';
            space[i][size] = 'W';
        }
    
        for(int i=1;i<=size;++i){
            for(int j=1;j<=size;++j)
                space[i][j]='.';
        }
    
        space[1][1]='S';
    
        body = new LinkedList<Point>();
        body.add(new Point(1,1));
    
    }
    
    boolean move(char order){
    
        switch (order) {
            case 'L':
                direction = (direction+3)%4;
                break;
            case 'R':
                direction = (direction+1)%4;
                break;
        }
    
        Point head = body.getFirst();
    
        int newX = head.x + offset[direction].x;
        int newY = head.y + offset[direction].y;
    
        Point temp = null;
    
        switch (space[newX][newY]){
            case 'W':
                return false;
            case 'o':
                space[newX][newY] = 'S';
                body.addFirst(new Point(newX,newY));
                break;
            case '.':
                space[newX][newY] = 'S';
                body.addFirst(new Point(newX,newY));
                temp = body.removeLast();
                space[temp.x][temp.y] = '.'; //clean board
                break;
            case 'S':
                temp = body.getLast();
                if(temp.x == newX && temp.y == newY){
                    body.addFirst( body.removeLast() );
                }else {
                    return false;
                }
        }
    
        return true;
    }
    
    void display(){
        for(int i=1;i<size+1;++i){
            for(int j=1;j<size+1;++j){
                System.out.print(space[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    
    }
}

public class Solution {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
    
        int n = in.nextInt();
        while(n!=-1){
            Snake snake = new Snake(n);
            snake.display();
    
            int m = in.nextInt();
    
            while(m--!=0){
                snake.space[ in.nextInt()+1 ][ in.nextInt()+1 ] = 'o';
            }
    
            in.nextLine();
    
            while(true){
                String movement = in.nextLine();
                boolean state = snake.move( movement.charAt(0));
                snake.display();
                if(state==false) break;
            }


    	        System.out.println(snake.body.size());
            n = in.nextInt();
        }
    
        in.close();
    }
}

//  twitter



import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.ListIterator;


class Twitter{

    class Pair implements Comparable<Pair>{
        int pID;
        ListIterator<Integer> itr;
        Pair(int pID, ListIterator<Integer> itr){
            this.pID = pID;
            this.itr = itr;
        }
        public int compareTo(Pair other){
            return other.pID-pID;
        }
    }
    
    HashMap<Integer, HashSet<Integer> > relationship;
    HashMap<Integer, LinkedList<Integer> > post;
    
    Twitter(){
        relationship = new HashMap<Integer, HashSet<Integer> >();
        post = new HashMap<Integer, LinkedList<Integer> >();
    }


    void subscribe(int uID, int followID){
        if( relationship.containsKey(uID)==false) relationship.put(uID, new HashSet<Integer>());
        relationship.get(uID).add(followID);
    }
    
    void unSubscribe(int uID, int followID){
        if( relationship.containsKey(uID)==false) return;
        relationship.get(uID).remove(followID);
    }
    
    void publish(int uID, int pID){
        if(post.containsKey(uID)==false) post.put(uID, new LinkedList<Integer>());
        post.get(uID).addFirst(pID);
    }
    
    ArrayList<Integer> get(int uID,int limit){
        ArrayList<Integer> result = new ArrayList<Integer>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        for( int following: relationship.get(uID)){
            if( post.containsKey(following)){
                ListIterator<Integer> itr = post.get(following).listIterator();
                pq.add(new Pair(itr.next(),itr));
            }
        }
    
        while(pq.isEmpty()==false && result.size()<10){
            Pair temp = pq.poll();
            result.add(temp.pID);
            if(temp.itr.hasNext()) {
                temp.pID = temp.itr.next();
                pq.add(temp);
            }
        }
        return result;
    }
}

public class Solution{

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("input.txt"));
        Twitter twitter = new Twitter();
    
        int uID = in.nextInt();
    
        while(uID!=-1){
            String op = in.next();
            switch(op){
                case "Publish":
                    twitter.publish(uID, in.nextInt());
                    break;
                case "Subscribe":
                    twitter.subscribe(uID, in.nextInt());
                    break;
                case "Unsubscribe":
                    twitter.unSubscribe(uID, in.nextInt());
                    break;
                case "Get":
                    twitter.get(uID, 10).forEach(pID->System.out.print(pID+" "));
                    System.out.println();
                    break;
            }
            uID = in.nextInt();
        }
        in.close();
    }
}