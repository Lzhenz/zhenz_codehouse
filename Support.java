package java_Exec;

import java.awt.*;

//辅助
public class Support extends Hero {

    public void heal(){
        System.out.println(name + "加了血" + "但不知是谁");
    }

    public void heal(Hero h){//未指定英雄加血
        System.out.println( name + "为" + h.name + "加了血" );
    }

    public void heal(Hero h , float hp){
        System.out.println("当前英雄是" + h.name + "当前血量：" + h.hp);
        h.hp  += hp;
        System.out.println(name + "为" + h.name + "加了" + hp + "点血");
        System.out.println("当前英雄是" + h.name + "当前血量：" + h.hp);
    }

    public void heal(float hp,Hero...heroes){
        for (int i = 0 ; i < heroes.length ; i++){
            heroes[i].recovery(hp);
            System.out.println(name + "为" + heroes[i].name + "加了" + hp + "点血" );
        }
    }
    public static void main( String [] args){
        Support Soraka = new Support();
        Soraka.name = "索拉卡";

        Hero h = new Hero();
        h.name = "盖伦";
        h.hp = 40;

        Hero h1 = new Hero();
        h1.name = "亚索";

        Soraka.heal(h);
        Soraka.heal(h , 300.0f);
        Soraka.heal(200.0f , h ,h1);

    }
}
