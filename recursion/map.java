public class map{
    char map[][]= new char[10][10];
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
    }

    public void printmap(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(map[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}