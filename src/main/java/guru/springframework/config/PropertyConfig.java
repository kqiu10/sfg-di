package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Date: 1/19/21
 * Question Description
 */
@Configuration
public class PropertyConfig {

    @Value("${username}")
    String user;

    @Value("${password}")
    String password;

    @Value("${dburl}")
    String url;

    @Value("${jms.username}")
    String jmsuser;

    @Value("${jms.password}")
    String jmspassword;

    @Value("${jms.dburl}")
    String jmsurl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    public PropertyConfig() {
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUser(jmsuser);
        jmsBroker.setPassword(jmspassword);
        jmsBroker.setUrl(jmsurl);
        return jmsBroker;
    }
}
