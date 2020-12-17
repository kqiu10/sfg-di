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
public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
