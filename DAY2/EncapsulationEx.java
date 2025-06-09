class Human // <- Renamed from Humans
{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class EncapsulationEx {
    public static void main(String args[]) {
        Human h = new Human(); // Now matches the class name
        h.setAge(20);
        h.setName("Appu");
        System.out.println(h.getName() + ":" + h.getAge());
    }
}
