public class Knight {

    int getPower() {

        return 3;

    }

}

 

public class StrongKnight extends Knight {

    @Override

    int getPower() {

        return 5;

    }

}

 

public class Main {

    public static void main(String[] args) {

        Knight k = new StrongKnight();

        System.out.println(k.getPower());

    }

}