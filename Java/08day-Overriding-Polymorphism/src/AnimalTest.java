class Animal{
    public void move(){
        System.out.println("������ �����Դϴ�.");
    }
}
class Human extends Animal{
    public void move(){
        System.out.println("����� �� �߷� �ݴϴ�.");
    }
}
class Tiger extends Animal{
    public void move(){
        System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
    }
}
class Eagle extends Animal{
    public void move(){
        System.out.println("�������� ���ư��ϴ�.");
    }
}
class AnimalTest
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();
        
        AnimalTest test = new AnimalTest();
        Animal a = new Animal();
        a.move();
        //a.move(human);
        test.moveAnimal(human);
        test.moveAnimal(tiger);
        test.moveAnimal(eagle);
    }
    
    public void moveAnimal(Animal animal){
        animal.move();
    }
}