/**
 * Clase que define el comportamiento de un normalTank.
 */
public class NormalTank extends AbstractTank {

    /**
     * Constante para normalTank.
     */
    public static String CONST_NORMAL_TANK = "NormalTank";
    /**
     * Constante para cooldown.
     */
    public static double CONST_COOLDOWN = 0.74;

    /**
     * Constante para damage.
     */
    public static int CONST_DAMAGE = 15;


    /**
     * Retorna el tipo de tank.
     * @return NormalTank.
     */
    @Override
    public String type() {
        return CONST_NORMAL_TANK;
    }

    /**
     * Retorna el valor de cooldown.
     * @return cooldown.
     */
    @Override
    public double cooldown() {
        return CONST_COOLDOWN;
    }

    /**
     * Retorna el valor de damage.
     * @return damage.
     */
    @Override
    public int damage() {
        return CONST_DAMAGE;
    }
}
