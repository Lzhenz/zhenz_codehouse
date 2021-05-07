package java_Exec;

public class ADHero extends Hero {
    /*
    首先在此处写三个方法 ， 分别是
    无参数进行攻击
    有一个参数的进行攻击
    有两个参数的进行攻击
     */

    public void attack(){
        /*
        值得注意的是 ， 在这些方法里面 ， 没有对象调用的name ，是主类中的 ， 而不是继承的类中的

         */
        System.out.println( name + "进行了一次攻击，但是不确定打中了谁 ");
    }

//    public void attack(Hero h1){
//        System.out.println(name + "对" + h1.name + "进行了一次攻击");
//    }
//
//    public void  attack(Hero h1,Hero h2){
//        System.out.println(name + "对" + h1.name +"并且对" + h2.name + "进行了一次攻击");
//    }

    public void attack(Hero...heroes){
        for (int i = 0 ; i < heroes.length ; i++){
            System.out.println(name + "攻击了" + heroes[i].name);
        }
    }
    public static void main ( String [] args ){
        /*
        主函数 首先要写出 方法中的 name 是哪一个
         */

        ADHero bh = new ADHero(); //Bounty Hunters
        bh.name = "赏金猎人";

        //创建第一个参数的对象 ， 使用继承过来的 Hero 进行创建
        Hero h1 = new Hero();
        h1.name = "盖伦";

        //创建第二个参数的对象 ，依然使用继承过来的 Hero 进行创建
        Hero h2 = new Hero();
        h2.name = "提莫";

        //是谁的方法就用谁的对象去调用 ，例如可以在这里使用hero的类调用addspeed函数
        bh.attack();//无参
        bh.attack(h1);
        bh.attack(h1,h2);


    }
}
