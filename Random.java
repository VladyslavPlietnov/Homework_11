public class Random {
    public long a, c, m;
    private long x;
    public Random(){
        this.a =25214903917l;
        this.m = (long) Math.pow(2, 48);
    }
    public Random seed(long c) {
        this.c = c;
        this.x =c;
        return this;
    }
    public int next(){
        x = (a*x+c)%m;
        return (int) x;
    }
}
