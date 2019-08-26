import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
1、准备牌
2、洗牌
3、发牌
4、看牌
 */
public class fourstep {

    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();

        String[] colors = {"♥", "♠", "♣", "♦"};

        String[] numbers ={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color+number);
            }
        }


        Collections.shuffle(poker);
//        洗牌
        ArrayList<String> player01 =new ArrayList<>();
        ArrayList<String> player02 =new ArrayList<>();
        ArrayList<String> player03 =new ArrayList<>();
        ArrayList<String> dipai =new ArrayList<>();
//发牌

        for (int i = 0; i <poker.size() ; i++) {
            String p=poker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if(i%3==0)
            {
                player01.add(p);
            }else if(i%3==1)
            {
                player02.add(p);
            }else if(i%3==2)
            {
                player03.add(p);
            }

        }
        System.out.println("刘德华"+player01);
        System.out.println("周星驰"+player02);
        System.out.println("周润发"+player03);
        System.out.println("底牌"+dipai);
    }

}
