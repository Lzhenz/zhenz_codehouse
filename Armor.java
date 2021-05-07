package java_Exec;

public class Armor  extends Item {
    int Armor_class;
    public static void main ( String  [] args ) {
        Armor infinity = new Armor();
        Armor kongfu = new Armor();
        infinity.name = "布甲";
        infinity.price = 300;
        infinity.Armor_class = 15;

        kongfu.name = "锁子甲";
        kongfu.price = 500;
        kongfu.Armor_class = 40;

        System.out.println( kongfu.name + "的价格：" + kongfu.price);
        System.out.println(infinity.name + "的价格：" + infinity.price);
    }
}
