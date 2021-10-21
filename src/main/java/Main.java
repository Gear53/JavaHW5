public class Main {
    public static void main(String[] args) {
        Person[] personArr = new Person[5];
        personArr[0] = new Person("Ivan Icanovich Jacub", "Начальник", "IIJ1984@mail.ru",
                253054, 15000, 45);
        personArr[1] = new Person("Какой-то чувак", "Какая-то позиция", 55);
        personArr[2] = new Person("BORIS", "Борисыч", "wda@gmail.ru", 460588, 5000,
                41);
        personArr[3] = new Person("Stepan", "Кадровик", 25);
        personArr[4] = new Person("Sergey", "Рабочий", 28);



    }
    public static void ageInfo(){
        for(int i = 0; i < 5; i++){
            if(Person[i].getAge()>40){
                System.out.println(Person[i].info());
            }
        }
    }
}
