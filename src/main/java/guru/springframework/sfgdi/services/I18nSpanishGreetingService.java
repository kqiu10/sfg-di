package guru.springframework.sfgdi.services;
/**
 * Date: 12/17/20
 * Question Description
 */

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
