package learn.huidiao;

public class TestHuidiao {
    public static void main(String[] args) {

        //一种写法
//        Student student=new Ricky();
//        Teacher teacher=new Teacher(student);
//
//        student.resolveQuestion(teacher);


        //第二种写法

        Teacher teacher1=new Teacher(new Student() {
            @Override
            public void resolveQuestion(Callback callback) {
                //模拟解决问题
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                callback.tellAnswer(2);
            }
        });
        teacher1.askQuestion();




    }
}
