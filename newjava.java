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



import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class PreferenceUpdater {

    public static void main(String[] args) {
        // Step 1: Access token you already got using OAuth2RestTemplate
        String accessToken = "your_token_here"; // Replace this with your actual token

        // Step 2: Create RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Step 3: Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(accessToken); // adds Authorization: Bearer <token>
        headers.set("User-Agent", "insomnia/11.1.0");

        // Step 4: Set JSON body
        String jsonBody = """
        {
            "preferenceKey": "someKey",
            "preferenceValue": "someValue"
        }
        """;

        HttpEntity<String> entity = new HttpEntity<>(jsonBody, headers);

        // Step 5: Send POST request
        String url = "https://ape.cmp.xfinity.com/prefcenter/preferencedata/update";

        try {
            ResponseEntity<String> response = restTemplate.exchange(
                    url,
                    HttpMethod.POST,
                    entity,
                    String.class
            );

            System.out.println("Response Status Code: " + response.getStatusCode());
            System.out.println("Response Body: " + response.getBody());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
