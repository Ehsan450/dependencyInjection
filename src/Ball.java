public class Ball {
    private Spin spin;

    public Ball() {
    }

    public Ball(Spin spin) {
        this.spin = spin;
    }
    public String Googley(){
      return spin.LegSpin();
    }
}
