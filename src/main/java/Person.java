public class Person {
    private int age;
    private String name;


    //fungerande kod
    public String reverse(){
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
         this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    public int getAge() {
        return 10;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 5;
        } else {
            this.age = 15;
        }
    }

    public String getName() {
        return "";
    }

    public void setName(String name) {
        this.name = "";
    }

    public String reverse() {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        return "";
    }

     */

    public Person(int age, String name) {
        this.name = name;
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
