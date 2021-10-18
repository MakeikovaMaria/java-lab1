public class Beef extends Food {
    private String preperendess;

    public Beef(String preperendess) {
        super("Мясо");
        this.preperendess = preperendess;
    }

    public String getPreperendess() {
        return preperendess;
    }

    public void setPreperendess(String preperendess) {
        this.preperendess = preperendess;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Beef)) {
                return false;
            } else {
                Beef appleObject = (Beef) arg0;
                return this.preperendess.equals(appleObject.preperendess);
            }
        } else {
            return false;
        }
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " готовности '" + this.preperendess.toUpperCase() + "'";
    }

    public void consume() {
        System.out.println(this + " съедено");
    }
}