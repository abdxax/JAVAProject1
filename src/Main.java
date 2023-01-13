import java.util.Scanner;

public class Main {
    static String[][] arr = new String[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userPlay=true;
        boolean isWin=false;
        while (CheckEmptyPostion()){


                run();
                if(userPlay){
                    System.out.println("Please Enter number from 1 to 9");
                    int ins = scanner.nextInt();
                    boolean flag= insertItem(ins, "X");
                    if(flag){
                        if(checkPlayerWin()){
                            run();
                           System.out.println("The Player Is Win");
                           isWin=true;
                           break;
                        }
                        userPlay=false;
                    }
                }
                else{
                    int max=9;
                    int min=1;
                    int b = (int)(Math.random()*(max-min+1)+min);
                    boolean flag= insertItem(b, "O");
                    if(flag){
                        if(checkPlayerWin()){
                            run();
                            System.out.println("The Computer Is Win");
                            isWin=true;
                            break;
                        }
                        userPlay=true;
                    }
                }

        }

        if(!isWin){
            System.out.println("The Game End ");
        }

    }

    public static void run() {


        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < arr.length; y++) {

                if (arr[i][y] == null) {
                    System.out.print("_|");
                } else {
                    System.out.print(arr[i][y] + "_|");
                }

                for (int m = 0; m < arr[y].length; m++) {
                    System.out.print("");
                }
            }
            System.out.println();
        }

        System.out.println("_______________________________________________");

    }

    //Insert item into Array
    public static boolean insertItem(int postion, String vc) {
        boolean flag=false;
        switch (postion) {
            case 1:
                if(arr[0][0]==null){
                    arr[0][0] = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            case 2:
                if(arr[0][1]==null){
                    arr[0][1] = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            case 3:
                if( arr[0][2]==null){
                    arr[0][2] = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            case 4:
                if(arr[1][0]==null){
                    arr[1][0] = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            case 5:
                if( arr[1][1]==null){
                    arr[1][1] = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            case 6:
                if(  arr[1][2]==null){
                    arr[1][2] = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            case 7:
                if( arr[2][0]==null){
                    arr[2][0] = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            case 8:
                if( arr[2][1] ==null){
                    arr[2][1]  = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            case 9:
                if(arr[2][2] ==null){
                    arr[2][2]  = vc;
                    flag=true;
                }
                else{
                    System.out.println("Choice anther item");
                }

                break;
            default:
                System.out.print("Error input please enter 1-9");
                break;

        }
        return flag;
    }

    //Check the array has postion empty or no
    public static boolean CheckEmptyPostion(){
        for(int i=0;i<arr.length;i++){
            for(int y=0;y<arr[i].length;y++){
                if(arr[i][y]==null){
                    return true;
                }
            }
        }

        return false;

    }


    //Check the Win player
    public  static boolean checkPlayerWin(){
        //Check the player
        if((arr[0][0]=="X"&&arr[0][1]=="X"&&arr[0][2]=="X")||(arr[1][0]=="X"&&arr[1][1]=="X"&&arr[1][2]=="X")||
                (arr[2][0]=="X"&&arr[2][1]=="X"&&arr[2][2]=="X")||(arr[0][0]=="X"&&arr[1][0]=="X"&&arr[2][0]=="X")||
                (arr[0][1]=="X"&&arr[1][1]=="X"&&arr[2][1]=="X")||(arr[0][2]=="X"&&arr[1][2]=="X"&&arr[2][2]=="X")||
                (arr[0][0]=="X"&&arr[1][1]=="X"&&arr[2][2]=="X")||(arr[0][2]=="X"&&arr[1][1]=="X"&&arr[2][0]=="X")){
            return  true;
        }
        //Check the Computer
        else if((arr[0][0]=="O"&&arr[0][1]=="O"&&arr[0][2]=="O")||(arr[1][0]=="O"&&arr[1][1]=="O"&&arr[1][2]=="O")||
                (arr[2][0]=="O"&&arr[2][1]=="O"&&arr[2][2]=="O")||(arr[0][0]=="O"&&arr[1][0]=="O"&&arr[2][0]=="O")||
                (arr[0][1]=="O"&&arr[1][1]=="O"&&arr[2][1]=="O")||(arr[0][2]=="O"&&arr[1][2]=="O"&&arr[2][2]=="O")||
                (arr[0][0]=="O"&&arr[1][1]=="O"&&arr[2][2]=="O")||(arr[0][2]=="O"&&arr[1][1]=="O"&&arr[2][0]=="O")){
            return  true;
        }

        return false;
    }

    }


