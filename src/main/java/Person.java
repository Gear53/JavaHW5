public class Person {
    private String fio;
    private String postition;
    private String email;
    private int tel;
    private int salary;
    private int age;

    public Person(String fio, String postition, String email, int tel, int salary, int age) {
        this.fio = fio;
        this.postition = postition;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    public Person(String fio, String postition, int age) {
        this.fio = fio;
        this.postition = postition;
        email = "нет доступа";
        tel = 404;
        salary = 404;
        this.age = age;
    }

    public void info(){
        System.out.println("ФИО: " + fio+ "; Должность: " + postition + "; email:" + email + "" +
                "; Телефон:" + tel + "; Зарплата:" + salary + "; Возраст"+ age);
    }

    public String getFio() {
        return fio;
    }

    public String getPostition() {
        return postition;
    }

    public String getEmail() {
        return email;
    }

    public int getTel() {
        return tel;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPostition(String postition) {
        this.postition = postition;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
