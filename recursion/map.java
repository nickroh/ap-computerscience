import java.util.ArrayList;

public class map {

    ArrayList<coord> CoordList = new ArrayList<coord>();

    char map[][]= new char[10][10];
    int result[][] = new int[10][10];
    int n;
    char black='▣';
    char white='▥';
    public map(){
        n=10;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                map[i][j]=white;
            }
        }
        for(int i=1;i<8;i++){
            map[2][i]=black;
        }
        for(int i=2;i<8;i++){
            map[7][i]=black;
        }
        map[8][3]=black;
        map[3][1]=black;
        map[4][4]=black;
        map[7][7]=black;
        map[4][8]=black;
        map[5][8]=black;
        for(int i=3;i<7;i++){
            map[i][2]=black;
        }
        for(int i=3;i<7;i++){
            map[i][6]=black;
        }
        for(int i=1;i<5;i++){
            map[i][7]=black;
        }
        init_result();
    }

    public void init_result(){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[i][j]=0;
            }
        }
    }

    private void set_result(int x, int y,int value){
        result[x][y]=value;
    }

    public void printmap(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(map[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
        enter();
        divide();
        enter();
    }

    public void traverse(int x, int y){
        if(map[x][y]==black){
            map[x][y]=white;
            CoordList.add(new coord(x,y));
        }
        printmap();
        if(map[x-1][y]==black){
            traverse(x-1, y);
        }
        if(map[x][y+1]==black){
            traverse(x, y+1);
        }
        if(map[x+1][y]==black){
            traverse(x+1, y);
        }
        if(map[x][y-1]==black){
            traverse(x,y-1);
        }
    }

    private void enter(){
        System.out.println();
    }
    private void divide(){
        System.out.println("-------------");
    }

    public void print_result(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void order(){
        int cnt = CoordList.size();
        int count=1;
        System.out.println("Total: "+cnt);
        for(coord a : CoordList){
            System.out.println("x:"+a.x + " y:"+a.y );
            set_result(a.x,a.y,count++);
        }
    }
}
