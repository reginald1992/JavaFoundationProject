package Chapter6_Day12;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.regist(-12);
        } catch (MyException e) {
            e.printStackTrace();
        }
        s.toString();
    }
}

class Student{
    int id;
    public void regist(int id) throws MyException {
        if(id > 0){
            this.id = id;
        }else{
            throw new MyException("学号有误");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
