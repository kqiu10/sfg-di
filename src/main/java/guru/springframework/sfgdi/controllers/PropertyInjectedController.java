package guru.springframework.sfgdi.controllers;
/**
 * Date: 12/17/20
 * Question Description
 */

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
