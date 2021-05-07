package java_Exec;
/*
    英雄的属性包括 名字、血量、护甲、移动速度
    死亡次数、杀人次数、助攻次数、金钱、补刀数、攻击速度
    杀人后说的话、被杀后说的话......
*/

public class Hero {
    String name;//英雄名字
    float hp;//血量
    float armor;//护甲
    int moveSpeed;//移动速度
    int death;//死亡次数
    int kill;//杀人次数
    int assists;//助攻次数
    int money;//金钱
    int kill_soldier;//补刀数
    String death_speak;//杀人后获得话
    String killed_speak;//被杀后说的话
    /*
    英雄的方法，比如增加移动速度，超神等等
     */

    //构造方法
//    public Hero( String heroname){
//            name = heroname;
//    }
//
//    public Hero(String heroname , float herohp){
//        name = heroname;
//        hp = herohp;
//    }
    void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;//增加移动速度
    }

    void legendary(){
        if((death+8)<=kill)
            System.out.println("宁超神了！！！！");
        else
            System.out.println("宁以击杀"+(kill)+"个人头");
    }

    float getHp(){
        return hp;
    }

    void recovery(float blood){ hp = hp + blood;
    }
/*
    具体的英雄
 */
    public static void main(String[] args){
        Hero yasuo = new Hero();//创建一个英雄对象
        yasuo.name = "亚索";
        yasuo.addSpeed(100);
        yasuo.recovery(50);

        yasuo.hp = 550.00f;
        yasuo.armor = 75.15f;
        yasuo.moveSpeed = 330;
        yasuo.death = 0;
        yasuo.kill = 8;
        yasuo.assists = 4;
        yasuo.money = 9000;
        yasuo.kill_soldier = 150;
        yasuo.death_speak = "哈哈哈哈哈哈哈菜！";
        yasuo.killed_speak = "呜呜呜";
        System.out.println("英雄："+yasuo.name);
        System.out.println("战绩："+yasuo.kill+"/"+yasuo.death+"/"+yasuo.assists);
        yasuo.legendary();

        //构造方法
//        Hero garen = new Hero("盖伦");
//        Hero teemo = new Hero("提莫", 532);
    }
}





























/*
    下面这个问题讨论的是参数的作用域的问题，而不是传递参数的问题
    参数只能被使用在被声明的方法里面
    其他的方法不能访问该参数，并且类里面的也不能进行访问该参数
 */
//class rennshyu{
//    public void method1(int method1){
//        System.out.println(method1);
//    }
//
//    public void method2(){
//        System.out.println(method1);
//    }
//}



