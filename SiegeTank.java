/**
 * Clase que define el comportamiento del siegeTank.
 */
public class SiegeTank extends AbstractTank {

    /**
     * Constante para normalTank.
     */
    public static String CONST_SIEGE_TANK = "SiegeTank";
    /**
     * Constante para cooldown.
     */
    public static double CONST_COOLDOWN = 2.14;

    /**
     * Constante para damage.
     */
    public static int CONST_DAMAGE = 40;



    /**
     * Define el tipo de tank.
     * @return SiegeTank.
     */
    @Override
    public String type() {
        return CONST_SIEGE_TANK;
    }

    /**
     * Retorna el cooldown del tank.
     * @return cooldown.
     */
    @Override
    public double cooldown() {
        return CONST_COOLDOWN;
    }

    /**
     * Retorna el daño del tank.
     * @return damage.
     */
    @Override
    public int damage() {
        return CONST_DAMAGE;
    }
}
