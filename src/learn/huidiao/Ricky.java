package learn.huidiao;

public class Ricky implements Student {
    @Override
    public void resolveQuestion(Callback callback) {
        //模拟解决问题
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //回答老师问题
        callback.tellAnswer(3);
    }
}
