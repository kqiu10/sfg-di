package guru.springframework.sfgdi.services;
/**
 * Date: 12/17/20
 * Question Description
 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
