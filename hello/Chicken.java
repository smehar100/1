package hello;

import java.util.concurrent.Callable;

interface IBird {
    Egg lay();
}

class Chicken implements IBird {
    public Chicken() {
    }

    public static void main(String[] args) throws Exception {
        Chicken chicken = new Chicken();
        System.out.println(chicken instanceof IBird);
    }
    @Override
    public Egg lay()  {
       return new Egg();
    }
}

class Egg {
    public Egg(Callable<IBird> createBird) {
        createBird = new IBird();
    }

    public IBird hatch() throws Exception {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
}
