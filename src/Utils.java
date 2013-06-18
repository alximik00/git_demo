/**
 * Created by IntelliJ IDEA.
 *
 * @author alximik
 * @since 6/18/13 11:43 PM
 */
public class Utils {

    /* ********** Constants                ******* */
    
    /* ********** Variables                ******* */
    
    /* ********** Static methods           ******* */

    /* ********** Constructors             ******* */

    /* ********** Public instance methods  ******* */
    public boolean isEmpty(String s) {
        return s != null && s.length()>0;
    }

    public boolean isNumeric(String s) {
        try {
            Float.parseFloat(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    
    /* ********** Private instance methods ******* */
    
    /* ********** Internal classes         ******* */
}
