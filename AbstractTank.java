/**
 * Clase abstracta para definir un tank.
 */
public abstract class AbstractTank {

    /**
     * Define el tipo de tank.
     * @return tipo de tanke
     */
    public abstract String type ();

    /**
     * Define el cooldown del tank.
     * @return cooldown.
     */
    public abstract double cooldown();

    /**
     * Define el daño del tank.
     * @return damage.
     */
    public abstract int damage();

    /**
     * Imprime la informacion por pantalla.
     */
    public void print() {
        System.out.println(
                this.type() + "(" +
                        this.cooldown() + ", " +
                        this.damage() + ")");
    }


}
