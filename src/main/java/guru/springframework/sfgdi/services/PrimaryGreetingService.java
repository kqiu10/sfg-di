package guru.springframework.sfgdi.services;
/**
 * Date: 12/17/20
 * Question Description
 */

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World -- From the PRIMARY Bean";
    }
}
