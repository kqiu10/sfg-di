package guru.springframework.sfgdi.services;
/**
 * Date: 12/17/20
 * Question Description
 */

import org.springframework.stereotype.Service;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - property";
    }
}
