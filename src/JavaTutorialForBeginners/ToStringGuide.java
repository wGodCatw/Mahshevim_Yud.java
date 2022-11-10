package JavaTutorialForBeginners;

class Cat {
    private String name;
    private int age;


    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
//        //variant 1:
//        return name + ": " + age;
//
//        //variant 2:
//        return String.format("%s : %2d", name, age);
//
//        //variant 3:
        StringBuilder sb = new StringBuilder();
        return sb.append(name).append(": ").append(age).toString();
    }


}

public class ToStringGuide {
    public static void main(String[] args) {
        Cat kitten = new Cat("Belfry", 1);
        System.out.println(kitten); //by default this will print class name and unique identifier of object (hashcode)

        //but if you use one of the options of toString overriding method in the Cat class, it will give useful info
    }
}
