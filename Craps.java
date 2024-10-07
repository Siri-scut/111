import java.util.Random;
public class Craps{
    public static void main(String[] args){
        Random random=new Random();
        int num1=random.nextInt(6)+1;
        int num2=random.nextInt(6)+1;
        int sum1=num1+num2;
        System.out.println("You rolled " + num1 + "+" + num2 + "=" + sum1);
        if(sum1==2||sum1==3||sum1==12){
            System.out.println("You lose");
        }else if(sum1==7||sum1==11){
            System.out.println("You win");
        }else{
            
            boolean game=false;
            while(!game){
                int sum2=rollDice();
                System.out.println("the next roll sum is "+ sum2);
                
                }
            }
        }
        
    }
    public static int rollDice(){
        Random randomtwo=new Random();
        int sum = randomtwo.nextInt(6) + 1 + randomtwo.nextInt(6) + 1;
        return sum;
    }
}
