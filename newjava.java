import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

@Configuration
public class OAuthClientConfig {

    @Bean
    @ConfigurationProperties("cmp.oauth.client")
    public ClientCredentialsResourceDetails cmpOAuthDetails() {
        return new ClientCredentialsResourceDetails();
    }

    @Bean
    @Qualifier("cmpRestTemplate")
    public OAuth2RestTemplate cmpOAuthRestTemplate(ClientCredentialsResourceDetails details) {
        OAuth2RestTemplate template = new OAuth2RestTemplate(details);
        ClientCredentialsAccessTokenProvider provider = new ClientCredentialsAccessTokenProvider();
        provider.setRequestEnhancer(new CmpAuthRequestTokenEnhancer());
        template.setAccessTokenProvider(provider);
        return template;
    }
}




cmp.oauth.client.client-id=dsuser
cmp.oauth.client.client-secret=your-secret
cmp.oauth.client.access-token-uri=https://sat-stg.codebig2.net/v2/ws/token.oauth2
cmp.oauth.client.scope=cmp:preferences:write