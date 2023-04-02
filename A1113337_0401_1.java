import java.util.*;


class animal{
    String name;
    double high;
    int weight;
    double speed;

    static void line(){
        for(int A = 0; A < 10; A++){
            System.out.print("-");
        }
        System.out.println(" ");
    }

    void show(){
        System.out.println("名稱:" + name);
        System.out.println("身高:" + high + "m");
        System.out.println("體重:" + weight + "kg");
        System.out.println("速度:" + speed + "m/min");
    }
    public double distance(int x, double y){
        double distance = x * y * speed;
        return distance;
    }
    public double distance2(int z){
        double distance2 = z * speed;
        return distance2;
    }

    static void showinfo(){
        System.out.println("歡迎進入冰雪奇縁系統");
    }
}

class human{
    boolean gender;

    void show(){
        if(gender == true){
            System.out.println("性別:男生");
        }else{
            System.out.println("性別:女生");
        }
    }
}

class snow{
    boolean snow;
    
    void show(){
       if(snow == true){
            System.out.println("冰凍技能:YES");
        }else if(snow == false){
            System.out.println("冰凍技能:X");
        }
    }
}

public class A1113337_0401_1{
    public static void main(String[] args){
        
        animal.showinfo();
        Scanner sc = new Scanner(System.in);

        animal snowman = new animal();
        human snowmanHuman = new human();
        snow snowmanSnow = new snow();
        snowman.name = "雪寶";
        snowman.high = 1.1;
        snowman.weight = 52;
        snowman.speed = 100;
        
        System.out.print("請輸入'雪寶'是否有冰凍技能(true. YES: false. NO) >");
        snowmanSnow.snow = sc.nextBoolean();

        animal donkey = new animal();
        human donkeyHuman = new human();
        snow donkeySnow = new snow();
        donkey.name = "臚子";
        donkey.high = 1.5;
        donkey.weight = 99;
        donkey.speed = 200;
        System.out.print("請輸入'臚子'的性別(true. 男生: false. 女生) >");
        donkeyHuman.gender = sc.nextBoolean();
        System.out.print("請輸入'臚子'是否有冰凍技能(true. YES: false. NO) >");
        donkeySnow.snow = sc.nextBoolean();

        animal ake = new animal();
        human akeHuman = new human();
        snow akeSnow = new snow();
        ake.name = "阿克";
        ake.high = 1.9;
        ake.weight = 80;
        ake.speed = 150;
        System.out.print("請輸入'阿克'的性別(true. 男生: false. 女生) >");
        akeHuman.gender = sc.nextBoolean();
        System.out.print("請輸入'阿克'是否有冰凍技能(true. YES: false. NO) >");
        akeSnow.snow = sc.nextBoolean();

        animal hansi = new animal();
        human hansiHuman = new human();
        snow hansiSnow = new snow();
        hansi.name = "漢斯";
        hansi.high = 1.8;
        hansi.weight = 78;
        hansi.speed = 130;
        System.out.print("請輸入'漢斯'的性別(true. 男生: false. 女生) >");
        hansiHuman.gender = sc.nextBoolean();
        System.out.print("請輸入'漢斯'是否有冰凍技能(true. YES: false. NO) >");
        hansiSnow.snow = sc.nextBoolean();

        animal anna = new animal();
        human annaHuman = new human();
        snow annaSnow = new snow();
        anna.name = "安那";
        anna.high = 1.7;
        anna.weight = 48;
        anna.speed = 120;
        System.out.print("請輸入'安那'的性別(true. 男生: false. 女生) >");
        annaHuman.gender = sc.nextBoolean();
        System.out.print("請輸入'安那'是否有冰凍技能(true. YES: false. NO) >");
        annaSnow.snow = sc.nextBoolean();

        animal aisha = new animal();
        human aishaHuman = new human();
        snow aishaSnow = new snow();
        aisha.name = "愛沙";
        aisha.high = 1.7;
        aisha.weight = 50;
        aisha.speed = 120;
        System.out.print("請輸入'愛沙'的性別(true. 男生: false. 女生) >");
        aishaHuman.gender = sc.nextBoolean();
        System.out.print("請輸入'愛沙'是否有冰凍技能(true. YES: false. NO) >");
        aishaSnow.snow = sc.nextBoolean();

        snowman.show();
        snowmanHuman.show();
        snowmanSnow.show();
        animal.line();

        donkey.show();
        donkeyHuman.show();
        donkeySnow.show();
        animal.line();

        ake.show();
        akeHuman.show();
        akeSnow.show();
        animal.line();

        hansi.show();
        hansiHuman.show();
        hansiSnow.show();
        animal.line();

        anna.show();
        annaHuman.show();
        annaSnow.show();
        animal.line();

        aisha.show();
        aishaHuman.show();
        aishaSnow.show();

        System.out.print("請輸入時間(分鐘) >");
        int a = sc.nextInt();
        System.out.print("請輸入加速度 >");
        double b = sc.nextDouble();
       

        if(snowmanSnow.snow == true){
            System.out.println("雪寶:" + snowman.distance(a,b)*2 + "m");
        }else{
            System.out.println("雪寶:" + snowman.distance(a,b) + "m");
        }
        
        
        if(donkeySnow.snow == true){
            System.out.println("臚子:" +donkey.distance(a,b)*2 + "m");
        }else{
            System.out.println("臚子:" +donkey.distance(a,b) + "m");
        }
        
        
        if(akeSnow.snow == true){
            System.out.println("阿克:" +ake.distance(a,b)*2 + "m");
        }else{
            System.out.println("阿克:" +ake.distance(a,b) + "m");
        }


        if(hansiSnow.snow == true){
            System.out.println("漢斯:" +hansi.distance(a,b)*2 + "m");
        }else{
            System.out.println("漢斯:" +hansi.distance(a,b) + "m");
        }


        if(annaSnow.snow == true){
            System.out.println("安那:" +anna.distance(a,b)*2 + "m");
        }else{
            System.out.println("安那:" +anna.distance(a,b) + "m");
        }


        if(aishaSnow.snow == true){
            System.out.println("愛沙:" +aisha.distance(a,b)*2 + "m");
        }else{
            System.out.println("愛沙:" +aisha.distance(a,b) + "m");
        }
    }
}

