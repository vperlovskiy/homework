import java.util.ArrayList;

/**
 * Created by volodya on 04.01.15.
 */
public class l8l11 {
    public static void main(String[] args)
    {
        //Написать тут ваш код

        Human child = new Human("Изя",true,12,new ArrayList<Human>());
        Human child1 = new Human("Сара",false,10,new ArrayList<Human>());
        Human child2 = new Human("Мойша",true,11,new ArrayList<Human>());
        ArrayList<Human> kids = new ArrayList<Human>();
        kids.add(child);
        kids.add(child1);
        kids.add(child2);

        Human father = new Human("Адам",true,40,kids);
        Human mother = new Human("Сара",false,41,kids);

        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(father);
        ArrayList<Human> ch1 = new ArrayList<Human>();
        ch1.add(mother);

        Human gf = new Human("Авраам",true,61,ch);
        Human gm = new Human("Веред",false,55,ch);

        Human gf1 = new Human("Ави",true,57, ch1);
        Human gm1 = new Human("Заава",false,55,ch1);



        System.out.println(gf);
        System.out.println(gf1);
        System.out.println(gm);
        System.out.println(gm1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
        System.out.println(child1);
        System.out.println(child2);
    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }



        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }
}
