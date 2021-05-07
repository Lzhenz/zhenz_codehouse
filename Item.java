package java_Exec;

/*
    物品包括 血瓶、装备
 */
public class Item {
        String name;
        int price;


        public static void main(String[] args){
            Item Boold_bottle = new Item();
            Item Straw_sandals = new Item();
            Item Sword = new Item();
            //血瓶
            Boold_bottle.name = "血瓶";
            Boold_bottle.price = 50;

            //草鞋
            Straw_sandals.name = "草鞋";
            Straw_sandals.price = 300;

            //长剑
            Sword.name = "长剑";
            Sword.price = 350;
        }
}

