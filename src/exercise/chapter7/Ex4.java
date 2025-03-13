package exercise.chapter7;

public class Ex4 {
    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }

    private static void speak(Talkable talkable) {
        talkable.talk();
    }
}

class Korean implements Talkable{

    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable{

    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}

interface Talkable {
    void talk();
}

