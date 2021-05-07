package java_Exec;

public class Weapoon_Extend  extends Item {
    int damage;//攻击力
    public static void main ( String [] args ){
        Weapoon_Extend infinityEdge = new Weapoon_Extend();
        infinityEdge.damage = 65;//在Weapon中新设计的 damage
        infinityEdge.name = "无尽之刃";//从Item中继承过来的
        infinityEdge.price = 3600;
    }
}
